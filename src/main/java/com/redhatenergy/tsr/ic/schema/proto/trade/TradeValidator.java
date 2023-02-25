package com.redhatenergy.tsr.ic.schema.proto.trade;

import com.redhatenergy.tsr.ic.schema.proto.ValidationError;

import java.util.ArrayList;
import java.util.List;

public class TradeValidator {

    public List<ValidationError> validate(Trade trade) {
        List<ValidationError> validationErrors = new ArrayList<>();
        if (trade.getAssetClass().ordinal() == 0) {
            validationErrors.add(new ValidationError("trade", "assetClass", "assetClass is required"));
        }
        return validationErrors;
    }

}
