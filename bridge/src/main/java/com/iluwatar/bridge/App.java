package com.iluwatar.bridge;

/**
 * 
 * The Bridge pattern can also be thought of as two layers of abstraction(两层抽象). With Bridge, you can
 * decouple(解耦) an abstraction from its implementation so that the two can vary independently（独立）.
 * <p>
 * In Bridge pattern both abstraction ({@link MagicWeapon}) and implementation (
 * {@link MagicWeaponImpl}) have their own class hierarchies（层次）. The interface of the implementations
 * can be changed without affecting the clients.
 * 
 */
public class App {

  /**
   * Program entry point
   * 
   * @param args command line args
   */
  public static void main(String[] args) {
    BlindingMagicWeapon blindingMagicWeapon = new BlindingMagicWeapon(new Excalibur());
    blindingMagicWeapon.wield();
    blindingMagicWeapon.blind();
    blindingMagicWeapon.swing();
    blindingMagicWeapon.unwield();

    FlyingMagicWeapon flyingMagicWeapon = new FlyingMagicWeapon(new Mjollnir());
    flyingMagicWeapon.wield();
    flyingMagicWeapon.fly();
    flyingMagicWeapon.swing();
    flyingMagicWeapon.unwield();

    SoulEatingMagicWeapon soulEatingMagicWeapon = new SoulEatingMagicWeapon(new Stormbringer());
    soulEatingMagicWeapon.wield();
    soulEatingMagicWeapon.swing();
    soulEatingMagicWeapon.eatSoul();
    soulEatingMagicWeapon.unwield();
  }
}
