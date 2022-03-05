package frogger.scenes.level.model

import indigo._

sealed trait LevelModel {
  val notRead: Boolean

  def update(gameTime: GameTime, inputState: InputState): Outcome[LevelModel]
}
object LevelModel {
  case object NotReady extends LevelModel {
    val notRead: Boolean = true

    def update(gameTime: GameTime, inputState: InputState): Outcome[NotReady.type] =
      Outcome(this)
  }

  final case class Ready(frog: Frog, car: Car) extends LevelModel {
    val notReady: Boolean = false

    def update(gameTime: GameTime, inputState: InputState): Outcome[Ready] =
      frog.udpate(gameTime, inputState, car).map { f =>
        this.copy(frog = f)
      }
  }
}
