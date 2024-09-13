-- Data Sample
INSERT INTO Categories (Category_Name_EN, Category_Name_ZH) VALUES ('Curry Hong Kong Style', '咖喱香港風味');
INSERT INTO Categories (Category_Name_EN, Category_Name_ZH) VALUES ('Hot ' || CHR(38) || ' Cold Drinks', '熱飲和冷飲');
INSERT INTO Categories (Category_Name_EN, Category_Name_ZH) VALUES ('Party Tray', '派對拼盤');
COMMIT;

INSERT INTO NoodleType (Noodle_Type_Name_EN, Noodle_Type_Name_ZH, Noodle_Type_Price) VALUES ('Vermicelli', '米粉', 0);
INSERT INTO NoodleType (Noodle_Type_Name_EN, Noodle_Type_Name_ZH, Noodle_Type_Price) VALUES ('Udon', '烏冬', 3.00);
INSERT INTO NoodleType (Noodle_Type_Name_EN, Noodle_Type_Name_ZH, Noodle_Type_Price) VALUES ('Instant Noodles', '即食麵', 2.00);
COMMIT;

INSERT INTO Drinks (Drink_Name_EN, Drink_Name_ZH, Price) VALUES ('Hot Lemon Tea', '熱檸檬茶', 0);
INSERT INTO Drinks (Drink_Name_EN, Drink_Name_ZH, Price) VALUES ('Iced Lemon Tea', '冰檸檬茶', 0);
INSERT INTO Drinks (Drink_Name_EN, Drink_Name_ZH, Price) VALUES ('Passion Fruit Lemon Honey', '百香果蜂蜜檸檬', 2.5);
INSERT INTO Drinks (Drink_Name_EN, Drink_Name_ZH, Price) VALUES ('Tofu Jelly Coffee', '豆腐花凍咖啡', 1.0);
INSERT INTO Drinks (Drink_Name_EN, Drink_Name_ZH, Price) VALUES ('Cappuccino', '卡布奇諾', 2.0);
COMMIT;

INSERT INTO AllergenType (Notice_Text_EN, Notice_Text_ZH) VALUES ('Contains nuts and dairy', '含有堅果和乳製品');
INSERT INTO AllergenType (Notice_Text_EN, Notice_Text_ZH) VALUES ('Contains gluten', '含有麩質');
COMMIT;

INSERT INTO ModificationType (Modi_Type_Name_EN, Modi_Type_Name_ZH) VALUES ('Extra Spicy', '額外辣');
INSERT INTO ModificationType (Modi_Type_Name_EN, Modi_Type_Name_ZH) VALUES ('No Onions', '不要洋蔥');
COMMIT;

INSERT INTO Items (Category_ID, Item_Name_EN, Item_Name_ZH, Price, Image_URL, Is_Included_Drink, Is_Noodle) VALUES (1, 'Curry Beef Brisket', '咖喱牛腩', 18.99, 'url_to_image', 1, 0);
INSERT INTO Items (Category_ID, Item_Name_EN, Item_Name_ZH, Price, Image_URL, Is_Included_Drink, Is_Noodle) VALUES (2, 'Passion Fruit Lemon Honey', '百香果蜂蜜檸檬', 7.99, 'url_to_image', 0, 0);
INSERT INTO Items (Category_ID, Item_Name_EN, Item_Name_ZH, Price, Image_URL, Is_Included_Drink, Is_Noodle) VALUES (3, 'Party Tray - Curry Beef Brisket', '派對拼盤 - 咖喱牛腩', 98.00, 'url_to_image', 0, 0);
INSERT INTO Items (Category_ID, Item_Name_EN, Item_Name_ZH, Price, Image_URL, Is_Included_Drink, Is_Noodle) VALUES (1, 'BBQ pork spaghetti in soup with scrambled eggs and charcoal toast', '叉燒湯意粉，炒滑蛋，黑炭多士', 15.99, 'url_to_image', 1, 1);
COMMIT;

INSERT INTO Modification (Item_ID, Modi_Type_ID) VALUES (1, 1);
INSERT INTO Modification (Item_ID, Modi_Type_ID) VALUES (1, 2);
INSERT INTO Modification (Item_ID, Modi_Type_ID) VALUES (2, 1);
COMMIT;

INSERT INTO AllergenNotice (Item_ID, Allergen_Type_Id) VALUES (1, 1);
INSERT INTO AllergenNotice (Item_ID, Allergen_Type_Id) VALUES (1, 2);
INSERT INTO AllergenNotice (Item_ID, Allergen_Type_Id) VALUES (2, 1);
COMMIT;