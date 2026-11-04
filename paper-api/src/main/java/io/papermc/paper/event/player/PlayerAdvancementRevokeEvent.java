package io.papermc.paper.event.player;

import org.bukkit.advancement.Advancement;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.ApiStatus;
import org.jspecify.annotations.NullMarked;

/**
 * An event fired when a {@link Player} has an advancement revoked
 */
@NullMarked
public final class PlayerAdvancementRevokeEvent extends Event {

    private static final HandlerList HANDLER_LIST = new HandlerList();

    private final Player player;
    private final Advancement advancement;

    @ApiStatus.Internal
    public PlayerAdvancementRevokeEvent(final Player player, Advancement advancement) {
        this.player = player;
        this.advancement = advancement;
    }

    public Player getPlayer()
    {
        return this.player;
    }

    public Advancement getAdvancement() {
        return this.advancement;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLER_LIST;
    }

    public static HandlerList getHandlerList() {
        return HANDLER_LIST;
    }
}
