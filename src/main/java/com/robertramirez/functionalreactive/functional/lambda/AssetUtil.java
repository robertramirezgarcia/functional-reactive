package com.robertramirez.functionalreactive.functional.lambda;

import java.util.Arrays;
import java.util.List;

public class AssetUtil {

    public static int totalAssetValues(final List<Asset> assets) {
        return assets.stream()
                .mapToInt(Asset::getValue)
                .sum();
    }

    public static int totalBondValues(final List<Asset> assets) {
        return assets.stream()
                .mapToInt(asset -> asset.getType() == Asset.AssetType.BOND ? asset.getValue() : 0 )
                .sum();
    }

    public static int totalStockValues(final List<Asset> assets) {
        return assets.stream()
                .mapToInt(asset -> asset.getType() == Asset.AssetType.STOCK ? asset.getValue() : 0 )
                .sum();
    }
}
