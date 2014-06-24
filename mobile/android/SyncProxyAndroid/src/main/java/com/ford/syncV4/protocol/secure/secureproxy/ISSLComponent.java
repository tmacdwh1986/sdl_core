package com.ford.syncV4.protocol.secure.secureproxy;

import java.io.IOException;

/**
 * Created by Andrew Batutin on 3/20/14.
 */
public interface ISSLComponent {
    void setupClient(int localPort) throws IOException;

    void writeData(byte[] data) throws IOException;

    void setRPCPacketListener(IRPCodedDataListener RPCPacketListener);

    IRPCodedDataListener getRPCPacketListener();
}
