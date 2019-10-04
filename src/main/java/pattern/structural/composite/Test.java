package pattern.structural.composite;

public class Test {
    public static void main(String[] args) {
        CatalogComponent linuxCourse = new Course("Linux", 11.00);
        CatalogComponent windowsCourse = new Course("Windows", 05.00);

        CatalogComponent javaCourseCatelog = new CourseCatalog("java课程目录",2);

        CatalogComponent mmallCourse1 = new Course("Java电商一期", 56.00);
        CatalogComponent mmallCourse2 = new Course("Java电商二期", 50.00);
        CatalogComponent designPattern = new Course("Java设计模式", 80.00);

        javaCourseCatelog.add(mmallCourse1);
        javaCourseCatelog.add(mmallCourse2);
        javaCourseCatelog.add(designPattern);

        CatalogComponent imoocCourseCatelog = new CourseCatalog("imooc课程目录",1);

        imoocCourseCatelog.add(linuxCourse);
        imoocCourseCatelog.add(windowsCourse);
        imoocCourseCatelog.add(javaCourseCatelog);


        imoocCourseCatelog.print();
    }
}
