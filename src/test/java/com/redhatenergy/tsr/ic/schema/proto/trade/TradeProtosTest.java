package com.redhatenergy.tsr.ic.schema.proto.trade;

import org.junit.jupiter.api.Test;

public class TradeProtosTest {

    @Test
    void tradeIdConstructor() {
        TradeId tradeId = TradeId.newBuilder()
                .setId("test")
                .setId("id")
                .build();
    }

    @Test
    void tradeConstructor() {
        Trade trade = Trade.newBuilder().build();
        trade.getTradeLegsCount();
    }

}
