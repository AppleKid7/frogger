package frogger.core

import frogger.scenes.level.model.LevelModel
import frogger.scenes.loading.LoadingModel


final case class Model(
    loadingScene: LoadingModel,
    gameScene: LevelModel
)