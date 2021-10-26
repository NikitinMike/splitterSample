package com.sample;

public class Main {

    static String text = "3f030a78b980eb93501f2c7d37f028b2ea2f11b4\n" +
            "                       d0c5778bc02ab8d17b7a5ad39baaa6d40c6ffbb1\n" +
            "                       6db08f624af410e53e0e91baa585b8bef1402b91\n" +
            "                       5f46aa4bcf3c2d3c75e47230da918ffb90d2ea6b\n" +
            "                       29d922690ed6cb92b325ffd09aea0f09473e5eee\n" +
            "                       caa70be18fa8d1ec07ae8f877093e8e208f06816\n" +
            "                       4670305830c05f74c767ef5767f0b68d28c3d828\n" +
            "                       e86830c27711c41e6b381e7df9ab7045995672f8\n" +
            "                       2cf5e6416e0d3a09d6d43994a39fa20833080510\n" +
            "                       d7ecc9431f5487eaed0e9c6fab3d9836d0e99de4\n" +
            "                       bd3b80d36643eb7a5c63d73244369dc7412ee074\n" +
            "                       04081203da64e8c1cc48f899c6144923e296f1cb\n" +
            "                       641e77c66e572399dd979a3798fe160c476d3e83\n" +
            "                       c422a660e91208c1c500d8c5785cb18bf85a5e44\n" +
            "                       73c8ceba27ec85a697000a75b37ba59cb5ad69c9\n" +
            "                       9f65ea1bbfa0a8d8affd915e1a7b4a6c5cdc3a2f\n" +
            "                       ba0b36cbad2dbbaf378620e5b67f9e6c7db7fc51\n" +
            "                       9f79b862efbeb4eeddef3b43ba18b0ad923702bc\n" +
            "                       936a6ee4dce0dea4b216d718715ae77c831b80f1\n" +
            "                       056083290848d0fc6b051c0005fc0ed3e467b97f\n" +
            "                       2b1f9069b7c3d24c6cf623bdf9c9cdd8a5619627\n" +
            "                       f738203ca8a61c0ab5ff1d2951edb2e6950153da\n" +
            "                       9373ddb6810ed8da7e4ec8e4305156771e442d35\n" +
            "                       b1df9c86cf401350e8ef26d8e40fb85556270870\n" +
            "                       8fd392dbb90528cb48cd62df5327ac3fc86c65a0\n" +
            "                       55c17eb2cd25f8ce0eb79072";

    public static void main(String[] args) {
	// write your code here
        String key =
//        "a1b2c3d4e5f6".repeat(100)
        text.replaceAll("\\s+","")
//                .replaceAll("((\\w\\w){16})((\\w\\w){16})","  $1 $3 \n");
                .replaceAll("((\\w\\w){8})((\\w\\w){8})((\\w\\w){8})((\\w\\w){8})","  $1 $3  $5 $7 \n");
        System.out.println(key);
        System.out.println("1234567843210987".replaceAll("(\\d{4})", "$1 "));
    }
}
