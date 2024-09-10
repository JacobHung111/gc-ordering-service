--Triggers
--Category
create sequence categoryid_seq start with 1 increment by 1;

create or replace trigger categoryid_trigger before
    insert on categories
    for each row
begin
    :new.categoryid := categoryid_seq.nextval;
end;

--NoodleType
create sequence noodletypeid_seq start with 1 increment by 1;

create or replace trigger noodletypeid_trigger before
    insert on noodletypes
    for each row
begin
    :new.noodletypeid := noodletypeid_seq.nextval;
end;

--Drink
create sequence drinkid_seq start with 1 increment by 1;

create or replace trigger drinkid_trigger before
    insert on drinks
    for each row
begin
    :new.drinkid := drinkid_seq.nextval;
end;

--AllergenType
create sequence allergentypeid_seq start with 1 increment by 1;

create or replace trigger allergentypeid_trigger before
    insert on allergentype
    for each row
begin
    :new.allergentypeid := allergentypeid_seq.nextval;
end;

--ModiType
create sequence moditypeid_seq start with 1 increment by 1;

create or replace trigger moditypeid_trigger before
    insert on modificationtype
    for each row
begin
    :new.moditypeid := moditypeid_seq.nextval;
end;

--Item
create sequence itemid_seq start with 1 increment by 1;

create or replace trigger itemid_trigger before
    insert on items
    for each row
begin
    :new.itemid := itemid_seq.nextval;
end;

--Modification
create sequence modificationid_seq start with 1 increment by 1;

create or replace trigger modificationid_trigger before
    insert on modification
    for each row
begin
    :new.modificationid := modificationid_seq.nextval;
end;

--Allergen Notice
create sequence allergennoticeid_seq start with 1 increment by 1;

create or replace trigger allergennoticeid_trigger before
    insert on allergennotice
    for each row
begin
    :new.allergennoticeid := allergennoticeid_seq.nextval;
end;