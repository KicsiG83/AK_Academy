
  CREATE TABLE "PINCODEADMINUSER"."CLIENT" 
   (	"CLIENT_ID" NUMBER(*,0) NOT NULL ENABLE, 
	"CLIENT_NAME" VARCHAR2(20 BYTE) NOT NULL ENABLE, 
	"CLIENT_EMAIL" VARCHAR2(20 BYTE) NOT NULL ENABLE, 
	"PHONE_NUMBER" VARCHAR2(20 BYTE) NOT NULL ENABLE, 
	"CLIENT_TYPE" VARCHAR2(20 BYTE) NOT NULL ENABLE, 
	"CLIENT_COMMENT" VARCHAR2(100 BYTE), 
	 CONSTRAINT "CLIENT_ID_PK" PRIMARY KEY ("CLIENT_ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;

   COMMENT ON COLUMN "PINCODEADMINUSER"."CLIENT"."CLIENT_ID" IS 'CUSTOMER_ID - ÜGYFÉL EGYEDI AZONOSÍTÓ';
   COMMENT ON COLUMN "PINCODEADMINUSER"."CLIENT"."CLIENT_NAME" IS 'ÜGYFÉL NÉV';
   COMMENT ON COLUMN "PINCODEADMINUSER"."CLIENT"."CLIENT_EMAIL" IS 'ÜGYFÉL E-MAIL CÍME';
   COMMENT ON COLUMN "PINCODEADMINUSER"."CLIENT"."PHONE_NUMBER" IS 'ÜGYFÉL TELEFONSZÁMA';
   COMMENT ON COLUMN "PINCODEADMINUSER"."CLIENT"."CLIENT_TYPE" IS 'ÜGYFÉL TÍPUS (ELADÓ/KERESŐ)';
   COMMENT ON COLUMN "PINCODEADMINUSER"."CLIENT"."CLIENT_COMMENT" IS 'ÜGYFÉL KOMENT';