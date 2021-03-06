package me.mrCookieSlime.Slimefun.Lists;

import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.FireworkEffect;
import org.bukkit.FireworkEffect.Type;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.FireworkEffectMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.Item.CustomArmor;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.Item.CustomItem;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.Item.CustomPotion;
import me.mrCookieSlime.CSCoreLibPlugin.general.String.Christmas;
import me.mrCookieSlime.CSCoreLibPlugin.general.World.CustomSkull;

public class SlimefunItems {

	/*		 Items 		*/
	public static ItemStack PORTABLE_CRAFTER = null;
	public static ItemStack PORTABLE_DUSTBIN = null;
	public static ItemStack ENDER_BACKPACK = null;
	public static ItemStack MAGIC_EYE_OF_ENDER = new CustomItem(Material.ENDER_EYE, "&6&l末影魔力之眼", "&4&l需要完整的末影盔甲", "", "&7&e右键单击&7 发射末影珍珠");
	public static ItemStack BROKEN_SPAWNER = new CustomItem(Material.SPAWNER, "&c破碎刷怪笼", "&7类型: &b<Type>", "", "&c必须在古代祭坛中修复");
	public static ItemStack REPAIRED_SPAWNER = new CustomItem(Material.SPAWNER, "&b强化刷怪笼", "&7类型: &b<Type>");
	public static ItemStack INFERNAL_BONEMEAL = new CustomItem(Material.BONE_MEAL, "&4超级骨粉", "", "&c甚至能够加速", "&c地狱疣的生长");

	/*		 Gadgets 		*/
	public static ItemStack GOLD_PAN = new CustomItem(Material.BOWL, "&6淘金盘", "&a&o可以得到各种各样的好东西...", "", "&7&e右键单击&7 从沙砾中捞出各种东西");
	public static ItemStack PARACHUTE = new CustomArmor(new CustomItem(Material.LEATHER_CHESTPLATE, "&r&l降落伞", "", "&7按住 &eShift&7 来使用"), Color.WHITE);
	public static ItemStack GRAPPLING_HOOK = new CustomItem(Material.LEAD, "&6抓钩", "", "&7&e右键单击&7 来使用");
	public static ItemStack SOLAR_HELMET = new CustomItem(Material.IRON_HELMET, "&b太阳能头盔", "", "&a&o给物品和盔甲充电");
	public static ItemStack CLOTH = new CustomItem(Material.PAPER, "&b布匹");
	public static ItemStack CAN = null;
	public static ItemStack NIGHT_VISION_GOGGLES = new CustomArmor(new CustomItem(Material.LEATHER_HELMET, "&a夜视眼镜", "", "&9+ 夜视"), Color.BLACK);
	public static ItemStack FARMER_SHOES = new CustomArmor(new CustomItem(Material.LEATHER_BOOTS, "&e农民的靴子", "", "&6&o保护庄稼不会被你踩坏"), Color.YELLOW);
	public static ItemStack INFUSED_MAGNET = null;
	public static ItemStack FLASK_OF_KNOWLEDGE = new CustomItem(Material.GLASS_BOTTLE, "&c知识之瓶", "", "&r允许你储存你的", "&r一些经验在里面", "&7花费: &a1 等级");
	public static ItemStack RAG = new CustomItem(Material.PAPER, "&c破布", "", "&a等级 I - 医疗用品", "", "&r恢复 2 颗心", "&r灭火", "", "&7&e右键单击&7 来使用");
	public static ItemStack BANDAGE = new CustomItem(Material.PAPER, "&c绷带", "", "&a等级 II - 医疗用品", "", "&r恢复 4 颗心", "&r灭火", "", "&7&e右键单击&&7 来使用");
	public static ItemStack SPLINT = new CustomItem(Material.STICK, "&c夹板", "", "&a等级 I - 医疗用品", "", "&r恢复 2 颗心", "", "&7&e右键单击&&7 来使用");
	public static ItemStack VITAMINS = new CustomItem(Material.NETHER_WART, "&c维生素", "", "&a等级 III - 医疗用品", "", "&r恢复 4 颗心", "&r灭火", "&r治愈中毒/凋零/辐射", "", "&7&e右键单击&7 来使用");
	public static ItemStack MEDICINE = new CustomPotion("&c医疗包", Color.RED, new PotionEffect(PotionEffectType.HEAL, 0, 0), "", "&a等级 III - 医疗用品", "", "&r恢复 4 颗心", "&r灭火", "治愈中毒/凋零/辐射");

	/*		Backpacks		*/
	public static ItemStack BACKPACK_SMALL = null;
	public static ItemStack BACKPACK_MEDIUM = null;
	public static ItemStack BACKPACK_LARGE = null;
	public static ItemStack WOVEN_BACKPACK = null;
	public static ItemStack GILDED_BACKPACK = null;
	public static ItemStack BOUND_BACKPACK = null;
	public static ItemStack COOLER = null;

	public static ItemStack VOIDBAG_SMALL = null;
	public static ItemStack VOIDBAG_MEDIUM = null;
	public static ItemStack VOIDBAG_BIG = null;
	public static ItemStack VOIDBAG_LARGE = null;
	public static ItemStack BOUND_VOIDBAG = null;

	/*		 Jetpacks		*/
	public static ItemStack DURALUMIN_JETPACK = new CustomArmor(new CustomItem(Material.LEATHER_CHESTPLATE, "&9电力喷气背包 &7- &eI", "", "&8\u21E8 &7材料: &b杜拉铝", "&c&o&8\u21E8 &e\u26A1 &70 / 20 J", "&8\u21E8 &7推力: &c0.35", "", "&7按住 &eShift&7 来使用"), Color.SILVER);
	public static ItemStack SOLDER_JETPACK = new CustomArmor(new CustomItem(Material.LEATHER_CHESTPLATE, "&9电力喷气背包 &7- &eII", "", "&8\u21E8 &7材料: &b焊锡", "&c&o&8\u21E8 &e\u26A1 &70 / 30 J", "&8\u21E8 &7推力: &c0.4", "", "&7按住 &eShift&7 来使用"), Color.SILVER);
	public static ItemStack BILLON_JETPACK = new CustomArmor(new CustomItem(Material.LEATHER_CHESTPLATE, "&9电力喷气背包 &7- &eIII", "", "&8\u21E8 &7材料: &b合金", "&c&o&8\u21E8 &e\u26A1 &70 / 45 J", "&8\u21E8 &7推力: &c0.45", "", "&7按住 &eShift&7 来使用"), Color.SILVER);
	public static ItemStack STEEL_JETPACK = new CustomArmor(new CustomItem(Material.LEATHER_CHESTPLATE, "&9电力喷气背包 &7- &eIV", "", "&8\u21E8 &7材料: &b钢", "&c&o&8\u21E8 &e\u26A1 &70 / 60 J", "&8\u21E8 &7推力: &c0.5", "", "&7按住 &eShift&7 来使用"), Color.SILVER);
	public static ItemStack DAMASCUS_STEEL_JETPACK = new CustomArmor(new CustomItem(Material.LEATHER_CHESTPLATE, "&9电力喷气背包 &7- &eV", "", "&8\u21E8 &7材料: &b大马士革钢", "&c&o&8\u21E8 &e\u26A1 &70 / 75 J", "&8\u21E8 &7推力: &c0.55", "", "&7按住 &eShift&7 来使用"), Color.SILVER);
	public static ItemStack REINFORCED_ALLOY_JETPACK = new CustomArmor(new CustomItem(Material.LEATHER_CHESTPLATE, "&9电力喷气背包 &7- &eVI", "", "&8\u21E8 &7材料: &b加强合金", "&c&o&8\u21E8 &e\u26A1 &70 / 100 J", "&8\u21E8 &7推力: &c0.6", "", "&7按住 &eShift&7 来使用"), Color.SILVER);
	public static ItemStack CARBONADO_JETPACK = new CustomArmor(new CustomItem(Material.LEATHER_CHESTPLATE, "&9电力喷气背包 &7- &eVII", "", "&8\u21E8 &7材料: &b黑金刚石", "&c&o&8\u21E8 &e\u26A1 &70 / 150 J", "&8\u21E8 &7推力: &c0.7", "", "&7按住 &eShift&7 来使用"), Color.BLACK);
	public static ItemStack ARMORED_JETPACK = new CustomItem(Material.IRON_CHESTPLATE, "&9盔甲喷气背包", "&8\u21E8 &7材料: &b钢", "", "&c&o&8\u21E8 &e\u26A1 &70 / 50 J", "&8\u21E8 &7推力: &c0.45", "", "&7按住 &eShift&7 来使用");

	/*		 Jetboots		*/
	public static ItemStack DURALUMIN_JETBOOTS = new CustomArmor(new CustomItem(Material.LEATHER_BOOTS, "&9喷气靴 &7- &eI", "", "&8\u21E8 &7材料: &b杜拉铝", "&c&o&8\u21E8 &e\u26A1 &70 / 20 J", "&8\u21E8 &7速度: &a0.35", "&8\u21E8 &7精密度: &c50%", "", "&7按住 &eShift&7 来使用"), Color.SILVER);
	public static ItemStack SOLDER_JETBOOTS = new CustomArmor(new CustomItem(Material.LEATHER_BOOTS, "&9喷气靴 &7- &eII", "", "&8\u21E8 &7材料: &b焊锡", "&c&o&8\u21E8 &e\u26A1 &70 / 30 J", "&8\u21E8 &7速度: &a0.4", "&8\u21E8 &7精密度: &660%", "", "&7按住 &eShift&7 来使用"), Color.SILVER);
	public static ItemStack BILLON_JETBOOTS = new CustomArmor(new CustomItem(Material.LEATHER_BOOTS, "&9喷气靴 &7- &eIII", "", "&8\u21E8 &7材料: &b钢", "&c&o&8\u21E8 &e\u26A1 &70 / 40 J", "&8\u21E8 &7速度: &a0.45", "&8\u21E8 &7精密度: &665%", "", "&7按住 &eShift&7 来使用"), Color.SILVER);
	public static ItemStack STEEL_JETBOOTS = new CustomArmor(new CustomItem(Material.LEATHER_BOOTS, "&9喷气靴 &7- &eIV", "", "&8\u21E8 &7材料: &b钢", "&c&o&8\u21E8 &e\u26A1 &70 / 50 J", "&8\u21E8 &7速度: &a0.5", "&8\u21E8 &7精密度: &e70%", "", "&7按住 &eShift&7 来使用"), Color.SILVER);
	public static ItemStack DAMASCUS_STEEL_JETBOOTS = new CustomArmor(new CustomItem(Material.LEATHER_BOOTS, "&9喷气靴 &7- &eV", "", "&8\u21E8 &7&7材料: &b大马士革钢", "&c&o&8\u21E8 &e\u26A1 &70 / 75 J", "&8\u21E8 &7速度: &a0.55", "&8\u21E8 &7精密度: &a75%", "", "&7按住 &eShift&7 来使用"), Color.SILVER);
	public static ItemStack REINFORCED_ALLOY_JETBOOTS = new CustomArmor(new CustomItem(Material.LEATHER_BOOTS, "&9喷气靴 &7- &eVI", "", "&8\u21E8 &7材料: &b加强合金", "&c&o&8\u21E8 &e\u26A1 &70 / 100 J", "&8\u21E8 &7速度: &a0.6", "&8\u21E8 &7精密度: &c80%", "", "&7按住 &eShift&7 来使用"), Color.SILVER);
	public static ItemStack CARBONADO_JETBOOTS = new CustomArmor(new CustomItem(Material.LEATHER_BOOTS, "&9喷气靴 &7- &eVII", "", "&8\u21E8 &7材料: &b黑金刚石", "&c&o&8\u21E8 &e\u26A1 &70 / 125 J", "&8\u21E8 &7速度: &a0.7", "&8\u21E8 &7精密度: &c99.9%", "", "&7按住 &eShift&7 来使用"), Color.BLACK);
	public static ItemStack ARMORED_JETBOOTS = new CustomItem(Material.IRON_BOOTS, "&9装甲喷气靴", "", "&8\u21E8 &7材料: &b钢", "&c&o&8\u21E8 &e\u26A1 &70 / 50 J", "&8\u21E8 &7速度: &a0.45", "&8\u21E8 &7精密度: &e70%", "", "&7按住 &eShift&7 来使用");

	/*		 Multi Tools		*/
	public static ItemStack DURALUMIN_MULTI_TOOL = new CustomItem(Material.SHEARS, "&9多功能工具 &7- &eI", "", "&8\u21E8 &7材料: &b杜拉铝", "&c&o&8\u21E8 &e\u26A1 &70 / 20 J", "", "&7&e右键单击&7 来使用", "&7按住 &eShift + 右键单击&7 来切换模式");
	public static ItemStack SOLDER_MULTI_TOOL = new CustomItem(Material.SHEARS, "&9多功能工具 &7- &eII", "", "&8\u21E8 &7材料: &b焊锡", "&c&o&8\u21E8 &e\u26A1 &70 / 30 J", "", "&7&e右键单击&7 来使用", "&7按住 &eShift + 右键单击&7 来切换模式");
	public static ItemStack BILLON_MULTI_TOOL = new CustomItem(Material.SHEARS, "&9多功能工具 &7- &eIII", "", "&8\u21E8 &7材料: &b钢", "&c&o&8\u21E8 &e\u26A1 &70 / 40 J", "", "&7&e右键单击&7 来使用", "&7按住 &eShift + 右键单击&7 来切换模式");
	public static ItemStack STEEL_MULTI_TOOL = new CustomItem(Material.SHEARS, "&9多功能工具 &7- &eIV", "", "&8\u21E8 &7材料: &b钢", "&c&o&8\u21E8 &e\u26A1 &70 / 50 J", "", "&7&e右键单击&7 来使用", "&7按住 &eShift + 右键单击&7 来切换模式");
	public static ItemStack DAMASCUS_STEEL_MULTI_TOOL = new CustomItem(Material.SHEARS, "&9多功能工具 &7- &eV", "", "&8\u21E8 &7&7材料: &b大马士革钢", "&c&o&8\u21E8 &e\u26A1 &70 / 60 J", "", "&7&e右键单击&7 来使用", "&7按住 &eShift + 右键单击&7 来切换模式");
	public static ItemStack REINFORCED_ALLOY_MULTI_TOOL = new CustomItem(Material.SHEARS, "&9多功能工具 &7- &eVI", "", "&8\u21E8 &7材料: &b加强合金", "&c&o&8\u21E8 &e\u26A1 &70 / 75 J", "", "&7&e右键单击&7 来使用", "&7按住 &eShift + 右键单击&7 来切换模式");
	public static ItemStack CARBONADO_MULTI_TOOL = new CustomItem(Material.SHEARS, "&9多功能工具 &7- &eVII", "", "&8\u21E8 &7材料: &b黑金刚石", "&c&o&8\u21E8 &e\u26A1 &70 / 100 J", "", "&7&e右键单击&7 来使用", "&7按住 &eShift + 右键单击&7 来切换模式");

	/*		 Food 		*/
	public static ItemStack FORTUNE_COOKIE = new CustomItem(Material.COOKIE, "&6命运曲奇", "", "&a&o告诉关于你的未来 :o");
	public static ItemStack BEEF_JERKY = new CustomItem(Material.COOKED_BEEF, "&6牛肉干", "", "&a&o撑.jpg....");
	public static ItemStack MAGIC_SUGAR = new CustomItem(Material.SUGAR, "&6魔法糖", "", "&a&o感受麦基客(Magic!)的力量! 跑(");
	public static ItemStack MONSTER_JERKY = new CustomItem(Material.ROTTEN_FLESH, "&6怪物肉干", "", "&a&o不再越吃越饿!");
	public static ItemStack APPLE_JUICE = new CustomPotion("&c苹果汁", Color.RED, new PotionEffect(PotionEffectType.SATURATION, 6, 0), "", "&7&o恢复 &b&o" + "3.0" + " &7&o饱食度");
	public static ItemStack MELON_JUICE = new CustomPotion("&c西瓜汁", Color.RED, new PotionEffect(PotionEffectType.SATURATION, 6, 0), "", "&7&o恢复 &b&o" + "3.0" + " &7&o饱食度");
	public static ItemStack CARROT_JUICE = new CustomPotion("&6胡萝卜汁", Color.ORANGE, new PotionEffect(PotionEffectType.SATURATION, 6, 0), "", "&7&o恢复 &b&o" + "3.0" + " &7&o饱食度");
	public static ItemStack PUMPKIN_JUICE = new CustomPotion("&6南瓜汁", Color.ORANGE, new PotionEffect(PotionEffectType.SATURATION, 6, 0), "", "&7&o恢复 &b&o" + "3.0" + " &7&o饱食度");
	public static ItemStack GOLDEN_APPLE_JUICE = new CustomPotion("&b金苹果汁", Color.YELLOW, new PotionEffect(PotionEffectType.ABSORPTION, 20 * 20, 0));

	/*		Christmas		*/
	public static ItemStack CHRISTMAS_MILK = new CustomPotion("&6一杯牛奶", Color.WHITE, new PotionEffect(PotionEffectType.SATURATION, 5, 0), "", "&7&o恢复 &b&o" + "2.5" + " &7&o饱食度");
	public static ItemStack CHRISTMAS_CHOCOLATE_MILK = new CustomPotion("&6巧克力奶", Color.MAROON, new PotionEffect(PotionEffectType.SATURATION, 12, 0), "", "&7&o恢复 &b&o" + "6.0" + " &7&o饱食度");
	public static ItemStack CHRISTMAS_EGG_NOG = new CustomPotion("&a蛋酒", Color.GRAY, new PotionEffect(PotionEffectType.SATURATION, 7, 0), "", "&7&o恢复 &b&o" + "3.5" + " &7&o饱食度");
	public static ItemStack CHRISTMAS_APPLE_CIDER = new CustomPotion("&c苹果酒", Color.RED, new PotionEffect(PotionEffectType.SATURATION, 14, 0), "", "&7&o恢复 &b&o" + "7.0" + " &7&o饱食度");
	public static ItemStack CHRISTMAS_COOKIE = new CustomItem(Material.COOKIE, Christmas.color("圣诞曲奇"));
	public static ItemStack CHRISTMAS_FRUIT_CAKE = new CustomItem(Material.PUMPKIN_PIE, Christmas.color("水果蛋糕"));
	public static ItemStack CHRISTMAS_APPLE_PIE = new CustomItem(Material.PUMPKIN_PIE, "&r苹果派");
	public static ItemStack CHRISTMAS_HOT_CHOCOLATE = new CustomPotion("&6热可可", Color.MAROON, new PotionEffect(PotionEffectType.SATURATION, 14, 0), "", "&7&o恢复 &b&o" + "7.0" + " &7&o饱食度");
	public static ItemStack CHRISTMAS_CAKE = new CustomItem(Material.PUMPKIN_PIE, Christmas.color("圣诞蛋糕"));
	public static ItemStack CHRISTMAS_CARAMEL = new CustomItem(Material.BRICKS, "&6焦糖");
	public static ItemStack CHRISTMAS_CARAMEL_APPLE = new CustomItem(Material.APPLE, "&6焦糖苹果");
	public static ItemStack CHRISTMAS_CHOCOLATE_APPLE = new CustomItem(Material.APPLE, "&6苹果巧克力");
	public static ItemStack CHRISTMAS_PRESENT = new CustomItem(Material.CHEST, Christmas.color("圣诞礼物"), "&7来自: &emrCookieSlime", "&7给: &e你", "", "&e右键单击&7 来打开");

	/*		Easter			*/
	public static ItemStack EASTER_EGG = new CustomItem(Material.EGG, "&r复活节彩蛋", "&b惊喜! 惊喜!");
	public static ItemStack EASTER_CARROT_PIE = new CustomItem(Material.PUMPKIN_PIE, "&6胡萝卜派");

	/*		 Weapons 		*/
	public static ItemStack GRANDMAS_WALKING_STICK = new CustomItem(Material.STICK, "&7祖母的手杖", 0, new String[0], new String[] {"KNOCKBACK-2"});
	public static ItemStack GRANDPAS_WALKING_STICK = new CustomItem(Material.STICK, "&7祖父的手杖", 0, new String[0], new String[] {"KNOCKBACK-5"});
	public static ItemStack SWORD_OF_BEHEADING = new CustomItem(Material.IRON_SWORD, "&6斩首之剑", "&7斩首 II", "", "&r有几率砍下怪物的头", "&r对于凋零骷髅头有更高的掉率");
	public static ItemStack BLADE_OF_VAMPIRES = new CustomItem(Material.GOLDEN_SWORD, "&c吸血鬼之刃", 0, new String[] {"&7生命偷取 I", "", "&r每次用这把刀攻击什么东西时", "&r你有 45% 几率", "&r恢复 2 颗心 的血量"}, new String[] {"FIRE_ASPECT-2", "DURABILITY-4", "DAMAGE_ALL-2"});
	public static ItemStack SEISMIC_AXE = new CustomItem(Material.IRON_AXE, "&a地震斧", "", "&7&o人形自走地震机...", "", "&7&e右键单击&7 来使用");

	/*		Bows		*/
	public static ItemStack EXPLOSIVE_BOW = new CustomItem(Material.BOW, "&c爆炸箭", "&r这把弓射出去的任何箭", "&r都能把敌人发射到空中");
	public static ItemStack ICY_BOW = new CustomItem(Material.BOW, "&b冰凌弓", "&r这把弓射出去的任何箭", "&r都能将敌人冰冻住", "&r2秒钟无法移动");

	/*		 Tools		*/
	public static ItemStack AUTO_SMELT_PICKAXE = new CustomItem(Material.DIAMOND_PICKAXE, "&6冶炼厂的镐头", "&c&l自动冶炼", "", "&9和熔炉一样");
	public static ItemStack LUMBER_AXE = new CustomItem(Material.DIAMOND_AXE, "&6伐木斧", "&a&o砍倒一整棵树");
	public static ItemStack PICKAXE_OF_CONTAINMENT = new CustomItem(Material.IRON_PICKAXE, "&c包含之镐", "", "&9能挖下刷怪笼");
	public static ItemStack HERCULES_PICKAXE = new CustomItem(Material.IRON_PICKAXE, "&9粉碎镐", 0, new String[] {"", "&r它太强大了", "&r能将所有挖下的矿物", "&r碎为粉尘..."}, new String[] {"DURABILITY-2", "DIG_SPEED-4"});
	public static ItemStack EXPLOSIVE_PICKAXE = new CustomItem(Material.DIAMOND_PICKAXE, "&e爆炸镐", "", "&r能允许你一次挖掘", "&r多个方块", "", "&9可与时运一起使用");
	public static ItemStack PICKAXE_OF_THE_SEEKER = new CustomItem(Material.DIAMOND_PICKAXE, "&a向导镐", "&r在使用时指向最近的矿物", "&r但这样做会降低一定的耐久度", "", "&7&e右键单击&7 来指向最近的矿物");
	public static ItemStack COBALT_PICKAXE = new CustomItem(Material.IRON_PICKAXE, "&9钴g镐", 0, new String[0], new String[] {"DURABILITY-3", "DIG_SPEED-6"});
	public static ItemStack PICKAXE_OF_VEIN_MINING = new CustomItem(Material.DIAMOND_PICKAXE, "&e连锁镐", "", "&r一次挖掉", "&r一条矿脉...");

	/*		 Armor 		*/
	public static ItemStack GLOWSTONE_HELMET = new CustomArmor(new CustomItem(Material.LEATHER_HELMET, "&e&l萤石头盔", "", "&a&o像太阳一样闪闪发亮!", "", "&9+ 夜视"), Color.YELLOW);
	public static ItemStack GLOWSTONE_CHESTPLATE = new CustomArmor(new CustomItem(Material.LEATHER_CHESTPLATE, "&e&l萤石盔甲", "", "&a&o像太阳一样闪闪发亮!", "", "&9+ 夜视"), Color.YELLOW);
	public static ItemStack GLOWSTONE_LEGGINGS = new CustomArmor(new CustomItem(Material.LEATHER_LEGGINGS, "&e&l萤石护腿", "", "&a&o像太阳一样闪闪发亮!", "", "&9+ 夜视"), Color.YELLOW);
	public static ItemStack GLOWSTONE_BOOTS = new CustomArmor(new CustomItem(Material.LEATHER_BOOTS, "&e&l萤石靴", "", "&a&o像太阳一样闪闪发亮!", "", "&9+ 夜视"), Color.YELLOW);
	public static ItemStack ENDER_HELMET = new CustomArmor(new CustomItem(Material.LEATHER_HELMET, "&5&l末影头盔", "", "&a&o有时在这里，有时在那里!"), Color.fromRGB(28, 25, 112));
	public static ItemStack ENDER_CHESTPLATE = new CustomArmor(new CustomItem(Material.LEATHER_CHESTPLATE, "&5&l末影盔甲", "", "&a&o有时在这里，有时在那里!"), Color.fromRGB(28, 25, 112));
	public static ItemStack ENDER_LEGGINGS = new CustomArmor(new CustomItem(Material.LEATHER_LEGGINGS, "&5&l末影护腿", "", "&a&o有时在这里，有时在那里!"), Color.fromRGB(28, 25, 112));
	public static ItemStack ENDER_BOOTS = new CustomArmor(new CustomItem(Material.LEATHER_BOOTS, "&5&l末影靴", "", "&a&o有时在这里，有时在那里!", "" , "&9+ 无末影珍珠跌落伤害"), Color.fromRGB(28, 25, 112));
	public static ItemStack SLIME_HELMET = new CustomArmor(new CustomItem(Material.LEATHER_HELMET, "&a&l史莱姆头盔", "", "&a&o弹性的感觉"), Color.LIME);
	public static ItemStack SLIME_CHESTPLATE = new CustomArmor(new CustomItem(Material.LEATHER_CHESTPLATE, "&a&l史莱姆盔甲", "", "&a&o弹性的感觉"), Color.LIME);
	public static ItemStack SLIME_LEGGINGS = new CustomArmor(new CustomItem(Material.LEATHER_LEGGINGS, "&a&l史莱姆护腿", "", "&a&o弹性的感觉", "", "&9+ 速度"), Color.LIME);
	public static ItemStack SLIME_BOOTS = new CustomArmor(new CustomItem(Material.LEATHER_BOOTS, "&a&l史莱姆靴", "", "&a&o弹性的感觉", "", "&9+ 跳跃提升", "&9+ 免疫摔落伤害"), Color.LIME);
	public static ItemStack CACTUS_HELMET = new CustomArmor(new CustomItem(Material.LEATHER_HELMET, "&2仙人掌头盔", 0, new String[0], new String[] {"THORNS-3", "DURABILITY-5"}), Color.GREEN);
	public static ItemStack CACTUS_CHESTPLATE = new CustomArmor(new CustomItem(Material.LEATHER_CHESTPLATE, "&2仙人掌盔甲", 0, new String[0], new String[] {"THORNS-3", "DURABILITY-5"}), Color.GREEN);
	public static ItemStack CACTUS_LEGGINGS = new CustomArmor(new CustomItem(Material.LEATHER_LEGGINGS, "&2仙人掌护腿", 0, new String[0], new String[] {"THORNS-3", "DURABILITY-5"}), Color.GREEN);
	public static ItemStack CACTUS_BOOTS = new CustomArmor(new CustomItem(Material.LEATHER_BOOTS, "&2仙人掌靴", 0, new String[0], new String[] {"THORNS-3", "DURABILITY-5"}), Color.GREEN);
	public static ItemStack DAMASCUS_STEEL_HELMET = new CustomItem(Material.IRON_HELMET, "&7大马士革钢头盔", new String[] {"DURABILITY-4", "PROTECTION_ENVIRONMENTAL-4"}, 0);
	public static ItemStack DAMASCUS_STEEL_CHESTPLATE = new CustomItem(Material.IRON_CHESTPLATE, "&7大马士革钢盔甲", new String[] {"DURABILITY-4", "PROTECTION_ENVIRONMENTAL-4"}, 0);
	public static ItemStack DAMASCUS_STEEL_LEGGINGS = new CustomItem(Material.IRON_LEGGINGS, "&7大马士革钢护腿", new String[] {"DURABILITY-4", "PROTECTION_ENVIRONMENTAL-4"}, 0);
	public static ItemStack DAMASCUS_STEEL_BOOTS = new CustomItem(Material.IRON_BOOTS, "&7大马士革钢靴", new String[] {"DURABILITY-4", "PROTECTION_ENVIRONMENTAL-4"}, 0);
	public static ItemStack REINFORCED_ALLOY_HELMET = new CustomItem(Material.IRON_HELMET, "&b强化头盔", new String[] {"DURABILITY-9", "PROTECTION_ENVIRONMENTAL-9"}, 0);
	public static ItemStack REINFORCED_ALLOY_CHESTPLATE = new CustomItem(Material.IRON_CHESTPLATE, "&b强化盔甲", new String[] {"DURABILITY-9", "PROTECTION_ENVIRONMENTAL-9"}, 0);
	public static ItemStack REINFORCED_ALLOY_LEGGINGS = new CustomItem(Material.IRON_LEGGINGS, "&b强化护腿", new String[] {"DURABILITY-9", "PROTECTION_ENVIRONMENTAL-9"}, 0);
	public static ItemStack REINFORCED_ALLOY_BOOTS = new CustomItem(Material.IRON_BOOTS, "&b强化靴", new String[] {"DURABILITY-9", "PROTECTION_ENVIRONMENTAL-9"}, 0);
	public static ItemStack SCUBA_HELMET = new CustomArmor(new CustomItem(Material.LEATHER_HELMET, "&c潜水头盔", "", "&b允许你在水下呼吸", "&4&o危险品套装的一部分"), Color.ORANGE);
	public static ItemStack HAZMATSUIT_CHESTPLATE = new CustomArmor(new CustomItem(Material.LEATHER_CHESTPLATE, "&c危险品套装胸甲", "", "&b允许你在火焰中行走", "&4&o危险品套装的一部分"), Color.ORANGE);
	public static ItemStack HAZMATSUIT_LEGGINGS = new CustomArmor(new CustomItem(Material.LEATHER_LEGGINGS, "&c危险品套装护腿", "", "&4&o危险品套装的一部分"), Color.ORANGE);
	public static ItemStack RUBBER_BOOTS = new CustomArmor(new CustomItem(Material.LEATHER_BOOTS, "&c橡胶靴", "", "&4&o危险品套装的一部分"), Color.BLACK);
	public static ItemStack GILDED_IRON_HELMET = new CustomItem(Material.GOLDEN_HELMET, "&6镀金铁头盔", new String[] {"DURABILITY-6", "PROTECTION_ENVIRONMENTAL-8"}, 0);
	public static ItemStack GILDED_IRON_CHESTPLATE = new CustomItem(Material.GOLDEN_CHESTPLATE, "&6镀金铁盔甲", new String[] {"DURABILITY-6", "PROTECTION_ENVIRONMENTAL-8"}, 0);
	public static ItemStack GILDED_IRON_LEGGINGS = new CustomItem(Material.GOLDEN_LEGGINGS, "&6镀金铁护腿", new String[] {"DURABILITY-6", "PROTECTION_ENVIRONMENTAL-8"}, 0);
	public static ItemStack GILDED_IRON_BOOTS = new CustomItem(Material.GOLDEN_BOOTS, "&6镀金铁靴", new String[] {"DURABILITY-6", "PROTECTION_ENVIRONMENTAL-8"}, 0);
	public static ItemStack GOLD_HELMET = new CustomItem(Material.GOLDEN_HELMET, "&6黄金头盔", 0, new String[] {"&912-克拉"}, new String[] {"DURABILITY-10"});
	public static ItemStack GOLD_CHESTPLATE = new CustomItem(Material.GOLDEN_CHESTPLATE, "&6黄金盔甲", 0, new String[] {"&912-克拉"}, new String[] {"DURABILITY-10"});
	public static ItemStack GOLD_LEGGINGS = new CustomItem(Material.GOLDEN_LEGGINGS, "&6黄金护腿", 0, new String[] {"&912-克拉"}, new String[] {"DURABILITY-10"});
	public static ItemStack GOLD_BOOTS = new CustomItem(Material.GOLDEN_BOOTS, "&6黄金靴", 0, new String[] {"&912-克拉"}, new String[] {"DURABILITY-10"});
	public static ItemStack SLIME_HELMET_STEEL = new CustomItem(Material.IRON_HELMET, "&a&l史莱姆钢头盔", 0, new String[] {"&7&o强化", "", "&a&o弹性的感觉"}, new String[] {"DURABILITY-4", "PROTECTION_ENVIRONMENTAL-2"});
	public static ItemStack SLIME_CHESTPLATE_STEEL = new CustomItem(Material.IRON_CHESTPLATE, "&a&l史莱姆钢盔甲", 0, new String[] {"&7&o强化", "", "&a&o弹性的感觉"}, new String[] {"DURABILITY-4", "PROTECTION_ENVIRONMENTAL-2"});
	public static ItemStack SLIME_LEGGINGS_STEEL = new CustomItem(Material.IRON_LEGGINGS, "&a&l史莱姆钢护腿", 0, new String[] {"&7&o强化", "", "&a&o弹性的感觉", "", "&9+ 速度"}, new String[] {"DURABILITY-4", "PROTECTION_ENVIRONMENTAL-2"});
	public static ItemStack SLIME_BOOTS_STEEL = new CustomItem(Material.IRON_BOOTS, "&a&l史莱姆钢靴", 0, new String[] {"&7&o强化", "", "&a&o弹性的感觉", "", "&9+ 跳跃提升", "&9+ 免疫摔落伤害"}, new String[] {"DURABILITY-4", "PROTECTION_ENVIRONMENTAL-2"});
	public static ItemStack BOOTS_OF_THE_STOMPER = new CustomArmor(new CustomItem(Material.LEATHER_BOOTS, "&b踩踏板的靴子", "", "&9你收到的所有摔落伤害", "&9都会给予周围的怪物和玩家", "", "&9+ 免疫摔落伤害"), Color.AQUA);
	public static ItemStack HEAVY_METAL_HELMET = new CustomItem(Material.IRON_HELMET, "&c重头盔", 0, new String[] {"", "&9+ 力量", "&9+ 缓慢"}, new String[] {"DURABILITY-10", "PROTECTION_ENVIRONMENTAL-10"});
	public static ItemStack HEAVY_METAL_CHESTPLATE = new CustomItem(Material.IRON_CHESTPLATE, "&c重盔甲", 0, new String[] {"", "&9+ 力量", "&9+ 缓慢"}, new String[] {"DURABILITY-10", "PROTECTION_ENVIRONMENTAL-10"});
	public static ItemStack HEAVY_METAL_LEGGINGS = new CustomItem(Material.IRON_LEGGINGS, "&c重护腿", 0, new String[] {"", "&9+ 力量", "&9+ 缓慢"}, new String[] {"DURABILITY-10", "PROTECTION_ENVIRONMENTAL-10"});
	public static ItemStack HEAVY_METAL_BOOTS = new CustomItem(Material.IRON_BOOTS, "&c重靴", 0, new String[] {"", "&9+ 力量", "&9+ 缓慢"}, new String[] {"DURABILITY-10", "PROTECTION_ENVIRONMENTAL-10"});

	/*		 Misc 		*/
	public static ItemStack MAGIC_LUMP_1 = new CustomItem(Material.GOLD_NUGGET, "&6魔法块 &7- &eI", "", "&c&o等级: I");
	public static ItemStack MAGIC_LUMP_2 = new CustomItem(Material.GOLD_NUGGET, "&6魔法块 &7- &eII", "", "&c&o等级: II");
	public static ItemStack MAGIC_LUMP_3 = new CustomItem(Material.GOLD_NUGGET, "&6魔法块 &7- &eIII", "", "&c&o等级: III");
	public static ItemStack ENDER_LUMP_1 = new CustomItem(Material.GOLD_NUGGET, "&5末影块 &7- &eI", "", "&c&o等级: I");
	public static ItemStack ENDER_LUMP_2 = new CustomItem(Material.GOLD_NUGGET, "&5末影块 &7- &eII", "", "&c&o等级: II");
	public static ItemStack ENDER_LUMP_3 = new CustomItem(Material.GOLD_NUGGET, "&5末影块 &7- &eIII", "", "&c&o等级: III");
	public static ItemStack MAGICAL_BOOK_COVER = new CustomItem(Material.PAPER, "&6魔法书皮", "", "&a&o用于各种魔法书籍");
	public static ItemStack BASIC_CIRCUIT_BOARD = new CustomItem(Material.ACTIVATOR_RAIL, "&b基础电路板");
	public static ItemStack ADVANCED_CIRCUIT_BOARD = new CustomItem(Material.POWERED_RAIL, "&b高级电路板");
	public static ItemStack WHEAT_FLOUR = new CustomItem(Material.SUGAR, "&r面粉");
	public static ItemStack STEEL_PLATE = new CustomItem(Material.PAPER, "&7&l钢板");
	public static ItemStack COMPRESSED_CARBON = null;
	public static ItemStack BATTERY = null;
	public static ItemStack CARBON_CHUNK = null;
	public static ItemStack STEEL_THRUSTER = new CustomItem(Material.BUCKET, "&7&l钢制推进器");
	public static ItemStack POWER_CRYSTAL = null;
	public static ItemStack CHAIN = new CustomItem(Material.STRING, "&b锁链");
	public static ItemStack HOOK = new CustomItem(Material.FLINT, "&b钩子");
	public static ItemStack SIFTED_ORE = new CustomItem(Material.GUNPOWDER, "&6过滤过的矿石");
	public static ItemStack STONE_CHUNK = null;
	public static ItemStack LAVA_CRYSTAL = null;
	public static ItemStack SALT = new CustomItem(Material.SUGAR, "&r盐");
	public static ItemStack BUTTER = null;
	public static ItemStack CHEESE = null;
	public static ItemStack HEAVY_CREAM = new CustomItem(Material.SNOWBALL, "&r浓奶油");
	public static ItemStack CRUSHED_ORE = new CustomItem(Material.GUNPOWDER, "&6粉碎的矿石");
	public static ItemStack PULVERIZED_ORE = new CustomItem(Material.GUNPOWDER, "&6粉状矿石");
	public static ItemStack PURE_ORE_CLUSTER = new CustomItem(Material.GUNPOWDER, "&6纯矿石群");
	public static ItemStack TINY_URANIUM = null;
	public static ItemStack SMALL_URANIUM = null;
	public static ItemStack MAGNET = null;
	public static ItemStack NECROTIC_SKULL = new CustomItem(Material.WITHER_SKELETON_SKULL, "&c坏死的头颅");
	public static ItemStack ESSENCE_OF_AFTERLIFE = new CustomItem(Material.GUNPOWDER, "&4来世的本质");
	public static ItemStack ELECTRO_MAGNET = null;
	public static ItemStack HEATING_COIL = null;
	public static ItemStack COOLING_UNIT = null;
	public static ItemStack ELECTRIC_MOTOR = null;
	public static ItemStack CARGO_MOTOR = null;
	public static ItemStack SCROLL_OF_DIMENSIONAL_TELEPOSITION = new CustomItem(Material.PAPER, "&6对影折跃卷轴", "", "&c此卷轴能够创建", "&c一个临时黑洞把周围", "&c生物包括自己", "&c传送到其他他维度", "&c一切都转过来了", "", "&r换一种说法: 让实体旋转180°");
	public static ItemStack TOME_OF_KNOWLEDGE_SHARING = new CustomItem(Material.BOOK, "&6知识共享图腾", "&7所有者: &b无", "", "&e右键单击&7 绑定图腾到你身上", "", "", "&e右键单击&7 来获取所有者", "&7解锁的全部研究");
	public static ItemStack HARDENED_GLASS = new CustomItem(Material.LIGHT_GRAY_STAINED_GLASS, "&7硬化玻璃", "", "&r抗爆炸");
	public static ItemStack WITHER_PROOF_OBSIDIAN = new CustomItem(Material.OBSIDIAN, "&5凋零黑曜石", "", "&r抗爆炸", "&r抗凋零");
	public static ItemStack WITHER_PROOF_GLASS = new CustomItem(Material.PURPLE_STAINED_GLASS, "&5凋零玻璃", "", "&rW抗爆炸", "&r抗凋零");
	public static ItemStack REINFORCED_PLATE = new CustomItem(Material.PAPER, "&7加强板");
	public static ItemStack ANCIENT_PEDESTAL = new CustomItem(Material.DISPENSER, "&d古代基座", "", "&5P古代祭坛的一部分");
	public static ItemStack ANCIENT_ALTAR = new CustomItem(Material.ENCHANTING_TABLE, "&d古代祭坛", "", "&5多方块结构 合成", "&5魔法物品的祭坛");
	public static ItemStack DUCT_TAPE = null;

	public static ItemStack RAINBOW_WOOL = new CustomItem(Material.WHITE_WOOL, "&5彩虹 羊毛", "", "&d就像是彩虹一样的美丽!");
	public static ItemStack RAINBOW_GLASS = new CustomItem(Material.WHITE_STAINED_GLASS, "&5彩虹 玻璃", "", "&d就像是彩虹一样的美丽!");
	public static ItemStack RAINBOW_CLAY = new CustomItem(Material.WHITE_TERRACOTTA, "&5彩虹 粘土", "", "&d就像是彩虹一样的美丽!");
	public static ItemStack RAINBOW_GLASS_PANE = new CustomItem(Material.WHITE_STAINED_GLASS_PANE, "&5彩虹 玻璃板", "", "&d就像是彩虹一样的美丽!");

	public static ItemStack RAINBOW_WOOL_XMAS = new CustomItem(Material.WHITE_WOOL, "&5彩虹 羊毛 &7(圣诞节)", "", Christmas.color("< 圣诞节 限量珍藏版 >"));
	public static ItemStack RAINBOW_GLASS_XMAS = new CustomItem(Material.WHITE_STAINED_GLASS, "&5彩虹 玻璃 &7(圣诞节)", "", Christmas.color("< 圣诞节 限量珍藏版 >"));
	public static ItemStack RAINBOW_CLAY_XMAS = new CustomItem(Material.WHITE_TERRACOTTA, "&5彩虹 粘土 &7(圣诞节)", "", Christmas.color("< 圣诞节 限量珍藏版 >"));
	public static ItemStack RAINBOW_GLASS_PANE_XMAS = new CustomItem(Material.WHITE_STAINED_GLASS_PANE, "&5彩虹 玻璃板 &7(圣诞节)", "", Christmas.color("< 圣诞节 限量珍藏版 >"));

	public static ItemStack RAINBOW_WOOL_VALENTINE = new CustomItem(Material.PINK_WOOL, "&5彩虹 Wool &7(情人节)", "", "&d< 情人节 限量珍藏版 >");
	public static ItemStack RAINBOW_GLASS_VALENTINE = new CustomItem(Material.PINK_STAINED_GLASS, "&5彩虹 玻璃 &7(情人节)", "", "&d< 情人节 限量珍藏版 >");
	public static ItemStack RAINBOW_CLAY_VALENTINE = new CustomItem(Material.PINK_TERRACOTTA, "&5彩虹 粘土 &7(情人节)", "", "&d< 情人节 限量珍藏版 >");
	public static ItemStack RAINBOW_GLASS_PANE_VALENTINE = new CustomItem(Material.PINK_STAINED_GLASS_PANE, "&5彩虹 G玻璃板 &7(情人节)", "", "&d< 情人节 限量珍藏版 >");

	/*		 Ingots 		*/
	public static ItemStack COPPER_INGOT = new CustomItem(Material.BRICK, "&b铜锭");
	public static ItemStack TIN_INGOT = new CustomItem(Material.IRON_INGOT, "&b锡锭");
	public static ItemStack SILVER_INGOT = new CustomItem(Material.IRON_INGOT, "&b银锭");
	public static ItemStack ALUMINUM_INGOT = new CustomItem(Material.IRON_INGOT, "&b铝锭");
	public static ItemStack LEAD_INGOT = new CustomItem(Material.IRON_INGOT, "&b铅锭");
	public static ItemStack ZINC_INGOT = new CustomItem(Material.IRON_INGOT, "&b锌锭");
	public static ItemStack MAGNESIUM_INGOT = new CustomItem(Material.IRON_INGOT, "&b镁锭");

	/*		Alloy (Carbon + Iron)	*/
	public static ItemStack STEEL_INGOT = new CustomItem(Material.IRON_INGOT, "&b钢锭");
	/*		Alloy (Copper + Tin)	*/
	public static ItemStack BRONZE_INGOT = new CustomItem(Material.BRICK, "&b青铜锭");
	/*		Alloy (Copper + Aluminum)	*/
	public static ItemStack DURALUMIN_INGOT = new CustomItem(Material.IRON_INGOT, "&b硬铝锭");
	/*		Alloy (Copper + Silver)	*/
	public static ItemStack BILLON_INGOT = new CustomItem(Material.IRON_INGOT, "&b合金锭");
	/*		Alloy (Copper + Zinc)	*/
	public static ItemStack BRASS_INGOT = new CustomItem(Material.GOLD_INGOT, "&b黄铜锭");
	/*		Alloy (Aluminum + Brass)	*/
	public static ItemStack ALUMINUM_BRASS_INGOT = new CustomItem(Material.GOLD_INGOT, "&b铝黄铜锭");
	/*		Alloy (Aluminum + Bronze)	*/
	public static ItemStack ALUMINUM_BRONZE_INGOT = new CustomItem(Material.GOLD_INGOT, "&b铝青铜锭");
	/*		Alloy (Gold + Silver + Copper)	*/
	public static ItemStack CORINTHIAN_BRONZE_INGOT = new CustomItem(Material.GOLD_INGOT, "&b科林斯青铜锭");
	/*		Alloy (Lead + Tin)	*/
	public static ItemStack SOLDER_INGOT = new CustomItem(Material.IRON_INGOT, "&b焊锡锭");
	/*		Alloy (Steel + Iron + Carbon)	*/
	public static ItemStack DAMASCUS_STEEL_INGOT = new CustomItem(Material.IRON_INGOT, "&b大马士革钢锭");
	/*		Alloy (Damascus Steel + Duralumin + Compressed Carbon + Aluminium Bronze)	*/
	public static ItemStack HARDENED_METAL_INGOT = new CustomItem(Material.IRON_INGOT, "&b&l硬化金属");
	/*		Alloy (Hardened Metal + Corinthian Bronze + Solder + Billon + Damascus Steel)	*/
	public static ItemStack REINFORCED_ALLOY_INGOT = new CustomItem(Material.IRON_INGOT, "&b&l增强合金铸锭");
	/*		Alloy (Iron + Silicon)		*/
	public static ItemStack FERROSILICON = new CustomItem(Material.IRON_INGOT, "&b硅铁");
	/*		Alloy (Iron + Gold)			*/
	public static ItemStack GILDED_IRON = new CustomItem(Material.GOLD_INGOT, "&6&l镀金铁");
	/*		Alloy (Redston + Ferrosilicon)	*/
	public static ItemStack REDSTONE_ALLOY = new CustomItem(Material.BRICK, "&c红石合金锭");
	/*		Alloy (Iron + Copper)		*/
	public static ItemStack NICKEL_INGOT = new CustomItem(Material.IRON_INGOT, "&b镍锭");
	/*		Alloy (Nickel + Iron + Copper)		*/
	public static ItemStack COBALT_INGOT = new CustomItem(Material.IRON_INGOT, "&9钴锭");

	/*		Gold		*/
	public static ItemStack GOLD_4K = new CustomItem(Material.GOLD_INGOT, "&r金粒 &7(4-克拉)");
	public static ItemStack GOLD_6K = new CustomItem(Material.GOLD_INGOT, "&r金粒 &7(6-克拉)");
	public static ItemStack GOLD_8K = new CustomItem(Material.GOLD_INGOT, "&r金粒 &7(8-克拉)");
	public static ItemStack GOLD_10K = new CustomItem(Material.GOLD_INGOT, "&r金粒 &7(10-克拉)");
	public static ItemStack GOLD_12K = new CustomItem(Material.GOLD_INGOT, "&r金粒 &7(12-克拉)");
	public static ItemStack GOLD_14K = new CustomItem(Material.GOLD_INGOT, "&r金粒 &7(14-克拉)");
	public static ItemStack GOLD_16K = new CustomItem(Material.GOLD_INGOT, "&r金粒 &7(16-克拉)");
	public static ItemStack GOLD_18K = new CustomItem(Material.GOLD_INGOT, "&r金粒 &7(18-克拉)");
	public static ItemStack GOLD_20K = new CustomItem(Material.GOLD_INGOT, "&r金粒 &7(20-克拉)");
	public static ItemStack GOLD_22K = new CustomItem(Material.GOLD_INGOT, "&r金粒 &7(22-克拉)");
	public static ItemStack GOLD_24K = new CustomItem(Material.GOLD_INGOT, "&r金粒 &7(24-克拉)");

	/*		 Dusts 		*/
	public static ItemStack IRON_DUST = new CustomItem(Material.GUNPOWDER, "&6铁粉");
	public static ItemStack GOLD_DUST = new CustomItem(Material.GLOWSTONE_DUST, "&6金粉");
	public static ItemStack TIN_DUST = new CustomItem(Material.SUGAR, "&6锡粉");
	public static ItemStack COPPER_DUST = new CustomItem(Material.GLOWSTONE_DUST, "&6铜粉");
	public static ItemStack SILVER_DUST = new CustomItem(Material.SUGAR, "&6银粉");
	public static ItemStack ALUMINUM_DUST = new CustomItem(Material.SUGAR, "&铝粉");
	public static ItemStack LEAD_DUST = new CustomItem(Material.GUNPOWDER, "&6铅粉");
	public static ItemStack SULFATE = new CustomItem(Material.GLOWSTONE_DUST, "&6硫酸盐");
	public static ItemStack ZINC_DUST = new CustomItem(Material.SUGAR, "&6锌粉");
	public static ItemStack MAGNESIUM_DUST = new CustomItem(Material.SUGAR, "&6镁");
	public static ItemStack CARBON = null;
	public static ItemStack SILICON = new CustomItem(Material.FIREWORK_STAR, "&6硅");
	public static ItemStack GOLD_24K_BLOCK = new CustomItem(Material.GOLD_BLOCK, "&r金块 &7(24-克拉)");

	/*		 Gems 		*/
	public static ItemStack SYNTHETIC_DIAMOND = new CustomItem(Material.DIAMOND, "&b人造钻石");
	public static ItemStack SYNTHETIC_EMERALD = new CustomItem(Material.EMERALD, "&b人造绿宝石");
	public static ItemStack SYNTHETIC_SAPPHIRE = null;
	public static ItemStack CARBONADO = null;
	public static ItemStack RAW_CARBONADO = null;
	public static ItemStack URANIUM = null;
	public static ItemStack NEPTUNIUM = null;
	public static ItemStack PLUTONIUM = null;
	public static ItemStack BOOSTED_URANIUM = null;

	/*		Talisman		*/
	public static ItemStack TALISMAN = new CustomItem(Material.EMERALD, "&6寻常的附身符");
	public static ItemStack TALISMAN_ANVIL = new CustomItem(Material.EMERALD, "&a铁砧护身符", "", "&r每个护身符可保护", "&r1 个工具免遭耐久用尽, 然后护身符", "&r就会被消耗", "", "&4&l警告:", "&4当工具太强力时此护身符", "&4不起作用");
	public static ItemStack TALISMAN_MINER = new CustomItem(Material.EMERALD, "&a矿工护身符", "", "&r当你拥有这个护身符时", "&r放置在你的背包中", "&r你会有 20% 几率", "&r掉落双倍矿石");
	public static ItemStack TALISMAN_HUNTER = new CustomItem(Material.EMERALD, "&a猎人护身符", "", "&r当你拥有这个护身符时", "&r放置在你的背包中", "&r你会有 20% 几率", "&r掉落双倍怪物战利品");
	public static ItemStack TALISMAN_LAVA = new CustomItem(Material.EMERALD, "&a岩浆行者护身符", "", "&r当你拥有这个护身符时", "&r放置在你的背包中", "&r这将给你防火效果", "&r当你接触到岩浆时", "&r它将会被消耗");
	public static ItemStack TALISMAN_WATER = new CustomItem(Material.EMERALD, "&a水肺护身符", "", "&r当你拥有这个护身符时", "&r放置在你的背包中", "&r这将给你水下呼吸的能力", "&r护身符被消耗后", "&r你就会开始溺水");
	public static ItemStack TALISMAN_ANGEL = new CustomItem(Material.EMERALD, "&a天使护身符", "", "&r当你拥有这个护身符时", "&ri放置在你的背包中", "&r75% 几率保护你", "&r不会受到摔落伤害");
	public static ItemStack TALISMAN_FIRE = new CustomItem(Material.EMERALD, "&a烈焰护身符", "", "&r当你拥有这个护身符时", "&r放置在你的背包中", "&r这将给你防火效果", "&r当护身符被消耗后", "&r你就会开始着火");
	public static ItemStack TALISMAN_MAGICIAN = new CustomItem(Material.EMERALD, "&a魔法师护身符", "", "&r当你拥有这个护身符时", "&r放置在你的背包中", "&r给你附魔时增加 80% 的幸运几率", "&r有时候你可以得到额外附魔");
	public static ItemStack TALISMAN_TRAVELLER = new CustomItem(Material.EMERALD, "&a旅人护身符", "", "&r当你拥有这个护身符时", "&r放置在你的背包中", "&r有 60% 的几率获得", "&r速度效果当你开始疾跑时");
	public static ItemStack TALISMAN_WARRIOR = new CustomItem(Material.EMERALD, "&a战士护身符", "", "&r当你拥有这个护身符时", "&r放置在你的背包中", "&r当你攻击时将会获得力量III效果", "&r然后护身符会被消耗");
	public static ItemStack TALISMAN_KNIGHT = new CustomItem(Material.EMERALD, "&a骑士护身符", "", "&r当你拥有这个护身符时", "&r放置在你的背包中", "&r你有 30% 几率获得 5 秒生命恢复", "&r当你受到攻击时", "&r护身符会被消耗");
	public static ItemStack TALISMAN_WHIRLWIND = new CustomItem(Material.EMERALD, "&a旋风护身符", "", "&r当你拥有这个护身符时", "&r放置在你的背包中将反弹", "&r60% 的抛射物");
	public static ItemStack TALISMAN_WIZARD = new CustomItem(Material.EMERALD, "&a巫师护身符", "", "&r当你拥有这个护身符时", "&r放置在你的背包", "&r将会附魔4/5几率", "&r或者更低的等级", "&r在你的物品上");

	/*		Staves		*/
	public static ItemStack STAFF_ELEMENTAL = new CustomItem(Material.STICK, "&6Elemental Staff");
	public static ItemStack STAFF_WIND = new CustomItem(Material.STICK, "&6Elemental Staff &7- &b&oWind", 0, new String[] {"", "&7元素: &b&oWind", "", "&7&e右键单击&7 把自己发射上天"}, new String[] {"LUCK-1"});
	public static ItemStack STAFF_FIRE = new CustomItem(Material.STICK, "&6Elemental Staff &7- &c&oFire", 0, new String[] {"", "&7元素: &c&oFire"}, new String[] {"FIRE_ASPECT-5"});
	public static ItemStack STAFF_WATER = new CustomItem(Material.STICK, "&6Elemental Staff &7- &1&oWater", 0, new String[] {"", "&7元素: &1&oWater", "", "&7&e右键单击&7 熄灭自己身上的火"}, new String[] {"WATER_WORKER-1"});

	/*		 Machines 		*/
	public static ItemStack GRIND_STONE = new CustomItem(Material.DISPENSER, "&b磨石", "", "&a&o研磨物品以提高效率");
	public static ItemStack ARMOR_FORGE = new CustomItem(Material.ANVIL, "&6装甲锻造台", "", "&a&o锻造强力的盔甲");
	public static ItemStack SMELTERY = new CustomItem(Material.FURNACE, "&6冶炼厂", "", "&a&o金属的高温熔炉");
	public static ItemStack IGNITION_CHAMBER = new CustomItem(Material.HOPPER, "&4自动点火室", "&r防止冶炼厂用完火.", "&r需要打火石", "&r必须放在冶炼厂的发射器旁边");
	public static ItemStack ORE_CRUSHER = new CustomItem(Material.DISPENSER, "&b打粉机", "", "&a&o双倍矿物!");
	public static ItemStack COMPRESSOR = new CustomItem(Material.PISTON, "&b压缩机", "", "&a&o压缩物品");
	public static ItemStack PRESSURE_CHAMBER = new CustomItem(Material.GLASS, "&b压力仓", "", "&a&o压缩更多物品");
	public static ItemStack MAGIC_WORKBENCH = new CustomItem(Material.CRAFTING_TABLE, "&6魔法工作台", "给物品注入魔法能量");
	public static ItemStack ORE_WASHER = new CustomItem(Material.CAULDRON, "&6洗矿机", "", "&a&o洗涤矿石", "&a&o并给你一些小石块");
	public static ItemStack SAW_MILL = new CustomItem(Material.IRON_BARS, "&6锯木厂", "", "&a&o一个木头劈成8份");
	public static ItemStack COMPOSTER = new CustomItem(Material.CAULDRON, "&a堆肥桶", "", "&a&o可以随时间转换各种材料...");
	public static ItemStack ENHANCED_CRAFTING_TABLE = new CustomItem(Material.CRAFTING_TABLE, "&e附魔工作台", "", "&a&o一个普通的工作台", "&a&o无法包含如此多的力量...");
	public static ItemStack CRUCIBLE = new CustomItem(Material.CAULDRON, "&c坩埚", "", "&a&o用于把物品熔化成液体");
	public static ItemStack JUICER = new CustomItem(Material.GLASS_BOTTLE, "&a榨汁机", "", "&a&o允许你榨取美味的汁液");

	public static ItemStack SOLAR_PANEL = new CustomItem(Material.DAYLIGHT_DETECTOR, "&bSolar Panel", "", "&a&oTransforms Sunlight to Energy");
	public static ItemStack SOLAR_ARRAY = new CustomItem(Material.DAYLIGHT_DETECTOR, "&b太阳能阵列", "", "&a&oTransforms Sunlight to Energy");
	public static ItemStack DIGITAL_MINER = new CustomItem(Material.IRON_PICKAXE, "&b数字矿工", "", "&a&o挖掘一切!");
	public static ItemStack ADVANCED_DIGITAL_MINER = new CustomItem(Material.DIAMOND_PICKAXE, "&6高级数字矿工", "", "&a&o挖掘一切!", "&a&o自动粉碎你的矿石");
	public static ItemStack AUTOMATED_PANNING_MACHINE = new CustomItem(Material.BOWL, "&a自动平移机", "", "&a&o淘金盘的多方块版本");

	public static ItemStack HOLOGRAM_PROJECTOR = new CustomItem(Material.QUARTZ_SLAB, "&b全息投影仪", "", "&r投射可编辑的全息图");

	/*		 Enhanced Furnaces 		*/
	public static ItemStack ENHANCED_FURNACE = new CustomItem(Material.FURNACE, "&7增强熔炉 - &eI", "", "&7处理速度: &e1x", "&7燃料效率: &e1x", "&7幸运倍增器: &e1x");
	public static ItemStack ENHANCED_FURNACE_2 = new CustomItem(Material.FURNACE, "&7增强熔炉 - &eII", "", "&7处理速度: &e2x", "&7燃料效率: &e1x", "&7幸运倍增器: &e1x");
	public static ItemStack ENHANCED_FURNACE_3 = new CustomItem(Material.FURNACE, "&7增强熔炉 - &eIII", "", "&7处理速度: &e2x", "&7燃料效率: &e2x", "&7幸运倍增器: &e1x");
	public static ItemStack ENHANCED_FURNACE_4 = new CustomItem(Material.FURNACE, "&7增强熔炉 - &eIV", "", "&7处理速度: &e3x", "&7燃料效率: &e2x", "&7幸运倍增器: &e1x");
	public static ItemStack ENHANCED_FURNACE_5 = new CustomItem(Material.FURNACE, "&7增强熔炉 - &eV", "", "&7处理速度: &e3x", "&7燃料效率: &e2x", "&7幸运倍增器: &e2x");
	public static ItemStack ENHANCED_FURNACE_6 = new CustomItem(Material.FURNACE, "&7增强熔炉 - &eVI", "", "&7处理速度: &e3x", "&7燃料效率: &e3x", "&7幸运倍增器: &e2x");
	public static ItemStack ENHANCED_FURNACE_7 = new CustomItem(Material.FURNACE, "&7增强熔炉 - &eVII", "", "&7处理速度: &e4x", "&7燃料效率: &e3x", "&7幸运倍增器: &e2x");
	public static ItemStack ENHANCED_FURNACE_8 = new CustomItem(Material.FURNACE, "&7增强熔炉 - &eVIII", "", "&7处理速度: &e4x", "&7燃料效率: &e4x", "&7幸运倍增器: &e2x");
	public static ItemStack ENHANCED_FURNACE_9 = new CustomItem(Material.FURNACE, "&7增强熔炉 - &eIX", "", "&7处理速度: &e5x", "&7燃料效率: &e4x", "&7幸运倍增器: &e2x");
	public static ItemStack ENHANCED_FURNACE_10 = new CustomItem(Material.FURNACE, "&7增强熔炉 - &eX", "", "&7处理速度: &e5x", "&7燃料效率: &e5x", "&7幸运倍增器: &e2x");
	public static ItemStack ENHANCED_FURNACE_11 = new CustomItem(Material.FURNACE, "&7增强熔炉 - &eXI", "", "&7处理速度: &e5x", "&7燃料效率: &e5x", "&7幸运倍增器: &e3x");
	public static ItemStack REINFORCED_FURNACE = new CustomItem(Material.FURNACE, "&7强化熔炉", "", "&7处理速度: &e10x", "&7燃料效率: &e10x", "&7幸运倍增器: &e3x");
	public static ItemStack CARBONADO_EDGED_FURNACE = new CustomItem(Material.FURNACE, "&7黑晶镶边熔炉", "", "&7处理速度: &e20x", "&7燃料效率: &e10x", "&7幸运倍增器: &e3x");

	public static ItemStack BLOCK_PLACER = new CustomItem(Material.DISPENSER, "&a方块放置机", "", "&r所有在放置机内的方块", "&r都会被自动放置");

	/*		Soulbound Items		*/
	public static ItemStack SOULBOUND_SWORD = new CustomItem(Material.DIAMOND_SWORD, "&c灵魂绑定剑");
	public static ItemStack SOULBOUND_BOW = new CustomItem(Material.BOW, "&c灵魂绑定弓");
	public static ItemStack SOULBOUND_PICKAXE = new CustomItem(Material.DIAMOND_PICKAXE, "&c灵魂绑定镐");
	public static ItemStack SOULBOUND_AXE = new CustomItem(Material.DIAMOND_AXE, "&c灵魂绑定斧");
	public static ItemStack SOULBOUND_SHOVEL = new CustomItem(Material.DIAMOND_SHOVEL, "&c灵魂绑定铲");
	public static ItemStack SOULBOUND_HOE = new CustomItem(Material.DIAMOND_HOE, "&c灵魂绑定锄");

	public static ItemStack SOULBOUND_HELMET = new CustomItem(Material.DIAMOND_HELMET, "&c灵魂绑定头盔");
	public static ItemStack SOULBOUND_CHESTPLATE = new CustomItem(Material.DIAMOND_CHESTPLATE, "&c灵魂绑定胸甲");
	public static ItemStack SOULBOUND_LEGGINGS = new CustomItem(Material.DIAMOND_LEGGINGS, "&c灵魂绑定护腿");
	public static ItemStack SOULBOUND_BOOTS = new CustomItem(Material.DIAMOND_BOOTS, "&c灵魂绑定靴");

	/*		Runes				*/
	public static ItemStack BLANK_RUNE = null;
	public static ItemStack RUNE_AIR = null;
	public static ItemStack RUNE_WATER = null;
	public static ItemStack RUNE_FIRE = null;
	public static ItemStack RUNE_EARTH = null;
	public static ItemStack RUNE_ENDER = null;
	public static ItemStack RUNE_RAINBOW = null;
	
	static {
		ItemStack itemB = new ItemStack(Material.FIREWORK_STAR);
		FireworkEffectMeta imB = (FireworkEffectMeta) itemB.getItemMeta();
		imB.setEffect(FireworkEffect.builder().with(Type.BURST).with(Type.BURST).withColor(Color.BLACK).build());
		imB.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&8空符文"));
		itemB.setItemMeta(imB);
		BLANK_RUNE = itemB;
		
		ItemStack itemA = new ItemStack(Material.FIREWORK_STAR);
		FireworkEffectMeta imA = (FireworkEffectMeta) itemA.getItemMeta();
		imA.setEffect(FireworkEffect.builder().with(Type.BURST).withColor(Color.AQUA).build());
		imA.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&7古代符文 &8&l[&b&lAir&8&l]"));
		itemA.setItemMeta(imA);
		RUNE_AIR = itemA;
		
		ItemStack itemW = new ItemStack(Material.FIREWORK_STAR);
		FireworkEffectMeta imW = (FireworkEffectMeta) itemW.getItemMeta();
		imW.setEffect(FireworkEffect.builder().with(Type.BURST).withColor(Color.BLUE).build());
		imW.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&7古代符文 &8&l[&1&lWater&8&l]"));
		itemW.setItemMeta(imW);
		RUNE_WATER = itemW;
		
		ItemStack itemF = new ItemStack(Material.FIREWORK_STAR);
		FireworkEffectMeta imF = (FireworkEffectMeta) itemF.getItemMeta();
		imF.setEffect(FireworkEffect.builder().with(Type.BURST).withColor(Color.RED).build());
		imF.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&7古代符文 &8&l[&4&lFire&8&l]"));
		itemF.setItemMeta(imF);
		RUNE_FIRE = itemF;
		
		ItemStack itemE = new ItemStack(Material.FIREWORK_STAR);
		FireworkEffectMeta imE = (FireworkEffectMeta) itemE.getItemMeta();
		imE.setEffect(FireworkEffect.builder().with(Type.BURST).withColor(Color.ORANGE).build());
		imE.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&7古代符文 &8&l[&c&lEarth&8&l]"));
		itemE.setItemMeta(imE);
		RUNE_EARTH = itemE;
		
		ItemStack itemN = new ItemStack(Material.FIREWORK_STAR);
		FireworkEffectMeta imN = (FireworkEffectMeta) itemN.getItemMeta();
		imN.setEffect(FireworkEffect.builder().with(Type.BURST).withColor(Color.PURPLE).build());
		imN.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&7古代符文 &8&l[&5&lEnder&8&l]"));
		itemN.setItemMeta(imN);
		RUNE_ENDER = itemN;
		
		ItemStack itemR = new ItemStack(Material.FIREWORK_STAR);
		FireworkEffectMeta imR = (FireworkEffectMeta) itemR.getItemMeta();
		imR.setEffect(FireworkEffect.builder().with(Type.BURST).withColor(Color.PURPLE).build());
		imR.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&7古代符文 &8&l[&d&lRainbow&8&l]"));
		itemR.setItemMeta(imR);
		RUNE_RAINBOW = itemR;
	}
	
	/*		Electricity			*/
	public static ItemStack SOLAR_GENERATOR = new CustomItem(Material.DAYLIGHT_DETECTOR, "&b太阳能发电机", "", "&e基础发电机", "&8\u21E8 &e\u26A1 &70 J 缓冲", "&8\u21E8 &e\u26A1 &74 J/s");
	public static ItemStack SOLAR_GENERATOR_2 = new CustomItem(Material.DAYLIGHT_DETECTOR, "&c高级太阳能发电机", "", "&a中级发电机", "&8\u21E8 &e\u26A1 &70 J 缓冲", "&8\u21E8 &e\u26A1 &716 J/s");
	public static ItemStack SOLAR_GENERATOR_3 = new CustomItem(Material.DAYLIGHT_DETECTOR, "&4黑晶太阳能发电机", "", "&4终极发电机", "&8\u21E8 &e\u26A1 &70 J 缓冲", "&8\u21E8 &e\u26A1 &764 J/s");
	public static ItemStack SOLAR_GENERATOR_4 = new CustomItem(Material.DAYLIGHT_DETECTOR, "&e强化太阳能发电机", "", "&9夜晚也能发电", "", "&4终极发电机", "&8\u21E8 &e\u26A1 &70 J 缓冲", "&8\u21E8 &e\u26A1 &7256 J/s (白天)", "&8\u21E8 &e\u26A1 &7128 J/s (夜晚)");
	
	public static ItemStack COAL_GENERATOR = null;
	public static ItemStack LAVA_GENERATOR = null;
	
	public static ItemStack ELECTRIC_FURNACE = new CustomItem(Material.FURNACE, "&c电炉", "", "&e基础机器", "&8\u21E8 &7速度: 1x", "&8\u21E8 &e\u26A1 &74 J/s");
	public static ItemStack ELECTRIC_FURNACE_2 = new CustomItem(Material.FURNACE, "&c电炉 &7- &eII", "", "&a中级机器", "&8\u21E8 &7速度: 2x", "&8\u21E8 &e\u26A1 &76 J/s");
	public static ItemStack ELECTRIC_FURNACE_3 = new CustomItem(Material.FURNACE, "&c电炉 &7- &eIII", "", "&a中级机器", "&8\u21E8 &7速度: 4x", "&8\u21E8 &e\u26A1 &710 J/s");
	
	public static ItemStack ELECTRIC_ORE_GRINDER = new CustomItem(Material.FURNACE, "&c电动矿石粉碎机", "","&r和矿石粉碎机与研磨石一样", "", "&6高级机器", "&8\u21E8 &7速度: 1x", "&8\u21E8 &e\u26A1 &712 J/s");
	public static ItemStack ELECTRIC_ORE_GRINDER_2 = new CustomItem(Material.FURNACE, "&c电动矿石粉碎机 &7(&eII&7)", "","&r和矿石粉碎机与研磨石一样", "", "&4终极机器", "&8\u21E8 &7速度: 4x", "&8\u21E8 &e\u26A1 &730 J/s");
	public static ItemStack ELECTRIC_INGOT_PULVERIZER = new CustomItem(Material.FURNACE, "&c电锭粉碎机", "", "&r将锭粉碎成粉尘", "", "&a中级机器", "&8\u21E8 &7速度: 1x", "&8\u21E8 &e\u26A1 &714 J/s");
	public static ItemStack AUTO_ENCHANTER = new CustomItem(Material.ENCHANTING_TABLE, "&5自动附魔器", "", "&a中级机器", "&8\u21E8 &7速度: 1x", "&8\u21E8 &e\u26A1 &718 J/s");
	public static ItemStack AUTO_DISENCHANTER = new CustomItem(Material.ENCHANTING_TABLE, "&5自动祛魔器", "", "&a中级机器", "&8\u21E8 &7速度: 1x", "&8\u21E8 &e\u26A1 &718 J/s");
	public static ItemStack AUTO_ANVIL = new CustomItem(Material.IRON_BLOCK, "&7自动铁砧", "", "&6高级机器", "&8\u21E8 &7修复率: 10%", "&8\u21E8 &e\u26A1 &724 J/s");
	public static ItemStack AUTO_ANVIL_2 = new CustomItem(Material.IRON_BLOCK, "&7自动铁砧 Mk.II", "", "&4终极机器", "&8\u21E8 &7修复率: 25%", "&8\u21E8 &e\u26A1 &732 J/s");
	
	public static ItemStack BIO_REACTOR = new CustomItem(Material.LIME_TERRACOTTA, "&2生物反应堆", "", "&6中级发电机", "&8\u21E8 &e\u26A1 &7128 J 缓冲", "&8\u21E8 &e\u26A1 &78 J/s");
	public static ItemStack MULTIMETER = new CustomItem(Material.CLOCK, "&e万用表", "", "&r测量方块内储存的能量");
	public static ItemStack SMALL_CAPACITOR = null, MEDIUM_CAPACITOR = null, BIG_CAPACITOR = null, LARGE_CAPACITOR = null, CARBONADO_EDGED_CAPACITOR = null;
	
	/*		Robots				*/
	public static ItemStack PROGRAMMABLE_ANDROID = null;
	public static ItemStack PROGRAMMABLE_ANDROID_MINER = null;
	public static ItemStack PROGRAMMABLE_ANDROID_BUTCHER = null;
	public static ItemStack PROGRAMMABLE_ANDROID_FARMER = null;
	public static ItemStack PROGRAMMABLE_ANDROID_WOODCUTTER = null;
	public static ItemStack PROGRAMMABLE_ANDROID_FISHERMAN = null;

	public static ItemStack PROGRAMMABLE_ANDROID_2 = null;
	public static ItemStack PROGRAMMABLE_ANDROID_2_FISHERMAN = null;
	public static ItemStack PROGRAMMABLE_ANDROID_2_FARMER = null;
	public static ItemStack PROGRAMMABLE_ANDROID_2_BUTCHER = null;

	public static ItemStack PROGRAMMABLE_ANDROID_3 = null;
	public static ItemStack PROGRAMMABLE_ANDROID_3_FISHERMAN = null;
	public static ItemStack PROGRAMMABLE_ANDROID_3_BUTCHER = null;
	
	/*		GPS					*/
	public static ItemStack GPS_TRANSMITTER = null;
	public static ItemStack GPS_TRANSMITTER_2 = null;
	public static ItemStack GPS_TRANSMITTER_3 = null;
	public static ItemStack GPS_TRANSMITTER_4 = null;
	
	public static ItemStack GPS_CONTROL_PANEL = null;
	public static ItemStack GPS_MARKER_TOOL = new CustomItem(Material.REDSTONE_TORCH, "&bGPS 标记工具", "", "&r允许您设置路径点在", "&r您放置此位置");
	public static ItemStack GPS_EMERGENCY_TRANSMITTER = null;
	public static ItemStack GPS_GEO_SCANNER = null;
	
	public static ItemStack ANDROID_INTERFACE_FUEL = new CustomItem(Material.DISPENSER, "&7机器人接口 &c(燃料)", "", "&r存储在此接口中的项目", "&r将插入机器人的燃料槽", "&r当它的脚本运行需要时");
	public static ItemStack ANDROID_INTERFACE_ITEMS = new CustomItem(Material.DISPENSER, "&7机器人接口 &9(物品)", "", "&r存储在机器人库存中的项目", "&r将被插入此接口", "&r当它的脚本运行需要时");

	public static ItemStack BUCKET_OF_OIL = null;
	public static ItemStack BUCKET_OF_FUEL = null;
	public static ItemStack OIL_PUMP = null;

	public static ItemStack REFINERY = new CustomItem(Material.PISTON, "&c炼油厂", "", "&r精炼油以创造燃料");
	public static ItemStack COMBUSTION_REACTOR = null;
	public static ItemStack ANDROID_MEMORY_CORE = null;
	
	public static ItemStack GPS_TELEPORTER_PYLON = new CustomItem(Material.PURPLE_STAINED_GLASS, "&5GPS 传送器塔", "", "&7传送器组件");
	public static ItemStack GPS_TELEPORTATION_MATRIX = new CustomItem(Material.IRON_BLOCK, "&bGPS 传送器矩阵", "", "&r这是传送器的主要组件", "&r此矩阵允许玩家从中选择", "&r此设备放置的玩家制作的路径点");
	public static ItemStack GPS_ACTIVATION_DEVICE_SHARED = new CustomItem(Material.STONE_PRESSURE_PLATE, "&rGPS 激活设备 &3(公共)", "", "&r将其放在传送矩阵上", "&r并踏上这个板激活", "&r传送过程");
	public static ItemStack GPS_ACTIVATION_DEVICE_PERSONAL = new CustomItem(Material.STONE_PRESSURE_PLATE, "&rGPS 激活设备 &a(私人)", "", "&r将其放在传送矩阵上", "&并踏上这个板激活", "&r传送过程", "", "&r此版本仅允许放置者", "&r使用它");

	public static ItemStack ELEVATOR = new CustomItem(Material.STONE_PRESSURE_PLATE, "&b电梯板", "", "&r在每个楼层放置一个电梯板", "&r你将能够在他们之间传送.", "", "&e右键单击 这个方块 &7来命名它");
	
	public static ItemStack INFUSED_HOPPER = new CustomItem(Material.HOPPER, "&5注入漏斗", "", "&r自动捡起范围内的物品： 7x7x7", "&r当放置时.");

	public static ItemStack PLASTIC_SHEET = new CustomItem(Material.PAPER, "&r塑料纸");
	public static ItemStack HEATED_PRESSURE_CHAMBER = new CustomItem(Material.LIGHT_GRAY_STAINED_GLASS, "&c高温压力室", "", "&4终极机器", "&8\u21E8 &7速度: 1x", "&8\u21E8 &e\u26A1 &710 J/s");
	public static ItemStack HEATED_PRESSURE_CHAMBER_2 = new CustomItem(Material.LIGHT_GRAY_STAINED_GLASS, "&c高温压力室 &7- &eII", "", "&4终极机器", "&8\u21E8 &7速度: 5x", "&8\u21E8 &e\u26A1 &744 J/s");
	
	public static ItemStack ELECTRIC_SMELTERY = new CustomItem(Material.FURNACE, "&c电力冶炼厂", "", "&4仅合金，不会将矿尘熔炼成锭", "", "&4终极机器", "&8\u21E8 &7速度: 1x", "&8\u21E8 &e\u26A1 &720 J/s");
	public static ItemStack ELECTRIC_SMELTERY_2 = new CustomItem(Material.FURNACE, "&c电力冶炼厂 &7- &eII", "", "&4仅合金，不会将矿尘熔炼成锭", "", "&4终极机器", "&8\u21E8 &7速度: 3x", "&8\u21E8 &e\u26A1 &740 J/s");
	
	public static ItemStack ELECTRIFIED_CRUCIBLE = new CustomItem(Material.RED_TERRACOTTA, "&c电力坩埚", "", "&4终极机器", "&8\u21E8 &7速度: 1x", "&8\u21E8 &e\u26A1 &748 J/s");
	public static ItemStack ELECTRIFIED_CRUCIBLE_2 = new CustomItem(Material.RED_TERRACOTTA, "&c电力坩埚 &7- &eII", "", "&4终极机器", "&8\u21E8 &7速度: 2x", "&8\u21E8 &e\u26A1 &780 J/s");
	public static ItemStack ELECTRIFIED_CRUCIBLE_3 = new CustomItem(Material.RED_TERRACOTTA, "&c电力坩埚 &7- &eIII", "", "&4终极机器", "&8\u21E8 &7速度: 4x", "&8\u21E8 &e\u26A1 &7120 J/s");

	public static ItemStack CARBON_PRESS = new CustomItem(Material.BLACK_STAINED_GLASS, "&c碳压机", "", "&4终极机器", "&8\u21E8 &7速度: 1x", "&8\u21E8 &e\u26A1 &720 J/s");
	public static ItemStack CARBON_PRESS_2 = new CustomItem(Material.BLACK_STAINED_GLASS, "&c碳压机 &7- &eII", "", "&4终极机器", "&8\u21E8 &7速度: 3x", "&8\u21E8 &e\u26A1 &750 J/s");
	public static ItemStack CARBON_PRESS_3 = new CustomItem(Material.BLACK_STAINED_GLASS, "&c碳压机 &7- &eIII", "", "&4终极机器", "&8\u21E8 &7速度: 15x", "&8\u21E8 &e\u26A1 &7180 J/s");
	
	public static ItemStack BLISTERING_INGOT = new CustomItem(Material.GOLD_INGOT, "&6起泡锭 &7(33%)", "", "&2辐射等级: HIGH", "&4&o需要危险品套装");
	public static ItemStack BLISTERING_INGOT_2 = new CustomItem(Material.GOLD_INGOT, "&6起泡锭 &7(66%)", "", "&2辐射等级: HIGH", "&4&o需要危险品套装");
	public static ItemStack BLISTERING_INGOT_3 = new CustomItem(Material.GOLD_INGOT, "&6起泡锭 Ingot", "", "&2辐射等级: HIGH", "&4&o需要危险品套装");
	
	public static ItemStack ENERGY_REGULATOR = null;
	public static ItemStack DEBUG_FISH = new CustomItem(Material.PUFFERFISH, "&3鱼怎么样?", "", "&e右键单击 &r任意方块来查看BlockData", "&e左键单击 &r来破坏方块", "&eShift + 左键单击 &r任意方块来抹除BlockData", "&eShift + 右键单击 &r来放置占位符方块");


	public static ItemStack NETHER_ICE = null;
	public static ItemStack ENRICHED_NETHER_ICE = null;
	public static ItemStack NETHER_ICE_COOLANT_CELL = null;
	public static ItemStack NETHER_DRILL = new CustomItem(Material.RED_TERRACOTTA, "&4下界钻", "", "&r允许你挖掘下界之冰", "", "&4终极机器", "&8\u21E8 &7速度: 1x", "&8\u21E8 &e\u26A1 &7102 J/s", "", "&c&l! &c只能在下界使用!", "&c&l! &c确保进行过地理扫描");
	
	// Cargo
	public static ItemStack CARGO_MANAGER = null;
	public static ItemStack CARGO_NODE = null;
	public static ItemStack CARGO_INPUT = null;
	public static ItemStack CARGO_OUTPUT = null;
	public static ItemStack CARGO_OUTPUT_ADVANCED = null;

	public static ItemStack AUTO_BREEDER = new CustomItem(Material.HAY_BLOCK, "&e自动哺育机", "", "&rs使用&a有机食品", "", "&4终极机器", "&8\u21E8 &e\u26A1 &71024 J 缓冲", "&8\u21E8 &e\u26A1 &760 J/动物");;
	
	public static ItemStack ORGANIC_FOOD = null;
	public static ItemStack WHEAT_ORGANIC_FOOD = null;
	public static ItemStack CARROT_ORGANIC_FOOD = null;
	public static ItemStack POTATO_ORGANIC_FOOD = null;
	public static ItemStack SEEDS_ORGANIC_FOOD = null;
	public static ItemStack BEETROOT_ORGANIC_FOOD = null;
	public static ItemStack MELON_ORGANIC_FOOD = null;
	public static ItemStack APPLE_ORGANIC_FOOD = null;
	
	public static ItemStack FERTILIZER = null;
	public static ItemStack WHEAT_FERTILIZER = null;
	public static ItemStack CARROT_FERTILIZER = null;
	public static ItemStack POTATO_FERTILIZER = null;
	public static ItemStack SEEDS_FERTILIZER = null;
	public static ItemStack BEETROOT_FERTILIZER = null;
	public static ItemStack MELON_FERTILIZER = null;
	public static ItemStack APPLE_FERTILIZER = null;
	
	public static ItemStack ANIMAL_GROWTH_ACCELERATOR = new CustomItem(Material.HAY_BLOCK, "&b动物生长加速器", "", "&rs使用&a有机食品", "", "&4终极机器", "&8\u21E8 &e\u26A1 &71024 J 缓冲", "&8\u21E8 &e\u26A1 &728 J/s");;
	public static ItemStack CROP_GROWTH_ACCELERATOR = new CustomItem(Material.LIME_TERRACOTTA, "&a作物生长加速器", "", "&r使用&a有机肥", "", "&4终极机器", "&8\u21E8 &7距离: 7x7", "&8\u21E8 &7速度: &a3/time", "&8\u21E8 &e\u26A1 &71024 J 缓冲", "&8\u21E8 &e\u26A1 &750 J/s");
	public static ItemStack CROP_GROWTH_ACCELERATOR_2 = new CustomItem(Material.LIME_TERRACOTTA, "&a作物生长加速器 &7(&eII&7)", "", "&r使用&a有机肥", "", "&4终极机器", "&8\u21E8 &7距离: 9x9", "&8\u21E8 &7速度: &a4/时间", "&8\u21E8 &e\u26A1 &71024 J 缓冲", "&8\u21E8 &e\u26A1 &760 J/s");

	public static ItemStack FOOD_FABRICATOR = new CustomItem(Material.GREEN_STAINED_GLASS, "&c食品制造器", "", "&r生产&a有机食品", "", "&6高级机器", "&8\u21E8 &7速度: 1x", "&8\u21E8 &e\u26A1 &7256 J 缓冲", "&8\u21E8 &e\u26A1 &714 J/s");
	public static ItemStack FOOD_FABRICATOR_2 = new CustomItem(Material.GREEN_STAINED_GLASS, "&c食品制造器 &7(&eII&7)", "", "&r生产&a有机食品", "", "&4终极机器", "&8\u21E8 &7速度: 6x", "&8\u21E8 &e\u26A1 &7512 J 缓冲", "&8\u21E8 &e\u26A1 &748 J/s");
	
	public static ItemStack FOOD_COMPOSTER = new CustomItem(Material.GREEN_TERRACOTTA, "&c食品压缩机", "", "&r生产&a有机肥", "", "&6高级机器", "&8\u21E8 &7速度: 1x", "&8\u21E8 &e\u26A1 &7256 J 缓冲", "&8\u21E8 &e\u26A1 &716 J/s");
	public static ItemStack FOOD_COMPOSTER_2 = new CustomItem(Material.GREEN_TERRACOTTA, "&c食品压缩机 &7(&eII&7)", "", "&r生产&a有机肥", "", "&4终极机器", "&8\u21E8 &7速度: 10x", "&8\u21E8 &e\u26A1 &7512 J 缓冲", "&8\u21E8 &e\u26A1 &752 J/s");

	public static ItemStack XP_COLLECTOR = null;
	public static ItemStack REACTOR_COOLANT_CELL = null;

	public static ItemStack NUCLEAR_REACTOR = null;
	public static ItemStack NETHERSTAR_REACTOR = null;
	public static ItemStack REACTOR_ACCESS_PORT = new CustomItem(Material.CYAN_TERRACOTTA, "&2反应堆访问接口", "", "&r允许您与反应堆进行交互", "&r通过物流节点，也可以使用", "&r作为缓冲区", "", "&8\u21E8 &e必须放置在反应堆上面 &a3 方块 ");
	
	public static ItemStack FREEZER = new CustomItem(Material.LIGHT_BLUE_STAINED_GLASS, "&b电冰箱", "", "&6高级机器", "&8\u21E8 &7速度: 1x", "&8\u21E8 &e\u26A1 &7256 J 缓冲", "&8\u21E8 &e\u26A1 &718 J/s");;
	public static ItemStack FREEZER_2 = new CustomItem(Material.LIGHT_BLUE_STAINED_GLASS, "&b电冰箱 &7(&eII&7)", "", "&4终极机器", "&8\u21E8 &7速度: 2x", "&8\u21E8 &e\u26A1 &7256 J 缓冲", "&8\u21E8 &e\u26A1 &730 J/s");;
	
	public static ItemStack ELECTRIC_GOLD_PAN = new CustomItem(Material.BROWN_TERRACOTTA, "&6电力淘金盘", "", "&e基础机器", "&8\u21E8 &7速度: 1x", "&8\u21E8 &e\u26A1 &72 J/s");
	public static ItemStack ELECTRIC_GOLD_PAN_2 = new CustomItem(Material.BROWN_TERRACOTTA, "&6电力淘金盘 &7(&eII&7)", "", "&e基础机器", "&8\u21E8 &7速度: 3x", "&8\u21E8 &e\u26A1 &74 J/s");
	public static ItemStack ELECTRIC_GOLD_PAN_3 = new CustomItem(Material.BROWN_TERRACOTTA, "&6电力淘金盘 &7(&eIII&7)", "", "&4终极机器", "&8\u21E8 &7速度: 10x", "&8\u21E8 &e\u26A1 &714 J/s");

	public static ItemStack ELECTRIC_DUST_WASHER = new CustomItem(Material.BLUE_STAINED_GLASS, "&3电力洗矿机", "", "&e基础机器", "&8\u21E8 &7速度: 1x", "&8\u21E8 &e\u26A1 &76 J/s");
	public static ItemStack ELECTRIC_DUST_WASHER_2 = new CustomItem(Material.BLUE_STAINED_GLASS, "&3电力洗矿机 &7(&eII&7)", "", "&e基础机器", "&8\u21E8 &7速度: 2x", "&8\u21E8 &e\u26A1 &710 J/s");
	public static ItemStack ELECTRIC_DUST_WASHER_3 = new CustomItem(Material.BLUE_STAINED_GLASS, "&3电力洗矿机 &7(&eIII&7)", "", "&4终极机器", "&8\u21E8 &7速度: 10x", "&8\u21E8 &e\u26A1 &730 J/s");

	public static ItemStack ELECTRIC_INGOT_FACTORY = new CustomItem(Material.RED_TERRACOTTA, "&c电锭厂", "", "&e基础机器", "&8\u21E8 &7速度: 1x", "&8\u21E8 &e\u26A1 &78 J/s");
	public static ItemStack ELECTRIC_INGOT_FACTORY_2 = new CustomItem(Material.RED_TERRACOTTA, "&c电锭厂 &7(&eII&7)", "", "&e基础机器", "&8\u21E8 &7速度: 2x", "&8\u21E8 &e\u26A1 &714 J/s");
	public static ItemStack ELECTRIC_INGOT_FACTORY_3 = new CustomItem(Material.RED_TERRACOTTA, "&c电锭厂 &7(&eIII&7)", "", "&4终极机器", "&8\u21E8 &7速度: 8x", "&8\u21E8 &e\u26A1 &740 J/s");

	public static ItemStack AUTOMATED_CRAFTING_CHAMBER = new CustomItem(Material.CRAFTING_TABLE, "&6自动合成室", "", "&6高级机器", "&8\u21E8 &e\u26A1 &710 J/物品");
	public static ItemStack FLUID_PUMP = new CustomItem(Material.BLUE_TERRACOTTA, "&9流体泵", "", "&6高级机器", "&8\u21E8 &e\u26A1 &732 J/方块");
	public static ItemStack CHARGING_BENCH = new CustomItem(Material.CRAFTING_TABLE, "&6充能台", "", "&r给物品充电", "", "&e基础机器", "&8\u21E8 &e\u26A1 &7128 J 缓冲", "&8\u21E8 &e\u26A1 &7能量损失: &c50%");

	public static ItemStack WITHER_ASSEMBLER = new CustomItem(Material.OBSIDIAN, "&5凋零组装器", "", "&4终极机器", "&8\u21E8 &7冷却: &b30 秒", "&8\u21E8 &e\u26A1 &74096 J 缓冲", "&8\u21E8 &e\u26A1 &74096 J/每个凋零");
	
	public static ItemStack TRASH_CAN = null;
	
	public static ItemStack ELYTRA = new ItemStack(Material.ELYTRA);
	public static ItemStack ELYTRA_SCALE = new CustomItem(Material.FEATHER, "&b鞘翅鳞片");
	public static ItemStack INFUSED_ELYTRA = new CustomItem(new CustomItem(ELYTRA, "&5注入的鞘翅鳞片"), new String[] {"MENDING-1"});
	public static ItemStack SOULBOUND_ELYTRA = new CustomItem(ELYTRA, "&c灵魂绑定鞘翅");
	
	// ChestTerminal Addon
	
	public static ItemStack CHEST_TERMINAL = null;
	public static ItemStack CT_IMPORT_BUS = null;
	public static ItemStack CT_EXPORT_BUS = null;
	
	static {
		try {
			PORTABLE_CRAFTER = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNzJlYzRhNGJkOGE1OGY4MzYxZjhhMDMwM2UyMTk5ZDMzZDYyNGVhNWY5MmY3Y2IzNDE0ZmVlOTVlMmQ4NjEifX19"), "&6随身合成它", "&a&o一个随身工作台", "", "&e右键单击&7 来打开");
			PORTABLE_DUSTBIN = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzJkNDEwNDJjZTk5MTQ3Y2MzOGNhYzllNDY3NDE1NzZlN2VlNzkxMjgzZTZmYWM4ZDMyOTJjYWUyOTM1ZjFmIn19fQ=="), "&6随身物品粉碎机", "&r你的随身物品销毁机", "", "&e右键单击&7 来打开");
			TRASH_CAN = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzJkNDEwNDJjZTk5MTQ3Y2MzOGNhYzllNDY3NDE1NzZlN2VlNzkxMjgzZTZmYWM4ZDMyOTJjYWUyOTM1ZjFmIn19fQ=="), "&3垃圾箱", "", "&r放进去的物品都会被销毁");
			CAN = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTRkYTk3ZjA4MGUzOTViODQyYzRjYzgyYTg0MDgyM2Q0ZGJkOGNhNjg4YTIwNjg1M2U1NzgzZTRiZmRjMDEyIn19fQ=="), "&r锡罐");
			
			STONE_CHUNK = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvY2U4ZjVhZGIxNGQ2YzlmNmI4MTBkMDI3NTQzZjFhOGMxZjQxN2UyZmVkOTkzYzk3YmNkODljNzRmNWUyZTgifX19"), "&6石块");
			
			INFUSED_MAGNET = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYWJhOGViYzRjNmE4MTczMDk0NzQ5OWJmN2UxZDVlNzNmZWQ2YzFiYjJjMDUxZTk2ZDM1ZWIxNmQyNDYxMGU3In19fQ=="), "&a魔力磁铁" , "", "&r被注入了魔法", "&r吸引附近的物品", "&r只要它在你背包的某个地方", "", "&7按住 &eShift&7 来拾取周围的物品");
			MAGNET = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYWJhOGViYzRjNmE4MTczMDk0NzQ5OWJmN2UxZDVlNzNmZWQ2YzFiYjJjMDUxZTk2ZDM1ZWIxNmQyNDYxMGU3In19fQ=="), "&c磁铁");
			ELECTRO_MAGNET = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYWJhOGViYzRjNmE4MTczMDk0NzQ5OWJmN2UxZDVlNzNmZWQ2YzFiYjJjMDUxZTk2ZDM1ZWIxNmQyNDYxMGU3In19fQ=="), "&c电磁铁");
			ELECTRIC_MOTOR = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOGNiY2EwMTJmNjdlNTRkZTlhZWU3MmZmNDI0ZTA1NmMyYWU1OGRlNWVhY2M5NDlhYjJiY2Q5NjgzY2VjIn19fQ=="), "&c电动马达");
			CARGO_MOTOR = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOGNiY2EwMTJmNjdlNTRkZTlhZWU3MmZmNDI0ZTA1NmMyYWU1OGRlNWVhY2M5NDlhYjJiY2Q5NjgzY2VjIn19fQ=="), "&3货运电机");
			
			BACKPACK_SMALL = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDBjYjFlNjdiNTEyYWIyZDRiZjNkN2FjZTBlYWFmNjFjMzJjZDQ2ODFkZGMzOTg3Y2ViMzI2NzA2YTMzZmEifX19"), "&eS号背包", new String[] {"", "&7大小: &e9", "&7ID: <ID>", "", "&7&e右键单击&7 来打开"});
			BACKPACK_MEDIUM = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDBjYjFlNjdiNTEyYWIyZDRiZjNkN2FjZTBlYWFmNjFjMzJjZDQ2ODFkZGMzOTg3Y2ViMzI2NzA2YTMzZmEifX19"), "&e背包", new String[] {"", "&7大小: &e18", "&7ID: <ID>", "", "&7&e右键单击&7 来打开"});
			BACKPACK_LARGE = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDBjYjFlNjdiNTEyYWIyZDRiZjNkN2FjZTBlYWFmNjFjMzJjZDQ2ODFkZGMzOTg3Y2ViMzI2NzA2YTMzZmEifX19"), "&eL号背包", new String[] {"", "&7大小: &e27", "&7ID: <ID>", "", "&7&e右键单击&7 来打开"});
			WOVEN_BACKPACK = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDBjYjFlNjdiNTEyYWIyZDRiZjNkN2FjZTBlYWFmNjFjMzJjZDQ2ODFkZGMzOTg3Y2ViMzI2NzA2YTMzZmEifX19"), "&e编织背包", new String[] {"", "&7大小: &e36", "&7ID: <ID>", "", "&7&e右键单击&7 来打开"});
			GILDED_BACKPACK = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDBjYjFlNjdiNTEyYWIyZDRiZjNkN2FjZTBlYWFmNjFjMzJjZDQ2ODFkZGMzOTg3Y2ViMzI2NzA2YTMzZmEifX19"), "&e镀金背包", new String[] {"", "&7大小: &e45", "&7ID: <ID>", "", "&7&e右键单击&7 来打开"});
			BOUND_BACKPACK = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMmEzYjM0ODYyYjlhZmI2M2NmOGQ1Nzc5OTY2ZDNmYmE3MGFmODJiMDRlODNmM2VhZjY0NDlhZWJhIn19fQ=="), "&c灵魂绑定背包", new String[] {"", "&7大小: &e36", "&7ID: <ID>", "", "&7&e右键单击&7 来打开"});
			COOLER = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDRjMTU3MjU4NGViNWRlMjI5ZGU5ZjVhNGY3NzlkMGFhY2JhZmZkMzNiY2IzM2ViNDUzNmE2YTJiYzZhMSJ9fX0="), "&b冰箱", new String[] {"&r允许你储存果汁和冰沙", "&r并在饥饿时自动消耗它们", "&r需要放置在背包内", "", "&7d大小: &e27", "&7ID: <ID>", "", "&7&e右键单击&7 来打开"});
			ENDER_BACKPACK = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMmEzYjM0ODYyYjlhZmI2M2NmOGQ1Nzc5OTY2ZDNmYmE3MGFmODJiMDRlODNmM2VhZjY0NDlhZWJhIn19fQ=="), "&6末影背包", new String[] {"&a&o一个随身携带的末影箱", "", "&e右键单击&7 来打开"});

			VOIDBAG_SMALL = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMmEzYjM0ODYyYjlhZmI2M2NmOGQ1Nzc5OTY2ZDNmYmE3MGFmODJiMDRlODNmM2VhZjY0NDlhZWJhIn19fQ=="), "&4S号虚空背包", new String[] {"", "&7大小: &e9", "&7ID: <ID>", "", "&7&e左键单击&7 来吸取周围的物品", "&7&e右键单击&7 来打开"});
			VOIDBAG_MEDIUM = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMmEzYjM0ODYyYjlhZmI2M2NmOGQ1Nzc5OTY2ZDNmYmE3MGFmODJiMDRlODNmM2VhZjY0NDlhZWJhIn19fQ=="), "&4虚空背包", new String[] {"", "&7大小: &e18", "&7ID: <ID>", "", "&7&e左键单击&7 来吸取周围的物品", "&7&e右键单击&7 来打开"});
			VOIDBAG_BIG = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMmEzYjM0ODYyYjlhZmI2M2NmOGQ1Nzc5OTY2ZDNmYmE3MGFmODJiMDRlODNmM2VhZjY0NDlhZWJhIn19fQ=="), "&4L号虚空背包", new String[] {"", "&7大小: &e27", "&7ID: <ID>", "", "&7&e左键单击&7 来吸取周围的物品", "&7&e右键单击&7 来打开"});
			VOIDBAG_LARGE = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMmEzYjM0ODYyYjlhZmI2M2NmOGQ1Nzc5OTY2ZDNmYmE3MGFmODJiMDRlODNmM2VhZjY0NDlhZWJhIn19fQ=="), "&4XL号虚空背包", new String[] {"", "&7大小: &e36", "&7ID: <ID>", "", "&7&e左键单击&7 来吸取周围的物品", "&7&e右键单击&7 来打开"});
			BOUND_VOIDBAG = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMmEzYjM0ODYyYjlhZmI2M2NmOGQ1Nzc5OTY2ZDNmYmE3MGFmODJiMDRlODNmM2VhZjY0NDlhZWJhIn19fQ=="), "&4灵魂绑定虚空背包", new String[] {"", "&7大小: &e36", "&7ID: <ID>", "", "&7&e左键单击&7 来吸取周围的物品", "&7&e右键单击&7 来打开"});
			
			COAL_GENERATOR = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTM0M2NlNThkYTU0Yzc5OTI0YTJjOTMzMWNmYzQxN2ZlOGNjYmJlYTliZTQ1YTdhYzg1ODYwYTZjNzMwIn19fQ=="), "&c煤炭发电机", "", "&6中级发电机", "&8\u21E8 &e\u26A1 &764 J 缓冲", "&8\u21E8 &e\u26A1 &716 J/s");
			LAVA_GENERATOR = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTM0M2NlNThkYTU0Yzc5OTI0YTJjOTMzMWNmYzQxN2ZlOGNjYmJlYTliZTQ1YTdhYzg1ODYwYTZjNzMwIn19fQ=="), "&4岩浆发电机", "", "&6中级发电机", "&8\u21E8 &e\u26A1 &7512 J 缓冲", "&8\u21E8 &e\u26A1 &720 J/s");
			COMBUSTION_REACTOR = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTM0M2NlNThkYTU0Yzc5OTI0YTJjOTMzMWNmYzQxN2ZlOGNjYmJlYTliZTQ1YTdhYzg1ODYwYTZjNzMwIn19fQ=="), "&c燃烧发电机", "", "&6中级发电机", "&8\u21E8 &e\u26A1 &7256 J 缓冲", "&8\u21E8 &e\u26A1 &724 J/s");

			NUCLEAR_REACTOR = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTM0M2NlNThkYTU0Yzc5OTI0YTJjOTMzMWNmYzQxN2ZlOGNjYmJlYTliZTQ1YTdhYzg1ODYwYTZjNzMwIn19fQ=="), "&2核反应堆", "", "&r需要冷却!", "&8\u21E8 &b必须被水包围", "&8\u21E8 &b必须提供反应堆冷却单元", "", "&4游戏后期发电机", "&8\u21E8 &e\u26A1 &716384 J 缓冲", "&8\u21E8 &e\u26A1 &7500 J/s");
			NETHERSTAR_REACTOR = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTM0M2NlNThkYTU0Yzc5OTI0YTJjOTMzMWNmYzQxN2ZlOGNjYmJlYTliZTQ1YTdhYzg1ODYwYTZjNzMwIn19fQ=="), "&f下界之星反应堆", "", "&f消耗下界之星", "&8\u21E8 &b必须被水包围", "&8\u21E8 &b必须提供下界之冰反应堆冷却单元", "", "&4游戏后期发电机", "&8\u21E8 &e\u26A1 &732768 J 缓冲", "&8\u21E8 &e\u26A1 &71024 J/s", "&8\u21E8 &4会导致周围的生物凋零");

			SMALL_CAPACITOR = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTEzNjFlNTc2YjQ5M2NiZmRmYWUzMjg2NjFjZWRkMWFkZDU1ZmFiNGU1ZWI0MThiOTJjZWJmNjI3NWY4YmI0In19fQ=="), "&aS号能量容器", "", "&e基础电容器", "&8\u21E8 &e\u26A1 &7128 J 容量");
			MEDIUM_CAPACITOR = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTEzNjFlNTc2YjQ5M2NiZmRmYWUzMjg2NjFjZWRkMWFkZDU1ZmFiNGU1ZWI0MThiOTJjZWJmNjI3NWY4YmI0In19fQ=="), "&aM号能量容器", "", "&6中级电容器", "&8\u21E8 &e\u26A1 &7512 J 容量");
			BIG_CAPACITOR = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTEzNjFlNTc2YjQ5M2NiZmRmYWUzMjg2NjFjZWRkMWFkZDU1ZmFiNGU1ZWI0MThiOTJjZWJmNjI3NWY4YmI0In19fQ=="), "&aL号能量容器", "", "&a高级电容器", "&8\u21E8 &e\u26A1 &71024 J 容量");
			LARGE_CAPACITOR = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTEzNjFlNTc2YjQ5M2NiZmRmYWUzMjg2NjFjZWRkMWFkZDU1ZmFiNGU1ZWI0MThiOTJjZWJmNjI3NWY4YmI0In19fQ=="), "&aXL号能量容器", "", "&2终极电容器", "&8\u21E8 &e\u26A1 &78192 J 容量");
			CARBONADO_EDGED_CAPACITOR = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTEzNjFlNTc2YjQ5M2NiZmRmYWUzMjg2NjFjZWRkMWFkZDU1ZmFiNGU1ZWI0MThiOTJjZWJmNjI3NWY4YmI0In19fQ=="), "&a黑晶镶边能量容器", "", "&4游戏后期电容器", "&8\u21E8 &e\u26A1 &765536 J 容量");
			CHEESE = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzRmZWJiYzE1ZDFkNGNjNjJiZWRjNWQ3YTJiNmYwZjQ2Y2Q1YjA2OTZhODg0ZGU3NWUyODllMzVjYmI1M2EwIn19fQ=="), "&r奶酪");
			BUTTER = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjY2YjE5ZjdkNjM1ZDAzNDczODkxZGYzMzAxN2M1NDkzNjMyMDlhOGY2MzI4YTg1NDJjMjEzZDA4NTI1ZSJ9fX0="), "&r黄油");
			DUCT_TAPE = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjJmYWFjZWFiNjM4NGZmZjVlZDI0YmI0NGE0YWYyZjU4NGViMTM4MjcyOWVjZDkzYTUzNjlhY2ZkNjY1NCJ9fX0="), "&8强力胶带", "", "&r你可以在自动铁砧上", "&r用这个修复物品");
		
			URANIUM = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzhiMjlhZmE2ZDZkYzkyM2UyZTEzMjRiZjgxOTI3NTBmN2JkYmRkYzY4OTYzMmEyYjZjMThkOWZlN2E1ZSJ9fX0="), "&4铀", "", "&2辐射等级: 高", "&4&o需要危险品套装");
			SMALL_URANIUM = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzhiMjlhZmE2ZDZkYzkyM2UyZTEzMjRiZjgxOTI3NTBmN2JkYmRkYzY4OTYzMmEyYjZjMThkOWZlN2E1ZSJ9fX0="), "&c小块铀", "", "&e辐射等级: 中等", "&4&o需要危险品套装");
			TINY_URANIUM = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzhiMjlhZmE2ZDZkYzkyM2UyZTEzMjRiZjgxOTI3NTBmN2JkYmRkYzY4OTYzMmEyYjZjMThkOWZlN2E1ZSJ9fX0="), "&c微小的堆铀", "", "&c辐射等级: 中等W", "&4&o不需要危险品套装");

			NEPTUNIUM = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNGVkZWE2YmZkMzdlNDlkZTQzZjE1NGZlNmZjYTYxN2Q0MTI5ZTYxYjk1NzU5YTNkNDlhMTU5MzVhMWMyZGNmMCJ9fX0="), "&a镎", "", "&2辐射等级: 高", "&4&o需要危险品套装");
			PLUTONIUM = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMjVjZjkxYjczODg2NjVhNmQ3YzFiNjAyNmJkYjIzMjJjNmQyNzg5OTdhNDQ0Nzg2NzdjYmNjMTVmNzYxMjRmIn19fQ=="), "&7钚", "", "&2辐射等级: 高", "&4&o需要危险品套装");
			BOOSTED_URANIUM = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjgzN2NhMTJmMjIyZjQ3ODcxOTZhMTdiOGFiNjU2OTg1Zjg0MDRjNTA3NjdhZGJjYjZlN2YxNDI1NGZlZSJ9fX0="), "&2提纯铀", "", "&2辐射等级: 高", "&4&o需要危险品套装");
			
			PROGRAMMABLE_ANDROID = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzUwM2NiN2VkODQ1ZTdhNTA3ZjU2OWFmYzY0N2M0N2FjNDgzNzcxNDY1YzlhNjc5YTU0NTk0Yzc2YWZiYSJ9fX0="), "&c可编程机器人 &7(常规)", "", "&8\u21E8 &7函数: 无", "&8\u21E8 &7燃料效率: 1.0x");
			PROGRAMMABLE_ANDROID_FARMER = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZjlkMzMzNTdlODQxODgyM2JmNzgzZGU5MmRlODAyOTFiNGViZDM5MmFlYzg3MDY2OThlMDY4OTZkNDk4ZjYifX19"), "&c可编程机器人 &7(农夫)", "", "&8\u21E8 &7函数: 收割", "&8\u21E8 &7燃料效率: 1.0x");
			PROGRAMMABLE_ANDROID_MINER = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTYzOGEyODU0MWFiM2FlMGE3MjNkNTU3ODczOGUwODc1ODM4OGVjNGMzMzI0N2JkNGNhMTM0ODJhZWYzMzQifX19"), "&c可编程机器人 &7(矿工)", "", "&8\u21E8 &7函数: 挖矿", "&8\u21E8 &7燃料效率: 1.0x");
			PROGRAMMABLE_ANDROID_WOODCUTTER = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDMyYTgxNDUxMDE0MjIwNTE2OWExYWQzMmYwYTc0NWYxOGU5Y2I2YzY2ZWU2NGVjYTJlNjViYWJkZWY5ZmYifX19"), "&c可编程机器人 &7(伐木人)", "", "&8\u21E8 &7函数: 伐木", "&8\u21E8 &7燃料效率: 1.0x");
			PROGRAMMABLE_ANDROID_BUTCHER = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvM2I0NzJkZjBhZDlhM2JlODhmMmU1ZDVkNDIyZDAyYjExNmQ2NGQ4ZGYxNDc1ZWQzMmU1NDZhZmM4NGIzMSJ9fX0="), "&c可编程机器人 &7(屠夫)", "", "&8\u21E8 &7函数: 屠宰", "&8\u21E8 &7伤害: 4", "&8\u21E8 &7燃料效率: 1.0x");
			PROGRAMMABLE_ANDROID_FISHERMAN = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzQ1ZTg3MzNhNzMxMTQzMzNiOThiMzYwMTc1MTI0MTcyMmY0NzEzZTFhMWE1ZDM2ZmJiMTMyNDkzZjFjNyJ9fX0="), "&c可编程机器人 &7(渔人)", "", "&8\u21E8 &7函数: 钓鱼", "&8\u21E8 &7成功率: 10%", "&8\u21E8 &7燃料效率: 1.0x");
			
			PROGRAMMABLE_ANDROID_2 = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzUwM2NiN2VkODQ1ZTdhNTA3ZjU2OWFmYzY0N2M0N2FjNDgzNzcxNDY1YzlhNjc5YTU0NTk0Yzc2YWZiYSJ9fX0="), "&c高级可编程机器人 &7(常规)", "", "&8\u21E8 &7函数: 无", "&8\u21E8 &7燃料效率: 1.5x");
			PROGRAMMABLE_ANDROID_2_FISHERMAN = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzQ1ZTg3MzNhNzMxMTQzMzNiOThiMzYwMTc1MTI0MTcyMmY0NzEzZTFhMWE1ZDM2ZmJiMTMyNDkzZjFjNyJ9fX0="), "&c高级可编程机器人 &7(渔人)", "", "&8\u21E8 &7函数: 钓鱼", "&8\u21E8 &7成功率: 20%", "&8\u21E8 &7燃料效率: 1.5x");
			PROGRAMMABLE_ANDROID_2_FARMER = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZjlkMzMzNTdlODQxODgyM2JmNzgzZGU5MmRlODAyOTFiNGViZDM5MmFlYzg3MDY2OThlMDY4OTZkNDk4ZjYifX19"), "&c高级可编程机器人 &7(农夫)", "", "&8\u21E8 &7函数: 收割", "&8\u21E8 &7燃料效率: 1.5x");
			PROGRAMMABLE_ANDROID_2_BUTCHER = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvM2I0NzJkZjBhZDlhM2JlODhmMmU1ZDVkNDIyZDAyYjExNmQ2NGQ4ZGYxNDc1ZWQzMmU1NDZhZmM4NGIzMSJ9fX0="), "&c高级可编程机器人 &7(屠夫)", "", "&8\u21E8 &7函数: 屠宰", "&8\u21E8 &7伤害: 8", "&8\u21E8 &7燃料效率: 1.5x");

			PROGRAMMABLE_ANDROID_3 = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzUwM2NiN2VkODQ1ZTdhNTA3ZjU2OWFmYzY0N2M0N2FjNDgzNzcxNDY1YzlhNjc5YTU0NTk0Yzc2YWZiYSJ9fX0="), "&e增效的可编程机器人 &7(c常规)", "", "&8\u21E8 &7函数: 无", "&8\u21E8 &7燃料效率: 3.0x");
			PROGRAMMABLE_ANDROID_3_FISHERMAN = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzQ1ZTg3MzNhNzMxMTQzMzNiOThiMzYwMTc1MTI0MTcyMmY0NzEzZTFhMWE1ZDM2ZmJiMTMyNDkzZjFjNyJ9fX0="), "&e增效的可编程机器人 &7(渔人)", "", "&8\u21E8 &7函数: 钓鱼", "&8\u21E8 &7成功率: 30%", "&8\u21E8 &7燃料效率: 8.0x");
			PROGRAMMABLE_ANDROID_3_BUTCHER = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvM2I0NzJkZjBhZDlhM2JlODhmMmU1ZDVkNDIyZDAyYjExNmQ2NGQ4ZGYxNDc1ZWQzMmU1NDZhZmM4NGIzMSJ9fX0="), "&e增效的可编程机器人 &7(屠夫)", "", "&8\u21E8 &7函数: 屠宰", "&8\u21E8 &7伤害: 20", "&8\u21E8 &7燃料效率: 8.0x");
			
			GPS_TRANSMITTER = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjBjOWMxYTAyMmY0MGI3M2YxNGI0Y2JhMzdjNzE4YzZhNTMzZjNhMjg2NGI2NTM2ZDVmNDU2OTM0Y2MxZiJ9fX0="), "&bGPS 发射器", "", "&8\u21E8 &e\u26A1 &716 J 缓冲", "&8\u21E8 &e\u26A1 &72 J/s");
			GPS_TRANSMITTER_2 = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjBjOWMxYTAyMmY0MGI3M2YxNGI0Y2JhMzdjNzE4YzZhNTMzZjNhMjg2NGI2NTM2ZDVmNDU2OTM0Y2MxZiJ9fX0="), "&c高级 GPS 发射器", "", "&8\u21E8 &e\u26A1 &764 J 缓冲", "&8\u21E8 &e\u26A1 &76 J/s");
			GPS_TRANSMITTER_3 = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjBjOWMxYTAyMmY0MGI3M2YxNGI0Y2JhMzdjNzE4YzZhNTMzZjNhMjg2NGI2NTM2ZDVmNDU2OTM0Y2MxZiJ9fX0="), "&4黑钻 GPS 发射器", "", "&8\u21E8 &e\u26A1 &7256 J 缓冲", "&8\u21E8 &e\u26A1 &722 J/s");
			GPS_TRANSMITTER_4 = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjBjOWMxYTAyMmY0MGI3M2YxNGI0Y2JhMzdjNzE4YzZhNTMzZjNhMjg2NGI2NTM2ZDVmNDU2OTM0Y2MxZiJ9fX0="), "&e电力 GPS 发射器", "", "&8\u21E8 &e\u26A1 &71024 J 缓冲", "&8\u21E8 &e\u26A1 &792 J/s");
			
			GPS_CONTROL_PANEL = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZGRjZmJhNThmYWYxZjY0ODQ3ODg0MTExODIyYjY0YWZhMjFkN2ZjNjJkNDQ4MWYxNGYzZjNiY2I2MzMwIn19fQ=="), "&bGPS 控制面板", "", "&r允许您访问您的卫星", "&r和管理路径点");
			GPS_EMERGENCY_TRANSMITTER = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjBjOWMxYTAyMmY0MGI3M2YxNGI0Y2JhMzdjNzE4YzZhNTMzZjNhMjg2NGI2NTM2ZDVmNDU2OTM0Y2MxZiJ9fX0="), "&cGPS 紧急发射器", "", "&r在您的背包中携带这个", "&r在你死亡时会自动在你的位置", "&r创建路径点.");
			
			GPS_GEO_SCANNER = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMmFkOGNmZWIzODdhNTZlM2U1YmNmODUzNDVkNmE0MTdiMjQyMjkzODg3ZGIzY2UzYmE5MWZhNDA5YjI1NGI4NiJ9fX0="), "&bGPS 地理扫描器", "", "&r扫描区块自然资源", "&r例如 &8原油");
			OIL_PUMP = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYWZlMWEwNDBhNDI1ZTMxYTQ2ZDRmOWE5Yjk4MDZmYTJmMGM0N2VlODQ3MTFjYzE5MzJmZDhhYjMyYjJkMDM4In19fQ=="), "&r原油泵", "", "&7将油泵起并将其填充到桶中", "", "&c&l! &c确保首先对区块进行地理扫描");
			BUCKET_OF_OIL = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNmNlMDRiNDFkMTllYzc5MjdmOTgyYTYzYTk0YTNkNzlmNzhlY2VjMzMzNjMwNTFmZGUwODMxYmZhYmRiZCJ9fX0="), "&r原油桶");
			BUCKET_OF_FUEL = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTg0ZGRjYTc2NjcyNWI4Yjk3NDEzZjI1OWMzZjc2NjgwNzBmNmFlNTU0ODNhOTBjOGU1NTI1Mzk0ZjljMDk5In19fQ=="), "&r燃料桶");

			NETHER_ICE = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvM2NlMmRhZDliYWY3ZWFiYTdlODBkNGQwZjlmYWMwYWFiMDFhNzZiMTJmYjcxYzNkMmFmMmExNmZkZDRjNzM4MyJ9fX0="), "&e下界之冰", "", "&e辐射水平: 中等", "&4&o需要危险品套装");
			ENRICHED_NETHER_ICE = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvN2M4MThhYTEzYWFiYzcyOTQ4MzhkMjFjYWFjMDU3ZTk3YmQ4Yzg5NjQxYTBjMGY4YTU1NDQyZmY0ZTI3In19fQ=="), "&e富集的下界之冰", "", "&2辐射水平: 极高", "&4&o需要危险品套装");

			LAVA_CRYSTAL = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTNhZDhlZTg0OWVkZjA0ZWQ5YTI2Y2EzMzQxZjYwMzNiZDc2ZGNjNDIzMWVkMWVhNjNiNzU2NTc1MWIyN2FjIn19fQ=="), "&4岩浆水晶");
			ANDROID_MEMORY_CORE = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDc4ZjJiN2U1ZTc1NjM5ZWE3ZmI3OTZjMzVkMzY0YzRkZjI4YjQyNDNlNjZiNzYyNzdhYWRjZDYyNjEzMzcifX19"), "&b机器人的内存核心");

			CARBON = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOGIzYTA5NWI2YjgxZTZiOTg1M2ExOTMyNGVlZGYwYmI5MzQ5NDE3MjU4ZGQxNzNiOGVmZjg3YTA4N2FhIn19fQ=="), "&e碳");
			COMPRESSED_CARBON = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzIxZDQ5NTE2NTc0OGQzMTE2Zjk5ZDZiNWJkNWQ0MmViOGJhNTkyYmNkZmFkMzdmZDk1ZjliNmMwNGEzYiJ9fX0="), "&c压缩碳");
			CARBON_CHUNK = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzIxZDQ5NTE2NTc0OGQzMTE2Zjk5ZDZiNWJkNWQ0MmViOGJhNTkyYmNkZmFkMzdmZDk1ZjliNmMwNGEzYiJ9fX0="), "&4碳块");
			
			SYNTHETIC_SAPPHIRE = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTM1MDMyZjRkN2QwMWRlOGVjOTlkODlmODcyMzAxMmQ0ZTc0ZmE3MzAyMmM0ZmFjZjFiNTdjN2ZmNmZmMCJ9fX0="), "&b合成蓝宝石");
			CARBONADO = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTJmNGIxNTc3ZjUxNjBjNjg5MzE3MjU3MWM0YTcxZDhiMzIxY2RjZWFhMDMyYzZlMGUzYjYwZTBiMzI4ZmEifX19"), "&b&l黑金刚石", "", "&7&o\"黑钻\"");
			RAW_CARBONADO = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWI0OWU2ZWMxMDc3MWU4OTkyMjVhZWE3M2NkOGNmMDM2ODRmNDExZDE0MTVjNzMyM2M5M2NiOTQ3NjIzMCJ9fX0="), "&b原生黑金刚石");
			
			ENERGY_REGULATOR = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDc4ZjJiN2U1ZTc1NjM5ZWE3ZmI3OTZjMzVkMzY0YzRkZjI4YjQyNDNlNjZiNzYyNzdhYWRjZDYyNjEzMzcifX19"), "&6能量调节器", "", "&r能源网络的核心部分");
			
			CARGO_MANAGER = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTUxMGJjODUzNjJhMTMwYTZmZjlkOTFmZjExZDZmYTQ2ZDdkMTkxMmEzNDMxZjc1MTU1OGVmM2M0ZDljMiJ9fX0="), "&6物流管理器", "", "&r物品传输网络的核心部分");
			CARGO_NODE = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMDdiN2VmNmZkNzg2NDg2NWMzMWMxZGM4N2JlZDI0YWI1OTczNTc5ZjVjNjYzOGZlY2I4ZGVkZWI0NDNmZjAifX19"), "&7物流节点 &c(连接器)", "", "&r物流连接器管道");
			CARGO_INPUT = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTZkMWMxYTY5YTNkZTlmZWM5NjJhNzdiZjNiMmUzNzZkZDI1Yzg3M2EzZDhmMTRmMWRkMzQ1ZGFlNGM0In19fQ=="), "&7物流节点 &c(输入)", "", "&r物流输入管道");
			CARGO_OUTPUT = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTViMjFmZDQ4MGMxYzQzYmYzYjlmODQyYzg2OWJkYzNiYzVhY2MyNTk5YmYyZWI2YjhhMWM5NWRjZTk3OGYifX19"), "&7物流节点 &c(输出)", "", "&r物流输出管道");
			CARGO_OUTPUT_ADVANCED = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTViMjFmZDQ4MGMxYzQzYmYzYjlmODQyYzg2OWJkYzNiYzVhY2MyNTk5YmYyZWI2YjhhMWM5NWRjZTk3OGYifX19"), "&6高级物流节点 &c(输出)", "", "&r物流输出管道");

			XP_COLLECTOR = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTc2MmExNWIwNDY5MmEyZTRiM2ZiMzY2M2JkNGI3ODQzNGRjZTE3MzJiOGViMWM3YTlmN2MwZmJmNmYifX19"), "&a经验收集器", "", "&r收集旁边的经验球并收集在里面", "", "&4终极机器", "&8\u21E8 &e\u26A1 &71024 J 缓冲", "&8\u21E8 &e\u26A1 &720 J/s");
			
			ORGANIC_FOOD = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ=="), "&a有机食物", "&7内容: &9X");
			WHEAT_ORGANIC_FOOD = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ=="), "&a有机食物", "&7内容: &9小麦");
			CARROT_ORGANIC_FOOD = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ=="), "&a有机食物", "&7内容: &9胡萝卜");
			POTATO_ORGANIC_FOOD = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ=="), "&a有机食物", "&7内容: &9马铃薯");
			SEEDS_ORGANIC_FOOD = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ=="), "&a有机食物", "&7内容: &9种子");
			BEETROOT_ORGANIC_FOOD = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ=="), "&a有机食物", "&7内容: &9甜菜根");
			MELON_ORGANIC_FOOD = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ=="), "&a有机食物", "&7内容: &9西瓜");
			APPLE_ORGANIC_FOOD = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ=="), "&a有机食物", "&7内容: &9苹果");

			FERTILIZER = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ=="), "&a有机肥", "&7内容 &9X");
			WHEAT_FERTILIZER = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ=="), "&a有机肥", "&7内容: &9小麦");
			CARROT_FERTILIZER = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ=="), "&a有机肥", "&7内容: &9胡萝卜");
			POTATO_FERTILIZER = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ=="), "&a有机肥", "&7内容: &9马铃薯");
			SEEDS_FERTILIZER = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ=="), "&a有机肥", "&7内容: &9种子");
			BEETROOT_FERTILIZER = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ=="), "&a有机肥", "&7内容: &9甜菜根");
			MELON_FERTILIZER = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ=="), "&a有机肥", "&7内容: &9西瓜");
			APPLE_FERTILIZER = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ=="), "&a有机肥", "&7内容: &9苹果");

			NETHER_ICE_COOLANT_CELL = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOGQzY2Q0MTI1NTVmODk3MDE2MjEzZTVkNmM3NDMxYjQ0OGI5ZTU2NDRlMWIxOWVjNTFiNTMxNmYzNTg0MGUwIn19fQ=="), "&6下界冰冷却池");
			REACTOR_COOLANT_CELL = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZGU0MDczYmU0MGNiM2RlYjMxMGEwYmU5NTliNGNhYzY4ZTgyNTM3MjcyOGZhZmI2YzI5NzNlNGU3YzMzIn19fQ=="), "&b反应堆冷却剂池");

			CHEST_TERMINAL = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvN2E0NGZmM2E1ZjQ5YzY5Y2FiNjc2YmFkOGQ5OGEwNjNmYTc4Y2ZhNjE5MTZmZGVmM2UyNjc1NTdmZWMxODI4MyJ9fX0="), "&3访问终端", "&7If this Block is connected to a", "&7Cargo Network, it will allow you to remotely", "&7interact with any Items supplied by", "&7Nodes tuned into the ChestTerminal Channel");
			CT_IMPORT_BUS = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTEzZGIyZTdlNzJlYTQ0MzJlZWZiZDZlNThhODVlYWEyNDIzZjgzZTY0MmNhNDFhYmM2YTkzMTc3NTdiODg5In19fQ=="), "&3导入总线", "&7If this Block is connected to a", "&7Cargo Network, it will pull any Items from", "&7the Inventory it is attached to and place it", "&7into the CT Network Channel");
			CT_EXPORT_BUS = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTEzZGIyZTdlNzJlYTQ0MzJlZWZiZDZlNThhODVlYWEyNDIzZjgzZTY0MmNhNDFhYmM2YTkzMTc3NTdiODg5In19fQ=="), "&3导出总线", "&7If this Block is connected to a", "&7Cargo Network, it will pull any Items from", "&7the CT Network Channel and place these", "&7into the Inventory it is attached to");
			
			BATTERY = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNmUyZGRhNmVmNjE4NWQ0ZGQ2ZWE4Njg0ZTk3ZDM5YmE4YWIwMzdlMjVmNzVjZGVhNmJkMjlkZjhlYjM0ZWUifX19"), "&6电池");
			
			HEATING_COIL = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvN2UzYmM0ODkzYmE0MWEzZjczZWUyODE3NGNkZjRmZWY2YjE0NWU0MWZlNmM4MmNiN2JlOGQ4ZTk3NzFhNSJ9fX0="), "&c加热线圈");
			COOLING_UNIT = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNzU0YmFkODZjOTlkZjc4MGM4ODlhMTA5OGY3NzY0OGVhZDczODVjYzFkZGIwOTNkYTVhN2Q4YzRjMmFlNTRkIn19fQ=="), "&b冷却水晶");
			POWER_CRYSTAL = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTNjMWIwMzZiNmUwMzUxN2IyODVhODExYmQ4NWU3M2Y1YWJmZGFjYzFkZGY5MGRmZjk2MmUxODA5MzRlMyJ9fX0="), "&c&l能量水晶");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
