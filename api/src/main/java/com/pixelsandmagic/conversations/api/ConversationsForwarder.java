package com.gigabitwize.conversations.api;

import java.util.UUID;


/**
 * Created by Giovanni on 2/9/2023
 * <p>
 * Dummy interface to forward input coming in from platform-dependent events to
 * {@link Conversations}.
 */
public interface ConversationsForwarder<A> {

    /**
     * Registers this forwarder.
     *
     * @param base Base required to register, e.g JavaPlugin for Bukkit.
     */
    void register(A base);

    /**
     * Forwards the input to the sender's current {@link Conversation}, if existent.
     *
     * @param onSuccess Runnable that executes when the input was forwarded succesfully.
     */
    default void forwardInput(Conversation conversation, UUID sender, String input, Runnable onSuccess) {
        conversation.handleInput(input);
        onSuccess.run();
    }
}
