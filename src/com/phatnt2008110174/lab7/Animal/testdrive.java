/*
* create date: 21 thg 10, 2021
* author: captainPhat
*/
package com.phatnt2008110174.lab7.Animal;

public class testdrive {
    public static void main(String[] args) {
       Cat cat = new Cat("Neko","Picture of Cat", "ăn thức ăn cho mèo", 5, "o nha");
       cat.makeNoise();
       cat.Roam();
       cat.Eat();
       cat.Sleep();

       Dog dog = new Dog("Inu","Picture of Dog", "Ăn thức ăn cho chó", 5, "ở nhà");
       dog.makeNoise();
       dog.Roam();
       dog.Sleep();
       dog.Eat();

       Lion lion = new Lion("sutu","Picture of Lion", "Thịt sống", 10, "công viên quốc gia");
       lion.makeNoise();
       lion.Roam();
       lion.Roam();
       lion.Eat();

       Tiger tiger = new Tiger("ho","Picture of Tiger", "Thịt sống", 10, "rừng");
       tiger.makeNoise();
       tiger.Roam();
       tiger.Eat();
       tiger.Sleep();

       Hippo hippo = new Hippo("hama","Picture of Hippo","ăn đủ thứ", 10,"đàm lầy");
       hippo.makeNoise();
       hippo.Roam();
       hippo.Eat();
       hippo.Sleep();

       Wolf wolf = new Wolf("Wof","Picture of Wolf", "Ăn thịt sống", 6, "rừng");
       wolf.makeNoise();
       wolf.Roam();
       wolf.Eat();
       wolf.Sleep();
    }
}
