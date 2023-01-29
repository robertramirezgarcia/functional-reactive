package com.robertramirez.functionalreactive.functional.lambda;

import java.util.List;
import java.util.function.Predicate;

public class AssetUtilRefactored {
    public static int totalAssetValuesRefactored(final List<Asset> assets,
                                       final Predicate<Asset> assetSelector) {
        return assets.stream()
                .filter(assetSelector)
                .mapToInt(Asset::getValue)
                .sum();
    }
}
