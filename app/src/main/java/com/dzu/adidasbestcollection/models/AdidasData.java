package com.dzu.adidasbestcollection.models;

import java.util.ArrayList;

public class AdidasData {

    // array to store data that will be displayed on RecyclerView
    public static String[][] data = new String[][] {
            { "Alphaboost Shoes",
                    "Step up your game. Designed for explosive drills and speed training, these adidas running shoes help you take your athleticism to the next level. Dual-density cushioning and stability pods deliver outstanding control so you can dodge any obstacles standing between you and the championships.",
                    "https://i.ibb.co/W35sWH9/alphaboost-shoes.jpg",
                    "Rp. 2.000.000",
                    "White/Gold/Black (FW4523)",
                    "7\n8\n8.5\n9\n9.5\n10",
                    "Regular fit\nLace closure\nMesh upper\nLightweight and breathable\nSupportive speed-training shoes\nResponsive Boost midsole"
            },

            {"Harden Vol-4 Shoes",
                    "Remix James Harden's game. These adidas basketball shoes combine the former MVP's signature look with the fresh perspective of Chinese New Year. Change directions and break defenders' ankles in snug comfort. Stop and go on a dime.",
                    "https://i.ibb.co/Y3yvN3H/harden-vol4-shoes.jpg",
                    "Rp. 2.000.000",
                    "Black/Gold/Red (FW3136)",
                    "7\n8\n8.5\n9\n9.5\n10\n10.5\n11\n12",
                    "Regular fit\nLace closure\nLeather upper with midfoot lockdown band\nStable, locked-down feel\nJames Harden B-ball shoes\nLightstrike cushioning with banking barrier"
            },

            { "Ultraboost 20 Osaka City Pack",
                    "What's your favourite city? These adidas running shoes are designed with colours and graphics specific to key cities around the world. The stretchy knit upper has stitched in support at the midfoot. Responsive cushioning keeps you comfortable as you navigate your own urban environment.",
                    "https://i.ibb.co/DQpLFg7/ultraboost-20-osaka-city-pack.jpg",
                    "Rp. 3.000.000",
                    "Black/Multicolor/Yellow (FX7815",
                    "7\n7.5\n8\n8.5\n9\n9.5\n10\n10.5\n11",
                    "Regular fit\nLace closure\nAdidas Primeknit textile upper\nRunning shoes with a city theme\nTailored Fibre Placement for midfoot support\nWeight: 310 g (size UK 8.5)"
            },
            {"Ultraboost 20 Seoul City Pack",
                    "What's your favourite city? These adidas running shoes are designed with colours and graphics specific to key cities around the world. The stretchy knit upper has stitched in support at the midfoot. Responsive cushioning keeps you comfortable as you navigate your own urban environment.",
                    "https://i.ibb.co/znL3Rr9/ultraboost-20-seoul-city-pack.jpg",
                    "Rp. 3.000.000",
                    "White/Multicolor/Blue (FX7813)",
                    "7\n7.5\n8\n8.5\n9\n9.5\n10\n10.5\n11",
                    "Regular fit\nLace closure\nAdidas Primeknit textile upper\nRunning shoes with a city theme\nTailored Fibre Placement for midfoot support\nWeight: 310 g (size UK 8.5)"
            },
            {"Ultraboost 20 Shoes 16",
                    "The Ultraboost was revolutionary when it was released in 2015. Runners raved about the comfort and responsiveness of the midsole cushioning. These adidas Ultraboost 20 Shoes continue that tradition. Feel supported in the foot-hugging reinforced knit upper. Responsive cushioning adds energy to your stride.",
                    "https://i.ibb.co/2gVmbDM/ultraboost-20-shoes-16.jpg",
                    "Rp. 3.000.000",
                    "White/Black/Red (FW4314)",
                    "4\n4.5\n5\n5.5\n6\n6.5\n7\n7.5\n8\n8.5\n9\n9.5\n10\n10.5",
                    "Regular fit \nLace closure\nAdidas Primeknit upper\nLocked-in feel\nAdaptive, energy-returning running shoes\nResponsive Boost midsole \nWeight 310 g (size UK 8.5)"
            },
            { "Ultraboost 20 Singapore City Pack",
                    "What's your favourite city? These adidas running shoes are designed with colours and graphics specific to key cities around the world. The stretchy knit upper has stitched in support at the midfoot. Responsive cushioning keeps you comfortable as you navigate your own urban environment.",
                    "https://i.ibb.co/BnbPphy/ultraboost-20-singaporecity-pack.jpg",
                    "Rp. 3.000.000",
                    "Multicolor/Multicolor/Orange (FX7817)",
                    "7\n7.5\n8\n8.5\n9\n9.5\n10\n10.5",
                    "Regular fit\nLace closure\nAdidas Primeknit textile upper\nRunning shoes with a city theme\nTailored Fibre Placement for midfoot support\nWeight: 310 g (size UK 8.5)"
            },
            {"Ultraboost 20 Sydney City Pack",
                    "What's your favourite city? These adidas running shoes are designed with colours and graphics specific to key cities around the world. The stretchy knit upper has stitched in support at the midfoot. Responsive cushioning keeps you comfortable as you navigate your own urban environment.",
                    "https://i.ibb.co/v1L7Z24/ultraboost-20-sydney-city-pack.jpg",
                    "Rp. 3.000.000",
                    "Blue/White/White (FX7814)",
                    "7\n7.5\n8\n8.5\n9\n9.5\n10\n10.5",
                    "Regular fit\nLace closure\nAdidas Primeknit textile upper\nRunning shoes with a city theme\nTailored Fibre Placement for midfoot support\nWeight: 310 g (size UK 8.5)"
            },
            {"Ultraboost 20 Taipei City Pack",
                    "What's your favourite city? These adidas running shoes are designed with colours and graphics specific to key cities around the world. The stretchy knit upper has stitched in support at the midfoot. Responsive cushioning keeps you comfortable as you navigate your own urban environment.",
                    "https://i.ibb.co/Gkggwf3/ultraboost-20-taipeo-city-pack.jpg",
                    "Rp. 3.000.000",
                    "White/White/Multicolor (FX7816)",
                    "7\n7.5\n8\n8.5\n9\n9.5\n10\n10.5",
                    "Regular fit\nLace closure\nAdidas Primeknit textile upper\nRunning shoes with a city theme\nTailored Fibre Placement for midfoot support\nWeight: 310 g (size UK 8.5)"
            },
            {"Ultraboost 20 Tokyo City Pack",
                    "What's your favourite city? These adidas running shoes are designed with colours and graphics specific to key cities around the world. The stretchy knit upper has stitched in support at the midfoot. Responsive cushioning keeps you comfortable as you navigate your own urban environment.",
                    "https://i.ibb.co/JsxT7GM/ultraboost-20-tokyo-city-pack.jpg",
                    "Rp. 3.000.000",
                    "Blue/Multicolor/Yellow (FX7811)",
                    "8.5\n9",
                    "Regular fit\nLace closure\nAdidas Primeknit textile upper\nRunning shoes with a city theme\nTailored Fibre Placement for midfoot support\nWeight: 310 g (size UK 8.5)"
            },
            {"Ultraboost DNA Shoes",
                    "Built as a high-performance runner, the Ultraboost's impact extends far beyond running to the worlds of music and fashion. These adidas Ultraboost DNA Shoes combine a sleek, stylish silhouette with cutting-edge technologies to create a shoe you can wear anywhere.",
                    "https://i.ibb.co/0tb9c5D/ultraboost-dna-shoes.jpg",
                    "Rp. 2.800.000",
                    "White/White/Gold (FW4313)",
                    "4.5\n5\n5.5\n6\n6.5\n7\n7.5\n8\n8.5\n9\n9.5",
                    "Regular fit\nLace closure\nAdidas Primeknit upper\nLocked-in feel\nAdaptive, energy-returning running shoes\nResponsive Boost midsole"
            }

    };

    public static ArrayList<Adidas> getListData() {
        Adidas adidas;
        ArrayList<Adidas> list = new ArrayList<>();

        for (String[] mData : data) {
            adidas = new Adidas();
            adidas.setName(mData[0]);
            adidas.setElevation(mData[1]);
            adidas.setPhoto(mData[2]);
            adidas.setDescription(mData[3]);
            adidas.setLocation(mData[4]);
            adidas.setSize(mData[5]);
            adidas.setSpec(mData[6]);

            list.add(adidas);
        }

        return list;
    }

}
