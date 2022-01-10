package stream.test.collectors;

import stream.dominio.Category;
import stream.dominio.LightNovel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest12 {
    private static List<LightNovel> list = new ArrayList<>(List.of(
            new LightNovel("narutao",3.5, Category.FANTASY),
            new LightNovel("Sword Art Online",7.6,Category.ROMANCE),
            new LightNovel("no game no life",2.5,Category.FANTASY),
            new LightNovel("spell",4.5,Category.DRAMA),
            new LightNovel("fairy",2.5,Category.FANTASY),
            new LightNovel("Liga dos Campeoes ",9.5,Category.DRAMA)
    ));

    public static void main(String[] args) {
        Map<Category,List<LightNovel>> categoryListMap = new HashMap<>();
        List<LightNovel> fantasy = new ArrayList<>();
        List<LightNovel> drama = new ArrayList<>();
        List<LightNovel> romance = new ArrayList<>();
        for (LightNovel lightNovel : list) {
            switch (lightNovel.getCategory()){
                case DRAMA -> {
                    drama.add(lightNovel);
                    break;
                }
                case FANTASY -> {
                    fantasy.add(lightNovel);
                    break;
                }
                case ROMANCE -> {
                    romance.add(lightNovel);
                    break;
                }
            }
        }
        categoryListMap.put(Category.DRAMA,drama);
        categoryListMap.put(Category.FANTASY,fantasy);
        categoryListMap.put(Category.ROMANCE,romance);
        System.out.println("---- ");
        System.out.println(categoryListMap);

        System.out.println("Com Streams ");  // -------------------------

        Map<Category, List<LightNovel>> collect = list.stream().
                collect(Collectors.
                        groupingBy(LightNovel::getCategory));

        System.out.println(collect);

    }

}
