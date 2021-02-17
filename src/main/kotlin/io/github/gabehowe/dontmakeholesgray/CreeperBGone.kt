package io.github.gabehowe.dontmakeholesgray

import org.bukkit.entity.EntityType
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.entity.EntityExplodeEvent

class CreeperBGone : Listener {
    @EventHandler
    fun onGrayMakeHoleEvent(event: EntityExplodeEvent) {
        if (event.entity.type != EntityType.CREEPER) {
            return
        }
        event.blockList().clear()
    }
}