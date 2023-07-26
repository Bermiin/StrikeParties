package me.bermine.strikeparties.hook;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import me.bermine.strikeparties.StrikeParties;
import org.bukkit.entity.Player;

import java.util.List;

@Getter
@RequiredArgsConstructor
public class PartyHandler {

    private final StrikeParties plugin;
    private PartyType type;

    public void init() {
        this.type = PartyType.find();
    }

    /**
     * Gets the leader of the current party as a bukkit {@link Player}
     *
     * @param member The {@link Player} that is member of a party
     * @return The leader of the current party or <code>null</code> if no compatible party plugin was found
     */
    public Player getLeader(Player member) {
        return type.getAdapter().getLeader(member);
    }

    /**
     * Gets all members of the current party
     *
     * @param member The {@link Player} that is member of a pary
     * @return List of all members in a party or an empty {@link List} if no compatible party plugin was found
     */
    public List<Player> getMembers(Player member) {
        return type.getAdapter().getMembers(member);
    }
}
