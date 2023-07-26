package me.bermine.strikeparties;

import lombok.Getter;
import me.bermine.strikeparties.hook.PartyHandler;
import org.bukkit.plugin.java.JavaPlugin;

@Getter
public final class StrikeParties extends JavaPlugin {

    @Getter
    private static StrikeParties instance;
    private PartyHandler partyHandler;

    @Override
    public void onEnable() {
        instance = this;
        this.partyHandler = new PartyHandler(this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
