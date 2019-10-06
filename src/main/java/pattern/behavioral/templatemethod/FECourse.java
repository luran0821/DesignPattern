package pattern.behavioral.templatemethod;

public class FECourse extends ACourse {
    private boolean needWriteArticleFlag = false;

    public FECourse(boolean needWriteArticleFlag) {
        this.needWriteArticleFlag = needWriteArticleFlag;
    }

    void packageCourse() {
        System.out.println("提供课程的前端代码");
        System.out.println("提供课程的图片等素材");
    }

    @Override
    protected boolean needWriteArticle() {
        return needWriteArticleFlag;
    }
}
