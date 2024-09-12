-- Data Sample
INSERT INTO Categories (CategoryName_EN, CategoryName_ZH) VALUES ('Curry Hong Kong Style', '咖喱香港風味');
INSERT INTO Categories (CategoryName_EN, CategoryName_ZH) VALUES ('Hot ' || CHR(38) || ' Cold Drinks', '熱飲和冷飲');
INSERT INTO Categories (CategoryName_EN, CategoryName_ZH) VALUES ('Party Tray', '派對拼盤');
COMMIT;

INSERT INTO NoodleType (NoodleTypeName_EN, NoodleTypeName_ZH, NoodleTypePrice) VALUES ('Vermicelli', '米粉', 0);
INSERT INTO NoodleType (NoodleTypeName_EN, NoodleTypeName_ZH, NoodleTypePrice) VALUES ('Udon', '烏冬', 3.00);
INSERT INTO NoodleType (NoodleTypeName_EN, NoodleTypeName_ZH, NoodleTypePrice) VALUES ('Instant Noodles', '即食麵', 2.00);
COMMIT;

INSERT INTO Drinks (DrinkName_EN, DrinkName_ZH, Price) VALUES ('Hot Lemon Tea', '熱檸檬茶', 0);
INSERT INTO Drinks (DrinkName_EN, DrinkName_ZH, Price) VALUES ('Iced Lemon Tea', '冰檸檬茶', 0);
INSERT INTO Drinks (DrinkName_EN, DrinkName_ZH, Price) VALUES ('Passion Fruit Lemon Honey', '百香果蜂蜜檸檬', 2.5);
INSERT INTO Drinks (DrinkName_EN, DrinkName_ZH, Price) VALUES ('Tofu Jelly Coffee', '豆腐花凍咖啡', 1.0);
INSERT INTO Drinks (DrinkName_EN, DrinkName_ZH, Price) VALUES ('Cappuccino', '卡布奇諾', 2.0);
COMMIT;

INSERT INTO AllergenType (NoticeText_EN, NoticeText_ZH) VALUES ('Contains nuts and dairy', '含有堅果和乳製品');
INSERT INTO AllergenType (NoticeText_EN, NoticeText_ZH) VALUES ('Contains gluten', '含有麩質');
COMMIT;

INSERT INTO ModificationType (ModiTypeName_EN, ModiTypeName_ZH) VALUES ('Extra Spicy', '額外辣');
INSERT INTO ModificationType (ModiTypeName_EN, ModiTypeName_ZH) VALUES ('No Onions', '不要洋蔥');
COMMIT;

INSERT INTO Items (CategoryID, ItemName_EN, ItemName_ZH, Price, ImageURL, IsIncludedDrink, IsNoodle) VALUES (1, 'Curry Beef Brisket', '咖喱牛腩', 18.99, 'url_to_image', 'Y', 'N');
INSERT INTO Items (CategoryID, ItemName_EN, ItemName_ZH, Price, ImageURL, IsIncludedDrink, IsNoodle) VALUES (2, 'Passion Fruit Lemon Honey', '百香果蜂蜜檸檬', 7.99, 'url_to_image', 'N', 'N');
INSERT INTO Items (CategoryID, ItemName_EN, ItemName_ZH, Price, ImageURL, IsIncludedDrink, IsNoodle) VALUES (3, 'Party Tray - Curry Beef Brisket', '派對拼盤 - 咖喱牛腩', 98.00, 'url_to_image', 'N', 'N');
INSERT INTO Items (CategoryID, ItemName_EN, ItemName_ZH, Price, ImageURL, IsIncludedDrink, IsNoodle) VALUES (1, 'BBQ pork spaghetti in soup with scrambled eggs and charcoal toast', '叉燒湯意粉，炒滑蛋，黑炭多士', 15.99, 'url_to_image', 'Y', 'Y');
COMMIT;

INSERT INTO Modification (ItemID, ModiTypeID) VALUES (1, 1);
INSERT INTO Modification (ItemID, ModiTypeID) VALUES (1, 2);
INSERT INTO Modification (ItemID, ModiTypeID) VALUES (2, 1);
COMMIT;

INSERT INTO AllergenNotice (ItemID, AllergenTypeId) VALUES (1, 1);
INSERT INTO AllergenNotice (ItemID, AllergenTypeId) VALUES (1, 2);
INSERT INTO AllergenNotice (ItemID, AllergenTypeId) VALUES (2, 1);
COMMIT;