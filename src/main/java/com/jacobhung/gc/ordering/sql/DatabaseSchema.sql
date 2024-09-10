--GoodCatch Menu Database Schema Setup SQL
-- Categories Table
create table categories (
	categoryid      int primary key, -- Primary Key
	categoryname_en varchar2(255), -- Category name in English
	categoryname_zh varchar2(255) -- Category name in Chinese
);

-- Noodle Types Table
create table noodletypes (
	noodletypeid      int primary key, -- Primary Key
	noodletypename_en varchar2(255), -- Noodle type name in English
	noodletypename_zh varchar2(255), -- Noodle type name in Chinese
	noodletypeprice   decimal(10,2) -- Price of the noodle type
);

-- Drinks Table
create table drinks (
	drinkid      int primary key, -- Primary Key
	drinkname_en varchar2(255), -- Drink name in English
	drinkname_zh varchar2(255), -- Drink name in Chinese
	price        decimal(10,2) -- Price of the drink
);

-- Allergen Type Table
create table allergentype (
	allergentypeid int primary key, -- Primary Key
	noticetext_en  clob, -- Allergen notice in English
	noticetext_zh  clob -- Allergen notice in Chinese
);

-- Modification Type Table
create table modificationtype (
	moditypeid      int primary key, -- Primary Key
	moditypename_en varchar2(255), -- Modification type name in English
	moditypename_zh varchar2(255) -- Modification type name in Chinese
);

-- Items Table
create table items (
	itemid          int primary key, -- Primary Key
	categoryid      int, -- Foreign Key referencing Categories(CategoryID)
	itemname_en     varchar2(255), -- Item name in English
	itemname_zh     varchar2(255), -- Item name in Chinese
	description_en  clob, -- Description in English
	description_zh  clob, -- Description in Chinese
	price           decimal(10,2), -- Price of the item
	imageurl        varchar2(255), -- URL of the item’s image (optional)
	isincludeddrink char(1), -- Indicates if the item includes a drink
	isnoodle        char(1), -- Indicates if the item is a noodle dish
	foreign key ( categoryid )
		references categories ( categoryid )
);

-- Modification Table
create table modification (
	modificationid int primary key, -- Primary Key
	itemid         int, -- Foreign Key referencing Items(ItemID)
	moditypeid     int, -- Foreign Key referencing ModificationType(ModiTypeID)
	foreign key ( itemid )
		references items ( itemid ),
	foreign key ( moditypeid )
		references modificationtype ( moditypeid )
);

-- Allergen Notice Table
create table allergennotice (
	allergennoticeid int primary key, -- Primary Key
	itemid           int, -- Foreign Key referencing Items(ItemID)
	allergentypeid   int, -- Foreign Key referencing AllergenType(AllergenId)
	foreign key ( itemid )
		references items ( itemid ),
	foreign key ( allergentypeid )
		references allergentype ( allergentypeid )
);