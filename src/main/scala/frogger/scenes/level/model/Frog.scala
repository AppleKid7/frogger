package frogger.scenes.level.model

import frogger.core.Assets
import indigo._
import indigoextras.geometry.BoundingBox
import indigoextras.geometry.Vertex

final case class Frog(
    boudningBox: BoundingBox,
    state: FrogState,
    lastRespawn: Seconds,
    ySpeed: Double
) {
  val position: Vertex =
    Vertex(boudningBox.horizontalCenter, boudningBox.bottom)
}
