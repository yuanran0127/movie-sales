/*
SQLyog Ultimate v12.09 (64 bit)
MySQL - 8.0.22 : Database - moviesale
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`moviesale` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;

USE `moviesale`;

/*Table structure for table `admin` */

DROP TABLE IF EXISTS `admin`;

CREATE TABLE `admin` (
  `adm_id` int NOT NULL AUTO_INCREMENT COMMENT '管理员id',
  `adm_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '管理员用户名',
  `adm_password` int DEFAULT NULL COMMENT '管理员密码',
  PRIMARY KEY (`adm_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `admin` */

insert  into `admin`(`adm_id`,`adm_name`,`adm_password`) values (1,'admin',123456);

/*Table structure for table `movie` */

DROP TABLE IF EXISTS `movie`;

CREATE TABLE `movie` (
  `m_id` int NOT NULL AUTO_INCREMENT COMMENT '电影id',
  `m_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '电影名称',
  `m_description` varchar(400) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '电影描述',
  `m_duration` varchar(20) DEFAULT NULL COMMENT '电影上映时间',
  `m_release_time` int DEFAULT NULL COMMENT '电影持续时间',
  `m_type` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '电影类型',
  `m_area` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '电影地区',
  `m_photo` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '电影图片',
  `m_price` int NOT NULL COMMENT '电影价格',
  PRIMARY KEY (`m_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=1100118 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `movie` */

insert  into `movie`(`m_id`,`m_name`,`m_description`,`m_duration`,`m_release_time`,`m_type`,`m_area`,`m_photo`,`m_price`) values (1100101,'感动她77次','都市爱情电影《感动她77次》为《原谅他77次》续集。恢复单身的Eva（蔡卓妍 饰）与泰国红星Marvel（马里奥 饰）偶遇并互有好感，而Adam （周柏豪 饰）仍希望通过努力换来Eva的第78次原谅。为完成身患绝症的母亲（惠英红 饰）心愿，Eva考虑走进婚姻。Adam能否趁机挽回真爱呢？','',93,'爱情','中国香港','20210616100608速度与激情.jpg',35),(1100102,'猪猪侠大电影·恐龙日记','以阿五寻找猪猪侠为开端，讲述了见习超星特工阿五前往恐龙世界，结识了性格各异的伙伴们，在旅途中大家遭遇恶劣环境、恐龙袭击等种种危机，最后能够勇敢直面自己的弱点，相信伙伴的力量，从中得到了成长。','2020-05-01',83,'动画','中国大陆','猪猪侠大电影.jpg',32),(1100103,'悬崖之上','上世纪三十年代，四位曾在苏联接受特训的共产党特工组成任务小队，回国执行代号为“乌特拉”的秘密行动。由于叛徒的出卖，他们从跳伞降落的第一刻起， 就已置身于敌人布下的罗网之中。同志能否脱身，任务能否完成，雪一直下，立于“悬崖之上”的行动小组面临严峻考验。','2021-04-30',120,'悬疑/动作','中国大陆','悬崖之上.jpg',38),(1100104,'当男人恋爱时','当男人恋爱时会是什么样子？ 以讨债为生的小混混阿成（邱泽 饰）看似凶狠却本性善良，遇到了欠债人的女儿浩婷（许玮甯 饰）后，对浩婷一见钟情的阿成开始变得温柔又幼稚，笨拙地为浩婷打点一切。就在浩婷终于卸下防备接受追求的时候，他们之间却遭遇了接二连三的变故，阿成默默承受着一切。 阿成最终也没有忘记告诉浩婷那句藏在心底的表白：第一次见到你，我就喜欢你了。','2021-06-11',114,'爱情/剧情','中国台湾','当男人恋爱时.jpg',40),(1100105,'超越','百米冠军吴添翼为解开无法战胜老飞人郝超越的心结而返乡，不料郝超越早已沉沦，逃避最爱的跑步事业，更处心积虑利用吴添翼谋利。师兄弟二人的较量从回忆中的跑道延伸进现实生活，历经误会和冲突，最终冰释前嫌并互相治愈······','2021-06-12',98,'喜剧/剧情','中国大陆','超越.jpg',35),(1100106,'潜艇总动员：地心游记','科研潜艇“逗号”，是科幻小说《地心游记》的铁杆粉丝。为研究海底神秘物质, 跟着叔叔地质学家 “铁石号”深潜马里亚纳海沟，意外被卷入洞穴迷宫来到巨大未知世界并发现远古生物，开启了超乎想象的海底地心探险。','2021-06-12',85,'动画/喜剧','中国大陆','潜艇总动员：地心游记.jpg',38),(1100107,'了不起的老爸','一个患有先天疾病却怀有“马拉松梦”的少年肖尔东（张宥浩 饰），一个固执逼迫儿子预习“盲人生活”的出租车司机父亲肖大明（王砚辉 饰），互不理解的父子俩，却在一场马拉松比赛中“互换身份”，并肩站在了起跑线上……影片通过对“命运”持有不同态度的一对单亲家庭父子，讲述了一个用爱向阳而生的故事。','2021-06-18',104,'喜剧/剧情','中国大陆','了不起的老爸.jpg',36),(1100108,'你好世界','在京都居住的内向男高中生直实（北村匠海 配音）的面前，突然出现从10年后穿越而来26岁的自己（松坂桃李 配音）。未来的直实告诉他，自己不久便会与琉璃（滨边美波 配音）相爱，可是之后烟花大会时她却会因为一场事故意外离世。为了拯救爱人，16岁的直实卷入了这场现实与虚拟的记忆世界，经历了一系列超乎想象的事情。即使世界毁灭，我也想再见你一面。','2021-06-11',98,'爱情/动画','日本','你好世界.jpg',42),(1100109,'我要我们在一起','你有没有爱过一个人，曾经拼了命，只为和TA在一起。十年前，差生吕钦扬当众告白凌一尧，两人从校园步入社会，为了让她幸福，他不惜以命相搏。然而金钱、房子、婚姻等现实的考验，却将两人越推越远。十年长跑，他们能否还记得曾经刻在心底的约定：我要我们在一起。电影改编自长帖《与我十年长跑的女友明天要嫁人了》。','2021-05-20',105,'爱情/剧情','中国大陆','我要我们在一起.jpg',32),(1100110,'长安伏妖','长安六骑司前首领延东的墓遭遇盗墓贼，镇压妖王的玄牝珠被盗，导致长安城妖孽四起，民不聊生。大内总管鱼公公（罗家英 饰）命六骑司的马三（吴孟达 饰）、王诸葛（贾冰 饰）、雷燕（徐冬冬 饰）等人镇压群妖和追寻玄牝珠，并策划着一场惊天的阴谋。盗墓贼逃到一家客栈躲避，结果玄牝珠被厨师李长安（保剑锋饰）误食。为了心爱的恋人公孙玉（克拉拉饰）以及解救长安百姓，李长安通过重重考验进入六骑司，最后置之死地而后生，发动玄牝珠的神奇力量伏妖除魔。','2021-01-08',113,'古装','中国大陆','长安伏妖.jpg',40),(1100111,'我不是药神','一位不速之客的意外到访，打破了神油店老板程勇（徐峥 饰）的平凡人生，他从一个交不起房租的男性保健品商贩，一跃成为印度仿制药“格列宁”的独家代理商。收获巨额利润的他，生活剧烈变化，被病患们冠以“药神”的称号。但是，一场关于救赎的拉锯战也在波涛暗涌中慢慢展开......','2018-07-05',117,'喜剧','中国大陆','我不是药神.jpg',38),(1100112,'哪吒之魔童降世','天地灵气孕育出一颗能量巨大的混元珠，元始天尊将混元珠提炼成灵珠和魔丸，灵珠投胎为人，助周伐纣时可堪大用；而魔丸则会诞出魔王，为祸人间。元始天尊启动了天劫咒语，3年后天雷将会降临，摧毁魔丸。太乙受命将灵珠托生于陈塘关李靖家的儿子哪吒身上。然而阴差阳错，灵珠和魔丸竟然被掉包。本应是灵珠英雄的哪吒却成了混世大魔王。调皮捣蛋顽劣不堪的哪吒却徒有一颗做英雄的心。然而面对众人对魔丸的误解和即将来临的天雷的降临，哪吒是否命中注定会立地成魔？他将何去何从？','2019-07-26',110,'动画/科幻','中国大陆','哪吒之魔童降世.jpg',34),(1100113,'西虹市首富','故事发生在《夏洛特烦恼》中的“特烦恼”之城“西虹市”。混迹于丙级业余足球队的守门员王多鱼（沈腾 饰），因比赛失利被开除离队。正处于人生最低谷的他接受了神秘台湾财团“一个月花光十亿资金”的挑战。本以为快乐生活就此开始，王多鱼却第一次感到“花钱特烦恼”！想要人生反转走上巅峰，真的没有那么简单。','2018-07-27',118,'喜剧','中国大陆','西虹市首富.jpg',32),(1100114,'赤狐书生','清贫书生王子进（陈立农 饰）进京赶考，被来到人界取丹的狐妖白十三（李现 饰）盯上。为了骗取书生信任，狐妖联合各路妖鬼，设下重重陷阱。一场奇幻旅程等待着他们……','2020-12-04',125,'古装/科幻','中国大陆','赤狐书生.jpg',28),(1100115,'扫毒2天地对决','毒品市场维持四分天下的格局已久，但自从地藏（古天乐 饰）与墨西哥大毒枭跨境合作扩展势力，再加上一连串黑吃黑的动作，毒界变得风声鹤唳。另一方面，因儿时亲眼目睹父亲被毒品所毁而嫉毒如仇的慈善家兼金融巨子余顺天（刘德华 饰），正悬赏一亿歼灭香港最大毒贩，此举在社会上引起轩然大波。警员林正风（苗侨伟 饰）本致力搜证拘捕地藏，毒贩却因巨额悬赏导致人身安全受威胁，他在执行保护毒贩的任务时深感无奈，但又被余顺天的出价所诱惑，陷入黑白正邪的心理挣扎。原来，余顺天和地藏有不可告人的同门关系，一场天地对决一触即发。','2019-07-05',100,'动作/悬疑','中国大陆','扫毒2天地对决.jpg',33);

/*Table structure for table `movieorder` */

DROP TABLE IF EXISTS `movieorder`;

CREATE TABLE `movieorder` (
  `oid` int NOT NULL AUTO_INCREMENT COMMENT '订单编号',
  `m_id` int NOT NULL COMMENT '购买的电影id',
  `u_id` int NOT NULL COMMENT '购买电影的用户id',
  `odate` varchar(20) DEFAULT NULL COMMENT '订单创建日期',
  `onum` int DEFAULT NULL COMMENT '购买数量',
  PRIMARY KEY (`oid`)
) ENGINE=InnoDB AUTO_INCREMENT=2106110008 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `movieorder` */

insert  into `movieorder`(`oid`,`m_id`,`u_id`,`odate`,`onum`) values (2106100001,1100102,2,'2021-06-10 10:21:18',2),(2106100002,1100103,2,'2021-06-10 20:34:14',2),(2106110002,1100101,3,'2021-06-11 17:25:23',3),(2106110004,1100105,2,'2021-06-16 01:33:48',12),(2106110005,1100105,2,'2021-06-16 10:10:54',12),(2106110006,1100104,2,'2021-06-16 10:11:06',3),(2106110007,1100104,2,'2021-06-16 10:52:25',2);

/*Table structure for table `mt` */

DROP TABLE IF EXISTS `mt`;

CREATE TABLE `mt` (
  `m_name` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '电影名称',
  `t_name` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '类型名称',
  PRIMARY KEY (`m_name`,`t_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `mt` */

/*Table structure for table `type` */

DROP TABLE IF EXISTS `type`;

CREATE TABLE `type` (
  `t_id` int NOT NULL AUTO_INCREMENT COMMENT '类型id',
  `t_name` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '类型名称',
  PRIMARY KEY (`t_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `type` */

insert  into `type`(`t_id`,`t_name`) values (1,'喜剧'),(2,'爱情'),(3,'古装'),(4,'动画'),(5,'现代'),(6,'悬疑'),(7,'科幻'),(8,'动作'),(9,'剧情');

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `u_id` int NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `u_name` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户名称',
  `u_sex` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '用户性别',
  `u_phone_num` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '用户手机号',
  `u_username` varchar(10) NOT NULL COMMENT '用户账号',
  `u_password` varchar(10) NOT NULL COMMENT '用户密码',
  PRIMARY KEY (`u_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `user` */

insert  into `user`(`u_id`,`u_name`,`u_sex`,`u_phone_num`,`u_username`,`u_password`) values (2,'阿鬼大大','男','13474527606','user','123456'),(3,'王朝旭','男','111','231','saa');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
