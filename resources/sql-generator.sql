CREATE TABLE `telephoneguide`.`tbl_user` ( `id` INT NOT NULL AUTO_INCREMENT , `ad` VARCHAR(256) NOT NULL , `soyad` VARCHAR(256) NOT NULL , `gsm` INT NOT NULL , PRIMARY KEY (`id`)) ENGINE = InnoDB;
INSERT INTO `tbl_user`(`ad`, `soyad`, `gsm`) VALUES ('username','surname',1234);
INSERT INTO `tbl_user`(`ad`, `soyad`, `gsm`) VALUES ('username1','surname1',1234);
INSERT INTO `tbl_user`(`ad`, `soyad`, `gsm`) VALUES ('username2','surname2',12345);
INSERT INTO `tbl_user`(`ad`, `soyad`, `gsm`) VALUES ('username3','surname3',12346);
INSERT INTO `tbl_user`(`ad`, `soyad`, `gsm`) VALUES ('username4','surname4',12347);