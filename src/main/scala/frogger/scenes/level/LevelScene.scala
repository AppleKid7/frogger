package frogger.scenes.level

import frogger.scenes.level.model.LevelModel
import indigo._
import indigo.scenes._

import indigoextras.geometry.Vertex

final case class LevelScene(screenWidth: Int) extends Scene[StartupData, Model, ViewModel] {
  type SceneModel = LevelModel
}
