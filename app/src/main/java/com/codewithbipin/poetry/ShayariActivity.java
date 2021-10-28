package com.codewithbipin.poetry;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class ShayariActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<ShayariData> list;
    private int cat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shayari);

        cat = getIntent().getIntExtra("cat",1);

        list = new ArrayList<>();

        switch (cat){
            case 1:
                initList();
                break;
            case 2:
                initList2();
                break;
            case 3:
                initList3();
                break;
            case 4:
                initList4();
                break;
            case 5:
                initList5();
                break;
            case 6:
                initList6();
                break;
            case 7:
                initList7();
                break;
            case 8:
                initList8();
                break;

        }

        recyclerView = findViewById(R.id.recycler);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView.setAdapter(new ShayariAdapter(this,list));

    }

    private void initList() {

        list.add(new ShayariData("आशिक़ों के महबूब के पैरो की धुल हूँ,\n" +
                "हाँ मैं एक लाल गुलाब का फूल हूँ।"));
        list.add(new ShayariData("ए-हसीन मेरा गुलाब कबूल कर,\n" +
                "हम तुमसे बेइन्तहा इश्क़ करते हैं,\n" +
                "अब नहीं इस ज़माने की परवाह हमको,\n" +
                "हम अपने इश्क़ का इज़हार करते हैं,\n" +
                "तुम नादानी समझो या शैतानी हमारी,\n" +
                "हम हर घडी तेरा इंतजार करते हैं।\n" +
                "हैप्पी रोज डे"));
        list.add(new ShayariData("\n" +
                "गम में हँसने वाले को रूलाया नहीं जाता,\n" +
                "लहरों से पानी को हटाया नहीं जाता,\n" +
                "होने वाले हो जाते हैं खुद ही अपने,\n" +
                "किसी को कहकर अपना बनाया नहीं जाता।\n"));
        list.add(new ShayariData("प्रेम पर कविता\n" +
                "प्यार पर बेहतरीन कविताएं\n" +
                "मेरी दीवानगी की कोई हद नहीं\n" +
                "तेरी सूरत के सिवा मुझे कुछ याद नहीं\n" +
                "मैं गुलाब हूँ तेरे गुलशन का\n" +
                "तेरे सिवाए मुझपर किसी का हक़ नहीं।"));
        list.add(new ShayariData("अगर कुछ बनना है तो\n" +
                "गुलाब के फूल बनो…\n" +
                "क्योंकि ये फूल उस के हाथ मैं भी\n" +
                "खुश्बू छोड़ देता है\n" +
                "जो इसे मसल कर फेंक देता है।"));
        list.add(new ShayariData("हर फूल आपको नए अरमान दे,\n" +
                "हर सुबह आपको एक सलाम दे,\n" +
                "हमारी ये दुआ हैं तहे-दिल से,\n" +
                "अगर आपका एक आंसू भी निकले,\n" +
                "तो खुदा आपको उससे दुगनी खुशी दे।\n" +
                "हैप्पी रोज डे"));
        list.add(new ShayariData("नजरे मिली तो प्यार हो जाता है,\n" +
                "पलके उठे तो इज़हार हो जाता है,\n" +
                "ना जाने क्या कशिश है चाहत में,\n" +
                "कि कोई अनजान भी\n" +
                "हमारी जिंदगी का हकदार हो जाता है।"));
        list.add(new ShayariData("टूटा हुआ फूल खुशबू दे जाता हैं,\n" +
                "बिता हुआ पल यादें दे जाता हैं,\n" +
                "हर शख्स का अपना अंदाज होता हैं,\n" +
                "कोई जिंदगी में प्यार तो,\n" +
                "कोई प्यार में ज़िन्दगी दे जाता हैं।"));
        list.add(new ShayariData("बहते अश्कों की जुबाँ नहीं होती,\n" +
                "कभी लफ्जों में मोहब्बत बयाँ नहीं होती,\n" +
                "मिले जो प्यार तो कदर करना,\n" +
                "क्योंकि किस्मत हर किसी पर मेहरबान नहीं होती।"));
        list.add(new ShayariData("मेरा हर ख्वाब आज हकीकत बन जाये,\n" +
                "जो हो बस तुम्हारे साथ ऐसी जिन्दगी बन जाये,\n" +
                "हम लायें लाखों में एक गुलाब आपके लिए,\n" +
                "और ये गुलाब मोहब्बत की शुरूआत बन जाये।"));
        list.add(new ShayariData("मेरी सारी हसरते मचल गयी..\n" +
                "जब तुमने सोचा एक पल के लिए,\n" +
                "अंजाम-ए-दीवानगी क्या होगी,\n" +
                "जब तुम मिलोगे मुझे उम्र भर के लिए।\n" +
                "हैप्पी रोज डे"));
        list.add(new ShayariData("जिसे पाया ना जा सके वो जनाब हो तूम,\n" +
                "मेरी जिंदगी का पहला ख्वाब हो तूम,\n" +
                "लोग चाहे कुछ भी कहे लेकिन,\n" +
                "मेरी जिंदगी का एक सुन्दर सा गुलाब हो तूम।"));
        list.add(new ShayariData("फूल खिलते रहे आपकी ज़िन्दगी की राहो में,\n" +
                "हंसी चमकती रहे आपकी निगाहों में\n" +
                "कदम कदम पर मिले खुशियाँ आपको,\n" +
                "दिल देता हैं यही दुआ बार बार आपको।"));
        list.add(new ShayariData("इस कदर हम उनकी मोहब्बत में खो गये,\n" +
                "बस एक नजर पड़ी और हम उनके हो गये।"));
        list.add(new ShayariData("बड़े ही चुपके से भेजा था\n" +
                "मेरे मेहबूब ने मुझे एक गुलाब,\n" +
                "कम्भख्त उसकी खुशबू ने\n" +
                "सारे शहर में हंगामा कर दिया।"));
        list.add(new ShayariData("एक अजनबी से मुझे इतना प्यार क्यों है\n" +
                "इनकार करने पर चाहत का इजहार क्यों है\n" +
                "उसे पाना नहीं मेरी तक़दीर में मैं शायद….\n" +
                "फिर हर मोड़ पे उसी का इन्तजार क्यों है।\n" +
                "हैप्पी रोज डे"));
        list.add(new ShayariData("रिश्तों से बड़ी चाहत क्या होगी,\n" +
                "दोस्ती से बड़ी इबादत क्या होगी,\n" +
                "जिसे दोस्त मिल जाये आप जैसा\n" +
                "उसे जिन्दगी से शिकायत क्या होगी।"));
        list.add(new ShayariData("हुस्न और खुशबु का सबब हो तुम,\n" +
                "ऐसा खिलता हुआ गुलाब हो तुम,\n" +
                "तुम जैसा हसीन ना होगा इस जहां में,\n" +
                "तमाम हसीनों में लाजवाब हो तुम!"));
        list.add(new ShayariData("तुम्हारी अदा का क्या जवाब दूँ,\n" +
                "क्या खूबसूरत सा उपहार दूँ,\n" +
                "कोई तुमसे प्यारा गुलाब होता तो लाते,\n" +
                "जो खुद गुलाब है उसको क्या गुलाब दूँ।"));
        list.add(new ShayariData("तेरी आहट से ही मेरे चेहरे पर मुस्कान आ जाती हैं,\n" +
                "तेरे होने का अहसास मेरी साँसे बयाँ कर जाती हैं,\n" +
                "ये सुन्दर गुलाब तेरी ही यादों का हिस्सा हैं\n" +
                "जिन्हें देख फिर से वो खुशियाँ जवां हो जाती हैं।"));
        list.add(new ShayariData("चला जा SMS गुलाब बन के,\n" +
                "होगी सच्ची दोस्ती तो आएगा जवाब,\n" +
                "अगर ना आये तो मत होना उदास,\n" +
                "बस समझ लेना की मेरे लिए वक्त नही था उनके पास।"));
        list.add(new ShayariData("आपके होंठो पे सदा खिले गुलाब रहे\n" +
                "खुदा ना करे आप कभी उदास रहे\n" +
                "हम आप के पास चाहे रहे ना रहे\n" +
                "आप जिन्हें चाहते हैं वो हमेशा आपके पास रहें।\n" +
                "हैप्पी रोज डे"));
        list.add(new ShayariData("गुलाब की खूबसूरती भी फिकी सी लगती है\n" +
                "जब तेरे चेहरे पर मुस्कान खिल उठती है\n" +
                "यूँ हीं मुस्कुराते रहना मेरे प्यार तू\n" +
                "तेरी खुशियों से मेरी साँसे जी उठती है।"));
        list.add(new ShayariData("जैसे गुलाब, गुलाब के गुच्छे बगैर नहीं रह सकता,\n" +
                "मेरा सच्चा प्यार आप हो, मैं तुम्हें प्यार करता हूं,\n" +
                "आपके बिना मैं रह नहीं सकता।"));
        list.add(new ShayariData("फिजाओं का मौसम जाने के बाद बहारों का मौसम आया,\n" +
                "गुलाब से गुलाब का रंग तेरे गालों पर आया,\n" +
                "तेरे नैनो ने काली घटा का जब काजल लगाया,\n" +
                "जवानी जो तुम पर आई तो नशा मेरी आँखों में आया।"));
        list.add(new ShayariData("प्यार के समंदर में सब डूबना चाहते हैं,\n" +
                "प्यार में कुछ खोते हैं तो कुछ पाते हैं,\n" +
                "प्यार तो एक गुलाब है जिसे सब तोडना चाहते हैं,\n" +
                "हम तो इस गुलाब को चूमना चाहते हैं।"));
        list.add(new ShayariData("एक रोस उनके लिए\n" +
                "जो मिलते नही रोज़-रोज़,\n" +
                "मगर याद आते है हर रोज़।"));
        list.add(new ShayariData("यादों की बरसात लिए\n" +
                "दुआओं की सौगात लिए\n" +
                "दिल की गहराई से\n" +
                "चाँद की रौशनी से\n" +
                "फूलों कागज पर\n" +
                "आप के लिए सिर्फ 3 लफ्ज\n" +
                "“I LOVE YOU”"));
        list.add(new ShayariData("आपका मुस्कुराना हर रोज हो,\n" +
                "कभी चेहारा कमल तो कभी रोज़ हो,\n" +
                "सौ पल खुशी हजार पल मौज हो,\n" +
                "बस ऐसा ही दिन आपका हर रोज हो।"));
        list.add(new ShayariData("फूलों जैसी लबों पर हंसी हो,\n" +
                "जीवन में आपके कोई ना बेबसी हो,\n" +
                "ले आए हम प्यारा सा गुलाब आपके लिए,\n" +
                "बस अब इस गुलाब जैसी प्यारी आपकी जिंदगी हो।"));
        list.add(new ShayariData("रोज रोज रोज डे आये,\n" +
                "फिर तू मेरे लिए गुलाब लाये,\n" +
                "इसी बहाने से सही,\n" +
                "तू मुझसे मिलने तो आये।"));
        list.add(new ShayariData("तुम्हारी अदा का क्या जवाब दूँ,\n" +
                "क्या प्यारा सा उपहार दूँ,\n" +
                "कोई तुमसे खुबसूरत गुलाब होता तो लाते,\n" +
                "जो खुद गुलाब है उसको क्या गुलाब दूँ।"));
        list.add(new ShayariData("ये लम्हा मेरी मोहब्बत से भरा है,\n" +
                "ये समां मेरी मोहब्बत से भरा है,\n" +
                "इस गुलाब को सिर्फ गुलाब मत समझना,\n" +
                "और से देखना ये गुलाब मेरी मोहब्बत से भरा है।"));
        list.add(new ShayariData("फूल बनकर हम महकना जानते हैं,\n" +
                "मुस्कुरा के हम गम भूलाना जानते हैं,\n" +
                "लोग खुश होते है हमसे,\n" +
                "क्योंकि बिना मिले ही हम रिश्ते निभाना जानते हैं।"));
        list.add(new ShayariData("मुहब्बत लफ्जों की मोहताज नहीं होती\n" +
                "जब तन्हाई में आपकी याद आती है\n" +
                "होंठों पे एक ही फ़रियाद आती है\n" +
                "खुदा आपको हर ख़ुशी दे\n" +
                "क्यूंकि आज भी हमारी हर ख़ुशी आपके बाद आती है।"));
        list.add(new ShayariData("तुम हसीन हो, गुलाब जैसी हो,\n" +
                "बहुत नाजुक हो ख्वाब जैसी हो,\n" +
                "होंठों से लगाकर पी जाऊं तुम्हे\n" +
                "सर से पाँव तक शराब जैसी हो।"));
        list.add(new ShayariData("मेरे आंसुओं में तू ही छुपी रहती हैं,\n" +
                "रोज आंखों से तू ही तो बरसती हैं,\n" +
                "किसी गुलाब की बेटी है तू शायद,\n" +
                "इसलिए मुरझाकर भी महकती हैं।"));
        list.add(new ShayariData("फूल बनकर मुस्कुराना ज़िन्दगी\n" +
                "मुस्कुराके गम भुलाना ज़िन्दगी\n" +
                "जीत कर कोई खुश हो तो क्या हुआ\n" +
                "हार कर खुशियाँ मानना भी ज़िन्दगी।"));
        list.add(new ShayariData("गुलाब गुलाब होता है\n" +
                "उसे रोज ना कहो\n" +
                "दोस्त दोस्त होता है\n" +
                "उसे दुश्मन ना कहो।"));
        list.add(new ShayariData("फूलों जैसी लवों पर हसी हो,\n" +
                "जीवन में आपको कोई न बेबसी हो,\n" +
                "ले आये हम प्यारा सा गुलाब आपके लिए\n" +
                "बस इस गुलाब जैसी प्यारी आपकी जिन्दगी हो।"));
        list.add(new ShayariData("गुलाब लाये है तेरे दीदार के लिए,\n" +
                "पर वो भी मुरझा गया तेरे नूर के आगे,\n" +
                "तू ऐसा खूबसूरत हिरा हैं,\n" +
                "की कोहिनूर भी सोचे तुझे पाने के लिए।"));
        list.add(new ShayariData("बीते साल के बाद फिर से रोज डे आया हैं\n" +
                "मेरी आँखों में सिर्फ तेरा ही सुरूर छाया हैं\n" +
                "जरा तुम आकर तोह देखो एक बार\n" +
                "तुम्हारे इंतजार में पुरे घर को सजाया हैं।"));
        list.add(new ShayariData("लोग मंजिल को मुश्किल समझते हैं,\n" +
                "हम मुश्किल को मंजिल समझते हैं,\n" +
                "बड़ा फर्क है लोगों में और हम में,\n" +
                "लोग जिंदगी को दोस्त,\n" +
                "और हम दोस्त को जिंदगी समझते हैं,\n" +
                "आदत अलग है हमारी दुनिया वालों से,\n" +
                "कम दोस्त रखते है मगर लाजवाब रखते हैं,\n" +
                "क्योंकि बेशक हमारी माला छोटी हैं,\n" +
                "पर फूल उसमें सारे गुलाब के रखते हैं।"));
        list.add(new ShayariData("इकरार में शब्दों की एहमियत नहीं होती\n" +
                "दिल के जज्बात की आवाज़ नहीं होती\n" +
                "आँखें बयान कर देती हैं दिल की दास्तान\n" +
                "मोहब्बत लफ्जों की मोहताज़ नहीं होती।"));
        list.add(new ShayariData("किसी फूल में उतनी ख़ुशबू नहीं,\n" +
                "जितना मुझमें तुम महकते हों।"));
        list.add(new ShayariData("यूँ तो प्यार जताने के लिए,\n" +
                "किसी गुलाब की जरूरत नहीं हैं मुझे,\n" +
                "क्योंकि हर पल दिल से बहुत चाहा हैं तुझे।"));
        list.add(new ShayariData("तेरी हर अदा महोब्बत सी लगती है\n" +
                "एक पल की जुदाई सदियों सी लगती है\n" +
                "पहले नई सोचा था अब सोचने लगा हूँ\n" +
                "ज़िन्दगी की हर लम्हे में तेरी ज़रूरत सी लगती है।"));
        list.add(new ShayariData("सात फरवरी को साथ तेरा पाने को,\n" +
                "दिल से तेरे दिल मिलाने को,\n" +
                "आया हूँ लेकर गुलाब तेरे बालों में सजाने को,\n" +
                "आ जा गले से लगाले अपने इस दीवाने को।"));
        list.add(new ShayariData("बहाने से आपकी बात करते हैं\n" +
                "हर पल आपको महसूस करते हैं\n" +
                "इतनी बार सांस न लेते होंगे\n" +
                "जितनी बार हम आपको याद करते हैं।"));
        list.add(new ShayariData("आज दिल चाहता है तुझे गुलाब से सजा दूं,\n" +
                "प्यार सारा तुझ पर लुटा दूँ,\n" +
                "आकर तेरी जुल्फों के सायें में,\n" +
                "सारी दुनिया को भुला दूँ।"));
        list.add(new ShayariData("किसने कहा पगली तुझसे कि\n" +
                "हम तेरी खूबसूरती पर मरते हैं\n" +
                "हम तो तेरी गुलाबी आँखों पर मरते हैं,\n" +
                "जिस अदा से तू हमें देखती है।"));
        list.add(new ShayariData("लफ्जों की तरह तुझे किताबों में मिलेंगे,\n" +
                "बन के महक तुझे गुलाबो में मिलेंगे,\n" +
                "खुद को कभी अकेला न समझना\n" +
                "हम तुझे तेरे दिल में या तेरे ही ख्यालों में मिलेंगे।"));
        list.add(new ShayariData("एक रोज उनके लिए,\n" +
                "जो मिलते नहीं रोज रोज,\n" +
                "मगर याद आते हैं हर रोज।"));
        list.add(new ShayariData("किताब-ए-दर्द का सूखा हुआ गुलाब नहीं होना मुझे,\n" +
                "मोहब्बत में इस तरह भी कामयाब नहीं होना मुझे।\n"));
        list.add(new ShayariData("एक नन्हीं सी किरण चुराने आए हैं\n" +
                "खुशियों का अहसास दिल में बसाने आए हैं\n" +
                "नीद की मदहोसी से जो लिपटे हुए हैं\n" +
                "हम उन्हें प्यार से जगाने आए हैं।"));
        list.add(new ShayariData("आप मिलते नहीं रोज रोज,\n" +
                "आपकी याद आती हैं हर रोज,\n" +
                "हमने भेजा हैं रेड रोज,\n" +
                "जो आपको हमारी याद दिलाएगा हर रोज।"));
        list.add(new ShayariData("ये रोज डे रोज रोज आये,\n" +
                "तू भी मुझे मिलने फिर यु रोज आये,\n" +
                "लेकर गुलाब हाथों में मेरे नेनों से नेन मिलाये,\n" +
                "और ये तेरा दीवाना तेरी झील सी आँखों में डूब जाये।"));
        list.add(new ShayariData("फूल खिलते रहे जिंदगी की राह में,\n" +
                "हँसी चमकती रहे आपकी निगाह में,\n" +
                "कदम कदम पर मिले ख़ुशी की बहार आपको,\n" +
                "दिल देता है यही दुआ बार बार आपको।"));
        list.add(new ShayariData("इस चमन से जुदा हुआ एक गुलाब हूँ मैं,\n" +
                "खुद अपनी ही तबाही का जवाब हूँ मैं,\n" +
                "यूँ नजरे न फेर मुझसे ऐ मेरे सनम,\n" +
                "तेरी चाहतों में ही बर्बाद हुआ हूँ मैं।"));
        list.add(new ShayariData("दोस्ती का रिश्ता अनोखा है\n" +
                "ना गुलाब सा है ना काँटों सा\n" +
                "दोस्ती का रिश्ता तो उस डाली की तरह है\n" +
                "जो गुलाब और काँटों दोनों को एक साथ जोड़े रखता है।"));
        list.add(new ShayariData("गिन गिन के लाये गुलाब हम प्यारे\n" +
                "जैसे तारों में कुछ खूबसूरत तारे\n" +
                "तुम इन्हें रखना संभाल के सनम\n" +
                "यही भरे है प्यार से हमारे।"));
        list.add(new ShayariData("गुलाब तो टूट कर बिखर जाता है,\n" +
                "पर खुशबु हवा में बरकरार रहती हैं,\n" +
                "जाने वाले तो छोड़ कर चले जाते हैं,\n" +
                "पर एहसास तो दिलों में बरकरार रहते हैं।"));
    }
    private void initList2() {

        list.add(new ShayariData("दिल करता हैं ज़िन्दगी तुझे दे दू,\n" +
                "ज़िन्दगी की सारी खुशियाँ तुझे दे दू,\n" +
                "दे दे अगर तू मुझे भरोसा अपने साथ का,\n" +
                "तो यकीन मान अपनी सांसे भी तुझे दे दू"));
        list.add(new ShayariData("ज़मीन के हर ज़र्रे को आफताब कर देंगे,\n" +
                "गुलशन के हर फूल को गुलाब कर देंगे,\n" +
                "एक पल भी ना रह सकोगे हमारे बिन,\n" +
                "आपकी सब आदत हम इतनी ख़राब कर देंगे"));
        list.add(new ShayariData("कसूर तो था ही इन निगाहों का\n" +
                "जो चुपके से दीदार कर बैठा\n" +
                "हमने तो खामोश रहने की ठानी थी\n" +
                "पर बेवफा ये ज़ुबान इज़हार कर बैठा"));
        list.add(new ShayariData("दिल ये मेरा तुमसे प्यार करना चाहता हैं….\n" +
                "अपनी मोहब्बत का इज़हार करना चाहता है\n" +
                "देखा हैं जब से तुम्हे मेने मेरे ए-सनम…\n" +
                "सिर्फ तुम्हारा ही दीदार करने को दिल चाहता हैं\n"));
        list.add(new ShayariData("मेरी सारी हसरतें मचल गयी..\n" +
                "जब तुमने सोचा एक पल के लिए\n" +
                "अंजाम-ए- दीवानगी क्या होगी\n" +
                "जब तुम मिलोगी मुझे उम्र भर के लिए\n" +
                "हैप्पी प्रोपोज़ डे\n"));
        list.add(new ShayariData("तेरी खुशियों को सजाना चाहता हूं,\n" +
                "तुझे देख कर मुस्कुराना चाहता हूं,\n" +
                "मेरी जिंदगी में क्या अहमियत है तेरी,\n" +
                "यह लफ्जों में नहीं पास आकर बताना चाहता हूं."));
        list.add(new ShayariData("सीने से लगा कर तुमसे बस इतना ही कहना है,\n" +
                "मुझे जिंदगी भर आपके ही साथ रहना है..!!\n"));
        list.add(new ShayariData("मेरे दिल की बात सुन लो जरा,\n" +
                "साथी अपनी राहों का हमें चुन लो जरा,\n" +
                "प्यार करेंगे तुम्हें हर कदम के साथ,\n" +
                "यकीन नहीं हो तो तुम आजमा लो जरा.."));
        list.add(new ShayariData("इस दिल को अगर तेरा एहसास नहीं होता,\n" +
                "तू दूर भी रह कर के यूँ पास नहीं होता, इस दिल में तेरी चाहत कुछ ऐसे बसा ली है,\n" +
                "एक लम्हा भी तुझ बिन कुछ खास नहीं होता.!"));
        list.add(new ShayariData("तेरे साथ रहते रहते तेरी चाहत सी हो गई,\n" +
                "तुझसे बात करते-करते हमें तेरी आदत सी हो गई, एक पल भी ना मिले तुमसे तो बेचैनी सी रहती है,\n" +
                "दोस्ती निभाते निभाते हमें ना जाने कब मोहब्बत सी हो गई!"));
        list.add(new ShayariData("कसूर तो था ही इन निगाहों का जो चुपके से दीदार कर बैठा,\n" +
                "हमने तो खामोश रहने की ठानी थी पर बेवफा ये जुबान इजहार कर बैठा.."));
        list.add(new ShayariData("मेरे जीने की नई आस हो तुम, मेरी जिंदगी की प्यास हो तुम,\n" +
                "ढूंढता है दिल जिसे बेसब्र होकर, जिंदगी की वो तलाश हो तुम.."));
        list.add(new ShayariData("मुझे इन राहों में तेरा साथ चाहिए,\n" +
                "तन्हाइयों में तेरा हाथ चाहिए,\n" +
                "खुशियों से भरे इस संसार में\n" +
                "तेरा प्यार चाहिए.."));
        list.add(new ShayariData("Dil ye mera Tumse Pyar karna chahta hai,\n" +
                "Apni Mohabbat ka izhaar karna chahta hai,\n" +
                "Dekha hai jab se Tumhe aey mere Sanam,\n" +
                "Sirf tumhara hi Dedaar karne ko dil chahta hai."));
        list.add(new ShayariData("Kuch door mere saath chalo\n" +
                "Hum saari kahani keh denge\n" +
                "Samjhe na tum jise aankhon se\n" +
                "Wo baat muh Jubaani keh denge I love u my love.."));
        list.add(new ShayariData("Mujhe in raaho me tera saath chahiye,\n" +
                "Tanhaiyo me tera hath chahiye,\n" +
                "Khushiyon se bhare is sansar me tera pyaar chahiye."));
        list.add(new ShayariData("Mujhe in raahon me tera sath chahiye,\n" +
                "Tanhaiyo mein tera haath chahiye.."));
        list.add(new ShayariData("Dil ye mera Tumse Pyar karna chahta hai,\n" +
                "Apni Mohabbat ka izhaar karna chahta hai,\n" +
                "Dekha hai jab se Tumhe aey mere Sanam,\n" +
                "Sirf tumhara hi Dedaar karne ko dil chahta hai"));
        list.add(new ShayariData("Dil karta hain zindagi tujhe de du,\n" +
                "Zindagi ki saari khusiyan tujhe de du..\n" +
                "De de agar tu mujhe bharosa apne saath ka.\n" +
                "To yakeen maan apni saanse bhi tujhe de du."));
        list.add(new ShayariData("Unhe chahna hamari kamjori hai\n" +
                "Unse keh nahi pana hamari majboori hai\n" +
                "Wo kyun nahi samajhtey hamari khamoshi ko\n" +
                "Kya pyar ka izhaar karna itna jaruri hain..!!"));
        list.add(new ShayariData("Ham apne pyaar ka izhaar isliye nahi karte hain,\n" +
                "Kyunki ham unki han ya na se darte hain,\n" +
                "Agar unhone kar di han to ham khushi se mar jayenge\n" +
                "Aur agar unhone kar di na to ro ro ke mar jayenge!!!"));
        list.add(new ShayariData("Aankho ki gehrai ko samaz nahi sakte,\n" +
                "Honto se kuch keh nahi sakte.\n" +
                "Kaise baya kare hum aapko yeh dil ka haal ki,\n" +
                "Tumhi ho jiske bageir hum reh nahi sakte."));
        list.add(new ShayariData("Pyaar kya hai na poocho tum mujhse\n" +
                "Kya batane se maan jaao ge?\n" +
                "Yoon bataane se fayda bhi naheen\n" +
                "Kar ke dekho to jaan jaao ge.. "));
        list.add(new ShayariData("Meri Hasratein machal gayi,\n" +
                "Jab tumne socha ek pal ke liye, Anjaam-e-deewangi kya hogi,\n" +
                "Jab tum milogi mujhe umr bhar ke liye.."));
        list.add(new ShayariData("Cutest Proposal Ever:\n" +
                "Girl- Tum mera picha kar rahe ho?\n" +
                "Boy- Nahi, tum mere agge chal rahi ho.\n" +
                "Girl- Tum chahte kya ho?\n" +
                "Boy- Sath sath chalna ♥"));
        list.add(new ShayariData("Kasoor toh tha hi in nigaahon ka,\n" +
                "Joh chupke se deedar kar betha,\n" +
                "Humne to khamosh rehne ki thani thi,\n" +
                "Par bewafa ye zuban izhar kar betha."));
        list.add(new ShayariData("Zameen ke har zarre ko aftab kar denge,\n" +
                "Gulshan ke har phool ko gulab kar denge,\n" +
                "Ek pal bhi na reh sakoge hamare bin,\n" +
                "Aap ki sab aadat hum itni kharab kr denge.."));
        list.add(new ShayariData("Dil karta hai zindagi tujhe de du,\n" +
                "Zindagi ki saari khusiyan tere naam kar du..\n" +
                "De de agar tu mujhe bharosa apne saath ka,\n" +
                "To yakeen maan apni saanse bhi tere naam kar du."));
        list.add(new ShayariData("Tere dil ko sajayenge apne arman dekar\n" +
                "Tere labo ko hasayenge apni muskan dekar\n" +
                "Pyar ki kasam tuje kabar se b utha layenge\n" +
                "Tere jism mein hum apni jaan dekar Happy Propose Day"));
        list.add(new ShayariData("Dil do kisi ek ko, wo bhi kisi nek ko,\n" +
                "Yeh koi mandir ka parsad nahi,\n" +
                "Jo baantte rahe har ek ko,\n" +
                "Dil denge kisi ek ko wo bhi kisi nek ko,\n" +
                "Jab tak girl freind nahi pat jaati,\n" +
                "Propose kerenge har ek ko.. "));
        list.add(new ShayariData("Meri prem kahani ka kya ajeeb ending tha,\n" +
                "Meri prem kahani ka kya ajeeb ending tha,\n" +
                "Maine propose kiya sms se,\n" +
                "Kambhakt wo uski shadi tak pending tha."));
        list.add(new ShayariData("Kuch door mere saath chalo,\n" +
                "Hum saari kahani keh denge,\n" +
                "Samjhe na tum jise aankhon se,\n" +
                "Wo baat muh Jubaani keh denge. I love u my love…"));
        list.add(new ShayariData("Boy – I love u\n" +
                "Girl – hahahaha\n" +
                "Boy – Main tumhari khatir apni jaan bhi de sakta hoon\n" +
                "Girl: hahahahaha\n" +
                "Boy: Tumhare bina main zinda nahi reh sakta,\n" +
                "Girl – hahahahahahahaha\n" +
                "Boy – Main tum ko 1000 ka balance bhejh raha hu, mil jaye to bata dena\n" +
                "Girl – kab?\n" +
                "Boy – Hahahahahahahahahaha\n"));
        list.add(new ShayariData("Ankho se aankhe milakar to dekho,\n" +
                "Humare dil se dil milakar to dekho,\n" +
                "Saare jaha ki khushiya tere daaman mai rakh denge,\n" +
                "Humse pyaar ka izhaar karke to dekho"));
        list.add(new ShayariData("Ladki ki nazro mei nazakat hoti hai,\n" +
                "Uske inkar mei bhi ijaajat hoti hai,\n" +
                "Humesha piche pad jao jab tak haan na bole,\n" +
                "Kyunki der se haan karna ladkiyo ki aadat hoti hai"));
        list.add(new ShayariData("nhe chahna hamari kamzori hai,\n" +
                "Unse keh na pana hamari majboori hai,\n" +
                "Wo kyun nai samajhte hamaari khaamoshi ko,\n" +
                "Kya payar ka izhaar karna zaruri hai."));
        list.add(new ShayariData("Na Main Tumhe Khona Chahta Hun,\n" +
                "Na Teri Yaad Me Rona Chahta Hun,\n" +
                "Jab Tak Zindagi Hai Main Hamesa Tumhare Sath Rahunga,\n" +
                "Bas Yahi Baat Tumse Kehna Chahta Hun."));
        list.add(new ShayariData("Ye dil tum se pyaar karna chahta hain,\n" +
                "Apni Mohabbat ka Iqraar karna chahta hain."));
        list.add(new ShayariData("मुझे मेरे कल कि फिक्र तो आज भी नही है,\n" +
                "पर ख्वाहिश तुझे पाने कि कयामत तक रहेगी"));
        list.add(new ShayariData("मुक्तसर सी ज़िन्दगी है मेरी तेरे साथ जीना चाहता हूँ,\n" +
                "कुछ नहीं मांगता खुदा से बस तुझे मांगता हूँ."));
        list.add(new ShayariData("ऐ मेरी जान – ए – गजल,\n" +
                "क्यों तेरी चाहत ना करू ?\n" +
                "सास रुक जाए अगर,\n" +
                "तुझसे मोहब्बत ना करू।"));
        list.add(new ShayariData("ना हम तुम्हें खोना चाहते हैं,\n" +
                "ना तुम्हारी याद में रोना चाहते हैं,\n" +
                "जब तक है मेरी जिंदगी,\n" +
                "हम तुम्हारे साथ होना चाहते हैं i"));
        list.add(new ShayariData("ये वादा है हमारा,\n" +
                "ना छोडेंगे कभी साथ तूम्हारा,\n" +
                "जो गये तूम हम को भूल कर,\n" +
                "ले आयेंगे पकड कर हाथ तुम्हारा।"));
        list.add(new ShayariData("तेरी आँखों की गहराई को समझ नहीं सकते,\n" +
                "होंटो से कुछ कह नहीं सकते,\n" +
                "कैसे बया करे हम आपको यह दिल का हाल की,\n" +
                "तुम्ही हो जिसके बगैर हम रह नहीं सकते।"));
        list.add(new ShayariData("एक दिन कह लीजिए,\n" +
                "जो कुछ है दिल में आप के,\n" +
                "एक दिन सुन लीजिए,\n" +
                "जो कुछ है हमारे दिल में।"));
        list.add(new ShayariData("लबो को रखना चाहते है खामोश,\n" +
                "पर दिल कहने को बेकरार है,\n" +
                "मोहब्बत है तुमसे हा मोहब्बत बेशुमार है।"));
        list.add(new ShayariData("तुझसे ऐतबार करना है,\n" +
                "दिलो जान से प्यार करना है,\n" +
                "ख्वाहिश ज्याद नहीं बस इतनी है मेरी,\n" +
                "की हर लम्हे में तुझे अपना बना के रखना है।"));
        list.add(new ShayariData("इस एहसास में ख़ुशी है,\n" +
                "पर इसे मैं दिखा नहीं सकता,\n" +
                "प्यार करता हूँ तुमसे,\n" +
                "मैं चाह कर भी छुपा नहीं सकता।"));
        list.add(new ShayariData("मेरे जीने की नयी आस हो तुम,\n" +
                "मेरी जिन्दगी की प्यास हो तुम,\n" +
                "ढूंढ़ता है दिल जिसे बेसब्र होकर,\n" +
                "जिन्दगी की वो तलाश हो तुम।"));
        list.add(new ShayariData("दिल की जो हालत है,\n" +
                "मेरी वो मैं तुमसे कह नहीं सकता,\n" +
                "काश तुम इस एहसास को समझो,\n" +
                "तुम्हारे बिना मैं रह नहीं सकता।"));
        list.add(new ShayariData("इकरार में शब्दों की एहमियत नही होती,\n" +
                "दिल के जज़बात की आवाज़ नही होती,\n" +
                "आँखें बयान कर देती हैं दिल की दास्तान,\n" +
                "मोहब्बत लफज़ो की मोहताज़ नही होती।"));
        list.add(new ShayariData("तन्हाइयों में उनको ही याद करते हैं,\n" +
                "वो सलामत रहे यही फरियाद करते है,\n" +
                "हम उनकी ही मोहबत का इंतज़ार करते है,\n" +
                "उनको क्या पता हम उनसे कितना प्यार करते हैं"));
        list.add(new ShayariData("कितना प्यार है तुमसे, ये जान लो,\n" +
                "जिंदगी हो आप,यह बात मान लो,\n" +
                "तुम्हें देने के लिए, मेरे पास कुछ नहीं,\n" +
                "बस एक जान है, जब जी चाहे मांग लो।"));
        list.add(new ShayariData("प्यार क्या है ना पूछों तुम मुझसे,\n" +
                "क्या बताने से मान जाओगे,\n" +
                "यूं बताने से फायदा भी नहीं,\n" +
                "कर के देखो तो जान जाओगे।"));
        list.add(new ShayariData("मेरे दिल की बात सुन लो ज़रा,\n" +
                "साथी अपनी राहो का हमे चुन लो ज़रा,\n" +
                "प्यार करेंगे तुम्हें हर कदम के साथ,\n" +
                "यकीन नहीं हो तो तुम आज़मा लो ज़रा।"));
        list.add(new ShayariData("खुलकर ये बात स्वीकार करता हूं,\n" +
                "कि मैं तुमसे बहुत प्यार करता हूं,\n" +
                "आज प्रपोज डे है इसीलिए,\n" +
                "अपने प्यार का इजहार करता हूँ।"));
        list.add(new ShayariData("तेरी आंखों में खोना चाहता हूं,\n" +
                "तेरी जुल्फों तले सोना चाहता हूं,\n" +
                "मुझे किसी और का नहीं होना,\n" +
                "मैं सिर्फ तेरा होना चाहता हूं।\n"));
        list.add(new ShayariData("कुछ सोचु तो तेरा ही ख्याल आता हैं,\n" +
                "कुछ बोलू तो तेरा नाम आता हैं,\n" +
                "कब तक मैं छुपाऊँ अपने दिल की बात,\n" +
                "तेरी हर एक अदा पे हमे प्यार आता हैं।"));
        list.add(new ShayariData("मैं एक हाथ से\n" +
                "पूरी दुनिया से लड़ सकता हूँ,\n" +
                "बस मेरे दुसरे हाथ में\n" +
                "तेरा हाथ होना चाहिए।\n"));
        list.add(new ShayariData("मोहब्बत की कीमत कमी चुकाई नहीं जाती,\n" +
                "हो जाये अगर मोहब्बत तो छिपाई नही जाती,\n" +
                "वक्त के रहते मोहब्बत का इजहार कर दो,\n" +
                "वरना वक्त के बाद मोहबत जताई नही जाती।"));
        list.add(new ShayariData("आँखों से आँखे मिलाकर तो देखो,\n" +
                "हमारे दिल से दिल मिलाकर तो देखो,\n" +
                "सारे जहां की खुशिया तेरे दामन में रख देंगे,\n" +
                "हमसे प्यार का इज़हार करके तो देखो।"));
        list.add(new ShayariData("सीने में जो दब गये हैं,\n" +
                "वो ज़ज्बात क्या कहें,\n" +
                "खुद ही समझ लीजिए,\n" +
                "अब हर बात क्या कहें ! !"));
        list.add(new ShayariData("याद रुकती नहीं, रोक पाने से,\n" +
                "दिल मानता नहीं किसी के समझाने से,\n" +
                "रुक जाती है। धड़कन आपके भूल जाने से,\n" +
                "इसलिए आपको याद करते हैं मैसेज के बहाने से।\n"));


    }
    private void initList3() {

        list.add(new ShayariData("नादानी में हम किस्से अपना समझ बैठे,\n" +
                "जो दिखाया उस बेवफा ने सपना\n" +
                "हम हकीकत समझ बैठे,\n" +
                "देखो आज छोड़ दिया हमें उसने एक गैर के लिए,\n" +
                "जिससे हम अपना हमसफर समझ बैठे"));
        list.add(new ShayariData(".दिखावे की मोहब्बत से बेहतर हैं हमसे नफरत किजिए जनाब !\n" +
                "हम सच्चे जज़्बातों की बड़ी कदर करते हैं, आज चॉकलेट डे है !”\n" +
                "हैप्पी चॉकलेट डे!"));
        list.add(new ShayariData(".मीठा तो होना चाहिए\n" +
                "मीठे से ज्यादा मीठा प्यार होना चाहिए,\n" +
                "दुनिया में कुछ ना हो इतना मीठा\n" +
                "जितना मीठा अपना साथ होना चाहिए"));
        list.add(new ShayariData("जानते है वो फिर भी अनजान बनते है,\n" +
                "इसी तरह वो हमें परेशान करते है,\n" +
                "पूछते है हमसे कि आपको क्या पसंद है,\n" +
                "खुद जवाब होकर सवाल करते है,"));
        list.add(new ShayariData("Dairy Milk ने Perk से कहा, हम दुनियाँ में सबसे स्वीट है\n" +
                "लेकिन Perk ने कहा, तुम्हें शायद नहीं पता\n" +
                "जो इस SMS को पढ़ रहा है, वो हमसे भी ज्यादा Sweet है।"));
        list.add(new ShayariData(".मुझे इन राहो में तेरा साथ चाहिए,\n" +
                "तन्हाइयो में तेरा हाथ चाहिए,\n" +
                "खुशियों से भरे इस संसार में तेरा प्यार चाहिए,"));
        list.add(new ShayariData("दोस्ती के वादों को यूँ ही निभाते रहेंगे हम\n" +
                "हर वक़्त आपको यूँ ही सताते रहेंगे,\n" +
                "मर भी जायेंगे तो क्या ग़म है,\n" +
                "हम आंसू बन कर आपकी आँखों में आते रहेंगे।"));
        list.add(new ShayariData("ब्रह्मांड में दो ही बातें सत्य हैं\n" +
                "पहला सत्य: 10 में से 9 लोगों को चॉकलेट पसंद होता है\n" +
                "दूसरा सत्य: 10वां व्यक्ति झूठ बोल रहा है"));
        list.add(new ShayariData(".इस स्वीट से दिन मै\n" +
                "अपने स्वीट से फ्रेंड को\n" +
                "स्वीट सी चॉकलेट, मेरी और से."));
        list.add(new ShayariData(".चॉकलेट प्यार से भरी ला दो मुझको,\n" +
                "आज अपने ही हाथों से तुम खिला दो मुझको,\n" +
                "रिश्ता जो अपना है मोहब्बत का\n" +
                "आज मीठा और बना दो उसको"));
        list.add(new ShayariData(".हाय डियर, यूं कहने को तो हम बड़े खुश मिजाज है,\n" +
                "रुला देती है तेरे प्यार की हसरत कभी-कभी"));
        list.add(new ShayariData(".हर रिश्ते में विश्वास रहने दो\n" +
                "जुबान पर हर वक़्त मिठास रहने दो\n" +
                "यही तो अंदाज़ है जिंदगी जीने का\n" +
                "न खुद रहो उदास, न दूसरों को रहने दो ।"));
        list.add(new ShayariData("सुना है डार्क चॉकलेट खाने से वजन कम होता है\n" +
                "आज से तुम भी बत्ती बंद करके चॉकलेट खाना"));
        list.add(new ShayariData("आया है तेरी याद लाया है,\n" +
                "आजाओ आज दिल ने तुजे फिर बुलाया है"));
        list.add(new ShayariData("चॉकलेट हो जाए प्यारी-प्यारी\n" +
                "हो जो दोनों की हमारी,\n" +
                "जिसे शेयर करके खाना है\n" +
                "जिंदगी भर साथ निभाना है।\n" +
                "ए जान-ऐ-तम्मना तुझे मनाने के लिए,"));
        list.add(new ShayariData(".थोड़ा मीठा थोड़ा प्यार,\n" +
                "लाये तुम्हारे लिए यार,"));
        list.add(new ShayariData(".मुझे खामोश राहों में तेरा साथ चाहिए,\n" +
                "तनहा है मेरा हाथ तेरा हाथ चाहिए,\n" +
                "जूनून-ई-इश्क को तेरी ही सौगात चाहिए,\n" +
                "मुझे जीने के लिए तेरा ही प्यार चाहिए."));
        list.add(new ShayariData("मीठी इंतजार और इंतजार से भी यार मीठा\n" +
                "मीठा यार और यार से भी प्यार मीठा\n" +
                "मीठा प्यार और प्यार से मीठी अपनी यारी"));
        list.add(new ShayariData("आज चॉकलेट डे है\n" +
                "चॉकलेट तो खिलाओ\n" +
                "मिठी मिठी कोई बात तो सुनाओ\n" +
                "कबसे तड़प रहे हैं हम आपके प्यार में\n" +
                "आज तो हमे अपने पास बुलाओ."));
        list.add(new ShayariData(".जो होती हो किसी दर पर दुआ कबूल,\n" +
                "यकींन मानो उस दर पर मेरी जुबां पर\n" +
                "सिर्फ तुम्हारा जिक्र होगा |"));
        list.add(new ShayariData("एक डेरी मिल्क इंसान को उसके इस\n" +
                "फाइव स्टार दोस्त की तरफ से"));
        list.add(new ShayariData(".प्यार का त्यौहार है आया,\n" +
                "संग अपने है खुशिया लाया.\n" +
                "आओ मिल कर मनाये इसे,\n" +
                "कोई भी रंग ना रहे फीका,\n" +
                "पर सबसे पहले करलो कुछ मुह मीठा."));
        list.add(new ShayariData("सनम तेरा ये मीठा सा प्यार लाया है\n" +
                "मेरे जीवन में बहार..\n" +
                "इस प्यार की मिठास है एक बार…\n" +
                "चॉकलेट डे पर करती हूँ प्यार का इज़हार।"));
        list.add(new ShayariData(".आज का दिन है बड़ा मस्ताना\n" +
                "चॉकलेट डे का हूं मैं तो दीवाना\n" +
                "ऐ जाने बहारा अब तो आ भी जाओ\n" +
                "मेरे साथ मिलकर चॉकलेट खाओ"));
        list.add(new ShayariData(".मिठाई से ज्यादा मीठे हो तुम,\n" +
                "हो इतने तुम स्वीट\n" +
                "तुम को क्या लाकर दूँ चॉकलेट\n" +
                "तुम तो चॉकलेट से ज्यादा स्वीट"));
        list.add(new ShayariData("इस चॉकलेटी से दिन में,\n" +
                "चॉकलेट से फ्रेंड को ढेर सारा चॉकलेट\n" +
                "मेरी तरफ से…\n" +
                "हैप्पी चॉकलेट डे"));
        list.add(new ShayariData("रब करे आपका प्यार ऐसे ही बना रहे मेरे लिए,\n" +
                "जिसमें मुझे लाइफ का हर वो टेस्ट मिला है,\n" +
                "जो अलग-अलग चॉकलेट में होता है।"));
        list.add(new ShayariData(".काश फिर मिलने की वो मजा मिल जाए,\n" +
                "साथ जो बिताया वो पल मिल जाए,\n" +
                "चलो अपनी आँखे बंद करले,\n" +
                "क्या पता ख्वाबो में गुज़रा हुआ कल मिल जाये."));
        list.add(new ShayariData(".उनका मीठा सा प्यार\n" +
                "लाया है मेरे जीवन में बहार\n" +
                "सारे जहां में ना कोई तुम सा\n" +
                "चॉकलेट डे के दिन करूँ प्यार का इजहार"));
        list.add(new ShayariData(".तुम्हारे लिए बेस्ट चॉकलेट खरीदना था\n" +
                "कई दुकानों के चक्कर लगाए\n" +
                "लेकिन ऐसी कोई चॉकलेट मिली ही नहीं\n" +
                "जो तुम्हारी स्माइल से ज्यादा मीठी हो"));
        list.add(new ShayariData(".मिठास भरी हुई हर ओर है,\n" +
                "लगे है जैसे खूबसूरत शमा पुर-ज़ोर में है,\n" +
                "ढूँढा तो पाया, आपकी है ये मिठास,\n" +
                "जो आज के दिन एक Chocolate की तरह,\n" +
                "मीठी और छाई हर और है,\n" +
                "Chocolate का मीठा दिन मुबारक हो."));
        list.add(new ShayariData("आपके लबों पर भी लगी होगी तो हम खा लेंगे,\n" +
                "चॉकलेट के साथ आपके होठों को भी अपना बना लेंगे"));
        list.add(new ShayariData("कुछ मीठा हो जाए कुछ प्यारा हो जाए,\n" +
                "मोहब्बत अपनी बेशुमार हो जाए,\n" +
                "दिन आज चॉकलेट डे है\n" +
                "तो क्यों ना आज मीठे में कुछ खास हो जाए।"));
        list.add(new ShayariData(".तेरा ये मीठा सा प्यार,\n" +
                "लाया है मेरे जीवन में बहार,\n" +
                "इस प्यार की मिठास है एक वार,\n" +
                "Chocolate Day पे मई करता हु प्यार का इज़हार।"));
        list.add(new ShayariData("बिन पुकारे हमें साथ पाओगे\n" +
                "करो वादा की दोस्ती आप भी निभाओगे\n" +
                "मतलब ये नही की रोज याद करना\n" +
                "बस याद रखना उस वक्त जब\n" +
                "अकेले अकेले डेरीमिल्क खाओगे!!!"));
        list.add(new ShayariData("आज चॉकलेट डे है चॉकलेट तो खिलाओ\n" +
                "मीठी मीठी कोई बात तो सुनाओ\n" +
                "कब से तड़प रहे है हम आपके प्यार में\n" +
                "आज तो हमें अपने गले से लगाओ!!!"));
        list.add(new ShayariData("नींद की आँखों पर हो रही है फील्डिंग टाइट\n" +
                "इस डार्क स्काई में दिख रहे है तारे व्हाइट\n" +
                "अब बुझा के अपनी लाइट\n" +
                "हम आपसे कहते है\n" +
                "गुड नाईट & चॉकलेट ड्रीम्स"));
        list.add(new ShayariData(".लाइफ होंगी किटकेट\n" +
                "और डेरी मिल्क जैसी\n" +
                "अगर मिल जाये मुझे\n" +
                "गर्लफ्रैंड तेरी जैसी!!!"));
        list.add(new ShayariData("चॉकलेट डे आया है तेरी याद लाया है\n" +
                "आ जाओ आज दिल ने तुझे फिर बुलाया\n" +
                "ए जान तमन्ना तुझे मनाने के लिये मैने\n" +
                "चॉकलेट का पुरा डिब्बा मँगवाया है!!!"));
        list.add(new ShayariData(".मेरे दिल की धड़कन हो तुम\n" +
                "पर्क की चॉकलेट के रेपर हो तुम\n" +
                "रहना हमेशा यूँ ही मेरे साथ\n" +
                "क्योंकि मेरी फेवरेट चॉकलेट हो तुम!!!"));
        list.add(new ShayariData("दिल हमारा चॉकलेट की तरह नाजुक\n" +
                "तुम उसमे ड्राई फ्रूट का तड़का\n" +
                "लाइफ होगी फ्रूट एंड नट जैसी\n" +
                "अगर मिल जाये गर्लफ्रैंड तेरे जैसी!!!"));
        list.add(new ShayariData("Five star की तरह दिखते हो\n" +
                "Munch की तरह शरमाते हो\n" +
                "Cadbury की तरह जब तुम मुस्कराते हो\n" +
                "Kitkat की कसम तुम बहुत सुन्दर नजर आते हो!!!"));
        list.add(new ShayariData("किसने कहा पगली तुझसे की हम\n" +
                "तेरी खूबसूरती पर मरते है\n" +
                "हम तो उस चॉकलेटी अदा पर मरते है\n" +
                "जिस अदा से तू हमें देखती है"));
        list.add(new ShayariData("ज़िन्दगी के किताब में कुछ पन्ने ख़ास होते है..\n" +
                "कुछ अपने कुछ बेगाने होते है…\n" +
                "प्यार से सवर जाती है ज़िन्दगी…\n" +
                "जब रिश्तो में चॉकलेट की तरह मिठास होती है…!!!"));
        list.add(new ShayariData("चॉकलेट का डिब्बा लेकर आना,\n" +
                "हमें हमारी Importance बताना,\n" +
                "हम करेंगे झूठ मूठ के नखरे\n" +
                "तो आप अपने हाथों से खिलाना।"));
    }
    private void initList4() {

        list.add(new ShayariData("तेरी मेरी दोस्ती का अफसाना भी है, इस में प्यार का खज़ाना भी है,\n" +
                " इसलिए चाहते हैं आपसे टेडी बियर मांगना, और आज तो मांगने का बहाना भी है।"));
        list.add(new ShayariData("कुछ एहसासों के साये दिल को छु जाते हैं, कुछ मंज़र दिल में उतर जाते हैं, \n" +
                "बेजान गुलशन में भी फूल खिल जाते हैं, जब ज़िन्दगी में आप जैसे दोस्त मिल जाते है |"));
        list.add(new ShayariData("संग ए मरमर से तराशा खुदा ने तेरे बदन को,\n" +
                "बाकी जो पत्थर बचा उससे तेरा दिल बना दिया.\n" +
                "भेज रहा हु टेडी तेरे लिए बसा ले उसे भी अपने दिल में"));
        list.add(new ShayariData("दिल करता है तुम्हें अपनी\n" +
                "बाहों में भर लूँ\n" +
                "तुझे टेडी बियर बनाकर\n" +
                "हमेशा अपने पास रखलूँ"));
        list.add(new ShayariData("सब तेरे मोहब्बत की इनायत है वरना !!\n" +
                "मैं क्या.. मेरा दिल क्या.. मेरी टेडी क्या.. मेरी शायरी क्या !!"));
        list.add(new ShayariData("कुछ एहसासों के साये दिल को छू जाते हैं, कुछ मंजर दिल में उतर जाते हैं,\n" +
                "बेजान गुलशन में भी फूल खिल जाते हैं, सब जिंदगी में आप जैसे दोस्त मिल जाते हैं."));
        list.add(new ShayariData("“Teddy bear meri jaan”\n" +
                "“ko तंग मत करना”\n" +
                "“jaan ka dhyaan rakhna”\n" +
                "“babu jab bhi hum मिला करे”\n" +
                "“Teddy ko saath lana”☺️\n" +
                "“I love you sooo much”\n" +
                "“Happy Teddy Bear Day”"));
        list.add(new ShayariData("अगर आप एक टेडी होते,\n" +
                "तो हम अपने पास रख लेते,\n" +
                "डाल के अपनी झोली में\n" +
                "साथ साथ अपने ले चलते\n" +
                "हग कर के रोज़ रात को\n" +
                "अपने संग सुलाते….\n" +
                "Wishing You Happy Teddy Day."));
        list.add(new ShayariData("भेज रहा हु टेडी तुम्हें प्यार से,\n" +
                "रखना तुम इसको शम्भाल के,\n" +
                "मोहाबत अगर है तो भेज दो\n" +
                "मुझे भी एक टेडी प्यार से !!\n" +
                "हैप्पी टेडी बेयर डे लव.\n"));
        list.add(new ShayariData("चॉकलेट की खुशबू,\n" +
                "आइसक्रीम की मिठास,\n" +
                "प्यार की मस्ती\n" +
                "और हाथों का स्वाद\n" +
                "हसी के गुब्बारे और तुम्हारा साथ,\n" +
                "मुबारक हो आपको टेडी डे का त्यौहार !"));
        list.add(new ShayariData("तुम हँसते रहो टेडी बीयर की तरह,\n" +
                "मुस्कुराते रहो हमेशा छलकती बीयर की तरह,\n" +
                "बस गए हो दिल में किसी डिअर की तरह,"));
        list.add(new ShayariData("तू मेरी जान हैं..\n" +
                "तू मेरी लव हैं…\n" +
                "तू मेरी शान हैं..\n" +
                "तू मेरा दिल हैं..\n" +
                "और जब भी तुझे मेरी याद सतायें…तो मेरे इस Teddy Bear को गले लगा लेना.."));
        list.add(new ShayariData("“Teddy meri sweetheart”\n" +
                "“Ko kahna “मैं अपनी जान”\n" +
                "“को bhout pyar karta hu”\n" +
                "“ek pal bhi uske bina”\n" +
                "“dil nhi lagta”\n" +
                "“Sweetheart tum teddy ko”\n" +
                "❤️❤️\n" +
                "“Hmesha अपने पास रखना”"));
        list.add(new ShayariData("“Teddy Teddy”\n" +
                "“unko kahna मैं उन्हें bahut miss”\n" +
                "“Karta Hu”\n" +
                "“Jaldi se mere pass aa jay”\n" +
                "“Happy Teddy Bear Day”\n" +
                "“jaan”"));
        list.add(new ShayariData("“मैं bhi tumhara”\n" +
                "“pyara sa भोला सा”\n" +
                "“Teddy bear hu”\n" +
                "“Jaan”\n"));
        list.add(new ShayariData("Ek Acha Insaan Hamesha Yaad Rehta Hai\n" +
                "Ek Pyara Insaan Hamesha Khwabon mein Rehta Hai\n" +
                "Lekin… Ek Mukhlis Insaan Hameisha Dil Mein Rehta Hai\n" +
                "Happy Teddy Day !!"));
        list.add(new ShayariData("eri meri dosti ka afsana bhi hai\n" +
                "Isme pyar ka khazana bhi hai\n" +
                "Isliye chahte hain aapse Teddy Bear mangna.\n" +
                "Or aaj to mangne ka bahana bhi hai\n" +
                "Happy Teddy Bear Day."));
        list.add(new ShayariData("Aap Akele Chal diye ham khade reh gaye,\n" +
                "Har baar ki tarah Aansu Aj Bhi Beh gaye,\n" +
                "Hamne yaad kiya apko har lamha,\n" +
                "Aur aap ne hans ke kaha\n" +
                "Yaad kiya sabko ek bas aap hi reh gaye…\n" +
                "Happy Teddy Day"));
        list.add(new ShayariData("Aaj Teddy Bear ke din Tum Se Wada karta hun\n" +
                "Hamesha Mein tumhare Pass Rahunga\n" +
                "Kabhi dukh na Dun Ga Kabhi Tang Na Krunga\n" +
                "Happy Teddy Bear..With My Deep Love♥"));
        list.add(new ShayariData("Unhe Ye Shikayat Hai Hamse,\n" +
                "Ki Ham Har Kisi Ko Dekh Kar Muskurate Hai,\n" +
                "nasamajh Hai Wo Kya Jane,\n" +
                "Hame To Har Chehre Mai Wo Hi Nazar Ate Hai\n" +
                "Happy Teddy Day To My Friend"));
        list.add(new ShayariData("Kuch Ehsason Ke Saye Dil Ko Chu Jate Hain,\n" +
                "Kuch Manzar Dil Mein Utar Jate Hain,\n" +
                "Bejan Gulshan Mein Bhi Phool Khil Jate Hain,\n" +
                "Jab Zindagi Mein Aap Jaise Dost Mil Jate Hain."));
        list.add(new ShayariData("Teddy Bear ki tarah tum hamesha hanste raho\n" +
                "Muskurate raho, khelte raho\n" +
                "Nachte raho or soft raho."));
        list.add(new ShayariData("Bhej Raha hun Teddy Pyaar se,\n" +
                "Rakhna ise Tum Sambhal ke,\n" +
                "Ho mohabbat agar mujhse to bhej dena ek teddy Mujhe bhi pyaar se…\n" +
                "Happy Teddy Day"));
        list.add(new ShayariData("Teddy Teddy paas to aao,\n" +
                "Unko hamari yaad dilao,.. Happy Teddy Day\n"));
        list.add(new ShayariData("Aajkal ham har teddy ko dekh kar muskurate hai,\n" +
                "Kaise bataye unhe..\n" +
                "Hame to har teddy mein wo hi nazar aate hain…!!"));
        list.add(new ShayariData("जब भी तेरी याद \uD83D\uDE14 सताती है,\n" +
                "में तुम्हारे दिये Teddy \uD83D\uDC3B को गले लगा लेती हुँ…\uD83E\uDD17\n" +
                "Love you…❤️\n" +
                "\uD83D\uDC3BHappy Teddy Bear Day\uD83D\uDC3B\n"));
        list.add(new ShayariData("ख्वाहिश इतनी है कि,\n" +
                "आज तुझे देकर में Teddy\uD83D\uDC3B,\n" +
                "Future में बनु तेरे बच्चों का Daddy…\uD83D\uDE0A\uD83D\uDE0D\uD83D\uDE18\n" +
                "Happy Teddy \uD83D\uDC3B Bear Day Jaan.\uD83D\uDE18\n"));
        list.add(new ShayariData("Teddy\uD83D\uDC3BTeddy… पास तो आओ…\n" +
                "हमको उनका ऐहसास कराओ…\n" +
                "Miss you… \uD83D\uDC9B Love you… ❤️\n" +
                "Happy Teddy \uD83D\uDC3BBear Day…"));
        list.add(new ShayariData("Bear तो हम दोनो को पसंद है…\n" +
                "उसे Teddy \uD83D\uDC3B वाला Bear और मुझे\n" +
                "Hayward 5000 वाला…\uD83D\uDE1B\uD83D\uDE0B\n"));
        list.add(new ShayariData("Bears Need People,\n" +
                "People Need Bears…\n" +
                "(“)….(“)\n" +
                "( ‘ o ‘ )\n" +
                "(“)-(“)\n" +
                "(“”‘)-(“”‘)\n" +
                "Happy Teddy \uD83D\uDC3B Bear Day"));
        list.add(new ShayariData("Teddy\uD83D\uDC3BTeddy…\n" +
                "जा जल्दी से उनके पास…\n" +
                "कहना मेरी दिल की बात…\n" +
                "आ जाये जल्दी से मेरे पास…\uD83D\uDE18\n" +
                "Happy Teddy\uD83D\uDC3BBear Day…"));
        list.add(new ShayariData("Teddy Day का मौका है,\n" +
                "फिर क्युं आपने खुद को रोका है,\n" +
                "जाओ और दे आओ अपने प्यार को टेड्डी,\n" +
                "इस दिन का मौका ही अनोखा है ।"));
        list.add(new ShayariData("भेज रहा हुँ एक Teddy\uD83D\uDC3B में तुम्हें बहुत प्यार \uD83D\uDC97 से…\n" +
                "रखना इसे तुम हमेशा सम्भाल के…\n" +
                "हो अगर मोहब्बत मुझसे तो,\n" +
                "भेज देना मुझे भी एक Teddy\uD83D\uDC3B प्यार \uD83D\uDC97 से…\n" +
                "हेप्पी टेड्डी बीयर डे…"));
        list.add(new ShayariData("एक टेडी के बिना एक बेडरूम,\n" +
                "मुस्कान के बिना एक चेहरे की तरह है…"));
        list.add(new ShayariData("आजकल हम हर Teddy \uD83D\uDC3Bको देख कर मुस्कुराते है,\n" +
                "कैसे बताये उन्हें कि,\n" +
                "हम तो हर Teddy \uD83D\uDC3Bमें वो ही नजर आते है… !\n" +
                "Happy Teddy Bear Day\n"));
        list.add(new ShayariData("संग ए मरमर से तराशा खुदा ने तेरे बदन को,\n" +
                "बाकी जो पत्थर बचा उससे तेरा दिल बना दिया.\n" +
                "भेज रहा हु टेडी तेरे लिए बसा ले उसे भी अपने दिल में"));
        list.add(new ShayariData("आज Teddy Day है\n" +
                "और मुझे गले लगाने के लिए\n" +
                "बहुत बड़ा टेडी चाहिए\n" +
                "तो क्या आप आ रहे हैं?\n" +
                "आप मेरे Best Teddy हैं"));
        list.add(new ShayariData("A Cute Teddy \uD83D\uDC3B Bear,\n" +
                "To My Cutest Friend,\n" +
                "On A Cute Occasions"));
        list.add(new ShayariData("मुझे आर्टिफिशियल TEDDY \uD83D\uDC3B की जरूरत नहीं,\n" +
                "मेरे पास Real Cute Taddy है…\n" +
                "❤️ Love you… ❤️\n" +
                "Happy Teddy \uD83D\uDC3B Bear Day…"));
        list.add(new ShayariData("उन्हें ख्वाइश कि रोने की, तो देखो बरसात आ गयी,\n" +
                "हमारी तमन्ना थी उन्हें Teddy \uD83D\uDC3Bदेकर मनाने की….\n" +
                "लो Teddy \uD83D\uDC3B की वो रात आ गयी…\n" +
                "Happy Teddy Bear Day…\uD83D\uDE18\n"));
        list.add(new ShayariData("जाने उस शख्स को ये कैसा हुनर आता है,\n" +
                "रात होती है तो आँखों में उतर आता है \uD83D\uDE0D\uD83D\uDE18\n" +
                "Happy Teddy \uD83D\uDC3B Day\n"));
        list.add(new ShayariData("\uD83D\uDC3B Téddy Béâr ki târâh tum hâméshâ hânsté râho,\n" +
                "Muskurâté râho,\n" +
                "khélté râho,\n" +
                "Nâchté râho or\n" +
                "Soft râho. \uD83D\uDE42\n" +
                "~ \uD83D\uDC3BHâppy Téddy Dây\uD83D\uDC3B"));
        list.add(new ShayariData("भेज रहा हूँ Teddy \uD83D\uDC3B तुम्हें प्यार \uD83D\uDC97 से…\n" +
                "रखना तुम इसको संभाल के…\n" +
                "मोहब्बत है तो भेज दो मुझे भी एक Teddy \uD83D\uDC3B प्यार \uD83D\uDC97 से…\uD83D\uDE42\n" +
                "Wish you a very very Happy Teddy \uD83D\uDC3B Day"));
        list.add(new ShayariData("To My Cutést Wifé,\n" +
                "Who Is My Lifé,\n" +
                "This Téddy\uD83D\uDC3B Béâr Is Â Sign,\n" +
                "Thât You Will Bé Forévér Miné…\n" +
                "Hâppy Téddy Béâr Dây"));
        list.add(new ShayariData(" wish I wéré ä céll in yoür blood,\n" +
                "so I woüld bé süré I wäs\n" +
                "soméwhéré in yoür héärt\uD83D\uDC96.\n" +
                "Happy Teddy \uD83D\uDC3B Day ..!!"));
        list.add(new ShayariData("Te̾d̾d̾y ̾\uD83D\uDC3B d̾a̾y ̾i̾s ä ̾dä̾y ̾o̾f ̾❤️ Lo̾vé. ̾\n" +
                "It̾s ä ̾dä̾y ̾w̾hé̾n ̾y̾oü ̾f̾i̾n̾d ̾y̾oü̾r ̾t̾rüé ̾❤️ l̾o̾vé.\n" +
                "A ̾dä̾y ̾o̾f ̾héä̾r̾t̾s ä̾n̾d ̾yü̾m̾m̾y ̾cä̾n̾d̾ié̾s.\n" +
                "A ̾dä̾y ̾w̾hé̾n ̾cü̾p̾i̾d ̾h̾i̾t̾s ̾y̾oü ̾w̾i̾t̾h ä ̾❤️ l̾o̾vé ä̾r̾r̾o̾w.\n" +
                "A ̾dä̾y ̾w̾hé̾n ̾y̾oü ̾f̾i̾n̾d ̾y̾oü̾r ̾té̾d̾d̾y ̾\uD83D\uDC3B béä̾r. ̾\n" +
                "Wi̾l̾l ̾y̾oü ̾bé ̾m̾i̾né\n" +
                "\uD83D\uDC3B ̾Ha̾p̾p̾y ̾Te̾d̾d̾y ̾Da̾y \uD83D\uDC3B"));
        list.add(new ShayariData("Yoü äré so swéét änd soft liké ä téddy\uD83D\uDC3B\n" +
                "I know bécäüsé I lové änd cäré for yoü,\n" +
                "I älwäys cäré my swéét téddy\uD83D\uDC3B\n" +
                "Büt wänt to ❤️ lové yoü forévér.\n" +
                "Happy Teddy \uD83D\uDC3B Day ..!"));
        list.add(new ShayariData("My mothér gävé mé lots of\n" +
                "Téddiés in my childhood,\n" +
                "Büt in my yoüng ägé,\n" +
                "I äm giving my äll téddiés\n" +
                "To yoü, so cäré thém äll inclüding mé.\n" +
                "Happy Teddy \uD83D\uDC3B Day ..!! \uD83D\uDE42"));
        list.add(new ShayariData("कुछ अहेसानों के साये दिल ❤️ को छु जाते है,\n" +
                "कुछ मंजर दिल ❤️ में उतर जाते है,\n" +
                "बेझान गुलशन में भी फूल \uD83C\uDF3A खिल जाते है,\n" +
                "जब जिंदगी में आप जैसे दोस्त मिल जाते है\n" +
                "*टेड्डी \uD83D\uDC3B डे मुबारक हो मित्र*\uD83D\uDE42\n"));
    }
    private void initList5() {

        list.add(new ShayariData("बातों-बातों में दिल ले जाते हो,\n" +
                "देखते हो इस तरह जान ले जाते हो…\n" +
                "अदाओ से अपने इस दिल को धरकाते हो,\n" +
                "अदाओ से अपने इस दिल को धरकाते हो,\n" +
                "लेकर बाहों में सारा जहा घुमाते हो |"));
        list.add(new ShayariData("वादा है तुझे दिल से जुदा कभी होने नहीं देंगे,\n" +
                "हाथ हमारा कभी छोड़ने नहीं देंगे,\n" +
                "तेरी मुस्कान ही इतनी प्यारी है कि\n" +
                "हम मर भी जायें पर तुझे रोने नहीं देंगे।"));
        list.add(new ShayariData(".एक इक बात में सच्चाई है उस की लेकिन\n" +
                "अपने वादों से मुकर जाने को जी चाहता है"));
        list.add(new ShayariData("तेरे वादे को कभी झूट नहीं समझूँगा\n" +
                "आज की रात भी दरवाज़ा खुला रक्खूँगा"));
        list.add(new ShayariData("अपने से कभी जुदा, नहीं होने दूंगा\n" +
                "हर दिन प्यार से भरा होगा, प्यार ही प्यार होगा\n" +
                "सुबह से शाम तक, शाम से सुबह तक\n" +
                "I Love you my sweet jaan"));
        list.add(new ShayariData(".प्रॉमिस है वादा, वादा है इरादा\n" +
                "इरादा है तेरे संग प्यार का\n" +
                "दिल है बच्चा प्यार है मेरा सच्चा\n" +
                "रखूँगा मलिका बनाकर ये प्रॉमिस है तुमसे"));
        list.add(new ShayariData(".तेरे वादे पर जिए हम तो ये जान झूट जाना\n" +
                "कि ख़ुशी से मर न जाते अगर ए’तिबार होता मिर्ज़ा ग़ालिब\n" +
                "आदतन तुम ने कर दिए वादे\n" +
                "आदतन हम ने ए’तिबार किया"));
        list.add(new ShayariData("वादा है तुझसे कभी रुलायेंगे नही,\n" +
                "हालात जो भी हो तुझे भुलायेंगे नहीं,\n" +
                "छुपा के अपनी आँखों में रखेंगे तुझको\n" +
                "दुनिया में किसी और को दिखाएंगे नहीं।\n" +
                "हैप्पी प्रॉमिस डे"));
        list.add(new ShayariData("वफ़ा करेंगे निबाहेंगे बात मानेंगे\n" +
                "तुम्हें भी याद है कुछ ये कलाम किस का था"));
        list.add(new ShayariData(".लम्हें ये सुहाने साथ हो ना हो,\n" +
                "कल मे आज जैसी बात हो ना हो,\n" +
                "दोस्ती रहेगी हमेशा दिल में,\n" +
                "चाहे पूरी उम्र मुलाकात हो ना हो.\n" +
                "हैप्पी प्रॉमिस डे दोस्त"));
        list.add(new ShayariData("अपने दिल में तुझे बिठाएंगे हम ,\n" +
                "अपनी हर खुशी तुझ पर लुटाएंगे हम,\n" +
                "कसम से तेरे साथ तेरी परछाई बन के रहे गए,\n" +
                "ओर आखरी सांस तक तेरा साथ निभायेंगे हम।"));
        list.add(new ShayariData("कोई नही आऐगा मेरी जिदंगी मे तुम्हारे सिवा,\n" +
                "एक मौत ही है जिसका मैं वादा नही करता ।।"));
        list.add(new ShayariData(".आप ने झूटा व’अदा कर के\n" +
                "आज हमारी उम्र बढ़ा दी"));
        list.add(new ShayariData("वादा करते हैं दोस्ती निभाएंगे\n" +
                "कोशिश यही रहेगी तुझे ना सतायेंगे\n" +
                "जरुरत पड़े तो दिल से पुकारना\n" +
                "मर भी रहे होंगे तो मोहलत लेकर आएंगे\n" +
                "हैप्पी प्रॉमिस डे फ्रेंड्स"));
        list.add(new ShayariData("आप तो मुँह फेर कर कहते हैं आने के लिए\n" +
                "वस्ल का वादा ज़रा आँखें मिला कर कीजिए"));
        list.add(new ShayariData(".इन वफ़ादारी के वादों को इलाही क्या हुआ\n" +
                "वो वफ़ाएँ करने वाले बेवफ़ा क्यूँ हो गए"));
        list.add(new ShayariData("अगर आपने मुझे लाखो में चुना है.\n" +
                "तो मेरा भी वादा है आप से..\n" +
                "करोड़ों की भीड़ में खोने नहीं दूंगा आपको..!!\n" +
                "Happy Promise Day"));
        list.add(new ShayariData(".जब कभी खुद को तन्हा पाओगे\n" +
                "साथ अपने देखना हमको पाओगे,\n" +
                "वादा है लाएँगे हम इतनी खुशियाँ\n" +
                "तुम अपनी जिंदगी की हर लम्हे में मुस्कुरायोगे।"));
        list.add(new ShayariData("ना करते तुम कोई वादा पूरा,\n" +
                "ना करते कोई इरादा पूरा,\n" +
                "साथ निभाने की बात करते हो,\n" +
                "पहले प्यार तो करलो पूरा,\n" +
                "ये वादा है मेरा तुमसे आज,\n" +
                "छोड़ेंगे ना कभी तुम्हारा साथ…!!"));
        list.add(new ShayariData("लगजा गले फिर यह हसीन रात हो या ना हो,\n" +
                "शायद फिर इस जनम में मुलाकात हो या ना हो ||"));
        list.add(new ShayariData("ड़ी दुआ से मिला कोई तुम जैसा है,\n" +
                "जैसे कोई मिला कोई खूबसूरत ख्वाब जैसे है,\n" +
                "वादा है बेपन्नाह प्यार कर गए तुम्हें हर लम्हा\n" +
                "क्योंकि पहली बार मिला कोई अपना जैसा है।"));
        list.add(new ShayariData(".मैं वादा करता हूँ..❤\n" +
                "तेरी हर ख़ुशी पर अपनी जान निछावर कर दूँगा,\n" +
                "तेरे हर मंज़िल का रास्ता बन जायुंगा,\n" +
                "और इतना प्यार करूँगा कि 7 जन्म भी कम पड़ जायेगा मेरे प्यार के लिए.."));
        list.add(new ShayariData(".मैं एक हाथ से सारी \u202A#\u200Eदुनिया\u202C के साथ \u202A#\u200Eलड़\u202C सकता हुं\n" +
                "बस मेरा दुसरा \u202A#\u200Eहाथ\u202C तेरे हाथ मैं होना चाहिए..!!!"));
        list.add(new ShayariData("देखा है जबसे तुमको मेरा दिल नही है बसमे,\n" +
                "जी चाहता है तोड़ दूँ दुनियां की सारी रस्मे ||"));
        list.add(new ShayariData("तुम उदास उदास से लगते हो,\n" +
                "कोई तरकीब बताओ मानाने की,\n" +
                "प्रॉमिस है तुमसे मैं जिन्दगी गिरवी रख सकता हूँ,\n" +
                "तुम कीमत बताओ मुस्कुराने की…"));
        list.add(new ShayariData(".इस जहाँ में हमें कोई ऐसा मिल जाता,\n" +
                "प्यार में किया वादा और मेरा अरमान पूरे कर देते,\n" +
                "काश चाहने वाले हमेशा चाहने वाले ही रहते,\n" +
                "मगर लोग अकसर बदल जाते है,\n" +
                "दावे करने के बाद ||"));
        list.add(new ShayariData("छोटा पर सच्चा वादा है तुझसे\n" +
                "खुद से भी प्यार ज्यादा है तुझसे,\n" +
                "तन्हा ना छोड़ूँगा तुझे कभी किसी राह पर\n" +
                "दिल से अपने लगा कर रखेंगे ये वादा है तुझसे"));
        list.add(new ShayariData(".मेरा वादा है ये तुमसे की तुम्हे इतना प्यार दूंगा…\n" +
                "की दुनिया में कही भी मोहब्बत के हवाले से…\n" +
                "जो बात निकलेगी हमारा नाम जरूर आएगा…!!!"));
        list.add(new ShayariData("\n" +
                "#28.जिंदगी भर ये वादा निभायेंगे,\n" +
                "तुझको अपनी जिंदगी से ज्यादा चाहेंगे, ,\n" +
                "अब जियेंगे तो जियेंगे तेरे साथ\n" +
                "वर्ना हम मर जाएंगे।"));
        list.add(new ShayariData("पल पल साथ निभाएंगे\n" +
                "एक इशारे पर दौड़े चले आएंगे\n" +
                "वादा है गम को तेरे पास भी न आने देंगे\n" +
                "बस खुशियां तुझ पर लुटाएंगे."));
        list.add(new ShayariData(".वादा ना करो अगर तुम निभा ना सको,\n" +
                "चाहो ना उसको जिसे तुम पा ना सको,\n" +
                "दोस्त तो दुनिया में बहुत होते है,\n" +
                "पर एक खास रखो जिसके बिना तुम मुस्कुरा ना सको"));
        list.add(new ShayariData("वादा है कभी न होगी दूरी तुमसे हमारी,\n" +
                "हर लम्हा रहेगी चाहत तुम्हारी,\n" +
                "पल पल चाहेंगे तुम्हे इस कदर कि\n" +
                "एक पल भी तुम्हे कमी महसूस न होगी हमारी।"));
        list.add(new ShayariData(".ये प्रॉमिस है हमारा\n" +
                "ना छोड़ेंगे कभी साथ तुम्हारा\n" +
                "जो गए तुम हमे भूल कर\n" +
                "ले आएंगे पकड़ कर हाथ तुम्हारा"));
        list.add(new ShayariData(".तेरे नाम को होंठो पर सजाया है मैंने\n" +
                "तेरे रूह को अपनी डीएल में बसाया है मैंने\n" +
                "दुनिया तुम्हें ढूंढते ढूंढते हो जाएगी पागल\n" +
                "दिल के ऐसे कोने में छुपाया है मैंने"));
        list.add(new ShayariData("हर घड़ी हर लम्हा तेरा साथ\n" +
                "निभाने का वादा करते है हम\n" +
                "गम मैं तेरे होठों की मुस्कान बनने का वादा करते है हम,\n" +
                "जिंदगी तुझे अपनी बना कर सनम।"));
        list.add(new ShayariData("मैं तुझसे आज एक वादा करता हूँ,\n" +
                "कि मैं सारे वादे निभायुंगा,\n" +
                "पर एक वादा मुझे तुझसे भी लेना है,\n" +
                "जो तू अगर कभी मुझे दर्द दे\n" +
                "बस ये कह देना कि तू अंजान था,\n" +
                "वरना मैं जीते जी मर जायुंगा।"));
        list.add(new ShayariData("दिल ना दुखाएंगे कभी ना छोड़ के जायेंगे,\n" +
                "तेरे गम में तेरे साथ रोयेंगे\n" +
                "खुशी में तेरे साथ मुस्कुराएँगे\n" +
                "हर चीज से बढ़ कर सिर्फ तुझको को चाहेंगे."));
        list.add(new ShayariData(".ज़िन्दगी में सारे दर्द गम हुए…\n" +
                "तेरे आ जाने से प्यार के सिलसिले सुरु हुए..\n" +
                "तू मिला है तो अब ये गम है…\n" +
                "प्यार ज्यादा है मगर तेरा एतबार ही कम है…!!!"));
        list.add(new ShayariData("वादे कोई अधूरे ना जाएंगे,\n" +
                "वादे जो किए वो हम निभायेंगे,\n" +
                "साथ देंगे तुम्हारा जिंदगी भर\n" +
                "तुम्हारा लिए हर राह से गुजर जाएंगे"));
        list.add(new ShayariData(".सोचा था ना करेंगे किसी से दोस्ती,\n" +
                "ना करेंगे किसी से वादा,\n" +
                "पर क्या करे दोस्त मिला इतना प्यारा\n" +
                "कि करना पड़ा दोस्ती का वादा…."));
        list.add(new ShayariData(".अब तुम कभी न आओगे यानी कभी कभी\n" +
                "रुख़्सत करो मुझे कोई वादा किए बग़ैर"));
        list.add(new ShayariData(".हम निभाएंगे ये रिश्ता मरते दम तक,\n" +
                "हसाएंगे आपको खुशी से गम तक,\n" +
                "दोस्त वादा है तुझसे कभी ना छोड़ के जायेंगे\n" +
                "रहेंगे साथ आखरी दम तक."));
        list.add(new ShayariData("रहेंगे तेरे दिल में हरदम,\n" +
                "हमारा प्यार कभी न होगा काम,\n" +
                "चाहे कितने भी आये जिंदगी में\n" +
                "गम रहेंगे हमेशा तेरे साथ हम."));
        list.add(new ShayariData(".ये Promise है हमारा,\n" +
                "ना छोड़ेंगे कभी साथ तुम्हारा,\n" +
                "जो गये तुम हमें भूल कर,\n" +
                "ले आयेंगे पकड़ कर हाथ तुम्हारा…\n" +
                "Happy Promise Day"));
        list.add(new ShayariData("तेरा हाथ चाहती हूँ तेरा साथ चाहती हूँ,\n" +
                "बाहों में तेरी रहना में दिन रात चाहती हूँ ||"));
        list.add(new ShayariData("खुशबु की तरह तेरी हर साँस मैं,\n" +
                "प्यार अपना बसाने का वादा है.\n" +
                "रंग जितने है मोहबत में हमारी\n" +
                "आपके जीवन में सजाने का वादा है."));
   }
    private void initList6() {

        list.add(new ShayariData("आज बारिश में तेरे साथ नहाना है,\n" +
                "सपना मेरा ये कितना सुहाना है,\n" +
                "बारिश की बुँदे जो गिरे तेरे होठों पे,\n" +
                "उन्हें अपने होठों से उठाना हैं।"));
        list.add(new ShayariData("हर रोज तुझे प्यार करूँ,\n" +
                "हर रोज तुझे याद करूँ,\n" +
                "हर रोज तुझे मिस करूँ,\n" +
                "और आज के दिन तुझे में किश करूँ।"));
        list.add(new ShayariData("ना आप कुछ करना ना हम कुछ करेंगे,\n" +
                "आप भी चुप रहना हम भी चुप रहेंगे,\n" +
                "एक दूजे को हम अपनी बाहों में भरेंगे,\n" +
                "फिर एक प्यारी सी किश करेंगे।"));
        list.add(new ShayariData("चुम लूँ तेरे होठों को दिल की ये ख्वाहिश है,\n" +
                "बात ये मेरी नहीं दिल की फरमाइश हैं।"));
        list.add(new ShayariData("काश मेरे होठ तेरे होठों को छू जाये,\n" +
                "देखूं जहाँ बस तेरे ही चेहरा नजर आये,\n" +
                "हो जाये हमारा रिश्ता कुछ ऐसा,\n" +
                "होंठों के साथ हमारा दिल भी जुड़ जाये।"));
        list.add(new ShayariData("प्रेमियों के लिए किस डे पर शायरी\n" +
                "मुझे बाँहों में बिखर जाने दो,\n" +
                "अपनी मुश्कब्र साँसों से महक जाने दो,\n" +
                "दिल मचलता है और साँसे रूकती है,\n" +
                "अब अपने होठों को मुझे छू लेने दो।"));
        list.add(new ShayariData("किस डे की शायरी हिंदी में 2021\n" +
                "मेरे प्यार का अफसाना भी है,\n" +
                "इसमें प्यार का खजाना भी है,\n" +
                "इसलिए चाहते है आपसे एक किश मांगना,\n" +
                "और आज तो मांगने का बहाना भी है।"));
        list.add(new ShayariData("हद से ज्यादा तेरे करीब आने को जी करता है,\n" +
                "तेरे होठों को होठों से छू जाने को जी करता है,\n" +
                "तुम हो मेरे बेताब दिल की धड़कन,\n" +
                "तुम्हें अपना बनाने को जी करता है।"));
        list.add(new ShayariData("मोहब्बत के रंग में डूबी शाम हो,\n" +
                "एक नई शुरुआत का पैगाम हो,\n" +
                "मिले तेरे होठ मेरे होठों से ऐसे,\n" +
                "जैसे मेरे होठ तेरे और तेरे होठ मेरे नाम हो।"));
        list.add(new ShayariData("जब आती है याद तुम्हारी,\n" +
                "तो करके आँखें बंद,\n" +
                "तुम्हे मिस कर लेते है,\n" +
                "मुलाकात रोज हो नहीं पाती इसलिए,\n" +
                "ख्यालों में ही तुम्हे किस कर लेते है।"));
        list.add(new ShayariData("ना जाने कब वो हसीन रात होगी,\n" +
                "जब उनकी निगाहें हमारी निगाहों के साथ होंगी,\n" +
                "बैठे है हम उस रात के इंतजार में,\n" +
                "जब उनके होठों की सुर्खियां हमारे होठों के साथ होगी।"));
        list.add(new ShayariData("मेरे होठों से तेरे होंठों को गीला कर दूँ,\n" +
                "तेरे होठों को मैं और भी रसीला कर दूँ,\n" +
                "तू इस कदर प्यार कर और प्यार की इन्तहा हो जाये,\n" +
                "तेरे होठों को चूस कर तुझे और जोशीला कर दूँ।"));
        list.add(new ShayariData("ठों से तुम्हें आज छु लू इस तरह,\n" +
                "और डूब के प्यार के नशे में तुमसे इजहार कर लूं,\n" +
                "सिमट जाओ आज की तेरी बाँहों में सनम,\n" +
                "और सारी हसरतें आज पूरी कर लूं।"));
        list.add(new ShayariData("मैंने कहा तीखी मिर्ची हो तूम,\n" +
                "वो होंठ चूम कर बोली और अब?"));
        list.add(new ShayariData("चलो संग मिलकर प्यार की गलियां धूम लेते है,\n" +
                "प्यार का इजहार तो कर लिया,\n" +
                "अब एक दुसरे को चूम लेते हैं।\n"));
        list.add(new ShayariData("तुम हसीन हो गुलाब जैसी हो,\n" +
                "बहुत नाजुक हो ख्वाब जैसी हो,\n" +
                "होंठों से लगाकर पी जाऊं तुम्हें,\n" +
                "सर से पाँव तक शराब जैसी हो।\n"));
        list.add(new ShayariData("किस डे रोमांटिक शायरी\n" +
                "कभी दूर ना जाना तुम,\n" +
                "मैं तुम्हें बहुत मिस करूँगा,\n" +
                "अगर तुम दूर गई तो,\n" +
                "तेरी यादों को ही किस करूँगा।"));
        list.add(new ShayariData("किस डे फनी शायरी इन हिंदी\n" +
                "होंठों के तेरे होंठों से लगाना चाहते है,\n" +
                "बाँहों में अपनी छुपाना चाहते हैं,\n" +
                "हद-ए-मोहब्बत पार कर के,\n" +
                "आज तुझे अपना बनाना चाहते हैं।"));
        list.add(new ShayariData("किस डे शायरी इन हिंदी फॉर बॉयफ्रेंड\n" +
                "सुना है तुम ले लेती हो हर बात का सपना,\n" +
                "आजमाएंगे कभी तुम्हारे होंठों को चूम कर।"));
        list.add(new ShayariData("मैं उनका गुरुर भी कुछ ऐसे तोड़ दिया,\n" +
                "आँखों को चूमा और होंठों को छोड़ दिया।\n"));
        list.add(new ShayariData("बात बताने का बहाना कर के,\n" +
                "मैंने चूमा था उसके गालों को,\n" +
                "अब वो रोज जिद करती है,\n" +
                "की मुझे वो बात बताओ।"));
        list.add(new ShayariData("किस डे शायरी इमेज\n" +
                "किस की कोई भाषा नहीं होती,\n" +
                "किस की कोई जात नहीं होती,\n" +
                "आज कर लो मुझे किस,\n" +
                "क्योंकि कर रहा हूँ मैं तुझे बहुत मिस।"));
        list.add(new ShayariData("शरबती होंठों से मैं ये जाम पीना चाहता हूँ,\n" +
                "बस दो पल तेरी बाँहों में ख़ुशी से जीना चाहता हूँ,\n" +
                "अपना बना ले मुझे की तेरा आशिक हूँ,\n" +
                "मैं तो बस तेरा हो के रहना चाहता हूँ।\n"));
        list.add(new ShayariData("है मौसम प्यार का थोड़ा प्यार कर लो ,\n" +
                "करते हो मोहब्बत अगर तो बाँहों में हमे भर लो ,\n" +
                "चलो मेरे संग सपनो की दुनिया में घूम लो ,\n" +
                "रोज़ हम चूमा करते हैं आज तुम हमें चूम लो।"));
        list.add(new ShayariData("आपके प्यार में मैं कुछ ऐसा कर जाऊंगा ,\n" +
                "खुशबू बनकर फ़िज़ाओं में बिखर जाऊंगा ,\n" +
                "भूलना चाहो तो सांसो को रोक लेना , अगर\n" +
                "सांस लोगे तो मैं दिल में उतर जाऊंगा।"));
        list.add(new ShayariData("आज बारिश मे तेरे संग नहाना है, सपना ये मेरा कितना सुहाना है,\n" +
                "बारिश की बूंदें जो गिरे तेरे होंठों पे, उन्हे अपने होंठों से उठाना है!\n" +
                "डसके लबों को चूमते वक्त जब वो नजरों को झुकाती है…\n" +
                "दिल का हाल अजीब सा होता है जब वो हौले से मुस्कुराती है\n"));
        list.add(new ShayariData("\n" +
                "आज हर एक पल खूबसूरत है, दिल में सिर्फ तेरी सूरत है,\n" +
                "तेरे होठों को मेरे होठों से छू जाने दे, दुनिया से ज्यादा मुझे तेरी जरूरत है..!"));
        list.add(new ShayariData("Ab Tujhe Hi Chahne Ko Jee Chahta Hai,\n" +
                "Teri Yaado Me Kho Jaane Ko Jee Chahta Hai,\n" +
                "Laga Di H Tumne Aisi Ishq Ki Aag,\n" +
                "Ki Choom Choom K Kha Jane Ko Ji Chahta Hai\n" +
                "Happy Kiss Day."));
        list.add(new ShayariData("एक तमन्ना थी जो हसरत बन गई, कभी दोस्ती थी अब मोहब्बत बन गई,\n" +
                "कुछ इस तरह शामिल हुए तुम जिंदगी में कि, तुझे सोचते रहना मेरी आदत बन गई!"));
        list.add(new ShayariData("हर रोज़ तुझे Pyaar करूँ..\n" +
                "हर रोज़ तुझे Yaad करूँ..\n" +
                "हर रोज़ तुझे Miss करूँ…\n" +
                "और आज के दिन में तुझे Kiss करूँ..\n" +
                "HAPPY KISS DAY"));
        list.add(new ShayariData("Kiss की कोई भाषा नहीं होती..\n" +
                "Kiss की कोई ज़ात नहीं होती..\n" +
                "आज कर लो मुझे Kiss..क्यूँकि कर रहा हु, में तुझे बहुत Miss..❤️\n" +
                "HAPPY KISS DAY"));
        list.add(new ShayariData("मेरे प्यार का अफसाना भी है इसमें प्यार का खजाना भी है\n" +
                "इसलिए चाहते हैं आपसे एक किस मांगना और आज किस\n" +
                "मांगने का बहाना भी है Happy Kiss Day Dear\n"));
        list.add(new ShayariData("मोहब्बत के रंग में डूबी शाम हो, एक नई शुरुआत का पैगाम हो,\n" +
                "मिले तेरे होंठ मेरे होंठो से ऎसे, जेसे मेरे होंठ तेरे औऱ तेरे होंठ मेरे नाम हो।"));
        list.add(new ShayariData("Kiss की कोई भाषा नहीं होती..\n" +
                "Kiss की कोई ज़ात नहीं होती..\n" +
                "आज कर लो मुझे Kiss..क्यूँकि कर रहा हु, में तुझे बहुत Miss..❤️\n" +
                "HAPPY KISS DAY"));
        list.add(new ShayariData("Wo Pehla Kiss Jo Humne Ek duje Ko Kia,\n" +
                "Wo Kiss Humare Pyar Ki Shuruwat thi,\n" +
                "Humara Pyar Hamesha kayam Rahega,\n" +
                "Bus Tum Usi shiddat se Mujhe Kiss Karti Rehna."));
        list.add(new ShayariData("ham me hasne walo ko kabhi rulaya nahi jata,\n" +
                "lehro se pani ko hataya nahi jata,\n" +
                "hone wale ho jate hain khud hi dil se apne,\n" +
                "kisi ko kehkar apna banaya nahi jata..\n" +
                "Happy kiss day"));
        list.add(new ShayariData("Tuje Chumne Ka Maza Hi Aur Hai,\n" +
                "Tuje Me Chuma Tere In Kubsurat Gulabi Honton Pe,\n" +
                "Tuje Chumo Me Tera Hasen Mehktwe Jism Ko,\n" +
                "Bus Tume Hi Chumta Jao,\n" +
                "Is Tarah Mere Jawani Ki Saal Beet Jaye.\n"));
        list.add(new ShayariData("Meri dosti ka afsana bhi hai. Is me pyar ka khazana\n" +
                "bhi hai. Isliye chahte hain aapse Ek Kiss mangna.\n" +
                "Or aaj to mangne ka bahana bhi hai.\n" +
                "Happy Kiss Day"));
        list.add(new ShayariData("Us K Chor Jaanay K Baad Ab Mohabbat Nahi Kartay Kisi Say.Ae dost\n" +
                "Thori c To Umar Hy Kiss Kiss Ko Aazmatay Phirain\n" +
                "Happy Kiss Day"));
        list.add(new ShayariData("Husband:-1 kiss le lu Wife:-no\n" +
                "Husband:-Jewlry la dunga Wife:-no\n" +
                "Husband:-Car la dunga Wife:-no\n" +
                "Beta so raha tha\n" +
                "uth kr bola:-meri le lo,\n" +
                "1 Cycle hi dila dena.\n"));
        list.add(new ShayariData("KABHI TO SURAJ NE CHAND KO KISS KI HOGI,\n" +
                "TABHI TO CHAND ME DAAG HAI,\n" +
                "NATURAL SI BAAT HAI CHAND NE WAPAS NAHI DI HOGI,\n" +
                "TABHI TO SURAJ ME AAG HAI.."));
        list.add(new ShayariData("ollege Ki Girls Ne Strike Kiya, Boys Ne Bhi Unka Saath Diya!\n" +
                "Girls Ne Zor Se Kaha: We Want Justice!\n" +
                "Boys Ne Pichhe Se Kaha: We Want Just KiSS.."));
        list.add(new ShayariData("Boy-Cinema chale\n" +
                "Girl-Nhi,tum mujhe wha touch kroge\n" +
                "B-No\n" +
                "Gl-mera hath pkdoge\n" +
                "B-Nhi\n" +
                "G-Mujhe kiss kroge\n" +
                "B-Nhi\n" +
                "G-to apni bahan k sath chale jao\n"));
        list.add(new ShayariData("Madam: Jisne 1st lesson yaad kiya wo mere hath pe kisS kre\n" +
                "aur 2 lesson 2 gaal pe..\n" +
                "1 bccha: Madam phir bistar bichha lo?\n" +
                "Mujhe poori book yaad hai."));
    }
    private void initList7() {

        list.add(new ShayariData("दिल की एक ही ख़्वाहिश हैं..\n" +
                "धड़कनों की एक ही इच्छा हैं..\n" +
                "के तुम मुझे अपनी बाहों में पनाह दे दो,\n" +
                "और में खो जाऊ\n" +
                "Happy Hug Day"));
        list.add(new ShayariData("एक बार तो मुझे सीने से लगा ले,\n" +
                "अपने दिल के भी सारे अरमान सजा ले,\n" +
                "कबसे है तड़प तुझे अपना बनाने की,\n" +
                "आज तो मौका है मुझे अपने पास बुला ले |\n" +
                "Hug Day Mubarak meri Jaan..!"));
        list.add(new ShayariData("अपनी बाँहों में मुझे बिखर जाने दो..\n" +
                "साँसों से अपनी मुझे महक जाने दो..\n" +
                "दिल बेचैन है कबसे इस प्यार के लिए..\n" +
                "आज तो सीने में अपने मुझे उतर जाने दो।\n" +
                "Wishing you Hug day…!\n"));
        list.add(new ShayariData("बातो बातो मैं दिल ले जाते हो,\n" +
                "देखते हो इस तरह जान ले जाते हो,\n" +
                "अदाओ से अपनी इस दिल को धरकाते हो,\n" +
                "लेकर बाहों मै – सारा जहाँ भुलाते हो.\n" +
                "Happy Hug Day My Love."));
        list.add(new ShayariData("देखा है जब से तुमको मेरा दिल नही है बसमे,\n" +
                "जी चाहे आज तोड़ दूं दुनिया की सारी रस्में,\n" +
                "तेरा हाथ चाहता हूँ, तेरा साथ चाहता हूँ,\n" +
                "बाहों मैं तेरी रहना मैं दिन रात चाहता हूँ |\n" +
                "Happy Hug Day My Sweetheart…!\n"));
        list.add(new ShayariData("कोई कहे इससे जादू की झप्पी,\n" +
                "कोई कहे इसे प्यार…\n" +
                "मौका है खूबसूरत,\n" +
                "आ गले लग जा मेरे यार |\n" +
                "Wishing You Hug Day…!"));
        list.add(new ShayariData("Koi Kahe Isse Jaadu Ki Jhappi,\n" +
                "Koi Kahe Isse Pyaar..\n" +
                "Mauka Khubsurat,\n" +
                "Aa Gale Lagja Mere Yaar..\n" +
                "Happy Hug Day !\n" +
                "Bole Toh\n" +
                "Hug Day Mubarak..!\n"));
        list.add(new ShayariData("Hum ko hamhi se chura lo….\n" +
                "dil mei kahi tum choopa lo…\n" +
                "hum akele ho n jaye…\n" +
                "dooor tum se ho n jaye…\n" +
                "paaas aao Gale se laga lo.\n" +
                "Happy Hug Day"));
        list.add(new ShayariData("Dekha Hai Jab Se Tumko, Mera Dil Nahi Hai Bu-main\n" +
                "Jee Chahe Aaj Tod Doon Duniya Ki Saari Rus-mein\n" +
                "Tera Haath Chahta Hoon, Tera Saath Chahta Hoon\n" +
                "Baahon Mein Teri Rehna Main Din Raat Chahta Hoon!!\n" +
                "Happy Hug Day!"));
        list.add(new ShayariData("सुना है…हग-डे पर\n" +
                "अपने प्यार से कसकर गले मिलकर\n" +
                "उसका हाल चाल पूछा जाता है. हाँ तो फिर Dear…❤️\n" +
                "कब आ रहे हो हमारा हाल चाल पूछने.. .wish U Happy Hug Day"));
        list.add(new ShayariData("जैसे Romoe ने Juliet को..\n" +
                "जैसे Laila ने Majnu को..\n" +
                "जैसे Heer ने Ranjha को..\n" +
                "गाले लगाया था….\n" +
                "बस उसी तरह तुम मुझे Hugg करों..\n" +
                "❤️HAPPY HUGG DAY❤️"));
        list.add(new ShayariData("Bahon Ke Darmiyaan Do Pyaar Mil Rahe Hai..\n" +
                "Jaane Kya Bole Mann,\n" +
                "Dole Sunke Badan,\n" +
                "Dhadkan Bani Jubaan..\n" +
                "Happy Hug Day Mere Jaan."));
        list.add(new ShayariData("Ek baar to Mujhe seene se laga le,\n" +
                "Apne Dil ke bhi Sare Armaan saja le,\n" +
                "Kabse hai Tadap tujhe apna banane ki,\n" +
                "Aj toh Mauka hai Mujhe Apne pass Bula le.\n" +
                "Happy Hug Day….\n"));
        list.add(new ShayariData("Man Hi Man Karati Hu Baatein\n" +
                "Dilki Her Ek Baat Kah Jaati Hu\n" +
                "Ek Baar Le Lo Bahon Mai Ab To Sajna\n" +
                "Yahin Her Baar Kahte Kahte, Ruk Jaati Hu!!!\n" +
                "Happy Hug day to u dear."));
        list.add(new ShayariData("सिर्फ एक बार गले \uD83E\uDD17 लगाकर,\n" +
                "मेरे \uD83D\uDC98 दिल \uD83D\uDC93 की धड़कन सुन\uD83D\uDC97\uD83D\uDC93\n" +
                "फिर लौटने का इरादा हम तुम पर छोड़ देंगे…\uD83D\uDE14\uD83D\uDE0E\n" +
                "Hug \uD83E\uDD17 Day मुबारक\uD83D\uDE42\uD83D\uDC8F\uD83D\uDC8F"));
        list.add(new ShayariData("बातों बातों में दिल \uD83D\uDC95 ले जाते हो देखते हो,\n" +
                "इस तरह जान ले जाते हो…\uD83D\uDC8F\n" +
                "अपनी आदतों से \uD83D\uDC98 दिल को \uD83D\uDC97 धड़काते हो….\n" +
                "लेकर बाहों में, तुम सारा जहान भुलाते देते हो…\uD83D\uDE0D\n" +
                "Happy Hug \uD83E\uDD17 Day Jaan❤️\uD83D\uDE18\uD83D\uDE18"));
        list.add(new ShayariData("When you Hug \uD83E\uDD17 someone, Its nothing. \uD83D\uDE42\n" +
                "When someone Hug \uD83E\uDD17 you, Its something.\n" +
                "When you love ❤️ someone and they love you back, \uD83D\uDC8F\n" +
                "Its everything. Happy Hug \uD83E\uDD17 Day…❤️\uD83D\uDE18\uD83D\uDE18"));
        list.add(new ShayariData("My Sweetheart..\uD83D\uDE18\uD83D\uDE18 When u Hug \uD83E\uDD17 me,\n" +
                "I Want to Melt in your arms and\n" +
                "Stay there❤️Forever❤️\uD83D\uDE42\uD83D\uDE17\uD83D\uDC8F\uD83D\uDC8F"));
        list.add(new ShayariData("एक ही तमन्ना,☝️ एक ही आरजू…☝️\n" +
                "बाँहों की पनाह में तेरे…\n" +
                "सारी जिन्दगी गुजर जाए…\uD83D\uDC91\uD83D\uDC91\n" +
                "Happy Hug \uD83E\uDD17 Day Jan…\uD83D\uDE17\uD83D\uDE17\n"));
        list.add(new ShayariData("मुझे बाँहों में बिखर जाने दो,❣️\n" +
                "अपनी खुशनुमा साँसों से महक जाने दो, \uD83D\uDC98\n" +
                "दिल \uD83D\uDC98 मचलता है और सांस रूकती है –\n" +
                "अब तो सीने में आज मुझे उतर आने दो…\uD83D\uDC8F\n" +
                "Happy Hug \uD83E\uDD17 Day Dear…\uD83D\uDE17\n"));
        list.add(new ShayariData("What the ❤️heart gives away is never gone,\n" +
                "But kept in the ❤️hearts of others,\n" +
                "From dusk to dawn.\n" +
                "Hug \uD83E\uDD17 Day you from the core of my ❤️heart.\uD83D\uDE17\uD83D\uDE17\n" +
                "Happy Hug \uD83E\uDD17 day…"));
        list.add(new ShayariData("एक बार तो मुझे सीने से लगा ले…\n" +
                "अपने \uD83D\uDC98 दिल के भी अरमान सजा ले… \uD83D\uDC8F\n" +
                "कबसे है तड़प तुझे अपना बनाने की…\n" +
                "आज तो मौका है मुझे अपने पास बुला ले…\uD83D\uDC8F\n" +
                "\uD83E\uDD17hAPPY hUG dAY\uD83D\uDE17\uD83E\uDD17"));
        list.add(new ShayariData("\uD83C\uDFB5\uD83C\uDFB6हम को हमी से चुरा लो दिल में कहीं तुम छुपा लो \uD83C\uDFB5\uD83C\uDFB6\n" +
                "\uD83C\uDFB5\uD83C\uDFB6हम अकेले न हो जाये दूर तुमसे न हो जाये पास आओ गले से लगा लो…\uD83C\uDFB5\uD83C\uDFB6\n" +
                "Happy Hug Day\uD83D\uDE17\uD83D\uDE17"));
        list.add(new ShayariData("TaLk to me wHen I’m boReD,\n" +
                "kiSS me wHen i’m saD,\n" +
                "\uD83E\uDD17 Hug me wHen i cRy,\n" +
                "CaRe for me wHen i diE,\n" +
                "LoVe ❤️ me When I’m sTill Alive.\n" +
                "\uD83E\uDD17HAPPY HUG DAY…\uD83E\uDD17"));
        list.add(new ShayariData("मौका भी है मौसम भी.!\n" +
                "हुस्न तेरा बेताब भी है.!!\n" +
                "आ करीब सीने से लगा ले.!\n" +
                "गले मिल सारे गम भुला ले.!!"));
        list.add(new ShayariData("मन ही मन करती हूँ बातें…\n" +
                "दिल ❤️ की हर एक बात कह जाती हूँ…\uD83D\uDC8F\n" +
                "एक बार तो ले लो बाँहों में सजना…\n" +
                "यही हर बार कहते कहते रुक जाती हूँ…\uD83D\uDC8F\n" +
                "\uD83E\uDD17HAPPY HUG DAY DEAR\uD83E\uDD17\n"));
        list.add(new ShayariData("अपनी \uD83E\uDD17 बाँहों में मुझे बिखर जाने दो…\n" +
                "साँसों से अपनी मुझे महक जाने दो…\n" +
                "दिल \uD83D\uDC98 बेचैन है कबसे इस प्यार के लिए…\n" +
                "आज तो सीने में अपने मुझे उतर जाने दो…\uD83D\uDC8F\n" +
                "\uD83E\uDD17Wish you a Happiest Hug Day\uD83E\uDD17"));
        list.add(new ShayariData("Sending you a \uD83E\uDD17 hug to ease your stress.\n" +
                "A kiss to make you smile and my ❤️ heart to say,\n" +
                "I’m thinking of you.\n" +
                "I miss you!!\n" +
                "Happy \uD83E\uDD17 Hug day to u dear…"));
        list.add(new ShayariData("No matter where you are I’ll always find my way to ?\uD83D\uDC8F\n" +
                "\uD83E\uDD17 Hug you tight and shower you with my kisses I love ❤️ only you!\n" +
                "Wishing my dear a happy \uD83E\uDD17 hug day."));
        list.add(new ShayariData("Never wait until tomorrow to \uD83E\uDD17 hug someone you could \uD83E\uDD17 hug today,\uD83D\uDC8F\n" +
                "Because when you give one,\n" +
                "You get one right back your way. Happy \uD83E\uDD17 Hug day.\n"));
        list.add(new ShayariData("ever ask for a \uD83E\uDD17 hug Just take it Never ask Do You Love ❤️ me Say I Love you❤️❤️\n" +
                "Never say I Can’t live without you Say I live for you.❤️\n" +
                "You’ve been trained Now go and FLIRT !\n" +
                "Happy \uD83E\uDD17 Hug day."));
        list.add(new ShayariData("If you hesitate when I hold your hand,\n" +
                "I will let you go. If you run away when I give you a kiss,\n" +
                "I will let you go. But once you let me give you a \uD83E\uDD17 hug,\n" +
                "Just once…\n" +
                "I will never let you go. \uD83D\uDC8F\uD83D\uDC8F\n" +
                "Happy \uD83E\uDD17 Hug day."));
        list.add(new ShayariData("If I could freeze any moment,\n" +
                "It would be any one of the times i was in your arms,\n" +
                "Cause that could never last long enough.\n" +
                "Happy \uD83E\uDD17 Hug day\uD83D\uDC8F\uD83D\uDC8F\n"));
        list.add(new ShayariData("Hug \uD83E\uDD17 is the loving gift that\n" +
                "costs no money and can be distributed for\n" +
                "free to make the love❤️ grow.\n" +
                "Love❤️ you honey on the HUG \uD83E\uDD17 day.\n"));
        list.add(new ShayariData("During the lowest phase of your life\n" +
                "a simple hug \uD83E\uDD17 from that\n" +
                "special someone can turn your tears to joy.\n" +
                "\uD83E\uDD17Happy Hug Day\uD83E\uDD17 \uD83D\uDC8F\uD83D\uDC8F"));
        list.add(new ShayariData("A hug \uD83E\uDD17 is a great gift…\n" +
                "One size fits all.\n" +
                "It can be given for any occasion And it’s easy to exchange.\n" +
                "Happy Hug \uD83E\uDD17 day ~Happy Hug \uD83E\uDD17 day"));
        list.add(new ShayariData("A hug \uD83E\uDD17 can say I will miss you.\n" +
                "It can say ur special, or best of all,\n" +
                "I love ❤️ you.\uD83D\uDC8F\uD83D\uDC8F\n" +
                "It can soothe a hurt, or calm a fear, or cheer us`when were blue.\n" +
                "So here a hug \uD83E\uDD17 for you. Happy Hug \uD83E\uDD17 day."));
        list.add(new ShayariData("A girl wants a guy that will tell her she’s beautiful,\n" +
                "give her a hug \uD83E\uDD17 when she needs it,\n" +
                "and tell her he ❤️ loves her… ~Happy Hug \uD83E\uDD17 day\uD83D\uDC8F"));
        list.add(new ShayariData("तुझे देखा तो ये जाना सनम,\n" +
                "प्यार होता है दीवाना सनम,\n" +
                "अब यहाँ से कहा जाए हम,\n" +
                "तेरी बाँहों में मर जाए हम।"));
        list.add(new ShayariData("एक ही तमन्ना,\n" +
                "एक ही आरजू,\n" +
                "बाँहों में पनाह में तेरे,\n" +
                "सारी जिंदगी गुजर जाये।"));
        list.add(new ShayariData("एक बार तो मुझे से सीने लगा ले,\n" +
                "अपने दिल के भी सारे अरमान सजा ले,\n" +
                "कब से है तड़प तुझे अपना बनाने की,\n" +
                "आज तो मौका है मुझे अपने पास बुला ले।"));
        list.add(new ShayariData("कोई कहे इसे जादू की झप्पी,\n" +
                "कोई कहे इसे प्यार,\n" +
                "मौका है खूबसूरत,\n" +
                "आ गले लग जा मेरे यार।"));
        list.add(new ShayariData("हमको हमी से चुरा लो,\n" +
                "दिल में कही तुम छुपा लो,\n" +
                "हम अकेले हो ने जाये दूर तुमसे,\n" +
                "पास आओ गले से लगा लो।"));
        list.add(new ShayariData("लग जा गले से ये रात फिर न आएगी,\n" +
                "किस्मत भी शायद हमको फिर न मिलाएगी,\n" +
                "बाकि है बस चाँद सांसे इस दिल में,\n" +
                "रूह भी न जाने कैसे तेरे बिन रह पाएगी।"));
        list.add(new ShayariData("देखा है जबसे तुझको मेरा दिल नहीं है बस में,\n" +
                "जी चाहे आज तोड़ दूँ दुनिया की सारी रस्में,\n" +
                "तेरा साथ चाहता हूँ तेरा हाथ चाहता हूँ,\n" +
                "बाँहों में तेरी रहना मैं दिन रात चाहता हूँ।\n"));
        list.add(new ShayariData("इतना ना तड़पाओ मेरे दिल को,\n" +
                "इतना ना सताओ मेरे बाहों को,\n" +
                "इतना ना छुपाओ तेरे प्यार को,\n" +
                "आग दोनों तरफ लगी है,\n" +
                "आप ले लो मुझे अपनी बाहों में।\n"));
        list.add(new ShayariData("मन ही मन करती हूँ बातें,\n" +
                "दिल की हर एक बात कह जाती हूँ,\n" +
                "एक बार ले लो बाहों में अब तो सजना,\n" +
                "यही एक बात कहते कहते रूक जाती हूँ,\n" +
                "\"हैप्पी हग डे माय लव\"\n"));
        list.add(new ShayariData("लिपट जाओ फिर एक बार गले हमारे,\n" +
                "कोई दीवार ना रहे बीच हमारे तुम्हारे,\n" +
                "लिपट जाती जरूर अगर जमाने का डर ना होता,\n" +
                "बसा लेती मैं तुम्हें अगर सीने मैं घर होता।\n"));
        list.add(new ShayariData("मुझे बाँहों में बिखर जाने दो,\n" +
                "अपनी मुस्कुराती साँसों से महक जाने दो,\n" +
                "दिल मचलता है और सांसे रूक जाती है,\n" +
                "अब तो सीने में आज मुझे उतर जाने दो,\n" +
                "हग डे पर एक हग तो दे दो।\n"));
        list.add(new ShayariData("जैसे रोमियो ने जूलियट को,\n" +
                "जैसे लैला ने मजनू को,\n" +
                "और जैसे हीर ने राँझा को गले लगाया था,\n" +
                "बस उसी तरह तुम मुझे गले लगा लो।"));
        list.add(new ShayariData("एक प्यारा दोस्त एक तकिया की तरह होता है,\n" +
                "जब आप थके हुए होते हैं तो आप उस पर सोते हैं,\n" +
                "जब आप दुखी होते हैं तो आप उस पर आँसू गिराते हैं,\n" +
                "जब आप गुस्से में होते हैं तो आप उसे घूंसा मारते हैं,\n" +
                "और जब आप खुश होते हैं तो आप उसे गले लगा लेते हैं।"));


    }
    private void initList8() {

        list.add(new ShayariData("बाज़ार के रंगों से रंगने की मुझे जरुरत नही, किसी की याद आते ही ये चेहरा गुलाबी हो जाता है"));
        list.add(new ShayariData("कितना प्यार है इस दिल में तेरे लिए, अगर बयां कर दिया तो\n" +
                "तू नहीं ये दुनिया मेरी दिवानी हो जायेगी\n"));
        list.add(new ShayariData("Bohot choti si list hai meri Khwahishon ki,\n" +
                "Pehli khwahish bhi tum Akhiri bhi tum.\n" +
                "Happy Valentine Day"));
        list.add(new ShayariData("दिल ये मेरा तुमसे प्यार करना चाहता है, अपनी मोहब्बत का इजहार करना चाहता है,\n" +
                "देखा है जब से तुम्हें ए मेरे सनम, सिर्फ तुम्हारा ही दीदार करने का दिल चाहता है..\n" +
                "Happy Valentine Day"));
        list.add(new ShayariData("मेरे बस में नहीं अब हाल-ए-दिल बयां करना,\n" +
                "बस ये समझ लो, लफ्ज कम मोहब्बत ज्यादा है..\n" +
                "हैप्पी वैलेंटाइन डे"));
        list.add(new ShayariData("कितनी खुबसूरत सी\n" +
                "लगने लगती हे जिंदगी\n" +
                "जब कोई तुम्हारे पास आके\n" +
                "घुटनो के बल बैठे के तुमसे पुछे\n" +
                "Will u be my Valentine"));
        list.add(new ShayariData("7 जन्मो से तेरा इंतज़ार किया…\n" +
                "हर जन्म में तेरा दीदार किया…..\n" +
                "एक बार नहीं तुझे 100 बार प्यार किया.\n" +
                "HAPPY VALENTINE DAY\n"));
        list.add(new ShayariData("Aaj Ka Jo Hai Pura Din,\n" +
                "Sath Sath Jayenge Samundar Paar,\n" +
                "Aagar Aap Jo Saath Me Ho Mere,\n" +
                "Ek Hi Kya, Karenge Saat Samundar Paar… Can You Be My Valentine"));
        list.add(new ShayariData("Itne Saalon Ke Intejar Ke Baad,\n" +
                "Aaj Mai Khushi Se Samundar Bhar Du,\n" +
                "Tumhari Iss Haan Ko Sunne Ke Baad,\n" +
                "Kahi Is Samundar Mai Hi Dub Na Jaun!\n" +
                "Happy Valentines Day"));
        list.add(new ShayariData("Mera wajud sirf meri mohabbat se hai,\n" +
                "Mujhe gurur bahut apni mohabbat pe hai,\n" +
                "Mujhe chahte honge aur bhi bahut log,\n" +
                "Magar mujhe mohabbat sirf apni mohabbat se hai..\n" +
                "Happy Valentine’s Day"));
        list.add(new ShayariData("uskan Ho Tum Is Hotoon Ki,\n" +
                "Dhadkan Ho Tum Is Dil Ki,\n" +
                "Haasi Ho Tum Is Chere Ki,\n" +
                "Jaan Ho Tum Is Ruuh Ki! Be My Valentine"));
        list.add(new ShayariData("जीने के लिए जान जरुरी हैं !\n" +
                "हमारे लिए तो आप जरुरी हैं !!\n" +
                "मेरे चेहरे पे चाहे गम हो…..!\n" +
                "आपके चेहरे पे मुस्कान जरुरी हैं !!\n" +
                "Happy Valentine Day"));
        list.add(new ShayariData("Mere Dil Me Jyo Tum Rehti Ho,\n" +
                "Rooj Sapno Me Ake Satati Ho,\n" +
                "Bina Kuch Bole Hi Bhagwan Se,\n" +
                "Jindgibhar Ka Saath Kyo Mangti Ho! Happy Valentines Day!\n"));
        list.add(new ShayariData("Tujhe Jo Chaha Dil Se Hai,\n" +
                "Magar Lagta Nahi Aaj Kahe Paunga,\n" +
                "Yaaden Jo Dastan Baan Gayi Hai,\n" +
                "Ijahar Karke Mere Nasibe Ko Aajmaunga…. Happy Valentines Day!\n"));
        list.add(new ShayariData("Kabhi Ajnabee Se Milay The,\n" +
                "Fir Yhonhi Miltay Chale Gaye,\n" +
                "Hun To Aapko Dost Bananewale The Magar\n" +
                "Aap To Hamare Dil Ki Dhadkan Banthe Chale Gaye.\n" +
                "Happy Valentine’s Day…."));
        list.add(new ShayariData("Socha aap say baaat karoon,\n" +
                "Phir soocha, ek mulaqaat karoon,\n" +
                "Phir soocha, kyun na intezaar karoon,\n" +
                "Phir soocha, kyun na ek kaam karoon,\n" +
                "Ek pyaara sa sms aap ke naam karoon,\n" +
                "Happy Valentines Day!\n"));
        list.add(new ShayariData("Apke aane se zindagi kitni Khubsurat hai,\n" +
                "Dil me basi hai jo wo apki hi Surat hai,\n" +
                "Door jaana nahi humse kabhi bhulkar bhi,\n" +
                "Hume har kadam per aapki Zarurat hai.\n" +
                "Happy Valentine’s Day!"));
        list.add(new ShayariData("aise Hawa Ka Jhonka,\n" +
                "Shehad Ki Mithaas,\n" +
                "Jaise Phoolon Ki Khushbu,Jaise Pyar,\n" +
                "Jante Ho Sub Se Khubsurat Ehsas Kya Hai,\n" +
                "Aap Ka Sath…..!\n" +
                "I Love You, Happy Valentines Day.\n"));
        list.add(new ShayariData("Aaj Ka Din Ho Jayega Saab Se Yaadgar\n" +
                "Kyonki Aap Ka Mil Gaya Hai Ikrar,\n" +
                "Eidhar Baitha Rahunga Jindagi Bhar,\n" +
                "Karta Rahunga Aapka Deedar Happy Valentines Day!\n"));
        list.add(new ShayariData("Ye Dil tere liye beqarar aaj bhi hai,\n" +
                "Meri aankh ko tera intizar aaj bhi hai,\n" +
                "Tu aayegi ye umeed hai mujhe…..\n" +
                "Tujh ko pane k liye ye tera deewana aaj bhi hai. ..\n"));
        list.add(new ShayariData("Mere chehare ki hansi ho tum,\n" +
                "Mere Dil ki har khushi ho tum,\n" +
                "Mere hontho ki mushkan ho tum,\n" +
                "Dhadakta hai mera ye Dil jiske liye…..\n" +
                "Wo Meri Jaan tum ho tum. ..\n"));
        list.add(new ShayariData("Kitna bhi chaho, na bhol paoge\n" +
                "Hum se jitna dur jao nazdik paoge\n" +
                "Humein mita sakte ho to mita do\n" +
                "Yaadein meri, magar…\n" +
                "Kya sapno se juda kar paoge humein. Happy Valentine Day!\n"));
        list.add(new ShayariData("Bin Aapke Kuch Bhi Aacha Nahi Lagta,\n" +
                "Ab Mera Wajood Bhi Saccha Nahi Lagta.\n" +
                "Sirf Aapke Deedar K Intezaar Me Kat Rahi Hai Zindagi..,\n" +
                "Varna Kabki Maut Ki Aagosh Me So Jati Ye Zindagi.\n" +
                "Laut Aao K Aapke B’gair Ek Lamha Nahi Kat Ta\n" +
                "Bin Aapke Kuch Bhi Accha Nahi Lagta…\n" +
                "Happy Valentine Day..\n"));
        list.add(new ShayariData("Socha aap say baaat karoon\n" +
                "Valentines Day Poetry\n" +
                "Socha aap say baaat karoon,\n" +
                "Phir soocha, ek mulaqaat karoon,\n" +
                "Phir soocha, kyun na intezaar karoon,\n" +
                "Phir soocha, kyun na ek kaam karoon,\n" +
                "Ek piyaara sa sms aap ke naam karoon,\n" +
                "Happy Valentines Day!"));
        list.add(new ShayariData("आज मैं ये इजहार करता हूँ\n" +
                "जान भी तुझपर निसार करता हूँ\n" +
                "बेहिसाब, बेशुमार करता हूँ\n" +
                "मैं सिर्फ तुझसे प्यार करता हूँ"));
        list.add(new ShayariData("लोग कहते फिरते हैं कि वो जिससे प्यार करते हैं\n" +
                "वो एक चाँद का टुकड़ा है\n" +
                "पर मैं कहता हूँ कि मैं जिसे प्यार करता हूँ\n" +
                "चाँद उसका एक टुकड़ा है"));
        list.add(new ShayariData("करनी है खुदा से एक गुज़ारिश\n" +
                "तेरे प्यार के सिवा कोई बंदगी ना मिले\n" +
                "हर जनम में साथी हो तुम जैसा\n" +
                "या फिर कभी ज़िन्दगी ही ना मिले\n" +
                "\n"));
        list.add(new ShayariData("ऐ चाँद तू भूल जायेगा अपने आपको\n" +
                "जब सुनेगा दास्तान मेरे प्यार की\n" +
                "क्या तू करता है गुरुर अपने आप पे इतना\n" +
                "तू तो सिर्फ परछाई है मेरे प्यार की"));
        list.add(new ShayariData("लोग कहते फिरते है जिसे हम प्यार करते है\n" +
                "वो एक चांद का टुकड़ा है\n" +
                "पर उन्हें क्या पता जिसे मैं प्यार करता हूं\n" +
                "चांद उसका एक टुकड़ा है"));
        list.add(new ShayariData("चले गए हैं दूर कुछ पल के लिए\n" +
                "मगर करीब है हर पल के लिए\n" +
                "कैसे भुलायेंगे आपको एक पल के लिए\n" +
                "जब हो चुका है प्यार उम्र भर के लिए"));
        list.add(new ShayariData("चलो आज खामोश प्यार को इक नाम दे दें,\n" +
                "अपनी मुहब्बत को इक प्यारा अंज़ाम दे दें\n" +
                "इससे पहले कहीं रूठ न जाएँ मौसम अपने\n" +
                "धड़कते हुए अरमानों एक सुरमई शाम दे दें"));
        list.add(new ShayariData("मोहब्बत के भी कुछ अंदाज़ होते है\n" +
                "जागती आँखों में भी कुछ ख्वाब होते है\n" +
                "ज़रूरी नही है कि गम में ही आँसू निकले\n" +
                "मुस्कुराती आँखों में भी सैलाब होते हैं"));
        list.add(new ShayariData("ऐ चाँद तू भूल जायेगा अपने आपको\n" +
                "जब सुनेगा दास्तान मेरे प्यार की\n" +
                "क्या तू करता है गुरुर अपने आप पे इतना\n" +
                "तू तो सिर्फ परछाई है मेरे प्यार की"));
        list.add(new ShayariData("महक सी जाती हो रातों में\n" +
                "जब तूम ख़्वाब बनकर समाती हो\n" +
                "यादों की तस्वीर दिल में उतर जाती हैं\n" +
                "जब तुम रूबरू सामने आती हो\n"));
        list.add(new ShayariData("दिल ने जिसे ज़िन्दगी भर चाहा है\n" +
                "आज करूँगा में उनसे इकरार\n" +
                "जिसको सदियों से तम्मना की है\n" +
                "उनसे करूँगा मेरे प्यार का इजहार\n"));
        list.add(new ShayariData("प्यार शब्दों का मोहताज नही होता\n" +
                "दिल में हर किसी के राज़ नही होता\n" +
                "क्यों इंतज़ार करते है सभी वैलेंटाइन डे का\n" +
                "क्या साल का हर दिन प्यार का हक़दार नही होता ??"));
        list.add(new ShayariData("तेरी पहली मुलाकात जिन्दगी में एक बहार लाई थी\n" +
                "हर आईने में तेरी तस्वीर मुझे नजर आई थी\n" +
                "लोग कहते हैं प्यार में नींद उड़ जाती है\n" +
                "हमने तो नींदों में ही प्यार की दुनिया बनाई थी"));
        list.add(new ShayariData("ये दुनियाँ के तमाम चेहरे तुम्हें गुमराह कर देंगें\n" +
                "तुम बस मेरे दिल में रहो, यहाँ कोई आता जाता नहीं"));
        list.add(new ShayariData("बैठा के सामने जी भर के दीदार करना\n" +
                "एक रोज़ बाँहों में भर के प्यार करना\n" +
                "मेरी मजबूरी समझना शिकवा ना कोई करना\n" +
                "हम तेरे ही रहेंगे हमारा ऐतबार करना\n"));
        list.add(new ShayariData("कब उनकी पलकों से इज़हार होगा,\n" +
                "दिल के किसी कोने में हमारे लिए प्यार होगा,\n" +
                "गुज़र रही है हर रात उनकी याद में,\n" +
                "कभी तो उनको भी हमारा इंतज़ार होगा\n"));
        list.add(new ShayariData("प्यार वो एहसास है जो मिटता नहीं,\n" +
                "प्यार वो पर्वत है जो झुकता नहीं\n" +
                "प्यार की कीमत क्या है हमसे पूछो\n" +
                "प्यार वो अनमोल हिरा है जो बिकता नही\n"));
        list.add(new ShayariData("ख्वाबों में आते हो तुम\n" +
                "यादों में आते हो तुम\n" +
                "जहाँ मैं जाऊं ,जहाँ मैं देखूं\n" +
                "मुझे नज़र आते हो तुम"));
        list.add(new ShayariData("दिल की यादों में संवारु तुझे\n" +
                "तू दिखे तो आँखों में उतारूं तुझे\n" +
                "तेरे नाम को लबों पर ऐसे सजाऊँ\n" +
                "सो जाऊं तो ख्वाबों में पुकारूँ तुझे"));
        list.add(new ShayariData("हसरतें हैं बहुत मगर\n" +
                "तुमसे मैं क्या कहूं\n" +
                "लेके बाँहों में मैं तुम्हें\n" +
                "प्यार करता रहूं\n" +
                "ख्वाहिशें हैं बहुत मगर\n" +
                "तुमसे मैं क्या कहूं\n" +
                "हद से आगे गुजर के भी\n" +
                "अब मुहब्बत करूं"));
        list.add(new ShayariData("मेरे प्यार की पहचान तू ही तो है\n" +
                "मेरे जीने का अरमान तू ही तो है\n" +
                "कैसे बयां करें हाल इस दिल का\n" +
                "मेरी आशिकी मेरी जान तू ही हो है"));
        list.add(new ShayariData("चेहरे पर बनवाट का गुस्सा\n" +
                "आँखों से छलकता प्यार भी है\n" +
                "इस शौक-ऐ-अदा को क्या कहिये\n" +
                "इंकार भी है इकरार भी है\n" +
                "आज इकरार कर ही दो डियर"));
        list.add(new ShayariData("मेरे चेहरे की हंसी हो तुम\n" +
                "मेरे दिल की हर ख़ुशी हो तुम\n" +
                "मेरे होंठों की मुस्कान हो तुम\n" +
                "धड़कता है मेरा दिल जिसके लिए\n" +
                "वो मेरी जान तुम हो तुम\n"));
        list.add(new ShayariData("कब उनकी पलकों से इज़हार होगा\n" +
                "दिल के किसी कोने में हमारे लिए प्यार होगा\n" +
                "गुज़र रही है रात उनकी याद में\n" +
                "कभी तो उनको भी हमारा इन्तजार होगा"));
        list.add(new ShayariData("यादों का ये कारवाँ हमेशा रहेगा\n" +
                "दूर जाते हुए भी प्यार वही रहेगा\n" +
                "माफ़ करना मिल ना सके आपसे\n" +
                "यकीन रखना अखियों में इंतज़ार वही रहेगा\n" +
                "हैप्पी वैलेंटाइन डे\n"));
        list.add(new ShayariData("सांस लेने से भी तेरी याद आती है\n" +
                "हर सांस में तेरी खुशबू बस जाती है\n" +
                "कैसे कहूं कि सांस से मैं जिन्दा हूँ\n" +
                "जबकि सांस से पहले तेरी याद आती है"));
        list.add(new ShayariData("कितना भी चाहो, ना भूल पाओगे\n" +
                "हम से जितना दूर जाओ नजदीक पाओगे\n" +
                "हमें मिला सकते हो तो मिला दो\n" +
                "यादें मेरी, मगर…\n" +
                "क्या सपनों से जुदा कर पाओगे हमें\n"));
        list.add(new ShayariData("आपको पा कर अब खोना नहीं चाहते\n" +
                "इतना खुश हो कर अब रोना नहीं चाहते\n" +
                "यह आलम है हमारा आपकी जुदाई का\n" +
                "आँखों में नींद है मगर सोना नहीं चाहते\n" +
                "वैलेंटाइन डे पर भी जाग रहा हूँ आपके प्यार मैं"));
        list.add(new ShayariData("कहते हैं कि प्यार और जहर में कोई फर्क नहीं होता है\n" +
                "जहर पीने के बाद लोग मर जाते हैं\n" +
                "और प्यार करने के बाद लोग जी नहीं पाते हैं\n" +
                "वैलेंटाइन डे की शुभकामना\n"));
        list.add(new ShayariData("जीब सी कशिश है आप में\n" +
                "कि हम आप के ख्यालों में खोये रहते हैं\n" +
                "ये सोच कर के आप ख्वाबों में आओगे\n" +
                "हम दिन में भी सोया करते हैं\n"));
        list.add(new ShayariData("तुम ख्वाब हो तुम नींद हो\n" +
                "जीने की हर उम्मीद हो\n" +
                "तुम जान मेरी साँस मेरी\n" +
                "तुम ही मेरी प्रीति हो\n" +
                "तुम स्वप्न हो साकार हो\n" +
                "तुम रुप हो आकार हो\n"));
        list.add(new ShayariData("ना जाने क्यों जब ये हवाएं मुझे छू कर गुज़रती है\n" +
                "दिल पे एक दस्तक सी दे जाती है\n" +
                "शायद इशारो में कहती है तुम आने वाले हो\n" +
                "या फिर युही मुझे बहला कर चली जाती है"));
        list.add(new ShayariData("चुरा के तुझे तुझसे अपना बना लूँ मैं\n" +
                "तेरी चाहत की आग में खुद को जला लूँ मैं\n" +
                "आग-ऐ-इश्क़ से गर्मा के तेरे जिस्म को\n" +
                "तेरे सुलगते होंठों से अपने होंठ मिला लूँ मैं"));
        list.add(new ShayariData("हम तेरे साथ चलेंगे तू चले ना चले,\n" +
                "तेरा हर दर्द सहेंगे तू कहे या ना कहे,\n" +
                "हम चाहते है की तुम सदा खुश रहो,\n" +
                "हम चाहे कल रहे या ना रहे"));

    }
}