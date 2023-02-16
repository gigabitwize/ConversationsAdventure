package com.gigabitwize.conversations.api;

/**
 * Created by Giovanni on 2/9/2023
 */
public interface Converter<A> {

    A convert(String input);
}
