package io.github.gabehowe.dontmakeholesgray

import org.bukkit.plugin.java.JavaPlugin

class DontMakeHolesGray : JavaPlugin() {
    override fun onEnable() {
        // Plugin startup logic
        server.pluginManager.registerEvents(CreeperBGone(), this)
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}