package writer;


import Tree.FamilyTree;

public interface Writable {

    boolean saveToFile(FamilyTree familyTree, String filePath);// сохранение данных в файл

    boolean saveToFile(FamilyTree familyTree, String filePath);

    FamilyTree uploadFromFile (String filePath);// загрузка данных из файла

}
