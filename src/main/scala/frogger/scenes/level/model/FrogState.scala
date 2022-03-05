package frogger.scenes.level.model


sealed trait FrogState
object FrogState {
  case object Idle      extends FrogState
  case object MoveLeft  extends FrogState
  case object MoveRight extends FrogState
  case object MoveUp    extends FrogState
  case object MoveDown  extends FrogState
}
