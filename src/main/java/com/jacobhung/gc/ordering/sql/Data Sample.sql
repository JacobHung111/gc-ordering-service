--Data Sample
INSERT INTO Categories (CategoryName_EN, CategoryName_ZH) VALUES
('Curry Hong Kong Style', '咖喱香港風味'),
('Hot & Cold Drinks', '熱飲和冷飲'),
('Party Tray', '派對拼盤');

INSERT INTO NoodleTypes (NoodleTypeName_EN, NoodleTypeName_ZH, NoodleTypePrice) VALUES
('Vermicelli', '米粉', 0),
('Udon', '烏冬', 3.00),
('Instant Noodles', '即食麵', 2.00);

INSERT INTO Drinks (DrinkName_EN, DrinkName_ZH, Price) VALUES
('Hot Lemon Tea', '熱檸檬茶', 0),
('Iced Lemon Tea', '冰檸檬茶', 0),
('Passion Fruit Lemon Honey', '百香果蜂蜜檸檬', 2.5),
('Tofu Jelly Coffee', '豆腐花凍咖啡', 1.0),
('Cappuccino', '卡布奇諾', 2.0);

INSERT INTO AllergenType (NoticeText_EN, NoticeText_ZH) VALUES
('Contains nuts and dairy', '含有堅果和乳製品'),
('Contains gluten', '含有麩質');

INSERT INTO ModificationType (ModiTypeName_EN, ModiTypeName_ZH) VALUES
('Extra Spicy', '額外辣'),
('No Onions', '不要洋蔥');

INSERT INTO Items (CategoryID, ItemName_EN, ItemName_ZH, Description_EN, Description_ZH, Price, ImageURL, IsIncludedDrink, IsNoodle) VALUES
( 1,'Curry Beef Brisket', '咖喱牛腩', 'Curry beef brisket with rice', '咖喱牛腩飯', 18.99, 'url_to_image', 'Y', 'N', 2),
( 2,'Passion Fruit Lemon Honey', '百香果蜂蜜檸檬', 'Refreshing drink with passion fruit, lemon, and honey', '百香果蜂蜜檸檬飲料', 7.99, 'url_to_image', 'N', 'N'),
( 3,'Party Tray - Curry Beef Brisket', '派對拼盤 - 咖喱牛腩', 'Party tray with curry beef brisket', '派對拼盤包含咖喱牛腩', 98.00, 'url_to_image', 'N', 'N');


INSERT INTO Modification (ItemID, ModiTypeID) VALUES
(1, 1),
(1, 2),
(2, 1);

INSERT INTO AllergenNotice (ItemID, AllergenTypeId) VALUES
(1, 1),
(1, 2),
(2, 1);