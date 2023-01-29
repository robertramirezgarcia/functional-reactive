package com.robertramirez.functionalreactive.functional.lambda;

import java.util.Arrays;
import java.util.List;

import static com.robertramirez.functionalreactive.functional.lambda.AssetUtil.totalAssetValues;
import static com.robertramirez.functionalreactive.functional.lambda.AssetUtil.totalStockValues;
import static com.robertramirez.functionalreactive.functional.lambda.AssetUtilRefactored.totalAssetValuesRefactored;

public class Execute {
    public static void main (String[] args) {

        final List<Asset> assets = Arrays.asList(
                new Asset(Asset.AssetType.BOND, 1000),
                new Asset(Asset.AssetType.BOND, 2000),
                new Asset(Asset.AssetType.STOCK, 3000),
                new Asset(Asset.AssetType.STOCK, 4000)
        );

        //System.out.println("Total of all assets: " + totalAssetValues(assets));
        //System.out.println("Total of bond: " + totalAssetValues(assets));
        //System.out.println("Total of stock: " + totalStockValues(assets));

        System.out.println("Total of all assets: " + totalAssetValuesRefactored(assets, asset -> true));
        System.out.println("Total of bond: " + totalAssetValuesRefactored(assets, asset -> asset.getType() == Asset.AssetType.BOND));
        System.out.println("Total of stock: " + totalAssetValuesRefactored(assets, asset -> asset.getType() == Asset.AssetType.STOCK));

    }
}
