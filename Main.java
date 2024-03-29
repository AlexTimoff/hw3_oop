import Person.Person;
import Tree.FamilyTree;

import java.time.LocalDate;
import java.util.logging.FileHandler;

public class Main {
    public static void main(String[] args)  {

        FamilyTree tree=upLoadTree();
        //Tree.FamilyTree tree=createTree();
        //saveTree(tree);
        System.out.println(tree);

        //Выводит на основе применения Итератора
        System.out.println(getTreeInfo(tree));


        tree.sortByName();
        System.out.println("Генеалогическое древо после сортировки по имени:\n"+tree);

        tree.sortByDateOfBirth();
        System.out.println("Генеалогическое древо после сортировки по дате рождения:\n"+tree);
    }


    static FamilyTree createTree() {
        FamilyTree tree=new FamilyTree();


        int id = 0;// ID будет выступать автоинкрементом

        Person maria = new Person(id++, "Мария Трофимовна Т.",
                Gender.female,
                LocalDate.of(1931, 1, 19),
                LocalDate.of(2021, 1, 15),
                null,
                null);

        Person vladimir = new Person(id++, "Владимир Николаевич Т.",
                Gender.male,
                LocalDate.of(1931, 05, 12),
                LocalDate.of(1979, 3, 13),
                null,
                null);

        Person sergey = new Person(id++, "Сергей Владимирович Т.",
                Gender.male,
                LocalDate.of(1956, 11, 14),
                LocalDate.of(2023, 12, 16),
                maria,
                vladimir);

        Person ludmila = new Person(id++, "Людмила Алексеевна Т.",
                Gender.female,
                LocalDate.of(1956, 7, 5),
                null,
                null,
                null);

        Person alexandr = new Person(id++, "Александр Сергеевич Т.",
                Gender.male,
                LocalDate.of(1989, 1, 14),
                null,
                ludmila,
                sergey);

        Person vladimir2 = new Person(id++, "Владимир Сергеевич Т.",
                Gender.male,
                LocalDate.of(1977, 9, 20),
                LocalDate.of(2007, 3, 11),
                ludmila,
                sergey);


        tree.add(maria);
        tree.add(vladimir);
        tree.add(sergey);
        tree.add(ludmila);
        tree.add(alexandr);
        tree.add(vladimir2);
        return tree;

    }

    private static void saveTree(FamilyTree tree){
        String filePath="writer/familyTree.txt";
        FileHandler fileHandler=new FileHandler();
        fileHandler.saveToFile(tree,filePath);

    }

    private static FamilyTree upLoadTree() {
        String filePath="writer/familyTree.txt";
        FileHandler fileHandler=new FileHandler();
        return fileHandler.uploadFromFile(filePath);
    }

    private static String getTreeInfo(FamilyTree tree){
        StringBuilder str=new StringBuilder();
        str.append("Генеалогическое древо:\n");
        for (Person person: tree){
            str.append(person);
            str.append("\n");
        }
        return str.toString();
    }

}
