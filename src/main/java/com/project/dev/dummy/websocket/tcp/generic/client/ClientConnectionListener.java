/*
 * @fileoverview    {ClientConnectionListener}
 *
 * @version         2.0
 *
 * @author          Dyson Arley Parra Tilano <dysontilano@gmail.com>
 *
 * @copyright       Dyson Parra
 * @see             github.com/DysonParra
 *
 * History
 * @version 1.0     Implementation done.
 * @version 2.0     Documentation added.
 */
package com.project.dev.dummy.websocket.tcp.generic.client;

import java.net.Socket;

/**
 * TODO: Description of {@code ClientConnectionListener}.
 *
 * @author Dyson Parra
 * @since 11
 */
public interface ClientConnectionListener {

    /**
     * TODO: Description of {@code onConnectedClient}.
     *
     * @param client
     * @param server
     */
    public abstract void onConnectedClient(GenericClient client, Socket server);

    /**
     * TODO: Description of {@code onDisconnectedClient}.
     *
     * @param client
     * @param server
     */
    public abstract void onDisconnectedClient(GenericClient client, Socket server);

    /**
     * TODO: Description of {@code onErrorConnectingToServer}.
     *
     * @param client
     * @param tries
     * @param serverIpAddress
     * @param serverPort
     */
    public abstract void onErrorConnectingToServer(GenericClient client, String serverIpAddress, int serverPort, int tries);
}
