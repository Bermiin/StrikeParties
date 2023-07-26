package me.bermine.strikeparties.hook;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import me.bermine.strikeparties.hook.impl.DefaultProvider;
import org.bukkit.Bukkit;

import java.util.Arrays;

@Getter
@RequiredArgsConstructor
public enum PartyType {

    DEFAULT("Default", new DefaultProvider()),
    ;

    private final String name;
    private final PartyAdapter adapter;

    /**
     * Attempts to find a compatible party plugin
     *
     * @return The compatible {@link PartyType} or {@link PartyType#DEFAULT} if no compatible party plugin was found
     */
    public static PartyType find() {
        return Arrays.stream(PartyType.values())
                .filter(type -> !type.equals(PartyType.DEFAULT))
                .filter(type -> isAvailable(type.getName()))
                .findFirst()
                .orElse(PartyType.DEFAULT);
    }

    /**
     * Checks whether the given party plugin is present on the server
     *
     * @param pluginName The plugin name of the party plugin
     * @return <code>true</code> if given party plugin is present on the server, <code>false</code> if not
     */
    public static boolean isAvailable(String pluginName) {
        return Bukkit.getPluginManager().isPluginEnabled(pluginName);
    }
}
