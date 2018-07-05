
  CREATE TABLE "ADMIN"."SEARCH_PROPERTY" 
   (	"SEARCH_ID" NUMBER NOT NULL ENABLE, 
	"CLIENT_ID" NUMBER NOT NULL ENABLE, 
	"PROPERTY_TYPE" VARCHAR2(200 BYTE) NOT NULL ENABLE, 
	"SIZE_MIN" VARCHAR2(200 BYTE) NOT NULL ENABLE, 
	"SIZE_MAX" VARCHAR2(200 BYTE) NOT NULL ENABLE, 
	"PRICE_MIN" VARCHAR2(200 BYTE) NOT NULL ENABLE, 
	"PRICE_MAX" VARCHAR2(200 BYTE) NOT NULL ENABLE, 
	"SEARCH_TYPE" VARCHAR2(200 BYTE) NOT NULL ENABLE, 
	"CITY" VARCHAR2(200 BYTE) NOT NULL ENABLE, 
	"KEYWORD_ONE" VARCHAR2(200 CHAR) NOT NULL ENABLE, 
	"KEYWORD_TWO" VARCHAR2(200 CHAR) NOT NULL ENABLE, 
	"KEYWORD_THREE" VARCHAR2(200 CHAR) NOT NULL ENABLE, 
	 CONSTRAINT "SEARCH_PROPERTY_PK" PRIMARY KEY ("SEARCH_ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;

   COMMENT ON COLUMN "ADMIN"."SEARCH_PROPERTY"."SEARCH_ID" IS 'Keresés azonosító';
   COMMENT ON COLUMN "ADMIN"."SEARCH_PROPERTY"."CLIENT_ID" IS 'Ügyfél azonosító';
   COMMENT ON COLUMN "ADMIN"."SEARCH_PROPERTY"."PROPERTY_TYPE" IS 'Ingatlan típus';
   COMMENT ON COLUMN "ADMIN"."SEARCH_PROPERTY"."SIZE_MIN" IS 'Minimum alapterület ';
   COMMENT ON COLUMN "ADMIN"."SEARCH_PROPERTY"."SIZE_MAX" IS 'Maximum alapterület ';
   COMMENT ON COLUMN "ADMIN"."SEARCH_PROPERTY"."PRICE_MIN" IS 'Minimum ár';
   COMMENT ON COLUMN "ADMIN"."SEARCH_PROPERTY"."PRICE_MAX" IS 'Maximum alapterület ';
   COMMENT ON COLUMN "ADMIN"."SEARCH_PROPERTY"."SEARCH_TYPE" IS 'Eladó vagy kiadó';
   COMMENT ON COLUMN "ADMIN"."SEARCH_PROPERTY"."CITY" IS 'Város';
   COMMENT ON COLUMN "ADMIN"."SEARCH_PROPERTY"."KEYWORD_ONE" IS 'Kulcsszó 1';
   COMMENT ON COLUMN "ADMIN"."SEARCH_PROPERTY"."KEYWORD_TWO" IS 'Kulcsszó 2';
   COMMENT ON COLUMN "ADMIN"."SEARCH_PROPERTY"."KEYWORD_THREE" IS 'Kulcsszó 3';

   
CREATE SEQUENCE SEARCH_PROPERTY_SEQ START WITH 1 INCREMENT BY 1;