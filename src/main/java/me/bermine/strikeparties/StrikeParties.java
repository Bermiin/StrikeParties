package me.bermine.strikeparties;

import lombok.Getter;
import org.bukkit.plugin.java.JavaPlugin;

@Getter
public final class StrikeParties extends JavaPlugin {

    @Getter
    private static StrikeParties instance;

    @Override
    public void onEnable() {
        instance = this;
        // Plugin startup logic
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
