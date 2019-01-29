package design_mode.behaviour.visitor;

public class LiBaiVisitor implements SeasonVisitor {

    @Override
    public void visitSpring(Spring spring) {
        System.out.println("杨花落尽子规啼，闻道龙标过五溪");
    }

    @Override
    public void visitSummer(Summer summer) {
        System.out.println("镜湖三百里，菡萏发荷花");
    }

    @Override
    public void vivisAutumn(Autumn autunm) {
        System.out.println("涉江玩秋水，爱此红蕖鲜");
    }

    @Override
    public void visitWinter(Winter winter) {
        System.out.println("欲渡黄河冰塞川，将登太行雪满山");
    }
}
