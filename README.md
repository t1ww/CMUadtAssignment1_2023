# cmut4adt
    data structure subject in cmu assignment tutorial 4
# how to use the program 
first you need to find your directory in cmd promt or vscode's terminal
it has to be folder before your project folder
ex. if we want to execute   C:\Users\PowerNet\Documents\GitHub\cmut4adt\assignm\assignment1.java
                        and C:\Users\PowerNet\Documents\GitHub\cmut4adt\assignm\Student.java
we cd on PS C:\Users\PowerNet\Documents\GitHub\cmut4adt>
and then type javac .\assignm\assignment1.java .\assignm\Student.java   <<to complie the file before running>>
type java .\assignm\assignment1.java                                    <<to run>>
// when you want to run with sorting to the data, adds an argument to the file
//
# SORTING BY STUDENT'S ID
// java .\assignm\assignment1.java -n
    will run sorting by student's number
    example output
//
//////////////new run////////////////

Total Students = 33
[   1   | 652115001 |   KARANTHAPHONG |              AREERAK ]
[   2   | 652115002 |       KRITTAYOT |           KHUEANCHAN ]
[   3   | 652115003 |         KEERATI |            THUEANPAN ]
[   4   | 652115004 |       CHRISTINA |                 CHUA ]
[   5   | 652115005 |          CHAMOR |               LAHUNA ]
[   6   | 652115006 |        JAKKAPAN |              LONGLAI ]
[   7   | 652115007 |        JIRAPHAT |                LAMUN ]
[   8   | 652115008 |        CHATCHAI |          CHATKAMPANG ]
[   9   | 652115009 |     CHANANCHIDA |             WONGRACH ]
[  10   | 652115010 |      CHONTHICHA |              MAITHAM ]
[  11   | 652115011 |     CHAWANAKORN |             SANANNAM ]
[  12   | 652115012 |      CHANYANUCH |             PANYADEE ] 
[  13   | 652115013 |      NARONGCHAI |            RONGTHONG ]
[  14   | 652115014 |        NATTAPAT |               PUDHOM ]
[  15   | 652115015 |       NADTHAWAT |   DACHAPHOBPHOKKANIT ]
[  16   | 652115016 |       NICHAKORN |             PROMPONG ]
[  17   | 652115017 |        NICHAPAT |               PADUNG ]
[  18   | 652115018 |       TANABADEE |             KRAITONG ]
[  19   | 652115019 |       THANAPHAT |             SANNGOEN ]
[  20   | 652115020 |       TATCHAPOL |           WANGSUNTON ]
[  21   | 652115021 |      THANYASIRI |              CHAINOI ]
[  22   | 652115022 |         TANRADA |     WICHIANWANNAKOOL ]
[  23   | 652115023 |        THITIWUT |             THITNUEA ]
[  24   | 652115025 |        NONLANEE |        PANJATEERAWIT ]
[  25   | 652115026 |     POORIMPRATH |              SOMKHAM ]
[  26   | 652115027 |      PHORNSAWAN |           SRIJANPANG ]
[  27   | 652115028 |         PANIPUK |            YOTTHAMEE ]
[  28   | 652115029 |    PHITCHAYAPHA |               BUAPHA ]
[  29   | 652115030 |         PHIRIYA |           PROMKAEWMA ]
[  30   | 652115507 |                         HKUN LATT AUNG ] no last name
[  31   | 652115508 |          HONGYU |                   FU ]
[  32   | 652115510 |                       NAW JOYFUL AWGYI ] no last name
[  33   | 652115511 |                         KHANT ZAW HEIN ] no last name

After sorting by : student number (sid)
[   1   | 652115001 |   KARANTHAPHONG |              AREERAK ]
[   2   | 652115002 |       KRITTAYOT |           KHUEANCHAN ]
[   3   | 652115003 |         KEERATI |            THUEANPAN ]
[   4   | 652115004 |       CHRISTINA |                 CHUA ]
[   5   | 652115005 |          CHAMOR |               LAHUNA ]
[   6   | 652115006 |        JAKKAPAN |              LONGLAI ]
[   7   | 652115007 |        JIRAPHAT |                LAMUN ]
[   8   | 652115008 |        CHATCHAI |          CHATKAMPANG ]
[   9   | 652115009 |     CHANANCHIDA |             WONGRACH ]
[  10   | 652115010 |      CHONTHICHA |              MAITHAM ]
[  11   | 652115011 |     CHAWANAKORN |             SANANNAM ]
[  12   | 652115012 |      CHANYANUCH |             PANYADEE ]
[  13   | 652115013 |      NARONGCHAI |            RONGTHONG ]
[  14   | 652115014 |        NATTAPAT |               PUDHOM ]
[  15   | 652115015 |       NADTHAWAT |   DACHAPHOBPHOKKANIT ]
[  16   | 652115016 |       NICHAKORN |             PROMPONG ]
[  17   | 652115017 |        NICHAPAT |               PADUNG ]
[  18   | 652115018 |       TANABADEE |             KRAITONG ]
[  19   | 652115019 |       THANAPHAT |             SANNGOEN ]
[  20   | 652115020 |       TATCHAPOL |           WANGSUNTON ]
[  21   | 652115021 |      THANYASIRI |              CHAINOI ]
[  22   | 652115022 |         TANRADA |     WICHIANWANNAKOOL ]
[  23   | 652115023 |        THITIWUT |             THITNUEA ]
[  24   | 652115025 |        NONLANEE |        PANJATEERAWIT ]
[  25   | 652115026 |     POORIMPRATH |              SOMKHAM ]
[  26   | 652115027 |      PHORNSAWAN |           SRIJANPANG ]
[  27   | 652115028 |         PANIPUK |            YOTTHAMEE ] 
[  28   | 652115029 |    PHITCHAYAPHA |               BUAPHA ]
[  29   | 652115030 |         PHIRIYA |           PROMKAEWMA ]
[  30   | 652115507 |                         HKUN LATT AUNG ] no last name
[  31   | 652115508 |          HONGYU |                   FU ]
[  32   | 652115510 |                       NAW JOYFUL AWGYI ] no last name
[  33   | 652115511 |                         KHANT ZAW HEIN ] no last name

//////////////////////////////
/////////End of THE PROGRAM
//////////////////////////////
//
# SORTING BY FIRST NAME
// java .\assignm\assignment1.java -f
    will run sorting by student's first name
    example output
//
//////////////new run////////////////

Total Students = 33
[   1   | 652115001 |   KARANTHAPHONG |              AREERAK ] 
[   2   | 652115002 |       KRITTAYOT |           KHUEANCHAN ]
[   3   | 652115003 |         KEERATI |            THUEANPAN ]
[   4   | 652115004 |       CHRISTINA |                 CHUA ]
[   5   | 652115005 |          CHAMOR |               LAHUNA ]
[   6   | 652115006 |        JAKKAPAN |              LONGLAI ]
[   7   | 652115007 |        JIRAPHAT |                LAMUN ]
[   8   | 652115008 |        CHATCHAI |          CHATKAMPANG ]
[   9   | 652115009 |     CHANANCHIDA |             WONGRACH ]
[  10   | 652115010 |      CHONTHICHA |              MAITHAM ]
[  11   | 652115011 |     CHAWANAKORN |             SANANNAM ]
[  12   | 652115012 |      CHANYANUCH |             PANYADEE ]
[  13   | 652115013 |      NARONGCHAI |            RONGTHONG ]
[  14   | 652115014 |        NATTAPAT |               PUDHOM ]
[  15   | 652115015 |       NADTHAWAT |   DACHAPHOBPHOKKANIT ]
[  16   | 652115016 |       NICHAKORN |             PROMPONG ]
[  17   | 652115017 |        NICHAPAT |               PADUNG ]
[  18   | 652115018 |       TANABADEE |             KRAITONG ]
[  19   | 652115019 |       THANAPHAT |             SANNGOEN ]
[  20   | 652115020 |       TATCHAPOL |           WANGSUNTON ]
[  21   | 652115021 |      THANYASIRI |              CHAINOI ]
[  22   | 652115022 |         TANRADA |     WICHIANWANNAKOOL ]
[  23   | 652115023 |        THITIWUT |             THITNUEA ]
[  24   | 652115025 |        NONLANEE |        PANJATEERAWIT ]
[  25   | 652115026 |     POORIMPRATH |              SOMKHAM ]
[  26   | 652115027 |      PHORNSAWAN |           SRIJANPANG ]
[  27   | 652115028 |         PANIPUK |            YOTTHAMEE ]
[  28   | 652115029 |    PHITCHAYAPHA |               BUAPHA ]
[  29   | 652115030 |         PHIRIYA |           PROMKAEWMA ]
[  30   | 652115507 |                         HKUN LATT AUNG ] no last name
[  31   | 652115508 |          HONGYU |                   FU ]
[  32   | 652115510 |                       NAW JOYFUL AWGYI ] no last name
[  33   | 652115511 |                         KHANT ZAW HEIN ] no last name

After sorting by : First name
[   5   | 652115005 |          CHAMOR |               LAHUNA ]
[   9   | 652115009 |     CHANANCHIDA |             WONGRACH ]
[  12   | 652115012 |      CHANYANUCH |             PANYADEE ]
[   8   | 652115008 |        CHATCHAI |          CHATKAMPANG ]
[  11   | 652115011 |     CHAWANAKORN |             SANANNAM ]
[  10   | 652115010 |      CHONTHICHA |              MAITHAM ]
[   4   | 652115004 |       CHRISTINA |                 CHUA ]
[  30   | 652115507 |                         HKUN LATT AUNG ] no last name
[  31   | 652115508 |          HONGYU |                   FU ]
[   6   | 652115006 |        JAKKAPAN |              LONGLAI ]
[   7   | 652115007 |        JIRAPHAT |                LAMUN ]
[   1   | 652115001 |   KARANTHAPHONG |              AREERAK ] 
[   3   | 652115003 |         KEERATI |            THUEANPAN ]
[  33   | 652115511 |                         KHANT ZAW HEIN ] no last name
[   2   | 652115002 |       KRITTAYOT |           KHUEANCHAN ]
[  15   | 652115015 |       NADTHAWAT |   DACHAPHOBPHOKKANIT ]
[  13   | 652115013 |      NARONGCHAI |            RONGTHONG ]
[  14   | 652115014 |        NATTAPAT |               PUDHOM ]
[  32   | 652115510 |                       NAW JOYFUL AWGYI ] no last name
[  16   | 652115016 |       NICHAKORN |             PROMPONG ]
[  17   | 652115017 |        NICHAPAT |               PADUNG ]
[  24   | 652115025 |        NONLANEE |        PANJATEERAWIT ]
[  27   | 652115028 |         PANIPUK |            YOTTHAMEE ]
[  29   | 652115030 |         PHIRIYA |           PROMKAEWMA ]
[  28   | 652115029 |    PHITCHAYAPHA |               BUAPHA ]
[  26   | 652115027 |      PHORNSAWAN |           SRIJANPANG ]
[  25   | 652115026 |     POORIMPRATH |              SOMKHAM ]
[  18   | 652115018 |       TANABADEE |             KRAITONG ]
[  22   | 652115022 |         TANRADA |     WICHIANWANNAKOOL ]
[  20   | 652115020 |       TATCHAPOL |           WANGSUNTON ]
[  19   | 652115019 |       THANAPHAT |             SANNGOEN ]
[  21   | 652115021 |      THANYASIRI |              CHAINOI ]
[  23   | 652115023 |        THITIWUT |             THITNUEA ]

//////////////////////////////
/////////End of THE PROGRAM
//////////////////////////////
//
# SORTING BY LAST NAME
// java .\assignm\assignment1.java -l (lowercase L)
    will run sorting by student's last name (for students with middle name will be shown on top instead)
    example output
//
//////////////new run////////////////

Total Students = 33
[   1   | 652115001 |   KARANTHAPHONG |              AREERAK ]
[   2   | 652115002 |       KRITTAYOT |           KHUEANCHAN ]
[   3   | 652115003 |         KEERATI |            THUEANPAN ]
[   4   | 652115004 |       CHRISTINA |                 CHUA ]
[   5   | 652115005 |          CHAMOR |               LAHUNA ]
[   6   | 652115006 |        JAKKAPAN |              LONGLAI ]
[   7   | 652115007 |        JIRAPHAT |                LAMUN ]
[   8   | 652115008 |        CHATCHAI |          CHATKAMPANG ]
[   9   | 652115009 |     CHANANCHIDA |             WONGRACH ]
[  10   | 652115010 |      CHONTHICHA |              MAITHAM ]
[  11   | 652115011 |     CHAWANAKORN |             SANANNAM ]
[  12   | 652115012 |      CHANYANUCH |             PANYADEE ]
[  13   | 652115013 |      NARONGCHAI |            RONGTHONG ]
[  14   | 652115014 |        NATTAPAT |               PUDHOM ]
[  15   | 652115015 |       NADTHAWAT |   DACHAPHOBPHOKKANIT ]
[  16   | 652115016 |       NICHAKORN |             PROMPONG ]
[  17   | 652115017 |        NICHAPAT |               PADUNG ]
[  18   | 652115018 |       TANABADEE |             KRAITONG ]
[  19   | 652115019 |       THANAPHAT |             SANNGOEN ]
[  20   | 652115020 |       TATCHAPOL |           WANGSUNTON ]
[  21   | 652115021 |      THANYASIRI |              CHAINOI ]
[  22   | 652115022 |         TANRADA |     WICHIANWANNAKOOL ]
[  23   | 652115023 |        THITIWUT |             THITNUEA ]
[  24   | 652115025 |        NONLANEE |        PANJATEERAWIT ]
[  25   | 652115026 |     POORIMPRATH |              SOMKHAM ]
[  26   | 652115027 |      PHORNSAWAN |           SRIJANPANG ]
[  27   | 652115028 |         PANIPUK |            YOTTHAMEE ]
[  28   | 652115029 |    PHITCHAYAPHA |               BUAPHA ]
[  29   | 652115030 |         PHIRIYA |           PROMKAEWMA ]
[  30   | 652115507 |                         HKUN LATT AUNG ] no last name
[  31   | 652115508 |          HONGYU |                   FU ]
[  32   | 652115510 |                       NAW JOYFUL AWGYI ] no last name
[  33   | 652115511 |                         KHANT ZAW HEIN ] no last name

After sorting by : last name
[  33   | 652115511 |                         KHANT ZAW HEIN ] no last name
[  32   | 652115510 |                       NAW JOYFUL AWGYI ] no last name
[  30   | 652115507 |                         HKUN LATT AUNG ] no last name
[   1   | 652115001 |   KARANTHAPHONG |              AREERAK ]
[  28   | 652115029 |    PHITCHAYAPHA |               BUAPHA ]
[  21   | 652115021 |      THANYASIRI |              CHAINOI ]
[   8   | 652115008 |        CHATCHAI |          CHATKAMPANG ]
[   4   | 652115004 |       CHRISTINA |                 CHUA ]
[  15   | 652115015 |       NADTHAWAT |   DACHAPHOBPHOKKANIT ]
[  31   | 652115508 |          HONGYU |                   FU ]
[   2   | 652115002 |       KRITTAYOT |           KHUEANCHAN ]
[  18   | 652115018 |       TANABADEE |             KRAITONG ]
[   5   | 652115005 |          CHAMOR |               LAHUNA ]
[   7   | 652115007 |        JIRAPHAT |                LAMUN ]
[   6   | 652115006 |        JAKKAPAN |              LONGLAI ]
[  10   | 652115010 |      CHONTHICHA |              MAITHAM ]
[  17   | 652115017 |        NICHAPAT |               PADUNG ]
[  24   | 652115025 |        NONLANEE |        PANJATEERAWIT ]
[  12   | 652115012 |      CHANYANUCH |             PANYADEE ]
[  29   | 652115030 |         PHIRIYA |           PROMKAEWMA ]
[  16   | 652115016 |       NICHAKORN |             PROMPONG ]
[  14   | 652115014 |        NATTAPAT |               PUDHOM ]
[  13   | 652115013 |      NARONGCHAI |            RONGTHONG ]
[  11   | 652115011 |     CHAWANAKORN |             SANANNAM ]
[  19   | 652115019 |       THANAPHAT |             SANNGOEN ]
[  25   | 652115026 |     POORIMPRATH |              SOMKHAM ]
[  26   | 652115027 |      PHORNSAWAN |           SRIJANPANG ]
[  23   | 652115023 |        THITIWUT |             THITNUEA ]
[   3   | 652115003 |         KEERATI |            THUEANPAN ]
[  20   | 652115020 |       TATCHAPOL |           WANGSUNTON ]
[  22   | 652115022 |         TANRADA |     WICHIANWANNAKOOL ]
[   9   | 652115009 |     CHANANCHIDA |             WONGRACH ]
[  27   | 652115028 |         PANIPUK |            YOTTHAMEE ]

//////////////////////////////
/////////End of THE PROGRAM
//////////////////////////////
//

# end of the readme
