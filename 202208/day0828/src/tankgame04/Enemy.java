package tankgame04;

// 敌人类
public class Enemy extends Tank implements Runnable{
    private Hero hero; // 敌方坦克追击目标

    public Enemy(int x, int y, int direction) {
        super(x, y, direction);
    }

    public Hero getHero() {
        return hero;
    }

    public void setHero(Hero hero) {
        this.hero = hero;
    }

    @Override
    public void run() {
        int heading = 0; // 追击方向
        while(getHealth() > 0) { // 敌人坦克生命>0时
            heading = (int) (Math.random() * 2);
            switch (heading) {
                case 0 : // 沿x轴追击
                    if(hero.getX() > getX()) { // 英雄在右侧
                        setDirection(1);

                        if(hero.getY() > getY() - 60 && hero.getY() < getY() + 60) { // 纵坐标相等，发射子弹
                            shoot();

                            try {
                                Thread.sleep(50);
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                        } else { // 否则继续追击
                            for (int i = 0; i <= 10; i++) {
                                moveRight();

                                try {
                                    Thread.sleep(50);
                                } catch (InterruptedException e) {
                                    throw new RuntimeException(e);
                                }
                            }
                        }
                    } else {
                        setDirection(3);

                        if(hero.getY() > getY() - 60 && hero.getY() < getY() + 60) {
                            shoot();

                            try {
                                Thread.sleep(50);
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                        } else {
                            for (int i = 0; i < 10; i++) {
                                moveLeft();

                                try {
                                    Thread.sleep(50);
                                } catch (InterruptedException e) {
                                    throw new RuntimeException(e);
                                }
                            }
                        }
                    }
                    break;
                case 1 : // 沿y轴追击
                    if(hero.getY() < getY()) { // 英雄在上边
                        setDirection(0);

                        if(hero.getX() > getX() - 60 && hero.getY() < getY() + 60) {
                            shoot();

                            try {
                                Thread.sleep(50);
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                        } else {
                            for (int i = 0; i < 10; i++) {
                                moveUp();
                                try {
                                    Thread.sleep(50);
                                } catch (InterruptedException e) {
                                    throw new RuntimeException(e);
                                }
                            }
                        }
                    } else {
                        setDirection(2);

                        if(hero.getX() > getX() - 60 && hero.getY() < getY() + 60) {
                            shoot();

                            try {
                                Thread.sleep(50);
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                        } else {
                            for (int i = 0; i < 10; i++) {
                                moveDown();
                                try {
                                    Thread.sleep(50);
                                } catch (InterruptedException e) {
                                    throw new RuntimeException(e);
                                }
                            }
                        }
                    }
                    break;
            }

            // 休眠
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
