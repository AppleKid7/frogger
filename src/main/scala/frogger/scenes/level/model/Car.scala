package frogger.scenes.level.model

import indigoextras.geometry.BoundingBox

final case class Car(navMesh: List[BoundingBox], rowCount: Int) {
  def hitTest(bounds: BoundingBox): Option[BoundingBox] =
    navMesh.find(_.overlaps(bounds))
}
