package com.gigabitwize.conversations.api;

import net.kyori.adventure.audience.Audience;

/**
 * Created by Giovanni on 2/8/2023
 */
public interface Fetch<A> {

    void execute(A input, Audience sender);
}
