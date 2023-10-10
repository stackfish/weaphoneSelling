import java.util.InputMismatchException;
import java.util.Scanner;

public class data {
    public static void buy(Scanner sc, String[] weaponName, int[] recoveryWeaphone, int day, int[] price, String[] kind, int iValue, int[] sequence, int[] storage, int storageValue, int start, long[] money, int button, int buyButton, String adminId, String adminPassword, String[] accountInformation, int loginButton, int accountInformationButton, String idType, int userNumber, int[] capacityValueButton, int[] weaponInformation, int[] categoryRemove, int categoryButton, int[] num_of_days, int month, int year, String[] promotionName, int percentageDiscountButton, int discountPercent, int promotionYear1, int promotionMonth1, int promotionDay1, int promotionYear2, int promotionMonth2, int promotionDay2, int promotionValue1, int promotionValue2, int promotionValue3, int[] promoteInformation1, int[] timeCount, String[] partialName, int[] checkBox, int[] history, int[] damage, int[] speed, int[] weight, int[] weaponRemoval, int[] maximumInventory, int[] currentInventory, int[] promoteDate1, int[] promoteDate2, int[] promoteDate3, int[] promoteDate4, int[] promoteDate5, int[] promoteDate6, int[] promoteInformation2, int[] promoteInformation3, int[] discount, int[] indexStorage1, int[] indexStorage2, int[] indexStorage3, int[] thousandNumber, int MAX_Z, int[] recoveryStorage, int[] promoteDate7, int[] promoteDate8, int[] promoteDate9, int[] promoteInformation4, int[] promoteInformation5, int[] promoteInformation6, int[] promoteInformation7, int[] promoteInformation8, int[] promoteInformation9, int[] indexStorage4, int[] indexStorage5, int[] indexStorage6, int[] indexStorage7, int[] indexStorage8, int[] indexStorage9, int[] addPartialValue1, int[] addPartialValue2, int[] addPartialValue3, int[] addPartialValue4, int[] addPartialValue5, int[] addPartialValue6, int[] addPartialValue7, int[] addPartialValue8, int[] addPartialValue9, int tempYear, int tempMonth, int tempDay, int createButton, int[] discountMoney, int loginNumber
    ) {
        System.out.println("구매합니다. 이름과 재고를 차례대로 입력해주시고, 메뉴로 돌아가시길 원하신다면 1000을 입력해주세요");
        String str = sc.next();
        if (str.equals("1000")) {
            input2(sc, weaponName, recoveryWeaphone, day, price, kind, iValue, sequence, storage, storageValue, start, money, button, buyButton, adminId, adminPassword, accountInformation, loginButton, accountInformationButton, idType, userNumber, capacityValueButton, weaponInformation, categoryRemove, categoryButton, num_of_days, month, year, promotionName, percentageDiscountButton, discountPercent, promotionYear1, promotionMonth1, promotionDay1, promotionYear2, promotionMonth2, promotionDay2, promotionValue1, promotionValue2, promotionValue3, promoteInformation1, timeCount, partialName, checkBox, history, damage, speed, weight, weaponRemoval, maximumInventory, currentInventory, promoteDate1, promoteDate2, promoteDate3, promoteDate4, promoteDate5, promoteDate6, promoteInformation2, promoteInformation3, discount, indexStorage1, indexStorage2, indexStorage3, thousandNumber, MAX_Z, recoveryStorage, promoteDate7, promoteDate8, promoteDate9, promoteInformation4, promoteInformation5, promoteInformation6, promoteInformation7, promoteInformation8, promoteInformation9, indexStorage4, indexStorage5, indexStorage6, indexStorage7, indexStorage8, indexStorage9, addPartialValue1, addPartialValue2, addPartialValue3, addPartialValue4, addPartialValue5, addPartialValue6, addPartialValue7, addPartialValue8, addPartialValue9, tempYear, tempMonth, tempDay, createButton, discountMoney, loginNumber);
        }
        int Button2 = 0;
        for (int i = 99; i >= 0; i--) {
            for (int j = 99; j >= 0; j--) {
                if (str.equals(weaponName[i * 100 + j]) && weaponRemoval[i * 100 + j] == 0) {
                    Button2 = 1;
                    break;
                }
            }
            if (Button2 == 1) {
                break;
            }
        }
        if (Button2 == 0) {
            System.out.println("항목에 없습니다. 돌아갑니다.");
            buy(sc, weaponName, recoveryWeaphone, day, price, kind, iValue, sequence, storage, storageValue, start, money, button, buyButton, adminId, adminPassword, accountInformation, loginButton, accountInformationButton, idType, userNumber, capacityValueButton, weaponInformation, categoryRemove, categoryButton, num_of_days, month, year, promotionName, percentageDiscountButton, discountPercent, promotionYear1, promotionMonth1, promotionDay1, promotionYear2, promotionMonth2, promotionDay2, promotionValue1, promotionValue2, promotionValue3, promoteInformation1, timeCount, partialName, checkBox, history, damage, speed, weight, weaponRemoval, maximumInventory, currentInventory, promoteDate1, promoteDate2, promoteDate3, promoteDate4, promoteDate5, promoteDate6, promoteInformation2, promoteInformation3, discount, indexStorage1, indexStorage2, indexStorage3, thousandNumber, MAX_Z, recoveryStorage, promoteDate7, promoteDate8, promoteDate9, promoteInformation4, promoteInformation5, promoteInformation6, promoteInformation7, promoteInformation8, promoteInformation9, indexStorage4, indexStorage5, indexStorage6, indexStorage7, indexStorage8, indexStorage9, addPartialValue1, addPartialValue2, addPartialValue3, addPartialValue4, addPartialValue5, addPartialValue6, addPartialValue7, addPartialValue8, addPartialValue9, tempYear, tempMonth, tempDay, createButton, discountMoney, loginNumber);
        }
        int number = sc.nextInt();

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < sequence[i]; j++) {
                if (str.equals(weaponName[i * 100 + j]) && weaponRemoval[i * 100 + j] == 0) {
                    if (currentInventory[i * 100 + j] - number < 0) {
                        System.out.println("구매할 수 있는 수량을 초과했습니다. 다시 입력해주세요");
                        buy(sc, weaponName, recoveryWeaphone, day, price, kind, iValue, sequence, storage, storageValue, start, money, button, buyButton, adminId, adminPassword, accountInformation, loginButton, accountInformationButton, idType, userNumber, capacityValueButton, weaponInformation, categoryRemove, categoryButton, num_of_days, month, year, promotionName, percentageDiscountButton, discountPercent, promotionYear1, promotionMonth1, promotionDay1, promotionYear2, promotionMonth2, promotionDay2, promotionValue1, promotionValue2, promotionValue3, promoteInformation1, timeCount, partialName, checkBox, history, damage, speed, weight, weaponRemoval, maximumInventory, currentInventory, promoteDate1, promoteDate2, promoteDate3, promoteDate4, promoteDate5, promoteDate6, promoteInformation2, promoteInformation3, discount, indexStorage1, indexStorage2, indexStorage3, thousandNumber, MAX_Z, recoveryStorage, promoteDate7, promoteDate8, promoteDate9, promoteInformation4, promoteInformation5, promoteInformation6, promoteInformation7, promoteInformation8, promoteInformation9, indexStorage4, indexStorage5, indexStorage6, indexStorage7, indexStorage8, indexStorage9, addPartialValue1, addPartialValue2, addPartialValue3, addPartialValue4, addPartialValue5, addPartialValue6, addPartialValue7, addPartialValue8, addPartialValue9, tempYear, tempMonth, tempDay, createButton, discountMoney, loginNumber);
                    } else {
                        // 능력치 보강 해야지

                        System.out.println(idType + "의 능력치");
                        System.out.println("힘 : " + accountInformation[userNumber * 100 + 5] + " + " + damage[i * 100 + j] * number);
                        System.out.println("민첩성 : " + accountInformation[userNumber * 100 + 6] + " + " + speed[i * 100 + j] * number);
                        System.out.println("지구력 : " + accountInformation[userNumber * 100 + 7] + " + " + weight[i * 100 + j] * number);
                        System.out.println();
                        accountInformation[userNumber * 100 + 5] += damage[i * 100 + j] * number;
                        accountInformation[userNumber * 100 + 6] += speed[i * 100 + j] * number;
                        accountInformation[userNumber * 100 + 7] += weight[i * 100 + j] * number;

                        currentInventory[i * 100 + j] -= number;
                        recoveryWeaphone[i * 100 + j] += 3;
                        recoveryStorage[i * 100 + j] = number;
                        storage[storageValue * 100 + 0] = i;
                        storage[storageValue * 100 + 1] = j;
                        storage[storageValue * 100 + 2] = number;
                        storage[storageValue * 100 + 3] = 3;
                        System.out.println("무기종류 : " + kind[storage[storageValue * 100 + 0]] + " " + weaponName[storage[storageValue * 100 + 0] * 100 + storage[storageValue * 100 + 1]] + " " + storage[storageValue * 100 + 2] + "개 구매하였습니다. ");

                        money[day] += (long) price[storage[storageValue * 100 + 0] * 100 + storage[storageValue * 100 + 1]] * storage[storageValue * 100 + 2];
                        System.out.println("현재 금액 : " + money[day]);

                        System.out.println();
                        System.out.println("구매한 종류의 무기 리스트");
                        iValue = i;
                        addPartial(sc, weaponName, recoveryWeaphone, day, price, kind, iValue, sequence, storage, storageValue, start, money, button, buyButton, adminId, adminPassword, accountInformation, loginButton, accountInformationButton, idType, userNumber, capacityValueButton, weaponInformation, categoryRemove, categoryButton, num_of_days, month, year, promotionName, percentageDiscountButton, discountPercent, promotionYear1, promotionMonth1, promotionDay1, promotionYear2, promotionMonth2, promotionDay2, promotionValue1, promotionValue2, promotionValue3, promoteInformation1, timeCount, partialName, checkBox, history, damage, speed, weight, weaponRemoval, maximumInventory, currentInventory, promoteDate1, promoteDate2, promoteDate3, promoteDate4, promoteDate5, promoteDate6, promoteInformation2, promoteInformation3, discount, indexStorage1, indexStorage2, indexStorage3, thousandNumber, MAX_Z, recoveryStorage, promoteDate7, promoteDate8, promoteDate9, promoteInformation4, promoteInformation5, promoteInformation6, promoteInformation7, promoteInformation8, promoteInformation9, indexStorage4, indexStorage5, indexStorage6, indexStorage7, indexStorage8, indexStorage9, addPartialValue1, addPartialValue2, addPartialValue3, addPartialValue4, addPartialValue5, addPartialValue6, addPartialValue7, addPartialValue8, addPartialValue9, tempYear, tempMonth, tempDay, createButton, discountMoney, loginNumber);

                        int valueWareHouse = storageValue;
                        if (storageValue != 0) {
                            for (int k = valueWareHouse - 1; k >= start; k--) {
                                if (storage[k * 100 + 0] == i && storage[k * 100 + 1] == j && storage[k * 100 + 3] == 3) {
                                    storage[k * 100 + 2] += number;
                                    storage[storageValue * 100 + 0] = 0;
                                    storage[storageValue * 100 + 1] = 0;
                                    storage[storageValue * 100 + 2] = 0;
                                    storage[storageValue * 100 + 3] = -1;
                                    storageValue--;
                                }
                            }
                        }
                        storageValue++;
                        button = 1;
                        iValue = -1;


                    }
                }
            }
        }

        buy(sc, weaponName, recoveryWeaphone, day, price, kind, iValue, sequence, storage, storageValue, start, money, button, buyButton, adminId, adminPassword, accountInformation, loginButton, accountInformationButton, idType, userNumber, capacityValueButton, weaponInformation, categoryRemove, categoryButton, num_of_days, month, year, promotionName, percentageDiscountButton, discountPercent, promotionYear1, promotionMonth1, promotionDay1, promotionYear2, promotionMonth2, promotionDay2, promotionValue1, promotionValue2, promotionValue3, promoteInformation1, timeCount, partialName, checkBox, history, damage, speed, weight, weaponRemoval, maximumInventory, currentInventory, promoteDate1, promoteDate2, promoteDate3, promoteDate4, promoteDate5, promoteDate6, promoteInformation2, promoteInformation3, discount, indexStorage1, indexStorage2, indexStorage3, thousandNumber, MAX_Z, recoveryStorage, promoteDate7, promoteDate8, promoteDate9, promoteInformation4, promoteInformation5, promoteInformation6, promoteInformation7, promoteInformation8, promoteInformation9, indexStorage4, indexStorage5, indexStorage6, indexStorage7, indexStorage8, indexStorage9, addPartialValue1, addPartialValue2, addPartialValue3, addPartialValue4, addPartialValue5, addPartialValue6, addPartialValue7, addPartialValue8, addPartialValue9, tempYear, tempMonth, tempDay, createButton, discountMoney, loginNumber);
    }


    public static void input1(Scanner sc, String[] weaponName, int[] recoveryWeaphone, int day, int[] price, String[] kind, int iValue, int[] sequence, int[] storage, int storageValue, int start, long[] money, int button, int buyButton, String adminId, String adminPassword, String[] accountInformation, int loginButton, int accountInformationButton, String idType, int userNumber, int[] capacityValueButton, int[] weaponInformation, int[] categoryRemove, int categoryButton, int[] num_of_days, int month, int year, String[] promotionName, int percentageDiscountButton, int discountPercent, int promotionYear1, int promotionMonth1, int promotionDay1, int promotionYear2, int promotionMonth2, int promotionDay2, int promotionValue1, int promotionValue2, int promotionValue3, int[] promoteInformation1, int[] timeCount, String[] partialName, int[] checkBox, int[] history, int[] damage, int[] speed, int[] weight, int[] weaponRemoval, int[] maximumInventory, int[] currentInventory, int[] promoteDate1, int[] promoteDate2, int[] promoteDate3, int[] promoteDate4, int[] promoteDate5, int[] promoteDate6, int[] promoteInformation2, int[] promoteInformation3, int[] discount, int[] indexStorage1, int[] indexStorage2, int[] indexStorage3, int[] thousandNumber, int MAX_Z, int[] recoveryStorage, int[] promoteDate7, int[] promoteDate8, int[] promoteDate9, int[] promoteInformation4, int[] promoteInformation5, int[] promoteInformation6, int[] promoteInformation7, int[] promoteInformation8, int[] promoteInformation9, int[] indexStorage4, int[] indexStorage5, int[] indexStorage6, int[] indexStorage7, int[] indexStorage8, int[] indexStorage9, int[] addPartialValue1, int[] addPartialValue2, int[] addPartialValue3, int[] addPartialValue4, int[] addPartialValue5, int[] addPartialValue6, int[] addPartialValue7, int[] addPartialValue8, int[] addPartialValue9, int tempYear, int tempMonth, int tempDay, int createButton, int[] discountMoney, int loginNumber
    ) {
        int weaponPrice = 500;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                price[i * 100 + j] += weaponPrice;
                weaponPrice += 500;
            }
        }
        System.out.println("5종류, 각 종류당 100개 500개의 숫자데이터를 넣어주세요. 첨부되어있던 txt파일 복사 붙여넣기 해주세요! 그다음 엔터치시면 메뉴바가 나옵니다. 자유롭게 이용해주세요!");
        System.out.println("구현이 아직 덜 된 메뉴가 있을 수 있습니다!");
        System.out.println("앞으로 1. 인벤토리 2. 로그인 등 프로그램을 진행하려면, 인벤토리에 들어갈려면 '1'을 누르고 엔터치시면 도시구, 로그인 하시고싶으시다면 '2'를 눌러주시면 됩니다!");
        for (int i = 0; i < 10; i++) {
            System.out.printf("---%s---\n", kind[i]);
            for (int j = 0; j < 10; j++) {
                System.out.println("1. 이름, 2. 재고, 3. 손상, 4. 속도 5. 무게");
                weaponName[i * 100 + j] = sc.next();
                maximumInventory[i * 100 + j] = sc.nextInt();
                currentInventory[i * 100 + j] = maximumInventory[i * 100 + j];
                damage[i * 100 + j] = sc.nextInt();
                speed[i * 100 + j] = sc.nextInt();
                weight[i * 100 + j] = sc.nextInt();

                price[i * 100 + j] += damage[i * 100 + j] * 100 + speed[i * 100 + j] * 50 + weight[i * 100 + j] * 10;
            }
        }
        uiLogin(sc, weaponName, recoveryWeaphone, day, price, kind, iValue, sequence, storage, storageValue, start, money, button, buyButton, adminId, adminPassword, accountInformation, loginButton, accountInformationButton, idType, userNumber, capacityValueButton, weaponInformation, categoryRemove, categoryButton, num_of_days, month, year, promotionName, percentageDiscountButton, discountPercent, promotionYear1, promotionMonth1, promotionDay1, promotionYear2, promotionMonth2, promotionDay2, promotionValue1, promotionValue2, promotionValue3, promoteInformation1, timeCount, partialName, checkBox, history, damage, speed, weight, weaponRemoval, maximumInventory, currentInventory, promoteDate1, promoteDate2, promoteDate3, promoteDate4, promoteDate5, promoteDate6, promoteInformation2, promoteInformation3, discount, indexStorage1, indexStorage2, indexStorage3, thousandNumber, MAX_Z, recoveryStorage, promoteDate7, promoteDate8, promoteDate9, promoteInformation4, promoteInformation5, promoteInformation6, promoteInformation7, promoteInformation8, promoteInformation9, indexStorage4, indexStorage5, indexStorage6, indexStorage7, indexStorage8, indexStorage9, addPartialValue1, addPartialValue2, addPartialValue3, addPartialValue4, addPartialValue5, addPartialValue6, addPartialValue7, addPartialValue8, addPartialValue9, tempYear, tempMonth, tempDay, createButton, discountMoney, loginNumber);
    }

    public static void input2(Scanner sc, String[] weaponName, int[] recoveryWeaphone, int day, int[] price, String[] kind, int iValue, int[] sequence, int[] storage, int storageValue, int start, long[] money, int button, int buyButton, String adminId, String adminPassword, String[] accountInformation, int loginButton, int accountInformationButton, String idType, int userNumber, int[] capacityValueButton, int[] weaponInformation, int[] categoryRemove, int categoryButton, int[] num_of_days, int month, int year, String[] promotionName, int percentageDiscountButton, int discountPercent, int promotionYear1, int promotionMonth1, int promotionDay1, int promotionYear2, int promotionMonth2, int promotionDay2, int promotionValue1, int promotionValue2, int promotionValue3, int[] promoteInformation1, int[] timeCount, String[] partialName, int[] checkBox, int[] history, int[] damage, int[] speed, int[] weight, int[] weaponRemoval, int[] maximumInventory, int[] currentInventory, int[] promoteDate1, int[] promoteDate2, int[] promoteDate3, int[] promoteDate4, int[] promoteDate5, int[] promoteDate6, int[] promoteInformation2, int[] promoteInformation3, int[] discount, int[] indexStorage1, int[] indexStorage2, int[] indexStorage3, int[] thousandNumber, int MAX_Z, int[] recoveryStorage, int[] promoteDate7, int[] promoteDate8, int[] promoteDate9, int[] promoteInformation4, int[] promoteInformation5, int[] promoteInformation6, int[] promoteInformation7, int[] promoteInformation8, int[] promoteInformation9, int[] indexStorage4, int[] indexStorage5, int[] indexStorage6, int[] indexStorage7, int[] indexStorage8, int[] indexStorage9, int[] addPartialValue1, int[] addPartialValue2, int[] addPartialValue3, int[] addPartialValue4, int[] addPartialValue5, int[] addPartialValue6, int[] addPartialValue7, int[] addPartialValue8, int[] addPartialValue9, int tempYear, int tempMonth, int tempDay, int createButton, int[] discountMoney, int loginNumber
    ) {
        while(true) {
            System.out.println("1. 구매하기, 2. 구매 내역 3. 내 기본 통계 4.로그아웃");
            int n = sc.nextInt();
            if (n == 1) {
                seeInventory(sc, weaponName, recoveryWeaphone, day, price, kind, iValue, sequence, storage, storageValue, start, money, button, buyButton, adminId, adminPassword, accountInformation, loginButton, accountInformationButton, idType, userNumber, capacityValueButton, weaponInformation, categoryRemove, categoryButton, num_of_days, month, year, promotionName, percentageDiscountButton, discountPercent, promotionYear1, promotionMonth1, promotionDay1, promotionYear2, promotionMonth2, promotionDay2, promotionValue1, promotionValue2, promotionValue3, promoteInformation1, timeCount, partialName, checkBox, history, damage, speed, weight, weaponRemoval, maximumInventory, currentInventory, promoteDate1, promoteDate2, promoteDate3, promoteDate4, promoteDate5, promoteDate6, promoteInformation2, promoteInformation3, discount, indexStorage1, indexStorage2, indexStorage3, thousandNumber, MAX_Z, recoveryStorage, promoteDate7, promoteDate8, promoteDate9, promoteInformation4, promoteInformation5, promoteInformation6, promoteInformation7, promoteInformation8, promoteInformation9, indexStorage4, indexStorage5, indexStorage6, indexStorage7, indexStorage8, indexStorage9, addPartialValue1, addPartialValue2, addPartialValue3, addPartialValue4, addPartialValue5, addPartialValue6, addPartialValue7, addPartialValue8, addPartialValue9, tempYear, tempMonth, tempDay, createButton, discountMoney, loginNumber);
                buy(sc, weaponName, recoveryWeaphone, day, price, kind, iValue, sequence, storage, storageValue, start, money, button, buyButton, adminId, adminPassword, accountInformation, loginButton, accountInformationButton, idType, userNumber, capacityValueButton, weaponInformation, categoryRemove, categoryButton, num_of_days, month, year, promotionName, percentageDiscountButton, discountPercent, promotionYear1, promotionMonth1, promotionDay1, promotionYear2, promotionMonth2, promotionDay2, promotionValue1, promotionValue2, promotionValue3, promoteInformation1, timeCount, partialName, checkBox, history, damage, speed, weight, weaponRemoval, maximumInventory, currentInventory, promoteDate1, promoteDate2, promoteDate3, promoteDate4, promoteDate5, promoteDate6, promoteInformation2, promoteInformation3, discount, indexStorage1, indexStorage2, indexStorage3, thousandNumber, MAX_Z, recoveryStorage, promoteDate7, promoteDate8, promoteDate9, promoteInformation4, promoteInformation5, promoteInformation6, promoteInformation7, promoteInformation8, promoteInformation9, indexStorage4, indexStorage5, indexStorage6, indexStorage7, indexStorage8, indexStorage9, addPartialValue1, addPartialValue2, addPartialValue3, addPartialValue4, addPartialValue5, addPartialValue6, addPartialValue7, addPartialValue8, addPartialValue9, tempYear, tempMonth, tempDay, createButton, discountMoney, loginNumber);
            } else if (n == 2) {
                purchaseHistory(sc, weaponName, recoveryWeaphone, day, price, kind, iValue, sequence, storage, storageValue, start, money, button, buyButton, adminId, adminPassword, accountInformation, loginButton, accountInformationButton, idType, userNumber, capacityValueButton, weaponInformation, categoryRemove, categoryButton, num_of_days, month, year, promotionName, percentageDiscountButton, discountPercent, promotionYear1, promotionMonth1, promotionDay1, promotionYear2, promotionMonth2, promotionDay2, promotionValue1, promotionValue2, promotionValue3, promoteInformation1, timeCount, partialName, checkBox, history, damage, speed, weight, weaponRemoval, maximumInventory, currentInventory, promoteDate1, promoteDate2, promoteDate3, promoteDate4, promoteDate5, promoteDate6, promoteInformation2, promoteInformation3, discount, indexStorage1, indexStorage2, indexStorage3, thousandNumber, MAX_Z, recoveryStorage, promoteDate7, promoteDate8, promoteDate9, promoteInformation4, promoteInformation5, promoteInformation6, promoteInformation7, promoteInformation8, promoteInformation9, indexStorage4, indexStorage5, indexStorage6, indexStorage7, indexStorage8, indexStorage9, addPartialValue1, addPartialValue2, addPartialValue3, addPartialValue4, addPartialValue5, addPartialValue6, addPartialValue7, addPartialValue8, addPartialValue9, tempYear, tempMonth, tempDay, createButton, discountMoney, loginNumber);
            } else if (n == 3) {
                seeInventory(sc, weaponName, recoveryWeaphone, day, price, kind, iValue, sequence, storage, storageValue, start, money, button, buyButton, adminId, adminPassword, accountInformation, loginButton, accountInformationButton, idType, userNumber, capacityValueButton, weaponInformation, categoryRemove, categoryButton, num_of_days, month, year, promotionName, percentageDiscountButton, discountPercent, promotionYear1, promotionMonth1, promotionDay1, promotionYear2, promotionMonth2, promotionDay2, promotionValue1, promotionValue2, promotionValue3, promoteInformation1, timeCount, partialName, checkBox, history, damage, speed, weight, weaponRemoval, maximumInventory, currentInventory, promoteDate1, promoteDate2, promoteDate3, promoteDate4, promoteDate5, promoteDate6, promoteInformation2, promoteInformation3, discount, indexStorage1, indexStorage2, indexStorage3, thousandNumber, MAX_Z, recoveryStorage, promoteDate7, promoteDate8, promoteDate9, promoteInformation4, promoteInformation5, promoteInformation6, promoteInformation7, promoteInformation8, promoteInformation9, indexStorage4, indexStorage5, indexStorage6, indexStorage7, indexStorage8, indexStorage9, addPartialValue1, addPartialValue2, addPartialValue3, addPartialValue4, addPartialValue5, addPartialValue6, addPartialValue7, addPartialValue8, addPartialValue9, tempYear, tempMonth, tempDay, createButton, discountMoney, loginNumber);
            } else if (n == 4) {
                uiLogin(sc, weaponName, recoveryWeaphone, day, price, kind, iValue, sequence, storage, storageValue, start, money, button, buyButton, adminId, adminPassword, accountInformation, loginButton, accountInformationButton, idType, userNumber, capacityValueButton, weaponInformation, categoryRemove, categoryButton, num_of_days, month, year, promotionName, percentageDiscountButton, discountPercent, promotionYear1, promotionMonth1, promotionDay1, promotionYear2, promotionMonth2, promotionDay2, promotionValue1, promotionValue2, promotionValue3, promoteInformation1, timeCount, partialName, checkBox, history, damage, speed, weight, weaponRemoval, maximumInventory, currentInventory, promoteDate1, promoteDate2, promoteDate3, promoteDate4, promoteDate5, promoteDate6, promoteInformation2, promoteInformation3, discount, indexStorage1, indexStorage2, indexStorage3, thousandNumber, MAX_Z, recoveryStorage, promoteDate7, promoteDate8, promoteDate9, promoteInformation4, promoteInformation5, promoteInformation6, promoteInformation7, promoteInformation8, promoteInformation9, indexStorage4, indexStorage5, indexStorage6, indexStorage7, indexStorage8, indexStorage9, addPartialValue1, addPartialValue2, addPartialValue3, addPartialValue4, addPartialValue5, addPartialValue6, addPartialValue7, addPartialValue8, addPartialValue9, tempYear, tempMonth, tempDay, createButton, discountMoney, loginNumber);
            } else {
                System.out.println("입력범위를 초과하였습니다.");
            }
        }
    }

    public static void purchaseHistory(Scanner sc, String[] weaponName, int[] recoveryWeaphone, int day, int[] price, String[] kind, int iValue, int[] sequence, int[] storage, int storageValue, int start, long[] money, int button, int buyButton, String adminId, String adminPassword, String[] accountInformation, int loginButton, int accountInformationButton, String idType, int userNumber, int[] capacityValueButton, int[] weaponInformation, int[] categoryRemove, int categoryButton, int[] num_of_days, int month, int year, String[] promotionName, int percentageDiscountButton, int discountPercent, int promotionYear1, int promotionMonth1, int promotionDay1, int promotionYear2, int promotionMonth2, int promotionDay2, int promotionValue1, int promotionValue2, int promotionValue3, int[] promoteInformation1, int[] timeCount, String[] partialName, int[] checkBox, int[] history, int[] damage, int[] speed, int[] weight, int[] weaponRemoval, int[] maximumInventory, int[] currentInventory, int[] promoteDate1, int[] promoteDate2, int[] promoteDate3, int[] promoteDate4, int[] promoteDate5, int[] promoteDate6, int[] promoteInformation2, int[] promoteInformation3, int[] discount, int[] indexStorage1, int[] indexStorage2, int[] indexStorage3, int[] thousandNumber, int MAX_Z, int[] recoveryStorage, int[] promoteDate7, int[] promoteDate8, int[] promoteDate9, int[] promoteInformation4, int[] promoteInformation5, int[] promoteInformation6, int[] promoteInformation7, int[] promoteInformation8, int[] promoteInformation9, int[] indexStorage4, int[] indexStorage5, int[] indexStorage6, int[] indexStorage7, int[] indexStorage8, int[] indexStorage9, int[] addPartialValue1, int[] addPartialValue2, int[] addPartialValue3, int[] addPartialValue4, int[] addPartialValue5, int[] addPartialValue6, int[] addPartialValue7, int[] addPartialValue8, int[] addPartialValue9, int tempYear, int tempMonth, int tempDay, int createButton, int[] discountMoney, int loginNumber
    ) {

        input2(sc, weaponName, recoveryWeaphone, day, price, kind, iValue, sequence, storage, storageValue, start, money, button, buyButton, adminId, adminPassword, accountInformation, loginButton, accountInformationButton, idType, userNumber, capacityValueButton, weaponInformation, categoryRemove, categoryButton, num_of_days, month, year, promotionName, percentageDiscountButton, discountPercent, promotionYear1, promotionMonth1, promotionDay1, promotionYear2, promotionMonth2, promotionDay2, promotionValue1, promotionValue2, promotionValue3, promoteInformation1, timeCount, partialName, checkBox, history, damage, speed, weight, weaponRemoval, maximumInventory, currentInventory, promoteDate1, promoteDate2, promoteDate3, promoteDate4, promoteDate5, promoteDate6, promoteInformation2, promoteInformation3, discount, indexStorage1, indexStorage2, indexStorage3, thousandNumber, MAX_Z, recoveryStorage, promoteDate7, promoteDate8, promoteDate9, promoteInformation4, promoteInformation5, promoteInformation6, promoteInformation7, promoteInformation8, promoteInformation9, indexStorage4, indexStorage5, indexStorage6, indexStorage7, indexStorage8, indexStorage9, addPartialValue1, addPartialValue2, addPartialValue3, addPartialValue4, addPartialValue5, addPartialValue6, addPartialValue7, addPartialValue8, addPartialValue9, tempYear, tempMonth, tempDay, createButton, discountMoney, loginNumber);
    }

    /**
     * 판매자 옵션
     */

    public static void seeInventory(Scanner sc, String[] weaponName, int[] recoveryWeaphone, int day, int[] price, String[] kind, int iValue, int[] sequence, int[] storage, int storageValue, int start, long[] money, int button, int buyButton, String adminId, String adminPassword, String[] accountInformation, int loginButton, int accountInformationButton, String idType, int userNumber, int[] capacityValueButton, int[] weaponInformation, int[] categoryRemove, int categoryButton, int[] num_of_days, int month, int year, String[] promotionName, int percentageDiscountButton, int discountPercent, int promotionYear1, int promotionMonth1, int promotionDay1, int promotionYear2, int promotionMonth2, int promotionDay2, int promotionValue1, int promotionValue2, int promotionValue3, int[] promoteInformation1, int[] timeCount, String[] partialName, int[] checkBox, int[] history, int[] damage, int[] speed, int[] weight, int[] weaponRemoval, int[] maximumInventory, int[] currentInventory, int[] promoteDate1, int[] promoteDate2, int[] promoteDate3, int[] promoteDate4, int[] promoteDate5, int[] promoteDate6, int[] promoteInformation2, int[] promoteInformation3, int[] discount, int[] indexStorage1, int[] indexStorage2, int[] indexStorage3, int[] thousandNumber, int MAX_Z, int[] recoveryStorage, int[] promoteDate7, int[] promoteDate8, int[] promoteDate9, int[] promoteInformation4, int[] promoteInformation5, int[] promoteInformation6, int[] promoteInformation7, int[] promoteInformation8, int[] promoteInformation9, int[] indexStorage4, int[] indexStorage5, int[] indexStorage6, int[] indexStorage7, int[] indexStorage8, int[] indexStorage9, int[] addPartialValue1, int[] addPartialValue2, int[] addPartialValue3, int[] addPartialValue4, int[] addPartialValue5, int[] addPartialValue6, int[] addPartialValue7, int[] addPartialValue8, int[] addPartialValue9, int tempYear, int tempMonth, int tempDay, int createButton, int[] discountMoney, int loginNumber
    ) {
        int seePromotionButton = 0;
        int seePromotionButton2 = 0;
        int seePromotionValue1 = 0;

        System.out.println("♥ 현재 프로모션 ♥");
        System.out.println("-----------------------");
        for (int e = 2000; e < 2020; e++) {
            for (int i = 0; i < 200000; i += 2000) {
                for (int j = 0; j < 2000; j += 20) {
                    for (int k = 0; k < 20; k++) {
                        if (promoteInformation2[i + j + k] == e) {
                            if (seePromotionButton == 0) {
                                System.out.printf("%d년 %d월 %d일 ~ %d년 %d월 %d일\n", promoteDate2[i * 6 + j * 6 + k * 6 + 0], promoteDate2[i * 6 + j * 6 + k * 6 + 1], promoteDate2[i * 6 + j * 6 + k * 6 + 2], promoteDate2[i * 6 + j * 6 + k * 6 + 3], promoteDate2[i * 6 + j * 6 + k * 6 + 4], promoteDate2[i * 6 + j * 6 + k * 6 + 5]);
                                System.out.println(discount[i + j + k] + "%할인");
                                seePromotionButton = 1;
                            }
                            if (seePromotionButton2 == 0) {
                                System.out.printf("---%s---\n", kind[i / 2000]);
                                seePromotionButton2 = 1;
                            }
                            System.out.printf("%s\n", weaponName[i / 2000 * 100 + j % 2000 / 20]);
                            if (promoteInformation2[i + j + k] >= 2000 && promoteInformation2[i + j + k] < 2020) {
                                System.out.printf("  %d%% 할인", discount[i + j + k]);
                            }
                            if (promoteInformation5[i + j + k] >= 5000 && promoteInformation5[i + j + k] < 5020) {
                                System.out.printf("  1 + 1 무료");
                            }
                            if (promoteInformation8[i + j + k] >= 8000 && promoteInformation8[i + j + k] < 8020) {
                                System.out.printf("  %d원 할인\n", discountMoney[i + j + k]);
                            }
                        }
                    }
                }
                seePromotionButton2 = 0;
                seePromotionValue1++;
            }
            seePromotionButton = 0;
        }
        seePromotionValue1 = 0;

        for (int e = 5000; e < 5020; e++) {
            for (int i = 0; i < 200000; i += 2000) {
                for (int j = 0; j < 2000; j += 20) {
                    for (int k = 0; k < 20; k++) {
                        int formula = k / 2000 * 100 + k % 2000 / 20;
                        if (promoteInformation5[i + j + k] == e) {
                            if (seePromotionButton == 0) {
                                System.out.printf("%d년 %d월 %d일 ~ %d년 %d월 %d일\n", promoteDate5[i * 6 + j * 6 + k * 6 + 0], promoteDate5[i * 6 + j * 6 + k * 6 + 1], promoteDate5[i * 6 + j * 6 + k * 6 + 2], promoteDate5[i * 6 + j * 6 + k * 6 + 3], promoteDate5[i * 6 + j * 6 + k * 6 + 4], promoteDate5[i * 6 + j * 6 + k * 6 + 5]);
                                System.out.println("1 + 1 무료");
                                seePromotionButton = 1;
                            }
                            if (seePromotionButton2 == 0) {
                                System.out.printf("---%s---\n", kind[i / 2000]);
                                seePromotionButton2 = 1;
                            }
                            System.out.printf("%s\n", weaponName[formula]);
                            if (promoteInformation2[i + j + k] >= 2000 && promoteInformation2[i + j + k] < 2020) {
                                System.out.printf("  %d%% 할인", discount[i + j + k]);
                            }
                            if (promoteInformation5[i + j + k] >= 5000 && promoteInformation5[i + j + k] < 5020) {
                                System.out.printf("  1 + 1 무료");
                            }
                            if (promoteInformation8[i + j + k] >= 8000 && promoteInformation8[i + j + k] < 8020) {
                                System.out.printf("  %d원 할인\n", discountMoney[i + j + k]);
                            }
                        }
                    }
                }
                seePromotionButton2 = 0;
                seePromotionValue1++;
            }
            seePromotionButton = 0;
        }
        seePromotionValue1 = 0;

        for (int e = 8000; e < 8020; e++) {
            for (int i = 0; i < 200000; i += 2000) {
                for (int j = 0; j < 2000; j += 20) {
                    for (int k = 0; k < 20; k++) {
                        int formula = k / 2000 * 100 + k % 2000 / 20;
                        if (promoteInformation8[i + j + k] == e) {
                            if (seePromotionButton == 0) {
                                System.out.printf("%d년 %d월 %d일 ~ %d년 %d월 %d일\n", promoteDate8[i * 6 + j * 6 + k * 6 + 0], promoteDate8[i * 6 + j * 6 + k * 6 + 1], promoteDate8[i * 6 + j * 6 + k * 6 + 2], promoteDate8[i * 6 + j * 6 + k * 6 + 3], promoteDate8[i * 6 + j * 6 + k * 6 + 4], promoteDate8[i * 6 + j * 6 + k * 6 + 5]);
                                System.out.println(discount[k] + "원 할인");
                                seePromotionButton = 1;
                            }
                            if (seePromotionButton2 == 0) {
                                System.out.printf("---%s---\n", kind[i / 2000]);
                                seePromotionButton2 = 1;
                            }
                            System.out.printf("%s\n", weaponName[formula]);
                            if (promoteInformation2[i + j + k] >= 2000 && promoteInformation2[i + j + k] < 2020) {
                                System.out.printf("  %d%% 할인", discount[i + j + k]);
                            }
                            if (promoteInformation5[i + j + k] >= 5000 && promoteInformation5[i + j + k] < 5020) {
                                System.out.printf("  1 + 1 무료");
                            }
                            if (promoteInformation8[i + j + k] >= 8000 && promoteInformation8[i + j + k] < 8020) {
                                System.out.printf("  %d원 할인\n", discountMoney[i + j + k]);
                            }
                        }
                    }
                }
                seePromotionButton2 = 0;
                seePromotionValue1++;
            }
            seePromotionButton = 0;
        }
        seePromotionValue1 = 0;
        System.out.println("-----------------------↓무기상점리스트");
        int partialButton = 0;

        for (int o = 0; o < categoryButton; o++) {
            if (categoryRemove[o] == 0) {
                System.out.printf("---%s---\n", kind[o]);

                for (int i = 0; i < sequence[o]; i++) {
                    for (int m = 0; m < addPartialValue2[o * 100 + i]; m++) {
                        if (promoteInformation2[o * 2000 + i * 20 + m] >= 2000 && promoteInformation2[o * 2000 + i * 20 + m] < 2020) {
                            partialName[0] = "[%할인]";
                        }
                    }
                    for (int m = 0; m < addPartialValue5[o * 100 + i]; m++) {
                        if (promoteInformation5[o * 2000 + i * 20 + m] >= 5000 && promoteInformation5[o * 2000 + i * 20 + m] < 5020) {
                            partialName[1] = "[1+1 무료]";
                        }
                    }
                    for (int m = 0; m < addPartialValue8[o * 100 + i]; m++) {
                        if (promoteInformation8[o * 2000 + i * 20 + m] >= 8000 && promoteInformation8[o * 2000 + i * 20 + m] < 8020) {
                            partialName[2] = "[금액할인]";
                        }
                    }

                    if (checkBox[o * 100 + i] == 0) {
                        System.out.printf("%-4s : 재고: %-3d/%-3d 손상: %-4d 속도: %-4d 무게: %-4d %s%s%s\n", weaponName[o * 100 + i], currentInventory[o * 100 + i], maximumInventory[o * 100 + i], damage[o * 100 + i], speed[o * 100 + i], weight[o * 100 + i], partialName[0], partialName[1], partialName[2]);
                    } else {
                        System.out.printf("%-4s : 재고: %-3d/%-3d 손상: %-4d 속도: %-4d 무게: %-4d %s%s%s ✔[선택함] \n", weaponName[o * 100 + i], currentInventory[o * 100 + i], maximumInventory[o * 100 + i], damage[o * 100 + i], speed[o * 100 + i], weight[o * 100 + i], partialName[0], partialName[1], partialName[2]);
                    }

                    for (int j = 2000; j < 2020; j++) {
                        for (int k = 0; k < addPartialValue2[o * 100 + i]; k++) {
                            if (promoteInformation2[o * 2000 + i * 20 + k] == j) {
                                partialButton = 1;
                                System.out.printf("[%d년 %d월 %d일 ~ %d년 %d월 %d일] : %d%%할인\n", promoteDate2[o * 12000 + i * 120 + 6 * k + 0], promoteDate2[o * 12000 + i * 120 + 6 * k + 1], promoteDate2[o * 12000 + i * 120 + 6 * k + 2], promoteDate2[o * 12000 + i * 120 + 6 * k + 3], promoteDate2[o * 12000 + i * 120 + 6 * k + 4], promoteDate2[o * 12000 + i * 120 + 6 * k + 5], discount[o * 2000 + i * 20 + k]);
                            }
                        }
                    }
                    for (int j = 5000; j < 5020; j++) {
                        for (int k = 0; k < addPartialValue5[o * 100 + i]; k++) {
                            if (promoteInformation5[o * 2000 + i * 20 + k] == j) {
                                partialButton = 1;
                                System.out.printf("[%d년 %d월 %d일 ~ %d년 %d월 %d일] : [1 + 1 무료]\n", promoteDate5[o * 12000 + i * 120 + 6 * k + 0], promoteDate5[o * 12000 + i * 120 + 6 * k + 1], promoteDate5[o * 12000 + i * 120 + 6 * k + 2], promoteDate5[o * 12000 + i * 120 + 6 * k + 3], promoteDate5[o * 12000 + i * 120 + 6 * k + 4], promoteDate5[o * 12000 + i * 120 + 6 * k + 5]);
                            }
                        }
                    }
                    for (int j = 8000; j < 8020; j++) {
                        for (int k = 0; k < addPartialValue8[o * 100 + i]; k++) {
                            if (promoteInformation8[o * 2000 + i * 20 + k] == j) {
                                partialButton = 1;
                                System.out.printf("[%d년 %d월 %d일 ~ %d년 %d월 %d일] : %d원 할인\n", promoteDate8[o * 12000 + i * 120 + 6 * k + 0], promoteDate8[o * 12000 + i * 120 + 6 * k + 1], promoteDate8[o * 12000 + i * 120 + 6 * k + 2], promoteDate8[o * 12000 + i * 120 + 6 * k + 3], promoteDate8[o * 12000 + i * 120 + 6 * k + 4], promoteDate8[o * 12000 + i * 120 + 6 * k + 5], discount[o * 2000 + i * 20 + k]);
                            }
                        }
                    }

                    partialName[0] = "";
                    partialName[1] = "";
                    partialName[2] = "";


                }
            }
        }
    }

    public static void addCategory(Scanner sc, String[] weaponName, int[] recoveryWeaphone, int day, int[] price, String[] kind, int iValue, int[] sequence, int[] storage, int storageValue, int start, long[] money, int button, int buyButton, String adminId, String adminPassword, String[] accountInformation, int loginButton, int accountInformationButton, String idType, int userNumber, int[] capacityValueButton, int[] weaponInformation, int[] categoryRemove, int categoryButton, int[] num_of_days, int month, int year, String[] promotionName, int percentageDiscountButton, int discountPercent, int promotionYear1, int promotionMonth1, int promotionDay1, int promotionYear2, int promotionMonth2, int promotionDay2, int promotionValue1, int promotionValue2, int promotionValue3, int[] promoteInformation1, int[] timeCount, String[] partialName, int[] checkBox, int[] history, int[] damage, int[] speed, int[] weight, int[] weaponRemoval, int[] maximumInventory, int[] currentInventory, int[] promoteDate1, int[] promoteDate2, int[] promoteDate3, int[] promoteDate4, int[] promoteDate5, int[] promoteDate6, int[] promoteInformation2, int[] promoteInformation3, int[] discount, int[] indexStorage1, int[] indexStorage2, int[] indexStorage3, int[] thousandNumber, int MAX_Z, int[] recoveryStorage, int[] promoteDate7, int[] promoteDate8, int[] promoteDate9, int[] promoteInformation4, int[] promoteInformation5, int[] promoteInformation6, int[] promoteInformation7, int[] promoteInformation8, int[] promoteInformation9, int[] indexStorage4, int[] indexStorage5, int[] indexStorage6, int[] indexStorage7, int[] indexStorage8, int[] indexStorage9, int[] addPartialValue1, int[] addPartialValue2, int[] addPartialValue3, int[] addPartialValue4, int[] addPartialValue5, int[] addPartialValue6, int[] addPartialValue7, int[] addPartialValue8, int[] addPartialValue9, int tempYear, int tempMonth, int tempDay, int createButton, int[] discountMoney, int loginNumber
    ) {
        System.out.println("카테고리를 추가합니다.");
        String categoryName = sc.next();
        for (int i = 0; i <= categoryButton; i++) {
            if (categoryName.equals(kind[i])) {
                System.out.println("중복된 카테고리 명이 존재합니다. 판매자 카테고리로 이동합니다.");
                adminUi(sc, weaponName, recoveryWeaphone, day, price, kind, iValue, sequence, storage, storageValue, start, money, button, buyButton, adminId, adminPassword, accountInformation, loginButton, accountInformationButton, idType, userNumber, capacityValueButton, weaponInformation, categoryRemove, categoryButton, num_of_days, month, year, promotionName, percentageDiscountButton, discountPercent, promotionYear1, promotionMonth1, promotionDay1, promotionYear2, promotionMonth2, promotionDay2, promotionValue1, promotionValue2, promotionValue3, promoteInformation1, timeCount, partialName, checkBox, history, damage, speed, weight, weaponRemoval, maximumInventory, currentInventory, promoteDate1, promoteDate2, promoteDate3, promoteDate4, promoteDate5, promoteDate6, promoteInformation2, promoteInformation3, discount, indexStorage1, indexStorage2, indexStorage3, thousandNumber, MAX_Z, recoveryStorage, promoteDate7, promoteDate8, promoteDate9, promoteInformation4, promoteInformation5, promoteInformation6, promoteInformation7, promoteInformation8, promoteInformation9, indexStorage4, indexStorage5, indexStorage6, indexStorage7, indexStorage8, indexStorage9, addPartialValue1, addPartialValue2, addPartialValue3, addPartialValue4, addPartialValue5, addPartialValue6, addPartialValue7, addPartialValue8, addPartialValue9, tempYear, tempMonth, tempDay, createButton, discountMoney, loginNumber);
            }
        }
        kind[categoryButton] = categoryName;
        categoryRemove[categoryButton] = 0;
        categoryButton++;
        adminUi(sc, weaponName, recoveryWeaphone, day, price, kind, iValue, sequence, storage, storageValue, start, money, button, buyButton, adminId, adminPassword, accountInformation, loginButton, accountInformationButton, idType, userNumber, capacityValueButton, weaponInformation, categoryRemove, categoryButton, num_of_days, month, year, promotionName, percentageDiscountButton, discountPercent, promotionYear1, promotionMonth1, promotionDay1, promotionYear2, promotionMonth2, promotionDay2, promotionValue1, promotionValue2, promotionValue3, promoteInformation1, timeCount, partialName, checkBox, history, damage, speed, weight, weaponRemoval, maximumInventory, currentInventory, promoteDate1, promoteDate2, promoteDate3, promoteDate4, promoteDate5, promoteDate6, promoteInformation2, promoteInformation3, discount, indexStorage1, indexStorage2, indexStorage3, thousandNumber, MAX_Z, recoveryStorage, promoteDate7, promoteDate8, promoteDate9, promoteInformation4, promoteInformation5, promoteInformation6, promoteInformation7, promoteInformation8, promoteInformation9, indexStorage4, indexStorage5, indexStorage6, indexStorage7, indexStorage8, indexStorage9, addPartialValue1, addPartialValue2, addPartialValue3, addPartialValue4, addPartialValue5, addPartialValue6, addPartialValue7, addPartialValue8, addPartialValue9, tempYear, tempMonth, tempDay, createButton, discountMoney, loginNumber);
    }

    public static void removeCategory(Scanner sc, String[] weaponName, int[] recoveryWeaphone, int day, int[] price, String[] kind, int iValue, int[] sequence, int[] storage, int storageValue, int start, long[] money, int button, int buyButton, String adminId, String adminPassword, String[] accountInformation, int loginButton, int accountInformationButton, String idType, int userNumber, int[] capacityValueButton, int[] weaponInformation, int[] categoryRemove, int categoryButton, int[] num_of_days, int month, int year, String[] promotionName, int percentageDiscountButton, int discountPercent, int promotionYear1, int promotionMonth1, int promotionDay1, int promotionYear2, int promotionMonth2, int promotionDay2, int promotionValue1, int promotionValue2, int promotionValue3, int[] promoteInformation1, int[] timeCount, String[] partialName, int[] checkBox, int[] history, int[] damage, int[] speed, int[] weight, int[] weaponRemoval, int[] maximumInventory, int[] currentInventory, int[] promoteDate1, int[] promoteDate2, int[] promoteDate3, int[] promoteDate4, int[] promoteDate5, int[] promoteDate6, int[] promoteInformation2, int[] promoteInformation3, int[] discount, int[] indexStorage1, int[] indexStorage2, int[] indexStorage3, int[] thousandNumber, int MAX_Z, int[] recoveryStorage, int[] promoteDate7, int[] promoteDate8, int[] promoteDate9, int[] promoteInformation4, int[] promoteInformation5, int[] promoteInformation6, int[] promoteInformation7, int[] promoteInformation8, int[] promoteInformation9, int[] indexStorage4, int[] indexStorage5, int[] indexStorage6, int[] indexStorage7, int[] indexStorage8, int[] indexStorage9, int[] addPartialValue1, int[] addPartialValue2, int[] addPartialValue3, int[] addPartialValue4, int[] addPartialValue5, int[] addPartialValue6, int[] addPartialValue7, int[] addPartialValue8, int[] addPartialValue9, int tempYear, int tempMonth, int tempDay, int createButton, int[] discountMoney, int loginNumber
    ) {
        System.out.println("카테고리를 제거합니다.");
        for (int i = 0; i <= categoryButton; i++) {
            if (categoryRemove[i] == 0) {
                System.out.println((i + 1) + ". " + kind[i]);
            }
        }
        System.out.println("어떤 카테고리를 제거하시겠습니까? 이름을 적어주세요.");
        String removeName = sc.next();
        int check = 0;
        for (int i = 0; i <= categoryButton; i++) {
            if (removeName.equals(kind[i])) {
                categoryRemove[i] = 1;
                check = 1;
            }
        }
        if (check == 0) {
            System.out.println("알맞은 카테고리가 아닙니다. 관리자페이지로 돌아갑니다.");
            adminUi(sc, weaponName, recoveryWeaphone, day, price, kind, iValue, sequence, storage, storageValue, start, money, button, buyButton, adminId, adminPassword, accountInformation, loginButton, accountInformationButton, idType, userNumber, capacityValueButton, weaponInformation, categoryRemove, categoryButton, num_of_days, month, year, promotionName, percentageDiscountButton, discountPercent, promotionYear1, promotionMonth1, promotionDay1, promotionYear2, promotionMonth2, promotionDay2, promotionValue1, promotionValue2, promotionValue3, promoteInformation1, timeCount, partialName, checkBox, history, damage, speed, weight, weaponRemoval, maximumInventory, currentInventory, promoteDate1, promoteDate2, promoteDate3, promoteDate4, promoteDate5, promoteDate6, promoteInformation2, promoteInformation3, discount, indexStorage1, indexStorage2, indexStorage3, thousandNumber, MAX_Z, recoveryStorage, promoteDate7, promoteDate8, promoteDate9, promoteInformation4, promoteInformation5, promoteInformation6, promoteInformation7, promoteInformation8, promoteInformation9, indexStorage4, indexStorage5, indexStorage6, indexStorage7, indexStorage8, indexStorage9, addPartialValue1, addPartialValue2, addPartialValue3, addPartialValue4, addPartialValue5, addPartialValue6, addPartialValue7, addPartialValue8, addPartialValue9, tempYear, tempMonth, tempDay, createButton, discountMoney, loginNumber);

        }
        System.out.println("선택한 카테고리가 제거되었습니다.");
        adminUi(sc, weaponName, recoveryWeaphone, day, price, kind, iValue, sequence, storage, storageValue, start, money, button, buyButton, adminId, adminPassword, accountInformation, loginButton, accountInformationButton, idType, userNumber, capacityValueButton, weaponInformation, categoryRemove, categoryButton, num_of_days, month, year, promotionName, percentageDiscountButton, discountPercent, promotionYear1, promotionMonth1, promotionDay1, promotionYear2, promotionMonth2, promotionDay2, promotionValue1, promotionValue2, promotionValue3, promoteInformation1, timeCount, partialName, checkBox, history, damage, speed, weight, weaponRemoval, maximumInventory, currentInventory, promoteDate1, promoteDate2, promoteDate3, promoteDate4, promoteDate5, promoteDate6, promoteInformation2, promoteInformation3, discount, indexStorage1, indexStorage2, indexStorage3, thousandNumber, MAX_Z, recoveryStorage, promoteDate7, promoteDate8, promoteDate9, promoteInformation4, promoteInformation5, promoteInformation6, promoteInformation7, promoteInformation8, promoteInformation9, indexStorage4, indexStorage5, indexStorage6, indexStorage7, indexStorage8, indexStorage9, addPartialValue1, addPartialValue2, addPartialValue3, addPartialValue4, addPartialValue5, addPartialValue6, addPartialValue7, addPartialValue8, addPartialValue9, tempYear, tempMonth, tempDay, createButton, discountMoney, loginNumber);
    }

    public static void stockUpdateMake(Scanner sc, String[] weaponName, int[] recoveryWeaphone, int day, int[] price, String[] kind, int iValue, int[] sequence, int[] storage, int storageValue, int start, long[] money, int button, int buyButton, String adminId, String adminPassword, String[] accountInformation, int loginButton, int accountInformationButton, String idType, int userNumber, int[] capacityValueButton, int[] weaponInformation, int[] categoryRemove, int categoryButton, int[] num_of_days, int month, int year, String[] promotionName, int percentageDiscountButton, int discountPercent, int promotionYear1, int promotionMonth1, int promotionDay1, int promotionYear2, int promotionMonth2, int promotionDay2, int promotionValue1, int promotionValue2, int promotionValue3, int[] promoteInformation1, int[] timeCount, String[] partialName, int[] checkBox, int[] history, int[] damage, int[] speed, int[] weight, int[] weaponRemoval, int[] maximumInventory, int[] currentInventory, int[] promoteDate1, int[] promoteDate2, int[] promoteDate3, int[] promoteDate4, int[] promoteDate5, int[] promoteDate6, int[] promoteInformation2, int[] promoteInformation3, int[] discount, int[] indexStorage1, int[] indexStorage2, int[] indexStorage3, int[] thousandNumber, int MAX_Z, int[] recoveryStorage, int[] promoteDate7, int[] promoteDate8, int[] promoteDate9, int[] promoteInformation4, int[] promoteInformation5, int[] promoteInformation6, int[] promoteInformation7, int[] promoteInformation8, int[] promoteInformation9, int[] indexStorage4, int[] indexStorage5, int[] indexStorage6, int[] indexStorage7, int[] indexStorage8, int[] indexStorage9, int[] addPartialValue1, int[] addPartialValue2, int[] addPartialValue3, int[] addPartialValue4, int[] addPartialValue5, int[] addPartialValue6, int[] addPartialValue7, int[] addPartialValue8, int[] addPartialValue9, int tempYear, int tempMonth, int tempDay, int createButton, int[] discountMoney, int loginNumber
    ) {
        System.out.println("재고를 업데이트합니다.");
        System.out.println("1. 새로운 무기 추가");
        System.out.println("2. 무기 제거");
        System.out.println("3. 선택한 항목의 재고를 다 채워줍니다.");

        int f = sc.nextInt();
        if (f == 1) {
            System.out.println("새로운 무기를 추가합니다.");
            addWeaphone(sc, weaponName, recoveryWeaphone, day, price, kind, iValue, sequence, storage, storageValue, start, money, button, buyButton, adminId, adminPassword, accountInformation, loginButton, accountInformationButton, idType, userNumber, capacityValueButton, weaponInformation, categoryRemove, categoryButton, num_of_days, month, year, promotionName, percentageDiscountButton, discountPercent, promotionYear1, promotionMonth1, promotionDay1, promotionYear2, promotionMonth2, promotionDay2, promotionValue1, promotionValue2, promotionValue3, promoteInformation1, timeCount, partialName, checkBox, history, damage, speed, weight, weaponRemoval, maximumInventory, currentInventory, promoteDate1, promoteDate2, promoteDate3, promoteDate4, promoteDate5, promoteDate6, promoteInformation2, promoteInformation3, discount, indexStorage1, indexStorage2, indexStorage3, thousandNumber, MAX_Z, recoveryStorage, promoteDate7, promoteDate8, promoteDate9, promoteInformation4, promoteInformation5, promoteInformation6, promoteInformation7, promoteInformation8, promoteInformation9, indexStorage4, indexStorage5, indexStorage6, indexStorage7, indexStorage8, indexStorage9, addPartialValue1, addPartialValue2, addPartialValue3, addPartialValue4, addPartialValue5, addPartialValue6, addPartialValue7, addPartialValue8, addPartialValue9, tempYear, tempMonth, tempDay, createButton, discountMoney, loginNumber);
        } else if (f == 2) {
            System.out.println("무기를 제거합니다.");
            removeWeaphone(sc, weaponName, recoveryWeaphone, day, price, kind, iValue, sequence, storage, storageValue, start, money, button, buyButton, adminId, adminPassword, accountInformation, loginButton, accountInformationButton, idType, userNumber, capacityValueButton, weaponInformation, categoryRemove, categoryButton, num_of_days, month, year, promotionName, percentageDiscountButton, discountPercent, promotionYear1, promotionMonth1, promotionDay1, promotionYear2, promotionMonth2, promotionDay2, promotionValue1, promotionValue2, promotionValue3, promoteInformation1, timeCount, partialName, checkBox, history, damage, speed, weight, weaponRemoval, maximumInventory, currentInventory, promoteDate1, promoteDate2, promoteDate3, promoteDate4, promoteDate5, promoteDate6, promoteInformation2, promoteInformation3, discount, indexStorage1, indexStorage2, indexStorage3, thousandNumber, MAX_Z, recoveryStorage, promoteDate7, promoteDate8, promoteDate9, promoteInformation4, promoteInformation5, promoteInformation6, promoteInformation7, promoteInformation8, promoteInformation9, indexStorage4, indexStorage5, indexStorage6, indexStorage7, indexStorage8, indexStorage9, addPartialValue1, addPartialValue2, addPartialValue3, addPartialValue4, addPartialValue5, addPartialValue6, addPartialValue7, addPartialValue8, addPartialValue9, tempYear, tempMonth, tempDay, createButton, discountMoney, loginNumber);
        } else if (f == 3) {
            System.out.println("선택한 항목의 재고를 다 채워줍니다.");
            stockFull(sc, weaponName, recoveryWeaphone, day, price, kind, iValue, sequence, storage, storageValue, start, money, button, buyButton, adminId, adminPassword, accountInformation, loginButton, accountInformationButton, idType, userNumber, capacityValueButton, weaponInformation, categoryRemove, categoryButton, num_of_days, month, year, promotionName, percentageDiscountButton, discountPercent, promotionYear1, promotionMonth1, promotionDay1, promotionYear2, promotionMonth2, promotionDay2, promotionValue1, promotionValue2, promotionValue3, promoteInformation1, timeCount, partialName, checkBox, history, damage, speed, weight, weaponRemoval, maximumInventory, currentInventory, promoteDate1, promoteDate2, promoteDate3, promoteDate4, promoteDate5, promoteDate6, promoteInformation2, promoteInformation3, discount, indexStorage1, indexStorage2, indexStorage3, thousandNumber, MAX_Z, recoveryStorage, promoteDate7, promoteDate8, promoteDate9, promoteInformation4, promoteInformation5, promoteInformation6, promoteInformation7, promoteInformation8, promoteInformation9, indexStorage4, indexStorage5, indexStorage6, indexStorage7, indexStorage8, indexStorage9, addPartialValue1, addPartialValue2, addPartialValue3, addPartialValue4, addPartialValue5, addPartialValue6, addPartialValue7, addPartialValue8, addPartialValue9, tempYear, tempMonth, tempDay, createButton, discountMoney, loginNumber);
        }
        adminUi(sc, weaponName, recoveryWeaphone, day, price, kind, iValue, sequence, storage, storageValue, start, money, button, buyButton, adminId, adminPassword, accountInformation, loginButton, accountInformationButton, idType, userNumber, capacityValueButton, weaponInformation, categoryRemove, categoryButton, num_of_days, month, year, promotionName, percentageDiscountButton, discountPercent, promotionYear1, promotionMonth1, promotionDay1, promotionYear2, promotionMonth2, promotionDay2, promotionValue1, promotionValue2, promotionValue3, promoteInformation1, timeCount, partialName, checkBox, history, damage, speed, weight, weaponRemoval, maximumInventory, currentInventory, promoteDate1, promoteDate2, promoteDate3, promoteDate4, promoteDate5, promoteDate6, promoteInformation2, promoteInformation3, discount, indexStorage1, indexStorage2, indexStorage3, thousandNumber, MAX_Z, recoveryStorage, promoteDate7, promoteDate8, promoteDate9, promoteInformation4, promoteInformation5, promoteInformation6, promoteInformation7, promoteInformation8, promoteInformation9, indexStorage4, indexStorage5, indexStorage6, indexStorage7, indexStorage8, indexStorage9, addPartialValue1, addPartialValue2, addPartialValue3, addPartialValue4, addPartialValue5, addPartialValue6, addPartialValue7, addPartialValue8, addPartialValue9, tempYear, tempMonth, tempDay, createButton, discountMoney, loginNumber);
    }

    public static void stockFull(Scanner sc, String[] weaponName, int[] recoveryWeaphone, int day, int[] price, String[] kind, int iValue, int[] sequence, int[] storage, int storageValue, int start, long[] money, int button, int buyButton, String adminId, String adminPassword, String[] accountInformation, int loginButton, int accountInformationButton, String idType, int userNumber, int[] capacityValueButton, int[] weaponInformation, int[] categoryRemove, int categoryButton, int[] num_of_days, int month, int year, String[] promotionName, int percentageDiscountButton, int discountPercent, int promotionYear1, int promotionMonth1, int promotionDay1, int promotionYear2, int promotionMonth2, int promotionDay2, int promotionValue1, int promotionValue2, int promotionValue3, int[] promoteInformation1, int[] timeCount, String[] partialName, int[] checkBox, int[] history, int[] damage, int[] speed, int[] weight, int[] weaponRemoval, int[] maximumInventory, int[] currentInventory, int[] promoteDate1, int[] promoteDate2, int[] promoteDate3, int[] promoteDate4, int[] promoteDate5, int[] promoteDate6, int[] promoteInformation2, int[] promoteInformation3, int[] discount, int[] indexStorage1, int[] indexStorage2, int[] indexStorage3, int[] thousandNumber, int MAX_Z, int[] recoveryStorage, int[] promoteDate7, int[] promoteDate8, int[] promoteDate9, int[] promoteInformation4, int[] promoteInformation5, int[] promoteInformation6, int[] promoteInformation7, int[] promoteInformation8, int[] promoteInformation9, int[] indexStorage4, int[] indexStorage5, int[] indexStorage6, int[] indexStorage7, int[] indexStorage8, int[] indexStorage9, int[] addPartialValue1, int[] addPartialValue2, int[] addPartialValue3, int[] addPartialValue4, int[] addPartialValue5, int[] addPartialValue6, int[] addPartialValue7, int[] addPartialValue8, int[] addPartialValue9, int tempYear, int tempMonth, int tempDay, int createButton, int[] discountMoney, int loginNumber
    ) {
        System.out.println("어떤 종류의 무기를 선택할까요?");
        String j = sc.next();
        for (int i = 0; i <= categoryButton; i++) {
            if (j.equals(kind[i])) {
                iValue = i;
            }
        }
        for (int i = 0; i < sequence[iValue]; i++) {
            maximumInventory[iValue * 100 + i] = currentInventory[iValue * 100 + i];
        }
        iValue = -1;
        addPartial(sc, weaponName, recoveryWeaphone, day, price, kind, iValue, sequence, storage, storageValue, start, money, button, buyButton, adminId, adminPassword, accountInformation, loginButton, accountInformationButton, idType, userNumber, capacityValueButton, weaponInformation, categoryRemove, categoryButton, num_of_days, month, year, promotionName, percentageDiscountButton, discountPercent, promotionYear1, promotionMonth1, promotionDay1, promotionYear2, promotionMonth2, promotionDay2, promotionValue1, promotionValue2, promotionValue3, promoteInformation1, timeCount, partialName, checkBox, history, damage, speed, weight, weaponRemoval, maximumInventory, currentInventory, promoteDate1, promoteDate2, promoteDate3, promoteDate4, promoteDate5, promoteDate6, promoteInformation2, promoteInformation3, discount, indexStorage1, indexStorage2, indexStorage3, thousandNumber, MAX_Z, recoveryStorage, promoteDate7, promoteDate8, promoteDate9, promoteInformation4, promoteInformation5, promoteInformation6, promoteInformation7, promoteInformation8, promoteInformation9, indexStorage4, indexStorage5, indexStorage6, indexStorage7, indexStorage8, indexStorage9, addPartialValue1, addPartialValue2, addPartialValue3, addPartialValue4, addPartialValue5, addPartialValue6, addPartialValue7, addPartialValue8, addPartialValue9, tempYear, tempMonth, tempDay, createButton, discountMoney, loginNumber);
        adminUi(sc, weaponName, recoveryWeaphone, day, price, kind, iValue, sequence, storage, storageValue, start, money, button, buyButton, adminId, adminPassword, accountInformation, loginButton, accountInformationButton, idType, userNumber, capacityValueButton, weaponInformation, categoryRemove, categoryButton, num_of_days, month, year, promotionName, percentageDiscountButton, discountPercent, promotionYear1, promotionMonth1, promotionDay1, promotionYear2, promotionMonth2, promotionDay2, promotionValue1, promotionValue2, promotionValue3, promoteInformation1, timeCount, partialName, checkBox, history, damage, speed, weight, weaponRemoval, maximumInventory, currentInventory, promoteDate1, promoteDate2, promoteDate3, promoteDate4, promoteDate5, promoteDate6, promoteInformation2, promoteInformation3, discount, indexStorage1, indexStorage2, indexStorage3, thousandNumber, MAX_Z, recoveryStorage, promoteDate7, promoteDate8, promoteDate9, promoteInformation4, promoteInformation5, promoteInformation6, promoteInformation7, promoteInformation8, promoteInformation9, indexStorage4, indexStorage5, indexStorage6, indexStorage7, indexStorage8, indexStorage9, addPartialValue1, addPartialValue2, addPartialValue3, addPartialValue4, addPartialValue5, addPartialValue6, addPartialValue7, addPartialValue8, addPartialValue9, tempYear, tempMonth, tempDay, createButton, discountMoney, loginNumber);
    }

    public static void addWeaphone(Scanner sc, String[] weaponName, int[] recoveryWeaphone, int day, int[] price, String[] kind, int iValue, int[] sequence, int[] storage, int storageValue, int start, long[] money, int button, int buyButton, String adminId, String adminPassword, String[] accountInformation, int loginButton, int accountInformationButton, String idType, int userNumber, int[] capacityValueButton, int[] weaponInformation, int[] categoryRemove, int categoryButton, int[] num_of_days, int month, int year, String[] promotionName, int percentageDiscountButton, int discountPercent, int promotionYear1, int promotionMonth1, int promotionDay1, int promotionYear2, int promotionMonth2, int promotionDay2, int promotionValue1, int promotionValue2, int promotionValue3, int[] promoteInformation1, int[] timeCount, String[] partialName, int[] checkBox, int[] history, int[] damage, int[] speed, int[] weight, int[] weaponRemoval, int[] maximumInventory, int[] currentInventory, int[] promoteDate1, int[] promoteDate2, int[] promoteDate3, int[] promoteDate4, int[] promoteDate5, int[] promoteDate6, int[] promoteInformation2, int[] promoteInformation3, int[] discount, int[] indexStorage1, int[] indexStorage2, int[] indexStorage3, int[] thousandNumber, int MAX_Z, int[] recoveryStorage, int[] promoteDate7, int[] promoteDate8, int[] promoteDate9, int[] promoteInformation4, int[] promoteInformation5, int[] promoteInformation6, int[] promoteInformation7, int[] promoteInformation8, int[] promoteInformation9, int[] indexStorage4, int[] indexStorage5, int[] indexStorage6, int[] indexStorage7, int[] indexStorage8, int[] indexStorage9, int[] addPartialValue1, int[] addPartialValue2, int[] addPartialValue3, int[] addPartialValue4, int[] addPartialValue5, int[] addPartialValue6, int[] addPartialValue7, int[] addPartialValue8, int[] addPartialValue9, int tempYear, int tempMonth, int tempDay, int createButton, int[] discountMoney, int loginNumber) {
        System.out.println("어떤 종류의 무기를 추가하시겠습니까?");
        int p = 0;
        String b = sc.next();
        for (int i = 0; i <= categoryButton; i++) {
            if (b.equals(kind[i])) {
                p = i;
            }
        }
        System.out.println("무기추가 : 1. 이름, 2. 재고, 3. 손상, 4. 속도 5. 무게");
        weaponName[p * 100 + sequence[p]] = sc.next();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < sequence[i]; j++) {
                if (weaponName[p * 100 + sequence[p]].equals(weaponName[i * 100 + j]) && weaponRemoval[i * 100 + j] == 0) {
                    System.out.println("같은 이름을 가진 무기가 존재합니다. 다르게 설정해주세요");
                    addWeaphone(sc, weaponName, recoveryWeaphone, day, price, kind, iValue, sequence, storage, storageValue, start, money, button, buyButton, adminId, adminPassword, accountInformation, loginButton, accountInformationButton, idType, userNumber, capacityValueButton, weaponInformation, categoryRemove, categoryButton, num_of_days, month, year, promotionName, percentageDiscountButton, discountPercent, promotionYear1, promotionMonth1, promotionDay1, promotionYear2, promotionMonth2, promotionDay2, promotionValue1, promotionValue2, promotionValue3, promoteInformation1, timeCount, partialName, checkBox, history, damage, speed, weight, weaponRemoval, maximumInventory, currentInventory, promoteDate1, promoteDate2, promoteDate3, promoteDate4, promoteDate5, promoteDate6, promoteInformation2, promoteInformation3, discount, indexStorage1, indexStorage2, indexStorage3, thousandNumber, MAX_Z, recoveryStorage, promoteDate7, promoteDate8, promoteDate9, promoteInformation4, promoteInformation5, promoteInformation6, promoteInformation7, promoteInformation8, promoteInformation9, indexStorage4, indexStorage5, indexStorage6, indexStorage7, indexStorage8, indexStorage9, addPartialValue1, addPartialValue2, addPartialValue3, addPartialValue4, addPartialValue5, addPartialValue6, addPartialValue7, addPartialValue8, addPartialValue9, tempYear, tempMonth, tempDay, createButton, discountMoney, loginNumber);
                }
            }
        }
        maximumInventory[p * 100 + sequence[p]] = sc.nextInt();
        currentInventory[p * 100 + sequence[p]] = maximumInventory[p * 100 + sequence[p]];
        damage[p * 100 + sequence[p]] = sc.nextInt();
        speed[p * 100 + sequence[p]] = sc.nextInt();
        weight[p * 100 + sequence[p]] = sc.nextInt();
        iValue = p;
        sequence[p]++;

        System.out.println("추가된 무기의 무기 리스트");
        addPartial(sc, weaponName, recoveryWeaphone, day, price, kind, iValue, sequence, storage, storageValue, start, money, button, buyButton, adminId, adminPassword, accountInformation, loginButton, accountInformationButton, idType, userNumber, capacityValueButton, weaponInformation, categoryRemove, categoryButton, num_of_days, month, year, promotionName, percentageDiscountButton, discountPercent, promotionYear1, promotionMonth1, promotionDay1, promotionYear2, promotionMonth2, promotionDay2, promotionValue1, promotionValue2, promotionValue3, promoteInformation1, timeCount, partialName, checkBox, history, damage, speed, weight, weaponRemoval, maximumInventory, currentInventory, promoteDate1, promoteDate2, promoteDate3, promoteDate4, promoteDate5, promoteDate6, promoteInformation2, promoteInformation3, discount, indexStorage1, indexStorage2, indexStorage3, thousandNumber, MAX_Z, recoveryStorage, promoteDate7, promoteDate8, promoteDate9, promoteInformation4, promoteInformation5, promoteInformation6, promoteInformation7, promoteInformation8, promoteInformation9, indexStorage4, indexStorage5, indexStorage6, indexStorage7, indexStorage8, indexStorage9, addPartialValue1, addPartialValue2, addPartialValue3, addPartialValue4, addPartialValue5, addPartialValue6, addPartialValue7, addPartialValue8, addPartialValue9, tempYear, tempMonth, tempDay, createButton, discountMoney, loginNumber);
        adminUi(sc, weaponName, recoveryWeaphone, day, price, kind, iValue, sequence, storage, storageValue, start, money, button, buyButton, adminId, adminPassword, accountInformation, loginButton, accountInformationButton, idType, userNumber, capacityValueButton, weaponInformation, categoryRemove, categoryButton, num_of_days, month, year, promotionName, percentageDiscountButton, discountPercent, promotionYear1, promotionMonth1, promotionDay1, promotionYear2, promotionMonth2, promotionDay2, promotionValue1, promotionValue2, promotionValue3, promoteInformation1, timeCount, partialName, checkBox, history, damage, speed, weight, weaponRemoval, maximumInventory, currentInventory, promoteDate1, promoteDate2, promoteDate3, promoteDate4, promoteDate5, promoteDate6, promoteInformation2, promoteInformation3, discount, indexStorage1, indexStorage2, indexStorage3, thousandNumber, MAX_Z, recoveryStorage, promoteDate7, promoteDate8, promoteDate9, promoteInformation4, promoteInformation5, promoteInformation6, promoteInformation7, promoteInformation8, promoteInformation9, indexStorage4, indexStorage5, indexStorage6, indexStorage7, indexStorage8, indexStorage9, addPartialValue1, addPartialValue2, addPartialValue3, addPartialValue4, addPartialValue5, addPartialValue6, addPartialValue7, addPartialValue8, addPartialValue9, tempYear, tempMonth, tempDay, createButton, discountMoney, loginNumber);

    }

    public static void removeWeaphone(Scanner sc, String[] weaponName, int[] recoveryWeaphone, int day, int[] price, String[] kind, int iValue, int[] sequence, int[] storage, int storageValue, int start, long[] money, int button, int buyButton, String adminId, String adminPassword, String[] accountInformation, int loginButton, int accountInformationButton, String idType, int userNumber, int[] capacityValueButton, int[] weaponInformation, int[] categoryRemove, int categoryButton, int[] num_of_days, int month, int year, String[] promotionName, int percentageDiscountButton, int discountPercent, int promotionYear1, int promotionMonth1, int promotionDay1, int promotionYear2, int promotionMonth2, int promotionDay2, int promotionValue1, int promotionValue2, int promotionValue3, int[] promoteInformation1, int[] timeCount, String[] partialName, int[] checkBox, int[] history, int[] damage, int[] speed, int[] weight, int[] weaponRemoval, int[] maximumInventory, int[] currentInventory, int[] promoteDate1, int[] promoteDate2, int[] promoteDate3, int[] promoteDate4, int[] promoteDate5, int[] promoteDate6, int[] promoteInformation2, int[] promoteInformation3, int[] discount, int[] indexStorage1, int[] indexStorage2, int[] indexStorage3, int[] thousandNumber, int MAX_Z, int[] recoveryStorage, int[] promoteDate7, int[] promoteDate8, int[] promoteDate9, int[] promoteInformation4, int[] promoteInformation5, int[] promoteInformation6, int[] promoteInformation7, int[] promoteInformation8, int[] promoteInformation9, int[] indexStorage4, int[] indexStorage5, int[] indexStorage6, int[] indexStorage7, int[] indexStorage8, int[] indexStorage9, int[] addPartialValue1, int[] addPartialValue2, int[] addPartialValue3, int[] addPartialValue4, int[] addPartialValue5, int[] addPartialValue6, int[] addPartialValue7, int[] addPartialValue8, int[] addPartialValue9, int tempYear, int tempMonth, int tempDay, int createButton, int[] discountMoney, int loginNumber
    ) {
        System.out.println("어떤 무기를 삭제할까요? 이름을 적어주세요.");
        String removeName = sc.next();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < sequence[i]; j++) {
                if (removeName.equals(weaponName[i * 100 + j])) {
                    weaponName[i * 100 + j] = "";
                    weaponRemoval[i * 100 + j] = 1;
                    iValue = i;
                    System.out.println("제거된 무기의 무기 리스트");
                }
            }
        }
        addPartial(sc, weaponName, recoveryWeaphone, day, price, kind, iValue, sequence, storage, storageValue, start, money, button, buyButton, adminId, adminPassword, accountInformation, loginButton, accountInformationButton, idType, userNumber, capacityValueButton, weaponInformation, categoryRemove, categoryButton, num_of_days, month, year, promotionName, percentageDiscountButton, discountPercent, promotionYear1, promotionMonth1, promotionDay1, promotionYear2, promotionMonth2, promotionDay2, promotionValue1, promotionValue2, promotionValue3, promoteInformation1, timeCount, partialName, checkBox, history, damage, speed, weight, weaponRemoval, maximumInventory, currentInventory, promoteDate1, promoteDate2, promoteDate3, promoteDate4, promoteDate5, promoteDate6, promoteInformation2, promoteInformation3, discount, indexStorage1, indexStorage2, indexStorage3, thousandNumber, MAX_Z, recoveryStorage, promoteDate7, promoteDate8, promoteDate9, promoteInformation4, promoteInformation5, promoteInformation6, promoteInformation7, promoteInformation8, promoteInformation9, indexStorage4, indexStorage5, indexStorage6, indexStorage7, indexStorage8, indexStorage9, addPartialValue1, addPartialValue2, addPartialValue3, addPartialValue4, addPartialValue5, addPartialValue6, addPartialValue7, addPartialValue8, addPartialValue9, tempYear, tempMonth, tempDay, createButton, discountMoney, loginNumber);
        iValue = -1;
        adminUi(sc, weaponName, recoveryWeaphone, day, price, kind, iValue, sequence, storage, storageValue, start, money, button, buyButton, adminId, adminPassword, accountInformation, loginButton, accountInformationButton, idType, userNumber, capacityValueButton, weaponInformation, categoryRemove, categoryButton, num_of_days, month, year, promotionName, percentageDiscountButton, discountPercent, promotionYear1, promotionMonth1, promotionDay1, promotionYear2, promotionMonth2, promotionDay2, promotionValue1, promotionValue2, promotionValue3, promoteInformation1, timeCount, partialName, checkBox, history, damage, speed, weight, weaponRemoval, maximumInventory, currentInventory, promoteDate1, promoteDate2, promoteDate3, promoteDate4, promoteDate5, promoteDate6, promoteInformation2, promoteInformation3, discount, indexStorage1, indexStorage2, indexStorage3, thousandNumber, MAX_Z, recoveryStorage, promoteDate7, promoteDate8, promoteDate9, promoteInformation4, promoteInformation5, promoteInformation6, promoteInformation7, promoteInformation8, promoteInformation9, indexStorage4, indexStorage5, indexStorage6, indexStorage7, indexStorage8, indexStorage9, addPartialValue1, addPartialValue2, addPartialValue3, addPartialValue4, addPartialValue5, addPartialValue6, addPartialValue7, addPartialValue8, addPartialValue9, tempYear, tempMonth, tempDay, createButton, discountMoney, loginNumber);

    }

    public static void addPartial(Scanner sc, String[] weaponName, int[] recoveryWeaphone, int day, int[] price, String[] kind, int iValue, int[] sequence, int[] storage, int storageValue, int start, long[] money, int button, int buyButton, String adminId, String adminPassword, String[] accountInformation, int loginButton, int accountInformationButton, String idType, int userNumber, int[] capacityValueButton, int[] weaponInformation, int[] categoryRemove, int categoryButton, int[] num_of_days, int month, int year, String[] promotionName, int percentageDiscountButton, int discountPercent, int promotionYear1, int promotionMonth1, int promotionDay1, int promotionYear2, int promotionMonth2, int promotionDay2, int promotionValue1, int promotionValue2, int promotionValue3, int[] promoteInformation1, int[] timeCount, String[] partialName, int[] checkBox, int[] history, int[] damage, int[] speed, int[] weight, int[] weaponRemoval, int[] maximumInventory, int[] currentInventory, int[] promoteDate1, int[] promoteDate2, int[] promoteDate3, int[] promoteDate4, int[] promoteDate5, int[] promoteDate6, int[] promoteInformation2, int[] promoteInformation3, int[] discount, int[] indexStorage1, int[] indexStorage2, int[] indexStorage3, int[] thousandNumber, int MAX_Z, int[] recoveryStorage, int[] promoteDate7, int[] promoteDate8, int[] promoteDate9, int[] promoteInformation4, int[] promoteInformation5, int[] promoteInformation6, int[] promoteInformation7, int[] promoteInformation8, int[] promoteInformation9, int[] indexStorage4, int[] indexStorage5, int[] indexStorage6, int[] indexStorage7, int[] indexStorage8, int[] indexStorage9, int[] addPartialValue1, int[] addPartialValue2, int[] addPartialValue3, int[] addPartialValue4, int[] addPartialValue5, int[] addPartialValue6, int[] addPartialValue7, int[] addPartialValue8, int[] addPartialValue9, int tempYear, int tempMonth, int tempDay, int createButton, int[] discountMoney, int loginNumber
    ) {
        int a = 0;
        int partialButton = 0;
        System.out.println("현재 진행중인 프로모션들도 나타납니다.");
        System.out.printf("---%s---\n", kind[iValue]);

        for (int i = 0; i < sequence[iValue]; i++) {
            for (int m = 0; m < addPartialValue2[iValue * 100 + i]; m++) {
                if (promoteInformation2[iValue * 2000 + i * 20 + m] >= 2000 && promoteInformation2[iValue * 2000 + i * 20 + m] < 2020) {
                    partialName[0] = "[%할인]";
                }
            }
            for (int m = 0; m < addPartialValue5[iValue * 100 + i]; m++) {
                if (promoteInformation5[iValue * 2000 + i * 20 + m] >= 5000 && promoteInformation5[iValue * 2000 + i * 20 + m] < 5020) {
                    partialName[1] = "[1+1 무료]";
                }
            }
            for (int m = 0; m < addPartialValue8[iValue * 100 + i]; m++) {
                if (promoteInformation8[iValue * 2000 + i * 20 + m] >= 8000 && promoteInformation8[iValue * 2000 + i * 20 + m] < 8020) {
                    partialName[2] = "[금액할인]";
                }
            }
            if (weaponRemoval[iValue * 100 + i] == 0) {
                if (checkBox[iValue * 100 + i] == 0) {
                    System.out.printf("%-4s : 재고: %-3d/%-3d 손상: %-4d 속도: %-4d 무게: %-4d %s%s%s\n", weaponName[iValue * 100 + i], currentInventory[iValue * 100 + i], maximumInventory[iValue * 100 + i], damage[iValue * 100 + i], speed[iValue * 100 + i], weight[iValue * 100 + i], partialName[0], partialName[1], partialName[2]);
                } else {
                    System.out.printf("%-4s : 재고: %-3d/%-3d 손상: %-4d 속도: %-4d 무게: %-4d %s%s%s ✔[선택함] \n", weaponName[iValue * 100 + i], currentInventory[iValue * 100 + i], maximumInventory[iValue * 100 + i], damage[iValue * 100 + i], speed[iValue * 100 + i], weight[iValue * 100 + i], partialName[0], partialName[1], partialName[2]);
                }
            }

            for (int j = 2000; j < 2020; j++) {
                for (int k = 0; k < addPartialValue2[iValue * 100 + i]; k++) {
                    if (promoteInformation2[iValue * 2000 + i * 20 + k] == j) {
                        partialButton = 1;
                        System.out.printf("[%d년 %d월 %d일 ~ %d년 %d월 %d일] : %d%%할인\n", promoteDate2[iValue * 12000 + i * 120 + 6 * k + 0], promoteDate2[iValue * 12000 + i * 120 + 6 * k + 1], promoteDate2[iValue * 12000 + i * 120 + 6 * k + 2], promoteDate2[iValue * 12000 + i * 120 + 6 * k + 3], promoteDate2[iValue * 12000 + i * 120 + 6 * k + 4], promoteDate2[iValue * 12000 + i * 120 + 6 * k + 5], discount[iValue * 2000 + i * 20 + k]);
                    }
                }
            }
            for (int j = 5000; j < 5020; j++) {
                for (int k = 0; k < addPartialValue5[iValue * 100 + i]; k++) {
                    if (promoteInformation5[iValue * 2000 + i * 20 + k] == j) {
                        partialButton = 1;
                        System.out.printf("[%d년 %d월 %d일 ~ %d년 %d월 %d일] : [1 + 1 무료]\n", promoteDate5[iValue * 12000 + i * 120 + 6 * k + 0], promoteDate5[iValue * 12000 + i * 120 + 6 * k + 1], promoteDate5[iValue * 12000 + i * 120 + 6 * k + 2], promoteDate5[iValue * 12000 + i * 120 + 6 * k + 3], promoteDate5[iValue * 12000 + i * 120 + 6 * k + 4], promoteDate5[iValue * 12000 + i * 120 + 6 * k + 5]);
                    }
                }
            }
            for (int j = 8000; j < 8020; j++) {
                for (int k = 0; k < addPartialValue8[iValue * 100 + i]; k++) {
                    if (promoteInformation8[iValue * 2000 + i * 20 + k] == j) {
                        partialButton = 1;
                        System.out.printf("[%d년 %d월 %d일 ~ %d년 %d월 %d일] : %d원 할인\n", promoteDate8[iValue * 12000 + i * 120 + 6 * k + 0], promoteDate8[iValue * 12000 + i * 120 + 6 * k + 1], promoteDate8[iValue * 12000 + i * 120 + 6 * k + 2], promoteDate8[iValue * 12000 + i * 120 + 6 * k + 3], promoteDate8[iValue * 12000 + i * 120 + 6 * k + 4], promoteDate8[iValue * 12000 + i * 120 + 6 * k + 5], discount[iValue * 2000 + i * 20 + k]);
                    }
                }
            }

            partialName[0] = "";
            partialName[1] = "";
            partialName[2] = "";


        }

        //[iValue * 2000 + i * 20 + indexStorage3[iValue * 100 + i]]

    }

    /*
    물품에 어떤 프로모션인지 몇퍼센트 할인인지 1 + 1인지 할인이벤트인지 나와야됨
    weaphonInformation[무기종류][무기번호][5] = 어떤 프로모션인지 몇퍼센트 1 , 1+ 1 = 2 할인이벤트면 3
     */

    public static void recoveryCategory(Scanner sc, String[] weaponName, int[] recoveryWeaphone, int day, int[] price, String[] kind, int iValue, int[] sequence, int[] storage, int storageValue, int start, long[] money, int button, int buyButton, String adminId, String adminPassword, String[] accountInformation, int loginButton, int accountInformationButton, String idType, int userNumber, int[] capacityValueButton, int[] weaponInformation, int[] categoryRemove, int categoryButton, int[] num_of_days, int month, int year, String[] promotionName, int percentageDiscountButton, int discountPercent, int promotionYear1, int promotionMonth1, int promotionDay1, int promotionYear2, int promotionMonth2, int promotionDay2, int promotionValue1, int promotionValue2, int promotionValue3, int[] promoteInformation1, int[] timeCount, String[] partialName, int[] checkBox, int[] history, int[] damage, int[] speed, int[] weight, int[] weaponRemoval, int[] maximumInventory, int[] currentInventory, int[] promoteDate1, int[] promoteDate2, int[] promoteDate3, int[] promoteDate4, int[] promoteDate5, int[] promoteDate6, int[] promoteInformation2, int[] promoteInformation3, int[] discount, int[] indexStorage1, int[] indexStorage2, int[] indexStorage3, int[] thousandNumber, int MAX_Z, int[] recoveryStorage, int[] promoteDate7, int[] promoteDate8, int[] promoteDate9, int[] promoteInformation4, int[] promoteInformation5, int[] promoteInformation6, int[] promoteInformation7, int[] promoteInformation8, int[] promoteInformation9, int[] indexStorage4, int[] indexStorage5, int[] indexStorage6, int[] indexStorage7, int[] indexStorage8, int[] indexStorage9, int[] addPartialValue1, int[] addPartialValue2, int[] addPartialValue3, int[] addPartialValue4, int[] addPartialValue5, int[] addPartialValue6, int[] addPartialValue7, int[] addPartialValue8, int[] addPartialValue9, int tempYear, int tempMonth, int tempDay, int createButton, int[] discountMoney, int loginNumber
    ) {
        System.out.println("카테고리를 회복합니다. 제거된 카테고리 목록입니다. 입력해주세요");
        for (int i = 0; i < 100; i++) {
            if (categoryRemove[i] == 1) {
                System.out.println(kind[i]);
            }
        }
        String recoveredCategories = sc.next();
        int check = 0;
        for (int i = 0; i < 100; i++) {
            if (recoveredCategories.equals(kind[i])) {
                categoryRemove[i] = 0;
                iValue = i;
                check = 1;
            }
        }
        if (check == 0) {
            System.out.println("알맞지 않는 입력입니다.");
            adminUi(sc, weaponName, recoveryWeaphone, day, price, kind, iValue, sequence, storage, storageValue, start, money, button, buyButton, adminId, adminPassword, accountInformation, loginButton, accountInformationButton, idType, userNumber, capacityValueButton, weaponInformation, categoryRemove, categoryButton, num_of_days, month, year, promotionName, percentageDiscountButton, discountPercent, promotionYear1, promotionMonth1, promotionDay1, promotionYear2, promotionMonth2, promotionDay2, promotionValue1, promotionValue2, promotionValue3, promoteInformation1, timeCount, partialName, checkBox, history, damage, speed, weight, weaponRemoval, maximumInventory, currentInventory, promoteDate1, promoteDate2, promoteDate3, promoteDate4, promoteDate5, promoteDate6, promoteInformation2, promoteInformation3, discount, indexStorage1, indexStorage2, indexStorage3, thousandNumber, MAX_Z, recoveryStorage, promoteDate7, promoteDate8, promoteDate9, promoteInformation4, promoteInformation5, promoteInformation6, promoteInformation7, promoteInformation8, promoteInformation9, indexStorage4, indexStorage5, indexStorage6, indexStorage7, indexStorage8, indexStorage9, addPartialValue1, addPartialValue2, addPartialValue3, addPartialValue4, addPartialValue5, addPartialValue6, addPartialValue7, addPartialValue8, addPartialValue9, tempYear, tempMonth, tempDay, createButton, discountMoney, loginNumber);
        }
        addPartial(sc, weaponName, recoveryWeaphone, day, price, kind, iValue, sequence, storage, storageValue, start, money, button, buyButton, adminId, adminPassword, accountInformation, loginButton, accountInformationButton, idType, userNumber, capacityValueButton, weaponInformation, categoryRemove, categoryButton, num_of_days, month, year, promotionName, percentageDiscountButton, discountPercent, promotionYear1, promotionMonth1, promotionDay1, promotionYear2, promotionMonth2, promotionDay2, promotionValue1, promotionValue2, promotionValue3, promoteInformation1, timeCount, partialName, checkBox, history, damage, speed, weight, weaponRemoval, maximumInventory, currentInventory, promoteDate1, promoteDate2, promoteDate3, promoteDate4, promoteDate5, promoteDate6, promoteInformation2, promoteInformation3, discount, indexStorage1, indexStorage2, indexStorage3, thousandNumber, MAX_Z, recoveryStorage, promoteDate7, promoteDate8, promoteDate9, promoteInformation4, promoteInformation5, promoteInformation6, promoteInformation7, promoteInformation8, promoteInformation9, indexStorage4, indexStorage5, indexStorage6, indexStorage7, indexStorage8, indexStorage9, addPartialValue1, addPartialValue2, addPartialValue3, addPartialValue4, addPartialValue5, addPartialValue6, addPartialValue7, addPartialValue8, addPartialValue9, tempYear, tempMonth, tempDay, createButton, discountMoney, loginNumber);
        adminUi(sc, weaponName, recoveryWeaphone, day, price, kind, iValue, sequence, storage, storageValue, start, money, button, buyButton, adminId, adminPassword, accountInformation, loginButton, accountInformationButton, idType, userNumber, capacityValueButton, weaponInformation, categoryRemove, categoryButton, num_of_days, month, year, promotionName, percentageDiscountButton, discountPercent, promotionYear1, promotionMonth1, promotionDay1, promotionYear2, promotionMonth2, promotionDay2, promotionValue1, promotionValue2, promotionValue3, promoteInformation1, timeCount, partialName, checkBox, history, damage, speed, weight, weaponRemoval, maximumInventory, currentInventory, promoteDate1, promoteDate2, promoteDate3, promoteDate4, promoteDate5, promoteDate6, promoteInformation2, promoteInformation3, discount, indexStorage1, indexStorage2, indexStorage3, thousandNumber, MAX_Z, recoveryStorage, promoteDate7, promoteDate8, promoteDate9, promoteInformation4, promoteInformation5, promoteInformation6, promoteInformation7, promoteInformation8, promoteInformation9, indexStorage4, indexStorage5, indexStorage6, indexStorage7, indexStorage8, indexStorage9, addPartialValue1, addPartialValue2, addPartialValue3, addPartialValue4, addPartialValue5, addPartialValue6, addPartialValue7, addPartialValue8, addPartialValue9, tempYear, tempMonth, tempDay, createButton, discountMoney, loginNumber);

    }

    /**
     * 특정 기간 동안 가장 많이 팔린 품목에 대한 보고서 생성
     */
    public static void createReport(Scanner sc, String[] weaponName, int[] recoveryWeaphone, int day, int[] price, String[] kind, int iValue, int[] sequence, int[] storage, int storageValue, int start, long[] money, int button, int buyButton, String adminId, String adminPassword, String[] accountInformation, int loginButton, int accountInformationButton, String idType, int userNumber, int[] capacityValueButton, int[] weaponInformation, int[] categoryRemove, int categoryButton, int[] num_of_days, int month, int year, String[] promotionName, int percentageDiscountButton, int discountPercent, int promotionYear1, int promotionMonth1, int promotionDay1, int promotionYear2, int promotionMonth2, int promotionDay2, int promotionValue1, int promotionValue2, int promotionValue3, int[] promoteInformation1, int[] timeCount, String[] partialName, int[] checkBox, int[] history, int[] damage, int[] speed, int[] weight, int[] weaponRemoval, int[] maximumInventory, int[] currentInventory, int[] promoteDate1, int[] promoteDate2, int[] promoteDate3, int[] promoteDate4, int[] promoteDate5, int[] promoteDate6, int[] promoteInformation2, int[] promoteInformation3, int[] discount, int[] indexStorage1, int[] indexStorage2, int[] indexStorage3, int[] thousandNumber, int MAX_Z, int[] recoveryStorage, int[] promoteDate7, int[] promoteDate8, int[] promoteDate9, int[] promoteInformation4, int[] promoteInformation5, int[] promoteInformation6, int[] promoteInformation7, int[] promoteInformation8, int[] promoteInformation9, int[] indexStorage4, int[] indexStorage5, int[] indexStorage6, int[] indexStorage7, int[] indexStorage8, int[] indexStorage9, int[] addPartialValue1, int[] addPartialValue2, int[] addPartialValue3, int[] addPartialValue4, int[] addPartialValue5, int[] addPartialValue6, int[] addPartialValue7, int[] addPartialValue8, int[] addPartialValue9, int tempYear, int tempMonth, int tempDay, int createButton, int[] discountMoney, int loginNumber
    ) {
        System.out.println("특정시기의 사용자가 가장 많이 구매한 품목에 대한 보고서를 생성합니다.");
        int reportYear1 = sc.nextInt();
        int reportMonth1 = sc.nextInt();
        int reportDay1 = sc.nextInt();

        int reportYear2 = sc.nextInt();
        int reportMonth2 = sc.nextInt();
        int reportDay2 = sc.nextInt();

        /**
         * 리포트를 생성하기위해 특정기간동안 가장 많이 판 품목에 대한 보고서를 만든다.
         *
         * 구매를 하면
         * 누가? 아이디 몇년 몇 월 몇일에 몇개 샀는지 기록에 남는다.
         *
         *[0]= accountInformation[?]
         * [1] = 몇년
         * [2] = 몇월
         * [3] = 몇일
         * [4] = 몇개
         * [5] = 무기이름 weaponName
         * [6] = 무기종류
         * [7]
         * 아직 진행 중 미완성 중입니다. 면접 불러주시면 최대한 완성형에 가깝게 구축하겠습니다!
         */

    }


    public static void createPromotion(Scanner sc, String[] weaponName, int[] recoveryWeaphone, int day, int[] price, String[] kind, int iValue, int[] sequence, int[] storage, int storageValue, int start, long[] money, int button, int buyButton, String adminId, String adminPassword, String[] accountInformation, int loginButton, int accountInformationButton, String idType, int userNumber, int[] capacityValueButton, int[] weaponInformation, int[] categoryRemove, int categoryButton, int[] num_of_days, int month, int year, String[] promotionName, int percentageDiscountButton, int discountPercent, int promotionYear1, int promotionMonth1, int promotionDay1, int promotionYear2, int promotionMonth2, int promotionDay2, int promotionValue1, int promotionValue2, int promotionValue3, int[] promoteInformation1, int[] timeCount, String[] partialName, int[] checkBox, int[] history, int[] damage, int[] speed, int[] weight, int[] weaponRemoval, int[] maximumInventory, int[] currentInventory, int[] promoteDate1, int[] promoteDate2, int[] promoteDate3, int[] promoteDate4, int[] promoteDate5, int[] promoteDate6, int[] promoteInformation2, int[] promoteInformation3, int[] discount, int[] indexStorage1, int[] indexStorage2, int[] indexStorage3, int[] thousandNumber, int MAX_Z, int[] recoveryStorage, int[] promoteDate7, int[] promoteDate8, int[] promoteDate9, int[] promoteInformation4, int[] promoteInformation5, int[] promoteInformation6, int[] promoteInformation7, int[] promoteInformation8, int[] promoteInformation9, int[] indexStorage4, int[] indexStorage5, int[] indexStorage6, int[] indexStorage7, int[] indexStorage8, int[] indexStorage9, int[] addPartialValue1, int[] addPartialValue2, int[] addPartialValue3, int[] addPartialValue4, int[] addPartialValue5, int[] addPartialValue6, int[] addPartialValue7, int[] addPartialValue8, int[] addPartialValue9, int tempYear, int tempMonth, int tempDay, int createButton, int[] discountMoney, int loginNumber
    ) {
        System.out.println("프로모션을 만듭니다.");
        System.out.println("1. 백분율 할인");
        System.out.println("2. 1+1 무료");
        System.out.println("3. 할인 거래");
        int u = sc.nextInt();

        if (u == 1) {
            System.out.println("몇 퍼를 할인하시겠습니까?");
            while (true) {
                discountPercent = sc.nextInt();
                if (discountPercent > 0 && discountPercent <= 100) {
                    break;
                }
                System.out.println("0미만 100초과의 수는 입력할 수 없습니다.");
            }
            System.out.printf("현재날짜는 %d년 %d월 %d일입니다. 그 이후의 날짜를 입력해주세요\n", year, month, day);
            System.out.println("시작일 년도, 월, 일 만료일 년도, 월, 일을 공백을 구분해서 차례대로 적어주세요. ");
            System.out.println("예시 2023 5 6 2023 5 6");
            promotionYear1 = sc.nextInt();
            promotionMonth1 = sc.nextInt();
            promotionDay1 = sc.nextInt();

            promotionYear2 = sc.nextInt();
            promotionMonth2 = sc.nextInt();
            promotionDay2 = sc.nextInt();
            if (((promotionYear1 < year) || (promotionYear1 == year && promotionMonth1 < month) || (promotionYear1 == year && promotionMonth1 == month && promotionDay1 < day)) ||
                    ((promotionYear1 > promotionYear2) || (promotionYear1 == promotionYear2 && promotionMonth1 > promotionMonth2) || (promotionYear1 == promotionYear2 && promotionMonth1 == promotionMonth2 && promotionDay1 > promotionDay2))) {
                System.out.println("날짜가 현재 날짜보다 뒤에 있거나 두개의 날짜가 맞지 않습니다. 관리자페이지로 돌아갑니다.");
                adminUi(sc, weaponName, recoveryWeaphone, day, price, kind, iValue, sequence, storage, storageValue, start, money, button, buyButton, adminId, adminPassword, accountInformation, loginButton, accountInformationButton, idType, userNumber, capacityValueButton, weaponInformation, categoryRemove, categoryButton, num_of_days, month, year, promotionName, percentageDiscountButton, discountPercent, promotionYear1, promotionMonth1, promotionDay1, promotionYear2, promotionMonth2, promotionDay2, promotionValue1, promotionValue2, promotionValue3, promoteInformation1, timeCount, partialName, checkBox, history, damage, speed, weight, weaponRemoval, maximumInventory, currentInventory, promoteDate1, promoteDate2, promoteDate3, promoteDate4, promoteDate5, promoteDate6, promoteInformation2, promoteInformation3, discount, indexStorage1, indexStorage2, indexStorage3, thousandNumber, MAX_Z, recoveryStorage, promoteDate7, promoteDate8, promoteDate9, promoteInformation4, promoteInformation5, promoteInformation6, promoteInformation7, promoteInformation8, promoteInformation9, indexStorage4, indexStorage5, indexStorage6, indexStorage7, indexStorage8, indexStorage9, addPartialValue1, addPartialValue2, addPartialValue3, addPartialValue4, addPartialValue5, addPartialValue6, addPartialValue7, addPartialValue8, addPartialValue9, tempYear, tempMonth, tempDay, createButton, discountMoney, loginNumber);
            }
            PercentageDiscount(sc, weaponName, recoveryWeaphone, day, price, kind, iValue, sequence, storage, storageValue, start, money, button, buyButton, adminId, adminPassword, accountInformation, loginButton, accountInformationButton, idType, userNumber, capacityValueButton, weaponInformation, categoryRemove, categoryButton, num_of_days, month, year, promotionName, percentageDiscountButton, discountPercent, promotionYear1, promotionMonth1, promotionDay1, promotionYear2, promotionMonth2, promotionDay2, promotionValue1, promotionValue2, promotionValue3, promoteInformation1, timeCount, partialName, checkBox, history, damage, speed, weight, weaponRemoval, maximumInventory, currentInventory, promoteDate1, promoteDate2, promoteDate3, promoteDate4, promoteDate5, promoteDate6, promoteInformation2, promoteInformation3, discount, indexStorage1, indexStorage2, indexStorage3, thousandNumber, MAX_Z, recoveryStorage, promoteDate7, promoteDate8, promoteDate9, promoteInformation4, promoteInformation5, promoteInformation6, promoteInformation7, promoteInformation8, promoteInformation9, indexStorage4, indexStorage5, indexStorage6, indexStorage7, indexStorage8, indexStorage9, addPartialValue1, addPartialValue2, addPartialValue3, addPartialValue4, addPartialValue5, addPartialValue6, addPartialValue7, addPartialValue8, addPartialValue9, tempYear, tempMonth, tempDay, createButton, discountMoney, loginNumber);
        } else if (u == 2) {
            //percentageDiscount를 구현했으므르로 2번과 3번은 비교적 쉽게 구현할 수 있다. 따라서 나머지 부분을 개발하고, 덧붙여나가면 됨

            System.out.printf("현재날짜는 %d년 %d월 %d일입니다. 그 이후의 날짜를 입력해주세요\n", year, month, day);
            System.out.println("시작일 년도, 월, 일 만료일 년도, 월, 일을 공백을 구분해서 차례대로 적어주세요.");
            System.out.println("예시 2023 5 6 2023 5 6");
            promotionYear1 = sc.nextInt();
            promotionMonth1 = sc.nextInt();
            promotionDay1 = sc.nextInt();

            promotionYear2 = sc.nextInt();
            promotionMonth2 = sc.nextInt();
            promotionDay2 = sc.nextInt();
            if (((promotionYear1 < year) || (promotionYear1 == year && promotionMonth1 < month) || (promotionYear1 == year && promotionMonth1 == month && promotionDay1 < day)) ||
                    ((promotionYear1 > promotionYear2) || (promotionYear1 == promotionYear2 && promotionMonth1 > promotionMonth2) || (promotionYear1 == promotionYear2 && promotionMonth1 == promotionMonth2 && promotionDay1 > promotionDay2))) {
                System.out.println("날짜가 현재 날짜보다 뒤에 있거나 두개의 날짜가 맞지 않습니다. 관리자페이지로 돌아갑니다.");
                adminUi(sc, weaponName, recoveryWeaphone, day, price, kind, iValue, sequence, storage, storageValue, start, money, button, buyButton, adminId, adminPassword, accountInformation, loginButton, accountInformationButton, idType, userNumber, capacityValueButton, weaponInformation, categoryRemove, categoryButton, num_of_days, month, year, promotionName, percentageDiscountButton, discountPercent, promotionYear1, promotionMonth1, promotionDay1, promotionYear2, promotionMonth2, promotionDay2, promotionValue1, promotionValue2, promotionValue3, promoteInformation1, timeCount, partialName, checkBox, history, damage, speed, weight, weaponRemoval, maximumInventory, currentInventory, promoteDate1, promoteDate2, promoteDate3, promoteDate4, promoteDate5, promoteDate6, promoteInformation2, promoteInformation3, discount, indexStorage1, indexStorage2, indexStorage3, thousandNumber, MAX_Z, recoveryStorage, promoteDate7, promoteDate8, promoteDate9, promoteInformation4, promoteInformation5, promoteInformation6, promoteInformation7, promoteInformation8, promoteInformation9, indexStorage4, indexStorage5, indexStorage6, indexStorage7, indexStorage8, indexStorage9, addPartialValue1, addPartialValue2, addPartialValue3, addPartialValue4, addPartialValue5, addPartialValue6, addPartialValue7, addPartialValue8, addPartialValue9, tempYear, tempMonth, tempDay, createButton, discountMoney, loginNumber);
            }

            onePlusOne(sc, weaponName, recoveryWeaphone, day, price, kind, iValue, sequence, storage, storageValue, start, money, button, buyButton, adminId, adminPassword, accountInformation, loginButton, accountInformationButton, idType, userNumber, capacityValueButton, weaponInformation, categoryRemove, categoryButton, num_of_days, month, year, promotionName, percentageDiscountButton, discountPercent, promotionYear1, promotionMonth1, promotionDay1, promotionYear2, promotionMonth2, promotionDay2, promotionValue1, promotionValue2, promotionValue3, promoteInformation1, timeCount, partialName, checkBox, history, damage, speed, weight, weaponRemoval, maximumInventory, currentInventory, promoteDate1, promoteDate2, promoteDate3, promoteDate4, promoteDate5, promoteDate6, promoteInformation2, promoteInformation3, discount, indexStorage1, indexStorage2, indexStorage3, thousandNumber, MAX_Z, recoveryStorage, promoteDate7, promoteDate8, promoteDate9, promoteInformation4, promoteInformation5, promoteInformation6, promoteInformation7, promoteInformation8, promoteInformation9, indexStorage4, indexStorage5, indexStorage6, indexStorage7, indexStorage8, indexStorage9, addPartialValue1, addPartialValue2, addPartialValue3, addPartialValue4, addPartialValue5, addPartialValue6, addPartialValue7, addPartialValue8, addPartialValue9, tempYear, tempMonth, tempDay, createButton, discountMoney, loginNumber);
        } else if (u == 3) {
            System.out.println("얼마를 할인하시겠습니까");
            discountPercent = sc.nextInt();

            System.out.printf("현재날짜는 %d년 %d월 %d일입니다. 그 이후의 날짜를 입력해주세요\n", year, month, day);
            System.out.println("시작일 년도, 월, 일 만료일 년도, 월, 일을 공백을 구분해서 차례대로 적어주세요.");
            System.out.println("예시 2023 5 6 2023 5 6");
            promotionYear1 = sc.nextInt();
            promotionMonth1 = sc.nextInt();
            promotionDay1 = sc.nextInt();

            promotionYear2 = sc.nextInt();
            promotionMonth2 = sc.nextInt();
            promotionDay2 = sc.nextInt();
            if (((promotionYear1 < year) || (promotionYear1 == year && promotionMonth1 < month) || (promotionYear1 == year && promotionMonth1 == month && promotionDay1 < day)) ||
                    ((promotionYear1 > promotionYear2) || (promotionYear1 == promotionYear2 && promotionMonth1 > promotionMonth2) || (promotionYear1 == promotionYear2 && promotionMonth1 == promotionMonth2 && promotionDay1 > promotionDay2))) {
                System.out.println("날짜가 현재 날짜보다 뒤에 있거나 두개의 날짜가 맞지 않습니다. 관리자페이지로 돌아갑니다.");
                adminUi(sc, weaponName, recoveryWeaphone, day, price, kind, iValue, sequence, storage, storageValue, start, money, button, buyButton, adminId, adminPassword, accountInformation, loginButton, accountInformationButton, idType, userNumber, capacityValueButton, weaponInformation, categoryRemove, categoryButton, num_of_days, month, year, promotionName, percentageDiscountButton, discountPercent, promotionYear1, promotionMonth1, promotionDay1, promotionYear2, promotionMonth2, promotionDay2, promotionValue1, promotionValue2, promotionValue3, promoteInformation1, timeCount, partialName, checkBox, history, damage, speed, weight, weaponRemoval, maximumInventory, currentInventory, promoteDate1, promoteDate2, promoteDate3, promoteDate4, promoteDate5, promoteDate6, promoteInformation2, promoteInformation3, discount, indexStorage1, indexStorage2, indexStorage3, thousandNumber, MAX_Z, recoveryStorage, promoteDate7, promoteDate8, promoteDate9, promoteInformation4, promoteInformation5, promoteInformation6, promoteInformation7, promoteInformation8, promoteInformation9, indexStorage4, indexStorage5, indexStorage6, indexStorage7, indexStorage8, indexStorage9, addPartialValue1, addPartialValue2, addPartialValue3, addPartialValue4, addPartialValue5, addPartialValue6, addPartialValue7, addPartialValue8, addPartialValue9, tempYear, tempMonth, tempDay, createButton, discountMoney, loginNumber);
            }

            discountDeals(sc, weaponName, recoveryWeaphone, day, price, kind, iValue, sequence, storage, storageValue, start, money, button, buyButton, adminId, adminPassword, accountInformation, loginButton, accountInformationButton, idType, userNumber, capacityValueButton, weaponInformation, categoryRemove, categoryButton, num_of_days, month, year, promotionName, percentageDiscountButton, discountPercent, promotionYear1, promotionMonth1, promotionDay1, promotionYear2, promotionMonth2, promotionDay2, promotionValue1, promotionValue2, promotionValue3, promoteInformation1, timeCount, partialName, checkBox, history, damage, speed, weight, weaponRemoval, maximumInventory, currentInventory, promoteDate1, promoteDate2, promoteDate3, promoteDate4, promoteDate5, promoteDate6, promoteInformation2, promoteInformation3, discount, indexStorage1, indexStorage2, indexStorage3, thousandNumber, MAX_Z, recoveryStorage, promoteDate7, promoteDate8, promoteDate9, promoteInformation4, promoteInformation5, promoteInformation6, promoteInformation7, promoteInformation8, promoteInformation9, indexStorage4, indexStorage5, indexStorage6, indexStorage7, indexStorage8, indexStorage9, addPartialValue1, addPartialValue2, addPartialValue3, addPartialValue4, addPartialValue5, addPartialValue6, addPartialValue7, addPartialValue8, addPartialValue9, tempYear, tempMonth, tempDay, createButton, discountMoney, loginNumber);
        }
    }

    public static void PercentageDiscount(Scanner sc, String[] weaponName, int[] recoveryWeaphone, int day, int[] price, String[] kind, int iValue, int[] sequence, int[] storage, int storageValue, int start, long[] money, int button, int buyButton, String adminId, String adminPassword, String[] accountInformation, int loginButton, int accountInformationButton, String idType, int userNumber, int[] capacityValueButton, int[] weaponInformation, int[] categoryRemove, int categoryButton, int[] num_of_days, int month, int year, String[] promotionName, int percentageDiscountButton, int discountPercent, int promotionYear1, int promotionMonth1, int promotionDay1, int promotionYear2, int promotionMonth2, int promotionDay2, int promotionValue1, int promotionValue2, int promotionValue3, int[] promoteInformation1, int[] timeCount, String[] partialName, int[] checkBox, int[] history, int[] damage, int[] speed, int[] weight, int[] weaponRemoval, int[] maximumInventory, int[] currentInventory, int[] promoteDate1, int[] promoteDate2, int[] promoteDate3, int[] promoteDate4, int[] promoteDate5, int[] promoteDate6, int[] promoteInformation2, int[] promoteInformation3, int[] discount, int[] indexStorage1, int[] indexStorage2, int[] indexStorage3, int[] thousandNumber, int MAX_Z, int[] recoveryStorage, int[] promoteDate7, int[] promoteDate8, int[] promoteDate9, int[] promoteInformation4, int[] promoteInformation5, int[] promoteInformation6, int[] promoteInformation7, int[] promoteInformation8, int[] promoteInformation9, int[] indexStorage4, int[] indexStorage5, int[] indexStorage6, int[] indexStorage7, int[] indexStorage8, int[] indexStorage9, int[] addPartialValue1, int[] addPartialValue2, int[] addPartialValue3, int[] addPartialValue4, int[] addPartialValue5, int[] addPartialValue6, int[] addPartialValue7, int[] addPartialValue8, int[] addPartialValue9, int tempYear, int tempMonth, int tempDay, int createButton, int[] discountMoney, int loginNumber
    ) {
        int check2 = 0;
        iValue = -1;
        System.out.println("들어갈 카테고리 목록을 적어주세요. 프로모션 품목과 무기를 선택하셨으면 1을 넣어주세요. 문자열로 적어주세요!");
        System.out.println("---카테고리 목록---");
        for (int i = 0; i < 100; i++) {
            if (categoryRemove[i] == 0) {
                System.out.println(kind[i]);
            }
        }
        String enterCategory = sc.next();
        if (enterCategory.equals("1")) {
            System.out.println("관리자 UI로 돌아갑니다.");
            if (percentageDiscountButton == 1) {
                promotionValue1++;
                percentageDiscountButton = 0;

            }// 중요! 아무것도 선택하지 않고 프로모션을 진행하였다면 잘 구분하는게 필요함!
            thousandNumber[createButton]++;
            System.out.printf("thousandNumber[%d] = %d\n", createButton, thousandNumber[createButton]);
            for (int i = 0; i < MAX_Z; i++) {
                checkBox[i] = 0;
            }
            adminUi(sc, weaponName, recoveryWeaphone, day, price, kind, iValue, sequence, storage, storageValue, start, money, button, buyButton, adminId, adminPassword, accountInformation, loginButton, accountInformationButton, idType, userNumber, capacityValueButton, weaponInformation, categoryRemove, categoryButton, num_of_days, month, year, promotionName, percentageDiscountButton, discountPercent, promotionYear1, promotionMonth1, promotionDay1, promotionYear2, promotionMonth2, promotionDay2, promotionValue1, promotionValue2, promotionValue3, promoteInformation1, timeCount, partialName, checkBox, history, damage, speed, weight, weaponRemoval, maximumInventory, currentInventory, promoteDate1, promoteDate2, promoteDate3, promoteDate4, promoteDate5, promoteDate6, promoteInformation2, promoteInformation3, discount, indexStorage1, indexStorage2, indexStorage3, thousandNumber, MAX_Z, recoveryStorage, promoteDate7, promoteDate8, promoteDate9, promoteInformation4, promoteInformation5, promoteInformation6, promoteInformation7, promoteInformation8, promoteInformation9, indexStorage4, indexStorage5, indexStorage6, indexStorage7, indexStorage8, indexStorage9, addPartialValue1, addPartialValue2, addPartialValue3, addPartialValue4, addPartialValue5, addPartialValue6, addPartialValue7, addPartialValue8, addPartialValue9, tempYear, tempMonth, tempDay, createButton, discountMoney, loginNumber);
        }
        for (int i = 0; i < 100; i++) {
            if (kind[i].equals(enterCategory)) {
                iValue = i;
            }
        }
        if (iValue == -1) {
            System.out.println("카테고리가 존재하지않습니다. 다시 돌아갑니다.");
            PercentageDiscount(sc, weaponName, recoveryWeaphone, day, price, kind, iValue, sequence, storage, storageValue, start, money, button, buyButton, adminId, adminPassword, accountInformation, loginButton, accountInformationButton, idType, userNumber, capacityValueButton, weaponInformation, categoryRemove, categoryButton, num_of_days, month, year, promotionName, percentageDiscountButton, discountPercent, promotionYear1, promotionMonth1, promotionDay1, promotionYear2, promotionMonth2, promotionDay2, promotionValue1, promotionValue2, promotionValue3, promoteInformation1, timeCount, partialName, checkBox, history, damage, speed, weight, weaponRemoval, maximumInventory, currentInventory, promoteDate1, promoteDate2, promoteDate3, promoteDate4, promoteDate5, promoteDate6, promoteInformation2, promoteInformation3, discount, indexStorage1, indexStorage2, indexStorage3, thousandNumber, MAX_Z, recoveryStorage, promoteDate7, promoteDate8, promoteDate9, promoteInformation4, promoteInformation5, promoteInformation6, promoteInformation7, promoteInformation8, promoteInformation9, indexStorage4, indexStorage5, indexStorage6, indexStorage7, indexStorage8, indexStorage9, addPartialValue1, addPartialValue2, addPartialValue3, addPartialValue4, addPartialValue5, addPartialValue6, addPartialValue7, addPartialValue8, addPartialValue9, tempYear, tempMonth, tempDay, createButton, discountMoney, loginNumber);
        }

        addPartial(sc, weaponName, recoveryWeaphone, day, price, kind, iValue, sequence, storage, storageValue, start, money, button, buyButton, adminId, adminPassword, accountInformation, loginButton, accountInformationButton, idType, userNumber, capacityValueButton, weaponInformation, categoryRemove, categoryButton, num_of_days, month, year, promotionName, percentageDiscountButton, discountPercent, promotionYear1, promotionMonth1, promotionDay1, promotionYear2, promotionMonth2, promotionDay2, promotionValue1, promotionValue2, promotionValue3, promoteInformation1, timeCount, partialName, checkBox, history, damage, speed, weight, weaponRemoval, maximumInventory, currentInventory, promoteDate1, promoteDate2, promoteDate3, promoteDate4, promoteDate5, promoteDate6, promoteInformation2, promoteInformation3, discount, indexStorage1, indexStorage2, indexStorage3, thousandNumber, MAX_Z, recoveryStorage, promoteDate7, promoteDate8, promoteDate9, promoteInformation4, promoteInformation5, promoteInformation6, promoteInformation7, promoteInformation8, promoteInformation9, indexStorage4, indexStorage5, indexStorage6, indexStorage7, indexStorage8, indexStorage9, addPartialValue1, addPartialValue2, addPartialValue3, addPartialValue4, addPartialValue5, addPartialValue6, addPartialValue7, addPartialValue8, addPartialValue9, tempYear, tempMonth, tempDay, createButton, discountMoney, loginNumber);

        int check = 0;
        while (true) {
            System.out.println("전체선택 하실거면 '전체선택'이라고 적어주세요. 개별로 하실거라면 무기이름을 적어주시고, (무기이름은 왼쪽에 있습니다!) 돌아가신다면 '뒤로가기'라고 적어주세요. 문자열로 입력하셔야됩니다!");
            String promotionChoice = sc.next();
            int nested = 0;
            if (promotionChoice.equals("전체선택")) {
                for (int i = 0; i < sequence[iValue]; i++) {
                    if (weaponRemoval[iValue * 100 + i] == 0) {
                        if (promotionYear1 == year && promotionMonth1 == month && promotionDay1 == day) {
                            promoteInformation2[iValue * 2000 + i * 20 + addPartialValue2[iValue * 100 + i]] = thousandNumber[2];
                            System.out.printf("promoteInformation2[%d] = %d\n", iValue * 2000 + i * 20 + addPartialValue2[iValue * 100 + i], thousandNumber[2]);
//                            System.out.println(iValue);
//                            System.out.println(addPartialValue2[iValue * 100 + i]);
                            discount[iValue * 2000 + i * 20 + addPartialValue2[iValue * 100 + i]] = discountPercent;
                            promoteDate2[iValue * 12000 + i * 120 + indexStorage2[iValue * 100 + i] + 0] = promotionYear1;
                            promoteDate2[iValue * 12000 + i * 120 + indexStorage2[iValue * 100 + i] + 1] = promotionMonth1;
                            promoteDate2[iValue * 12000 + i * 120 + indexStorage2[iValue * 100 + i] + 2] = promotionDay1;
                            promoteDate2[iValue * 12000 + i * 120 + indexStorage2[iValue * 100 + i] + 3] = promotionYear2;
                            promoteDate2[iValue * 12000 + i * 120 + indexStorage2[iValue * 100 + i] + 4] = promotionMonth2;
                            promoteDate2[iValue * 12000 + i * 120 + indexStorage2[iValue * 100 + i] + 5] = promotionDay2;

                            createButton = 2;
                            if (checkBox[iValue * 100 + i] == 0) {
                                indexStorage2[iValue * 100 + i] += 6;
                                addPartialValue2[iValue * 100 + i]++;
                                checkBox[iValue * 100 + i] = 1;
                            } else if (checkBox[iValue * 100 + i] == 1) {
                                System.out.println(weaponName[iValue * 100 + i] + "번 무기의 프로모션을 중복선택할 수 없습니닷!");
                            }
                        } else {
                            promoteInformation3[iValue * 2000 + i * 20 + addPartialValue3[iValue * 100 + i]] = thousandNumber[3];
                            discount[iValue * 2000 + i * 20 + addPartialValue3[iValue * 100 + i]] = discountPercent;
                            promoteDate3[iValue * 12000 + i * 120 + indexStorage3[iValue * 100 + i] + 0] = promotionYear1;
                            promoteDate3[iValue * 12000 + i * 120 + indexStorage3[iValue * 100 + i] + 1] = promotionMonth1;
                            promoteDate3[iValue * 12000 + i * 120 + indexStorage3[iValue * 100 + i] + 2] = promotionDay1;
                            promoteDate3[iValue * 12000 + i * 120 + indexStorage3[iValue * 100 + i] + 3] = promotionYear2;
                            promoteDate3[iValue * 12000 + i * 120 + indexStorage3[iValue * 100 + i] + 4] = promotionMonth2;
                            promoteDate3[iValue * 12000 + i * 120 + indexStorage3[iValue * 100 + i] + 5] = promotionDay2;
                            createButton = 3;
                            if (checkBox[iValue * 100 + i] == 0) {
                                indexStorage3[iValue * 100 + i] += 6;
                                addPartialValue3[iValue * 100 + i]++;
                                checkBox[iValue * 100 + i] = 1;
                            } else if (checkBox[iValue * 100 + i] == 1) {
                                System.out.println(weaponName[iValue * 100 + i] + "번 무기의 프로모션을 중복선택할 수 없습니닷!");
                            }
                        }
                        percentageDiscountButton = 1;

                    }
                }
                addPartial(sc, weaponName, recoveryWeaphone, day, price, kind, iValue, sequence, storage, storageValue, start, money, button, buyButton, adminId, adminPassword, accountInformation, loginButton, accountInformationButton, idType, userNumber, capacityValueButton, weaponInformation, categoryRemove, categoryButton, num_of_days, month, year, promotionName, percentageDiscountButton, discountPercent, promotionYear1, promotionMonth1, promotionDay1, promotionYear2, promotionMonth2, promotionDay2, promotionValue1, promotionValue2, promotionValue3, promoteInformation1, timeCount, partialName, checkBox, history, damage, speed, weight, weaponRemoval, maximumInventory, currentInventory, promoteDate1, promoteDate2, promoteDate3, promoteDate4, promoteDate5, promoteDate6, promoteInformation2, promoteInformation3, discount, indexStorage1, indexStorage2, indexStorage3, thousandNumber, MAX_Z, recoveryStorage, promoteDate7, promoteDate8, promoteDate9, promoteInformation4, promoteInformation5, promoteInformation6, promoteInformation7, promoteInformation8, promoteInformation9, indexStorage4, indexStorage5, indexStorage6, indexStorage7, indexStorage8, indexStorage9, addPartialValue1, addPartialValue2, addPartialValue3, addPartialValue4, addPartialValue5, addPartialValue6, addPartialValue7, addPartialValue8, addPartialValue9, tempYear, tempMonth, tempDay, createButton, discountMoney, loginNumber);

            } else if (promotionChoice.equals("뒤로가기")) {
                System.out.println("뒤로 가겠습니다.");
                PercentageDiscount(sc, weaponName, recoveryWeaphone, day, price, kind, iValue, sequence, storage, storageValue, start, money, button, buyButton, adminId, adminPassword, accountInformation, loginButton, accountInformationButton, idType, userNumber, capacityValueButton, weaponInformation, categoryRemove, categoryButton, num_of_days, month, year, promotionName, percentageDiscountButton, discountPercent, promotionYear1, promotionMonth1, promotionDay1, promotionYear2, promotionMonth2, promotionDay2, promotionValue1, promotionValue2, promotionValue3, promoteInformation1, timeCount, partialName, checkBox, history, damage, speed, weight, weaponRemoval, maximumInventory, currentInventory, promoteDate1, promoteDate2, promoteDate3, promoteDate4, promoteDate5, promoteDate6, promoteInformation2, promoteInformation3, discount, indexStorage1, indexStorage2, indexStorage3, thousandNumber, MAX_Z, recoveryStorage, promoteDate7, promoteDate8, promoteDate9, promoteInformation4, promoteInformation5, promoteInformation6, promoteInformation7, promoteInformation8, promoteInformation9, indexStorage4, indexStorage5, indexStorage6, indexStorage7, indexStorage8, indexStorage9, addPartialValue1, addPartialValue2, addPartialValue3, addPartialValue4, addPartialValue5, addPartialValue6, addPartialValue7, addPartialValue8, addPartialValue9, tempYear, tempMonth, tempDay, createButton, discountMoney, loginNumber);
            } else {
                for (int i = 0; i < sequence[iValue]; i++) {
                    if (weaponRemoval[iValue * 100 + i] == 0 && promotionChoice.equals(weaponName[iValue * 100 + i])) {
                        if (promotionYear1 == year && promotionMonth1 == month && promotionDay1 == day) {
                            promoteInformation2[iValue * 2000 + i * 20 + addPartialValue2[iValue * 100 + i]] = thousandNumber[2];
                            discount[iValue * 2000 + i * 20 + addPartialValue2[iValue * 100 + i]] = discountPercent;
                            promoteDate2[iValue * 12000 + i * 120 + indexStorage2[iValue * 100 + i] + 0] = promotionYear1;
                            promoteDate2[iValue * 12000 + i * 120 + indexStorage2[iValue * 100 + i] + 1] = promotionMonth1;
                            promoteDate2[iValue * 12000 + i * 120 + indexStorage2[iValue * 100 + i] + 2] = promotionDay1;
                            promoteDate2[iValue * 12000 + i * 120 + indexStorage2[iValue * 100 + i] + 3] = promotionYear2;
                            promoteDate2[iValue * 12000 + i * 120 + indexStorage2[iValue * 100 + i] + 4] = promotionMonth2;
                            promoteDate2[iValue * 12000 + i * 120 + indexStorage2[iValue * 100 + i] + 5] = promotionDay2;
                            createButton = 2;
                            if (checkBox[iValue * 100 + i] == 0) {
                                indexStorage2[iValue * 100 + i] += 6;
                                addPartialValue2[iValue * 100 + i]++;
                                checkBox[iValue * 100 + i] = 1;
                            } else if (checkBox[iValue * 100 + i] == 1) {
                                System.out.println(weaponName[iValue * 100 + i] + "번 무기의 프로모션을 중복선택할 수 없습니닷!");
                            }
                        } else {
                            promoteInformation3[iValue * 2000 + i * 20 + addPartialValue3[iValue * 100 + i]] = thousandNumber[3];
                            discount[iValue * 2000 + i * 20 + addPartialValue3[iValue * 100 + i]] = discountPercent;
                            promoteDate3[iValue * 12000 + i * 120 + indexStorage3[iValue * 100 + i] + 0] = promotionYear1;
                            promoteDate3[iValue * 12000 + i * 120 + indexStorage3[iValue * 100 + i] + 1] = promotionMonth1;
                            promoteDate3[iValue * 12000 + i * 120 + indexStorage3[iValue * 100 + i] + 2] = promotionDay1;
                            promoteDate3[iValue * 12000 + i * 120 + indexStorage3[iValue * 100 + i] + 3] = promotionYear2;
                            promoteDate3[iValue * 12000 + i * 120 + indexStorage3[iValue * 100 + i] + 4] = promotionMonth2;
                            promoteDate3[iValue * 12000 + i * 120 + indexStorage3[iValue * 100 + i] + 5] = promotionDay2;
                            createButton = 3;
                            if (checkBox[iValue * 100 + i] == 0) {
                                indexStorage3[iValue * 100 + i] += 6;
                                addPartialValue3[iValue * 100 + i]++;
                                checkBox[iValue * 100 + i] = 1;
                            } else if (checkBox[iValue * 100 + i] == 1) {
                                System.out.println(weaponName[iValue * 100 + i] + "번 무기의 프로모션을 중복선택할 수 없습니닷!");
                            }
                        }
                        percentageDiscountButton = 1;
                        check2 = 1;
                    }
                }
                if(check2 == 0) {
                    System.out.println("잘못된 무기명을 입력하였습니다.");
                    check = 1;
                }
                if (check == 0) {
                    addPartial(sc, weaponName, recoveryWeaphone, day, price, kind, iValue, sequence, storage, storageValue, start, money, button, buyButton, adminId, adminPassword, accountInformation, loginButton, accountInformationButton, idType, userNumber, capacityValueButton, weaponInformation, categoryRemove, categoryButton, num_of_days, month, year, promotionName, percentageDiscountButton, discountPercent, promotionYear1, promotionMonth1, promotionDay1, promotionYear2, promotionMonth2, promotionDay2, promotionValue1, promotionValue2, promotionValue3, promoteInformation1, timeCount, partialName, checkBox, history, damage, speed, weight, weaponRemoval, maximumInventory, currentInventory, promoteDate1, promoteDate2, promoteDate3, promoteDate4, promoteDate5, promoteDate6, promoteInformation2, promoteInformation3, discount, indexStorage1, indexStorage2, indexStorage3, thousandNumber, MAX_Z, recoveryStorage, promoteDate7, promoteDate8, promoteDate9, promoteInformation4, promoteInformation5, promoteInformation6, promoteInformation7, promoteInformation8, promoteInformation9, indexStorage4, indexStorage5, indexStorage6, indexStorage7, indexStorage8, indexStorage9, addPartialValue1, addPartialValue2, addPartialValue3, addPartialValue4, addPartialValue5, addPartialValue6, addPartialValue7, addPartialValue8, addPartialValue9, tempYear, tempMonth, tempDay, createButton, discountMoney, loginNumber);
                }
                check = 0;
                check2 = 0;
            }
        }

        //카테고리를 전체선택한다면 나중에 프로모션을 보여줄때 카테고리의 무기전체를 보여주는게 아닌
    }

    public static void onePlusOne(Scanner sc, String[] weaponName, int[] recoveryWeaphone, int day, int[] price, String[] kind, int iValue, int[] sequence, int[] storage, int storageValue, int start, long[] money, int button, int buyButton, String adminId, String adminPassword, String[] accountInformation, int loginButton, int accountInformationButton, String idType, int userNumber, int[] capacityValueButton, int[] weaponInformation, int[] categoryRemove, int categoryButton, int[] num_of_days, int month, int year, String[] promotionName, int percentageDiscountButton, int discountPercent, int promotionYear1, int promotionMonth1, int promotionDay1, int promotionYear2, int promotionMonth2, int promotionDay2, int promotionValue1, int promotionValue2, int promotionValue3, int[] promoteInformation1, int[] timeCount, String[] partialName, int[] checkBox, int[] history, int[] damage, int[] speed, int[] weight, int[] weaponRemoval, int[] maximumInventory, int[] currentInventory, int[] promoteDate1, int[] promoteDate2, int[] promoteDate3, int[] promoteDate4, int[] promoteDate5, int[] promoteDate6, int[] promoteInformation2, int[] promoteInformation3, int[] discount, int[] indexStorage1, int[] indexStorage2, int[] indexStorage3, int[] thousandNumber, int MAX_Z, int[] recoveryStorage, int[] promoteDate7, int[] promoteDate8, int[] promoteDate9, int[] promoteInformation4, int[] promoteInformation5, int[] promoteInformation6, int[] promoteInformation7, int[] promoteInformation8, int[] promoteInformation9, int[] indexStorage4, int[] indexStorage5, int[] indexStorage6, int[] indexStorage7, int[] indexStorage8, int[] indexStorage9, int[] addPartialValue1, int[] addPartialValue2, int[] addPartialValue3, int[] addPartialValue4, int[] addPartialValue5, int[] addPartialValue6, int[] addPartialValue7, int[] addPartialValue8, int[] addPartialValue9, int tempYear, int tempMonth, int tempDay, int createButton, int[] discountMoney, int loginNumber
    ) {

        iValue = -1;
        System.out.println("들어갈 카테고리 목록을 적어주세요. 프로모션 품목과 무기를 선택하셨으면 1을 넣어주세요. 문자열로 입력하셔야됩니다!");
        System.out.println("---카테고리 목록---");
        for (int i = 0; i < 100; i++) {
            if (categoryRemove[i] == 0) {
                System.out.println(kind[i]);
            }
        }
        String enterCategory = sc.next();
        if (enterCategory.equals("1")) {
            System.out.println("관리자 UI로 돌아갑니다.");
            if (percentageDiscountButton == 1) {
                promotionValue2++;
                percentageDiscountButton = 0;
            }// 중요! 아무것도 선택하지 않고 프로모션을 진행하였다면 잘 구분하는게 필요함!
            for (int i = 0; i < MAX_Z; i++) {
                checkBox[i] = 0;
            }
            thousandNumber[createButton]++;
            adminUi(sc, weaponName, recoveryWeaphone, day, price, kind, iValue, sequence, storage, storageValue, start, money, button, buyButton, adminId, adminPassword, accountInformation, loginButton, accountInformationButton, idType, userNumber, capacityValueButton, weaponInformation, categoryRemove, categoryButton, num_of_days, month, year, promotionName, percentageDiscountButton, discountPercent, promotionYear1, promotionMonth1, promotionDay1, promotionYear2, promotionMonth2, promotionDay2, promotionValue1, promotionValue2, promotionValue3, promoteInformation1, timeCount, partialName, checkBox, history, damage, speed, weight, weaponRemoval, maximumInventory, currentInventory, promoteDate1, promoteDate2, promoteDate3, promoteDate4, promoteDate5, promoteDate6, promoteInformation2, promoteInformation3, discount, indexStorage1, indexStorage2, indexStorage3, thousandNumber, MAX_Z, recoveryStorage, promoteDate7, promoteDate8, promoteDate9, promoteInformation4, promoteInformation5, promoteInformation6, promoteInformation7, promoteInformation8, promoteInformation9, indexStorage4, indexStorage5, indexStorage6, indexStorage7, indexStorage8, indexStorage9, addPartialValue1, addPartialValue2, addPartialValue3, addPartialValue4, addPartialValue5, addPartialValue6, addPartialValue7, addPartialValue8, addPartialValue9, tempYear, tempMonth, tempDay, createButton, discountMoney, loginNumber);
        }
        for (int i = 0; i < 100; i++) {
            if (kind[i].equals(enterCategory)) {
                iValue = i;
            }
        }
        if (iValue == -1) {
            System.out.println("카테고리가 존재하지않습니다. 다시 돌아갑니다.");
            onePlusOne(sc, weaponName, recoveryWeaphone, day, price, kind, iValue, sequence, storage, storageValue, start, money, button, buyButton, adminId, adminPassword, accountInformation, loginButton, accountInformationButton, idType, userNumber, capacityValueButton, weaponInformation, categoryRemove, categoryButton, num_of_days, month, year, promotionName, percentageDiscountButton, discountPercent, promotionYear1, promotionMonth1, promotionDay1, promotionYear2, promotionMonth2, promotionDay2, promotionValue1, promotionValue2, promotionValue3, promoteInformation1, timeCount, partialName, checkBox, history, damage, speed, weight, weaponRemoval, maximumInventory, currentInventory, promoteDate1, promoteDate2, promoteDate3, promoteDate4, promoteDate5, promoteDate6, promoteInformation2, promoteInformation3, discount, indexStorage1, indexStorage2, indexStorage3, thousandNumber, MAX_Z, recoveryStorage, promoteDate7, promoteDate8, promoteDate9, promoteInformation4, promoteInformation5, promoteInformation6, promoteInformation7, promoteInformation8, promoteInformation9, indexStorage4, indexStorage5, indexStorage6, indexStorage7, indexStorage8, indexStorage9, addPartialValue1, addPartialValue2, addPartialValue3, addPartialValue4, addPartialValue5, addPartialValue6, addPartialValue7, addPartialValue8, addPartialValue9, tempYear, tempMonth, tempDay, createButton, discountMoney, loginNumber);
        }
        addPartial(sc, weaponName, recoveryWeaphone, day, price, kind, iValue, sequence, storage, storageValue, start, money, button, buyButton, adminId, adminPassword, accountInformation, loginButton, accountInformationButton, idType, userNumber, capacityValueButton, weaponInformation, categoryRemove, categoryButton, num_of_days, month, year, promotionName, percentageDiscountButton, discountPercent, promotionYear1, promotionMonth1, promotionDay1, promotionYear2, promotionMonth2, promotionDay2, promotionValue1, promotionValue2, promotionValue3, promoteInformation1, timeCount, partialName, checkBox, history, damage, speed, weight, weaponRemoval, maximumInventory, currentInventory, promoteDate1, promoteDate2, promoteDate3, promoteDate4, promoteDate5, promoteDate6, promoteInformation2, promoteInformation3, discount, indexStorage1, indexStorage2, indexStorage3, thousandNumber, MAX_Z, recoveryStorage, promoteDate7, promoteDate8, promoteDate9, promoteInformation4, promoteInformation5, promoteInformation6, promoteInformation7, promoteInformation8, promoteInformation9, indexStorage4, indexStorage5, indexStorage6, indexStorage7, indexStorage8, indexStorage9, addPartialValue1, addPartialValue2, addPartialValue3, addPartialValue4, addPartialValue5, addPartialValue6, addPartialValue7, addPartialValue8, addPartialValue9, tempYear, tempMonth, tempDay, createButton, discountMoney, loginNumber);

        int check = 0;
        int check2 = 0;
        while (true) {
            System.out.println("전체선택 하실거면 '전체선택'이라고 적어주세요. 개별로 하실거라면 무기이름을 적어주시고,(무기이름은 왼쪽에 있습니다!) 돌아가신다면 '뒤로가기'라고 적어주세요. 문자열로 입력하셔야됩니다!");
            String promotionChoice = sc.next();
            int nested = 0;
            if (promotionChoice.equals("전체선택")) {
                for (int i = 0; i < sequence[iValue]; i++) {
                    if (weaponRemoval[iValue * 100 + i] == 0) {
                        if (promotionYear1 == year && promotionMonth1 == month && promotionDay1 == day) {
                            promoteInformation5[iValue * 2000 + i * 20 + addPartialValue5[iValue * 100 + i]] = thousandNumber[5];
                            promoteDate5[iValue * 12000 + i * 120 + indexStorage5[iValue * 100 + i] + 0] = promotionYear1;
                            promoteDate5[iValue * 12000 + i * 120 + indexStorage5[iValue * 100 + i] + 1] = promotionMonth1;
                            promoteDate5[iValue * 12000 + i * 120 + indexStorage5[iValue * 100 + i] + 2] = promotionDay1;
                            promoteDate5[iValue * 12000 + i * 120 + indexStorage5[iValue * 100 + i] + 3] = promotionYear2;
                            promoteDate5[iValue * 12000 + i * 120 + indexStorage5[iValue * 100 + i] + 4] = promotionMonth2;
                            promoteDate5[iValue * 12000 + i * 120 + indexStorage5[iValue * 100 + i] + 5] = promotionDay2;
                            createButton = 5;
                            if (checkBox[iValue * 100 + i] == 0) {
                                indexStorage5[iValue * 100 + i] += 6;
                                addPartialValue5[iValue * 100 + i]++;
                                checkBox[iValue * 100 + i] = 1;
                            } else if (checkBox[iValue * 100 + i] == 1) {
                                System.out.println(weaponName[iValue * 100 + i] + "번 무기의 프로모션을 중복선택할 수 없습니닷!");
                            }
                        } else {
                            promoteInformation6[iValue * 2000 + i * 20 + addPartialValue6[iValue * 100 + i]] = thousandNumber[6];
                            promoteDate6[iValue * 12000 + i * 120 + indexStorage6[iValue * 100 + i] + 0] = promotionYear1;
                            promoteDate6[iValue * 12000 + i * 120 + indexStorage6[iValue * 100 + i] + 1] = promotionMonth1;
                            promoteDate6[iValue * 12000 + i * 120 + indexStorage6[iValue * 100 + i] + 2] = promotionDay1;
                            promoteDate6[iValue * 12000 + i * 120 + indexStorage6[iValue * 100 + i] + 3] = promotionYear2;
                            promoteDate6[iValue * 12000 + i * 120 + indexStorage6[iValue * 100 + i] + 4] = promotionMonth2;
                            promoteDate6[iValue * 12000 + i * 120 + indexStorage6[iValue * 100 + i] + 5] = promotionDay2;
                            createButton = 6;
                            if (checkBox[iValue * 100 + i] == 0) {
                                indexStorage6[iValue * 100 + i] += 6;
                                addPartialValue6[iValue * 100 + i]++;
                                checkBox[iValue * 100 + i] = 1;
                            } else if (checkBox[iValue * 100 + i] == 1) {
                                System.out.println(weaponName[iValue * 100 + i] + "번 무기의 프로모션을 중복선택할 수 없습니닷!");
                            }
                        }
                        percentageDiscountButton = 1;
                    }
                }
                addPartial(sc, weaponName, recoveryWeaphone, day, price, kind, iValue, sequence, storage, storageValue, start, money, button, buyButton, adminId, adminPassword, accountInformation, loginButton, accountInformationButton, idType, userNumber, capacityValueButton, weaponInformation, categoryRemove, categoryButton, num_of_days, month, year, promotionName, percentageDiscountButton, discountPercent, promotionYear1, promotionMonth1, promotionDay1, promotionYear2, promotionMonth2, promotionDay2, promotionValue1, promotionValue2, promotionValue3, promoteInformation1, timeCount, partialName, checkBox, history, damage, speed, weight, weaponRemoval, maximumInventory, currentInventory, promoteDate1, promoteDate2, promoteDate3, promoteDate4, promoteDate5, promoteDate6, promoteInformation2, promoteInformation3, discount, indexStorage1, indexStorage2, indexStorage3, thousandNumber, MAX_Z, recoveryStorage, promoteDate7, promoteDate8, promoteDate9, promoteInformation4, promoteInformation5, promoteInformation6, promoteInformation7, promoteInformation8, promoteInformation9, indexStorage4, indexStorage5, indexStorage6, indexStorage7, indexStorage8, indexStorage9, addPartialValue1, addPartialValue2, addPartialValue3, addPartialValue4, addPartialValue5, addPartialValue6, addPartialValue7, addPartialValue8, addPartialValue9, tempYear, tempMonth, tempDay, createButton, discountMoney, loginNumber);
            } else if (promotionChoice.equals("뒤로가기")) {
                System.out.println("뒤로 가겠습니다.");
                onePlusOne(sc, weaponName, recoveryWeaphone, day, price, kind, iValue, sequence, storage, storageValue, start, money, button, buyButton, adminId, adminPassword, accountInformation, loginButton, accountInformationButton, idType, userNumber, capacityValueButton, weaponInformation, categoryRemove, categoryButton, num_of_days, month, year, promotionName, percentageDiscountButton, discountPercent, promotionYear1, promotionMonth1, promotionDay1, promotionYear2, promotionMonth2, promotionDay2, promotionValue1, promotionValue2, promotionValue3, promoteInformation1, timeCount, partialName, checkBox, history, damage, speed, weight, weaponRemoval, maximumInventory, currentInventory, promoteDate1, promoteDate2, promoteDate3, promoteDate4, promoteDate5, promoteDate6, promoteInformation2, promoteInformation3, discount, indexStorage1, indexStorage2, indexStorage3, thousandNumber, MAX_Z, recoveryStorage, promoteDate7, promoteDate8, promoteDate9, promoteInformation4, promoteInformation5, promoteInformation6, promoteInformation7, promoteInformation8, promoteInformation9, indexStorage4, indexStorage5, indexStorage6, indexStorage7, indexStorage8, indexStorage9, addPartialValue1, addPartialValue2, addPartialValue3, addPartialValue4, addPartialValue5, addPartialValue6, addPartialValue7, addPartialValue8, addPartialValue9, tempYear, tempMonth, tempDay, createButton, discountMoney, loginNumber);
            } else {
                for (int i = 0; i < sequence[iValue]; i++) {
                    if (weaponRemoval[iValue * 100 + i] == 0 && promotionChoice.equals(weaponName[iValue * 100 + i])) {
                        if (promotionYear1 == year && promotionMonth1 == month && promotionDay1 == day) {
                            promoteInformation5[iValue * 2000 + i * 20 + addPartialValue5[iValue * 100 + i]] = thousandNumber[5];
                            discount[iValue * 2000 + i * 20 + addPartialValue5[iValue * 100 + i]] = discountPercent;
                            promoteDate5[iValue * 12000 + i * 120 + indexStorage5[iValue * 100 + i] + 0] = promotionYear1;
                            promoteDate5[iValue * 12000 + i * 120 + indexStorage5[iValue * 100 + i] + 1] = promotionMonth1;
                            promoteDate5[iValue * 12000 + i * 120 + indexStorage5[iValue * 100 + i] + 2] = promotionDay1;
                            promoteDate5[iValue * 12000 + i * 120 + indexStorage5[iValue * 100 + i] + 3] = promotionYear2;
                            promoteDate5[iValue * 12000 + i * 120 + indexStorage5[iValue * 100 + i] + 4] = promotionMonth2;
                            promoteDate5[iValue * 12000 + i * 120 + indexStorage5[iValue * 100 + i] + 5] = promotionDay2;
                            createButton = 5;
                            if (checkBox[iValue * 100 + i] == 0) {
                                indexStorage5[iValue * 100 + i] += 6;
                                addPartialValue5[iValue * 100 + i]++;
                                checkBox[iValue * 100 + i] = 1;
                            } else if (checkBox[iValue * 100 + i] == 1) {
                                System.out.println(weaponName[iValue * 100 + i] + "번 무기의 프로모션을 중복선택할 수 없습니닷!");
                            }
                        } else {
                            promoteInformation6[iValue * 2000 + i * 20 + addPartialValue6[iValue * 100 + i]] = thousandNumber[6];
                            discount[iValue * 2000 + i * 20 + addPartialValue6[iValue * 100 + i]] = discountPercent;
                            promoteDate6[iValue * 12000 + i * 120 + indexStorage6[iValue * 100 + i] + 0] = promotionYear1;
                            promoteDate6[iValue * 12000 + i * 120 + indexStorage6[iValue * 100 + i] + 1] = promotionMonth1;
                            promoteDate6[iValue * 12000 + i * 120 + indexStorage6[iValue * 100 + i] + 2] = promotionDay1;
                            promoteDate6[iValue * 12000 + i * 120 + indexStorage6[iValue * 100 + i] + 3] = promotionYear2;
                            promoteDate6[iValue * 12000 + i * 120 + indexStorage6[iValue * 100 + i] + 4] = promotionMonth2;
                            promoteDate6[iValue * 12000 + i * 120 + indexStorage6[iValue * 100 + i] + 5] = promotionDay2;
                            createButton = 6;
                            if (checkBox[iValue * 100 + i] == 0) {
                                indexStorage6[iValue * 100 + i] += 6;
                                addPartialValue6[iValue * 100 + i]++;
                                checkBox[iValue * 100 + i] = 1;
                            } else if (checkBox[iValue * 100 + i] == 1) {
                                System.out.println(weaponName[iValue * 100 + i] + "번 무기의 프로모션을 중복선택할 수 없습니닷!");
                            }
                        }
                        percentageDiscountButton = 1;
                        check2 = 1;
                    }
                }
                if(check2 == 0) {
                    System.out.println("잘못된 무기명을 입력하였습니다.");
                    check = 1;
                }

                if (check == 0) {
                    addPartial(sc, weaponName, recoveryWeaphone, day, price, kind, iValue, sequence, storage, storageValue, start, money, button, buyButton, adminId, adminPassword, accountInformation, loginButton, accountInformationButton, idType, userNumber, capacityValueButton, weaponInformation, categoryRemove, categoryButton, num_of_days, month, year, promotionName, percentageDiscountButton, discountPercent, promotionYear1, promotionMonth1, promotionDay1, promotionYear2, promotionMonth2, promotionDay2, promotionValue1, promotionValue2, promotionValue3, promoteInformation1, timeCount, partialName, checkBox, history, damage, speed, weight, weaponRemoval, maximumInventory, currentInventory, promoteDate1, promoteDate2, promoteDate3, promoteDate4, promoteDate5, promoteDate6, promoteInformation2, promoteInformation3, discount, indexStorage1, indexStorage2, indexStorage3, thousandNumber, MAX_Z, recoveryStorage, promoteDate7, promoteDate8, promoteDate9, promoteInformation4, promoteInformation5, promoteInformation6, promoteInformation7, promoteInformation8, promoteInformation9, indexStorage4, indexStorage5, indexStorage6, indexStorage7, indexStorage8, indexStorage9, addPartialValue1, addPartialValue2, addPartialValue3, addPartialValue4, addPartialValue5, addPartialValue6, addPartialValue7, addPartialValue8, addPartialValue9, tempYear, tempMonth, tempDay, createButton, discountMoney, loginNumber);
                }
                check2 = 0;
                check = 0;
            }
        }
    }

    public static void discountDeals(Scanner sc, String[] weaponName, int[] recoveryWeaphone, int day, int[] price, String[] kind, int iValue, int[] sequence, int[] storage, int storageValue, int start, long[] money, int button, int buyButton, String adminId, String adminPassword, String[] accountInformation, int loginButton, int accountInformationButton, String idType, int userNumber, int[] capacityValueButton, int[] weaponInformation, int[] categoryRemove, int categoryButton, int[] num_of_days, int month, int year, String[] promotionName, int percentageDiscountButton, int discountPercent, int promotionYear1, int promotionMonth1, int promotionDay1, int promotionYear2, int promotionMonth2, int promotionDay2, int promotionValue1, int promotionValue2, int promotionValue3, int[] promoteInformation1, int[] timeCount, String[] partialName, int[] checkBox, int[] history, int[] damage, int[] speed, int[] weight, int[] weaponRemoval, int[] maximumInventory, int[] currentInventory, int[] promoteDate1, int[] promoteDate2, int[] promoteDate3, int[] promoteDate4, int[] promoteDate5, int[] promoteDate6, int[] promoteInformation2, int[] promoteInformation3, int[] discount, int[] indexStorage1, int[] indexStorage2, int[] indexStorage3, int[] thousandNumber, int MAX_Z, int[] recoveryStorage, int[] promoteDate7, int[] promoteDate8, int[] promoteDate9, int[] promoteInformation4, int[] promoteInformation5, int[] promoteInformation6, int[] promoteInformation7, int[] promoteInformation8, int[] promoteInformation9, int[] indexStorage4, int[] indexStorage5, int[] indexStorage6, int[] indexStorage7, int[] indexStorage8, int[] indexStorage9, int[] addPartialValue1, int[] addPartialValue2, int[] addPartialValue3, int[] addPartialValue4, int[] addPartialValue5, int[] addPartialValue6, int[] addPartialValue7, int[] addPartialValue8, int[] addPartialValue9, int tempYear, int tempMonth, int tempDay, int createButton, int[] discountMoney, int loginNumber
    ) {
        int check2 = 0;
        iValue = -1;
        System.out.println("들어갈 카테고리 목록을 적어주세요. 프로모션 품목과 무기를 선택하셨으면 1을 넣어주세요. 문자열로 입력하셔야됩니다!");
        System.out.println("---카테고리 목록---");
        for (int i = 0; i < 100; i++) {
            if (categoryRemove[i] == 0) {
                System.out.println(kind[i]);
            }
        }
        String enterCategory = sc.next();
        if (enterCategory.equals("1")) {
            System.out.println("관리자 UI로 돌아갑니다.");
            if (percentageDiscountButton == 1) {
                promotionValue3++;
                percentageDiscountButton = 0;
            }// 중요! 아무것도 선택하지 않고 프로모션을 진행하였다면 잘 구분하는게 필요함!
            for (int i = 0; i < MAX_Z; i++) {
                checkBox[i] = 0;
            }
            thousandNumber[createButton]++;
            adminUi(sc, weaponName, recoveryWeaphone, day, price, kind, iValue, sequence, storage, storageValue, start, money, button, buyButton, adminId, adminPassword, accountInformation, loginButton, accountInformationButton, idType, userNumber, capacityValueButton, weaponInformation, categoryRemove, categoryButton, num_of_days, month, year, promotionName, percentageDiscountButton, discountPercent, promotionYear1, promotionMonth1, promotionDay1, promotionYear2, promotionMonth2, promotionDay2, promotionValue1, promotionValue2, promotionValue3, promoteInformation1, timeCount, partialName, checkBox, history, damage, speed, weight, weaponRemoval, maximumInventory, currentInventory, promoteDate1, promoteDate2, promoteDate3, promoteDate4, promoteDate5, promoteDate6, promoteInformation2, promoteInformation3, discount, indexStorage1, indexStorage2, indexStorage3, thousandNumber, MAX_Z, recoveryStorage, promoteDate7, promoteDate8, promoteDate9, promoteInformation4, promoteInformation5, promoteInformation6, promoteInformation7, promoteInformation8, promoteInformation9, indexStorage4, indexStorage5, indexStorage6, indexStorage7, indexStorage8, indexStorage9, addPartialValue1, addPartialValue2, addPartialValue3, addPartialValue4, addPartialValue5, addPartialValue6, addPartialValue7, addPartialValue8, addPartialValue9, tempYear, tempMonth, tempDay, createButton, discountMoney, loginNumber);
        }
        for (int i = 0; i < 100; i++) {
            if (kind[i].equals(enterCategory)) {
                iValue = i;
            }
        }
        if (iValue == -1) {
            System.out.println("카테고리가 존재하지않습니다. 다시 돌아갑니다.");
            discountDeals(sc, weaponName, recoveryWeaphone, day, price, kind, iValue, sequence, storage, storageValue, start, money, button, buyButton, adminId, adminPassword, accountInformation, loginButton, accountInformationButton, idType, userNumber, capacityValueButton, weaponInformation, categoryRemove, categoryButton, num_of_days, month, year, promotionName, percentageDiscountButton, discountPercent, promotionYear1, promotionMonth1, promotionDay1, promotionYear2, promotionMonth2, promotionDay2, promotionValue1, promotionValue2, promotionValue3, promoteInformation1, timeCount, partialName, checkBox, history, damage, speed, weight, weaponRemoval, maximumInventory, currentInventory, promoteDate1, promoteDate2, promoteDate3, promoteDate4, promoteDate5, promoteDate6, promoteInformation2, promoteInformation3, discount, indexStorage1, indexStorage2, indexStorage3, thousandNumber, MAX_Z, recoveryStorage, promoteDate7, promoteDate8, promoteDate9, promoteInformation4, promoteInformation5, promoteInformation6, promoteInformation7, promoteInformation8, promoteInformation9, indexStorage4, indexStorage5, indexStorage6, indexStorage7, indexStorage8, indexStorage9, addPartialValue1, addPartialValue2, addPartialValue3, addPartialValue4, addPartialValue5, addPartialValue6, addPartialValue7, addPartialValue8, addPartialValue9, tempYear, tempMonth, tempDay, createButton, discountMoney, loginNumber);
        }
        addPartial(sc, weaponName, recoveryWeaphone, day, price, kind, iValue, sequence, storage, storageValue, start, money, button, buyButton, adminId, adminPassword, accountInformation, loginButton, accountInformationButton, idType, userNumber, capacityValueButton, weaponInformation, categoryRemove, categoryButton, num_of_days, month, year, promotionName, percentageDiscountButton, discountPercent, promotionYear1, promotionMonth1, promotionDay1, promotionYear2, promotionMonth2, promotionDay2, promotionValue1, promotionValue2, promotionValue3, promoteInformation1, timeCount, partialName, checkBox, history, damage, speed, weight, weaponRemoval, maximumInventory, currentInventory, promoteDate1, promoteDate2, promoteDate3, promoteDate4, promoteDate5, promoteDate6, promoteInformation2, promoteInformation3, discount, indexStorage1, indexStorage2, indexStorage3, thousandNumber, MAX_Z, recoveryStorage, promoteDate7, promoteDate8, promoteDate9, promoteInformation4, promoteInformation5, promoteInformation6, promoteInformation7, promoteInformation8, promoteInformation9, indexStorage4, indexStorage5, indexStorage6, indexStorage7, indexStorage8, indexStorage9, addPartialValue1, addPartialValue2, addPartialValue3, addPartialValue4, addPartialValue5, addPartialValue6, addPartialValue7, addPartialValue8, addPartialValue9, tempYear, tempMonth, tempDay, createButton, discountMoney, loginNumber);

        int check = 0;
        while (true) {
            System.out.println("전체선택 하실거면 '전체선택'이라고 적어주세요. 개별로 하실거라면 무기이름을 적어주시고, (무기이름은 왼쪽에 있습니다!) 돌아가신다면 '뒤로가기'라고 적어주세요. 문자열로 입력하셔야됩니다!");
            String promotionChoice = sc.next();
            int nested = 0;
            if (promotionChoice.equals("전체선택")) {

                for (int i = 0; i < sequence[iValue]; i++) {
                    if (weaponRemoval[iValue * 100 + i] == 0) {
                        if (promotionYear1 == year && promotionMonth1 == month && promotionDay1 == day) {
                            promoteInformation8[iValue * 2000 + i * 20 + addPartialValue8[iValue * 100 + i]] = thousandNumber[8];
                            discountMoney[iValue * 2000 + i * 20 + addPartialValue8[iValue * 100 + i]] = discountPercent;
                            promoteDate8[iValue * 12000 + i * 120 + indexStorage8[iValue * 100 + i] + 0] = promotionYear1;
                            promoteDate8[iValue * 12000 + i * 120 + indexStorage8[iValue * 100 + i] + 1] = promotionMonth1;
                            promoteDate8[iValue * 12000 + i * 120 + indexStorage8[iValue * 100 + i] + 2] = promotionDay1;
                            promoteDate8[iValue * 12000 + i * 120 + indexStorage8[iValue * 100 + i] + 3] = promotionYear2;
                            promoteDate8[iValue * 12000 + i * 120 + indexStorage8[iValue * 100 + i] + 4] = promotionMonth2;
                            promoteDate8[iValue * 12000 + i * 120 + indexStorage8[iValue * 100 + i] + 5] = promotionDay2;
                            createButton = 8;
                            if (checkBox[iValue * 100 + i] == 0) {
                                indexStorage8[iValue * 100 + i] += 6;
                                addPartialValue8[iValue * 100 + i]++;
                                checkBox[iValue * 100 + i] = 1;
                            } else if (checkBox[iValue * 100 + i] == 1) {
                                System.out.println(weaponName[iValue * 100 + i] + "번 무기의 프로모션을 중복선택할 수 없습니닷!");
                            }
                        } else {
                            promoteInformation9[iValue * 2000 + i * 20 + addPartialValue9[iValue * 100 + i]] = thousandNumber[9];
                            discountMoney[iValue * 2000 + i * 20 + addPartialValue9[iValue * 100 + i]] = discountPercent;
                            promoteDate9[iValue * 12000 + i * 120 + indexStorage9[iValue * 100 + i] + 0] = promotionYear1;
                            promoteDate9[iValue * 12000 + i * 120 + indexStorage9[iValue * 100 + i] + 1] = promotionMonth1;
                            promoteDate9[iValue * 12000 + i * 120 + indexStorage9[iValue * 100 + i] + 2] = promotionDay1;
                            promoteDate9[iValue * 12000 + i * 120 + indexStorage9[iValue * 100 + i] + 3] = promotionYear2;
                            promoteDate9[iValue * 12000 + i * 120 + indexStorage9[iValue * 100 + i] + 4] = promotionMonth2;
                            promoteDate9[iValue * 12000 + i * 120 + indexStorage9[iValue * 100 + i] + 5] = promotionDay2;
                            createButton = 9;
                            if (checkBox[iValue * 100 + i] == 0) {
                                indexStorage9[iValue * 100 + i] += 6;
                                addPartialValue9[iValue * 100 + i]++;
                                checkBox[iValue * 100 + i] = 1;
                            } else if (checkBox[iValue * 100 + i] == 1) {
                                System.out.println(weaponName[iValue * 100 + i] + "번 무기의 프로모션을 중복선택할 수 없습니닷!");
                            }
                        }
                        percentageDiscountButton = 1;
                    }
                }
                addPartial(sc, weaponName, recoveryWeaphone, day, price, kind, iValue, sequence, storage, storageValue, start, money, button, buyButton, adminId, adminPassword, accountInformation, loginButton, accountInformationButton, idType, userNumber, capacityValueButton, weaponInformation, categoryRemove, categoryButton, num_of_days, month, year, promotionName, percentageDiscountButton, discountPercent, promotionYear1, promotionMonth1, promotionDay1, promotionYear2, promotionMonth2, promotionDay2, promotionValue1, promotionValue2, promotionValue3, promoteInformation1, timeCount, partialName, checkBox, history, damage, speed, weight, weaponRemoval, maximumInventory, currentInventory, promoteDate1, promoteDate2, promoteDate3, promoteDate4, promoteDate5, promoteDate6, promoteInformation2, promoteInformation3, discount, indexStorage1, indexStorage2, indexStorage3, thousandNumber, MAX_Z, recoveryStorage, promoteDate7, promoteDate8, promoteDate9, promoteInformation4, promoteInformation5, promoteInformation6, promoteInformation7, promoteInformation8, promoteInformation9, indexStorage4, indexStorage5, indexStorage6, indexStorage7, indexStorage8, indexStorage9, addPartialValue1, addPartialValue2, addPartialValue3, addPartialValue4, addPartialValue5, addPartialValue6, addPartialValue7, addPartialValue8, addPartialValue9, tempYear, tempMonth, tempDay, createButton, discountMoney, loginNumber);
            } else if (promotionChoice.equals("뒤로가기")) {
                System.out.println("뒤로 가겠습니다.");
                discountDeals(sc, weaponName, recoveryWeaphone, day, price, kind, iValue, sequence, storage, storageValue, start, money, button, buyButton, adminId, adminPassword, accountInformation, loginButton, accountInformationButton, idType, userNumber, capacityValueButton, weaponInformation, categoryRemove, categoryButton, num_of_days, month, year, promotionName, percentageDiscountButton, discountPercent, promotionYear1, promotionMonth1, promotionDay1, promotionYear2, promotionMonth2, promotionDay2, promotionValue1, promotionValue2, promotionValue3, promoteInformation1, timeCount, partialName, checkBox, history, damage, speed, weight, weaponRemoval, maximumInventory, currentInventory, promoteDate1, promoteDate2, promoteDate3, promoteDate4, promoteDate5, promoteDate6, promoteInformation2, promoteInformation3, discount, indexStorage1, indexStorage2, indexStorage3, thousandNumber, MAX_Z, recoveryStorage, promoteDate7, promoteDate8, promoteDate9, promoteInformation4, promoteInformation5, promoteInformation6, promoteInformation7, promoteInformation8, promoteInformation9, indexStorage4, indexStorage5, indexStorage6, indexStorage7, indexStorage8, indexStorage9, addPartialValue1, addPartialValue2, addPartialValue3, addPartialValue4, addPartialValue5, addPartialValue6, addPartialValue7, addPartialValue8, addPartialValue9, tempYear, tempMonth, tempDay, createButton, discountMoney, loginNumber);
            } else {
                for (int i = 0; i < sequence[iValue]; i++) {
                    if (weaponRemoval[iValue * 100 + i] == 0 && promotionChoice.equals(weaponName[iValue * 100 + i])) {
                        if (promotionYear1 == year && promotionMonth1 == month && promotionDay1 == day) {
                            promoteInformation8[iValue * 2000 + i * 20 + addPartialValue8[iValue * 100 + i]] = thousandNumber[8];
                            discountMoney[iValue * 2000 + i * 20 + addPartialValue8[iValue * 100 + i]] = discountPercent;
                            promoteDate8[iValue * 12000 + i * 120 + indexStorage8[iValue * 100 + i] + 0] = promotionYear1;
                            promoteDate8[iValue * 12000 + i * 120 + indexStorage8[iValue * 100 + i] + 1] = promotionMonth1;
                            promoteDate8[iValue * 12000 + i * 120 + indexStorage8[iValue * 100 + i] + 2] = promotionDay1;
                            promoteDate8[iValue * 12000 + i * 120 + indexStorage8[iValue * 100 + i] + 3] = promotionYear2;
                            promoteDate8[iValue * 12000 + i * 120 + indexStorage8[iValue * 100 + i] + 4] = promotionMonth2;
                            promoteDate8[iValue * 12000 + i * 120 + indexStorage8[iValue * 100 + i] + 5] = promotionDay2;
                            createButton = 8;
                            if (checkBox[iValue * 100 + i] == 0) {
                                indexStorage8[iValue * 100 + i] += 6;
                                addPartialValue8[iValue * 100 + i]++;
                                checkBox[iValue * 100 + i] = 1;
                            } else if (checkBox[iValue * 100 + i] == 1) {
                                System.out.println(weaponName[iValue * 100 + i] + "번 무기의 프로모션을 중복선택할 수 없습니닷!");
                            }
                        } else {
                            promoteInformation9[iValue * 2000 + i * 20 + addPartialValue9[iValue * 100 + i]] = thousandNumber[9];
                            discountMoney[iValue * 2000 + i * 20 + addPartialValue9[iValue * 100 + i]] = discountPercent;
                            promoteDate9[iValue * 12000 + i * 120 + indexStorage9[iValue * 100 + i] + 0] = promotionYear1;
                            promoteDate9[iValue * 12000 + i * 120 + indexStorage9[iValue * 100 + i] + 1] = promotionMonth1;
                            promoteDate9[iValue * 12000 + i * 120 + indexStorage9[iValue * 100 + i] + 2] = promotionDay1;
                            promoteDate9[iValue * 12000 + i * 120 + indexStorage9[iValue * 100 + i] + 3] = promotionYear2;
                            promoteDate9[iValue * 12000 + i * 120 + indexStorage9[iValue * 100 + i] + 4] = promotionMonth2;
                            promoteDate9[iValue * 12000 + i * 120 + indexStorage9[iValue * 100 + i] + 5] = promotionDay2;
                            createButton = 9;
                            if (checkBox[iValue * 100 + i] == 0) {
                                indexStorage9[iValue * 100 + i] += 6;
                                addPartialValue9[iValue * 100 + i]++;
                                checkBox[iValue * 100 + i] = 1;
                            } else if (checkBox[iValue * 100 + i] == 1) {
                                System.out.println(weaponName[iValue * 100 + i] + "번 무기의 프로모션을 중복선택할 수 없습니닷!");
                            }
                        }
                        percentageDiscountButton = 1;
                        check2 = 1;
                    }
                }
                if(check2 == 0) {
                    System.out.println("잘못된 무기명을 입력하였습니다.");
                    check = 1;
                }
                if (check == 0) {
                    addPartial(sc, weaponName, recoveryWeaphone, day, price, kind, iValue, sequence, storage, storageValue, start, money, button, buyButton, adminId, adminPassword, accountInformation, loginButton, accountInformationButton, idType, userNumber, capacityValueButton, weaponInformation, categoryRemove, categoryButton, num_of_days, month, year, promotionName, percentageDiscountButton, discountPercent, promotionYear1, promotionMonth1, promotionDay1, promotionYear2, promotionMonth2, promotionDay2, promotionValue1, promotionValue2, promotionValue3, promoteInformation1, timeCount, partialName, checkBox, history, damage, speed, weight, weaponRemoval, maximumInventory, currentInventory, promoteDate1, promoteDate2, promoteDate3, promoteDate4, promoteDate5, promoteDate6, promoteInformation2, promoteInformation3, discount, indexStorage1, indexStorage2, indexStorage3, thousandNumber, MAX_Z, recoveryStorage, promoteDate7, promoteDate8, promoteDate9, promoteInformation4, promoteInformation5, promoteInformation6, promoteInformation7, promoteInformation8, promoteInformation9, indexStorage4, indexStorage5, indexStorage6, indexStorage7, indexStorage8, indexStorage9, addPartialValue1, addPartialValue2, addPartialValue3, addPartialValue4, addPartialValue5, addPartialValue6, addPartialValue7, addPartialValue8, addPartialValue9, tempYear, tempMonth, tempDay, createButton, discountMoney, loginNumber);
                }
                check2 = 0;
                check = 0;
            }
        }
    }

    public static void seePromotion(Scanner sc, String[] weaponName, int[] recoveryWeaphone, int day, int[] price, String[] kind, int iValue, int[] sequence, int[] storage, int storageValue, int start, long[] money, int button, int buyButton, String adminId, String adminPassword, String[] accountInformation, int loginButton, int accountInformationButton, String idType, int userNumber, int[] capacityValueButton, int[] weaponInformation, int[] categoryRemove, int categoryButton, int[] num_of_days, int month, int year, String[] promotionName, int percentageDiscountButton, int discountPercent, int promotionYear1, int promotionMonth1, int promotionDay1, int promotionYear2, int promotionMonth2, int promotionDay2, int promotionValue1, int promotionValue2, int promotionValue3, int[] promoteInformation1, int[] timeCount, String[] partialName, int[] checkBox, int[] history, int[] damage, int[] speed, int[] weight, int[] weaponRemoval, int[] maximumInventory, int[] currentInventory, int[] promoteDate1, int[] promoteDate2, int[] promoteDate3, int[] promoteDate4, int[] promoteDate5, int[] promoteDate6, int[] promoteInformation2, int[] promoteInformation3, int[] discount, int[] indexStorage1, int[] indexStorage2, int[] indexStorage3, int[] thousandNumber, int MAX_Z, int[] recoveryStorage, int[] promoteDate7, int[] promoteDate8, int[] promoteDate9, int[] promoteInformation4, int[] promoteInformation5, int[] promoteInformation6, int[] promoteInformation7, int[] promoteInformation8, int[] promoteInformation9, int[] indexStorage4, int[] indexStorage5, int[] indexStorage6, int[] indexStorage7, int[] indexStorage8, int[] indexStorage9, int[] addPartialValue1, int[] addPartialValue2, int[] addPartialValue3, int[] addPartialValue4, int[] addPartialValue5, int[] addPartialValue6, int[] addPartialValue7, int[] addPartialValue8, int[] addPartialValue9, int tempYear, int tempMonth, int tempDay, int createButton, int[] discountMoney, int loginNumber
    ) {
        int seePromotionButton = 0;
        int seePromotionButton2 = 0;
        int seePromotionValue1 = 0;
        System.out.println("프로모션 리스트를 확인합니다");
        System.out.println("★☆★종료된 프로모션★☆★");
        //[iValue * 2000 + i * 20 + indexStorage3[iValue * 100 + i]]
        /**
         * %할인
         */
        for (int e = 1000; e < 1020; e++) {
            for (int i = 0; i < 200000; i += 2000) {
                for (int j = 0; j < 2000; j += 20) {
                    for (int k = 0; k < 20; k++) {
                        if (promoteInformation1[i + j + k] == e) {
                            if (seePromotionButton == 0) {

                                System.out.printf("%d년 %d월 %d일 ~ %d년 %d월 %d일\n", promoteDate1[i * 6 + j * 6 + k * 6 + 0], promoteDate1[i * 6 + j * 6 + k * 6 + 1], promoteDate1[i * 6 + j * 6 + k * 6 + 2], promoteDate1[i * 6 + j * 6 + k * 6 + 3], promoteDate1[i * 6 + j * 6 + k * 6 + 4], promoteDate1[i * 6 + j * 6 + k * 6 + 5]);
                                System.out.println(discount[k] + "%할인");
                                seePromotionButton = 1;
                            }
                            if (seePromotionButton2 == 0) {
                                System.out.printf("---%s---\n", kind[i / 2000]);
                                seePromotionButton2 = 1;
                            }
                            System.out.printf("%s\n", weaponName[i / 2000 * 100 + j % 2000 / 20]);
                        }
                    }
                }
                seePromotionButton2 = 0;
                seePromotionValue1++;
            }
            seePromotionButton = 0;
        }
        seePromotionValue1 = 0;

        for (int e = 4000; e < 4020; e++) {
            for (int i = 0; i < 200000; i += 2000) {
                for (int j = 0; j < 2000; j += 20) {
                    for (int k = 0; k < 20; k++) {
                        if (promoteInformation4[i + j + k] == e) {
                            if (seePromotionButton == 0) {
                                System.out.printf("%d년 %d월 %d일 ~ %d년 %d월 %d일\n", promoteDate4[i * 6 + j * 6 + k * 6 + 0], promoteDate2[i * 6 + j * 6 + k * 6 + 1], promoteDate4[i * 6 + j * 6 + k * 6 + 2], promoteDate4[i * 6 + j * 6 + k * 6 + 3], promoteDate4[i * 6 + j * 6 + k * 6 + 4], promoteDate4[i * 6 + j * 6 + k * 6 + 5]);
                                System.out.println("1 + 1 무료");
                                seePromotionButton = 1;
                            }
                            if (seePromotionButton2 == 0) {
                                System.out.printf("---%s---\n", kind[i / 2000]);
                                seePromotionButton2 = 1;
                            }
                            System.out.printf("%s\n", weaponName[i / 2000 * 100 + j % 2000 / 20]);
                        }
                    }
                }
                seePromotionButton2 = 0;
                seePromotionValue1++;
            }
            seePromotionButton = 0;
        }
        seePromotionValue1 = 0;

        for (int e = 7000; e < 7020; e++) {
            for (int i = 0; i < 200000; i += 2000) {
                for (int j = 0; j < 2000; j += 20) {
                    for (int k = 0; k < 20; k++) {
                        if (promoteInformation7[i + j + k] == e) {
                            if (seePromotionButton == 0) {
                                System.out.printf("%d년 %d월 %d일 ~ %d년 %d월 %d일\n", promoteDate7[i * 6 + j * 6 + k * 6 + 0], promoteDate7[i * 6 + j * 6 + k * 6 + 1], promoteDate7[i * 6 + j * 6 + k * 6 + 2], promoteDate7[i * 6 + j * 6 + k * 6 + 3], promoteDate7[i * 6 + j * 6 + k * 6 + 4], promoteDate7[i * 6 + j * 6 + k * 6 + 5]);
                                System.out.println(discount[k] + "원 할인");
                                seePromotionButton = 1;
                            }
                            if (seePromotionButton2 == 0) {

                                System.out.printf("---%s---\n", kind[i / 2000]);
                                seePromotionButton2 = 1;
                            }
                            System.out.printf("%s\n", weaponName[i / 2000 * 100 + j % 2000 / 20]);

                        }
                    }
                }
                seePromotionButton2 = 0;
                seePromotionValue1++;
            }
            seePromotionButton = 0;
        }
        seePromotionValue1 = 0;

        System.out.println("★☆★진행중인 프로모션★☆★");
        //[iValue * 2000 + i * 20 + indexStorage3[iValue * 100 + i]]
        for (int e = 2000; e < 2020; e++) {
            for (int i = 0; i < 200000; i += 2000) {
                for (int j = 0; j < 2000; j += 20) {
                    for (int k = 0; k < 20; k++) {
                        if (promoteInformation2[i + j + k] == e) {
                            if (seePromotionButton == 0) {
                                System.out.printf("%d년 %d월 %d일 ~ %d년 %d월 %d일\n", promoteDate2[i * 6 + j * 6 + k * 6 + 0], promoteDate2[i * 6 + j * 6 + k * 6 + 1], promoteDate2[i * 6 + j * 6 + k * 6 + 2], promoteDate2[i * 6 + j * 6 + k * 6 + 3], promoteDate2[i * 6 + j * 6 + k * 6 + 4], promoteDate2[i * 6 + j * 6 + k * 6 + 5]);
                                System.out.println(discount[k] + "%할인");
                                seePromotionButton = 1;
                            }
                            if (seePromotionButton2 == 0) {
                                System.out.printf("---%s---\n", kind[i / 2000]);
                                seePromotionButton2 = 1;
                            }
                            System.out.printf("%s\n", weaponName[i / 2000 * 100 + j % 2000 / 20]);

                        }
                    }
                }
                seePromotionButton2 = 0;
                seePromotionValue1++;
            }
            seePromotionButton = 0;
        }
        seePromotionValue1 = 0;

        for (int e = 5000; e < 5020; e++) {
            for (int i = 0; i < 200000; i += 2000) {
                for (int j = 0; j < 2000; j += 20) {
                    for (int k = 0; k < 20; k++) {
                        if (promoteInformation5[i + j + k] == e) {
                            if (seePromotionButton == 0) {
                                System.out.printf("%d년 %d월 %d일 ~ %d년 %d월 %d일\n", promoteDate5[i * 6 + j * 6 + k * 6 + 0], promoteDate5[i * 6 + j * 6 + k * 6 + 1], promoteDate5[i * 6 + j * 6 + k * 6 + 2], promoteDate5[i * 6 + j * 6 + k * 6 + 3], promoteDate5[i * 6 + j * 6 + k * 6 + 4], promoteDate5[i * 6 + j * 6 + k * 6 + 5]);
                                System.out.println("1 + 1 무료");
                                seePromotionButton = 1;
                            }
                            if (seePromotionButton2 == 0) {
                                System.out.printf("---%s---\n", kind[i / 2000]);
                                seePromotionButton2 = 1;
                            }
                            System.out.printf("%s\n", weaponName[i / 2000 * 100 + j % 2000 / 20]);

                        }
                    }
                }
                seePromotionButton2 = 0;
                seePromotionValue1++;
            }
            seePromotionButton = 0;
        }
        seePromotionValue1 = 0;

        for (int e = 8000; e < 8020; e++) {
            for (int i = 0; i < 200000; i += 2000) {
                for (int j = 0; j < 2000; j += 20) {
                    for (int k = 0; k < 20; k++) {
                        if (promoteInformation8[i + j + k] == e) {
                            if (seePromotionButton == 0) {
                                System.out.printf("%d년 %d월 %d일 ~ %d년 %d월 %d일\n", promoteDate8[i * 6 + j * 6 + k * 6 + 0], promoteDate8[i * 6 + j * 6 + k * 6 + 1], promoteDate8[i * 6 + j * 6 + k * 6 + 2], promoteDate8[i * 6 + j * 6 + k * 6 + 3], promoteDate8[i * 6 + j * 6 + k * 6 + 4], promoteDate8[i * 6 + j * 6 + k * 6 + 5]);
                                System.out.println(discount[k] + "원 할인");
                                seePromotionButton = 1;
                            }
                            if (seePromotionButton2 == 0) {
                                System.out.printf("---%s---\n", kind[i / 2000]);
                                seePromotionButton2 = 1;
                            }
                            System.out.printf("%s\n", weaponName[i / 2000 * 100 + j % 2000 / 20]);

                        }
                    }
                }
                seePromotionButton2 = 0;
                seePromotionValue1++;
            }
            seePromotionButton = 0;
        }
        seePromotionValue1 = 0;

        //-------------------------------------------------------------------
        System.out.println("★☆★프로모션 예정★☆★");
        //[iValue * 2000 + i * 20 + indexStorage3[iValue * 100 + i]]
        for (int e = 3000; e < 3020; e++) {
            for (int i = 0; i < 200000; i += 2000) {
                for (int j = 0; j < 2000; j += 20) {
                    for (int k = 0; k < 20; k++) {
                        if (promoteInformation3[i + j + k] == e) {
                            if (seePromotionButton == 0) {
                                System.out.printf("%d년 %d월 %d일 ~ %d년 %d월 %d일\n", promoteDate3[i * 6 + j * 6 + k * 6 + 0], promoteDate3[i * 6 + j * 6 + k * 6 + 1], promoteDate3[i * 6 + j * 6 + k * 6 + 2], promoteDate3[i * 6 + j * 6 + k * 6 + 3], promoteDate3[i * 6 + j * 6 + k * 6 + 4], promoteDate3[i * 6 + j * 6 + k * 6 + 5]);
                                System.out.println(discount[k] + "%할인");
                                seePromotionButton = 1;
                            }
                            if (seePromotionButton2 == 0) {
                                System.out.printf("---%s---\n", kind[i / 2000]);
                                seePromotionButton2 = 1;
                            }
                            System.out.printf("%s\n", weaponName[i / 2000 * 100 + j % 2000 / 20]);

                        }
                    }
                }
                seePromotionButton2 = 0;
                seePromotionValue1++;
            }
            seePromotionButton = 0;
        }
        seePromotionValue1 = 0;

        for (int e = 6000; e < 6020; e++) {
            for (int i = 0; i < 200000; i += 2000) {
                for (int j = 0; j < 2000; j += 20) {
                    for (int k = 0; k < 20; k++) {
                        if (promoteInformation6[i + j + k] == e) {
                            if (seePromotionButton == 0) {
                                System.out.printf("%d년 %d월 %d일 ~ %d년 %d월 %d일\n", promoteDate6[i * 6 + j * 6 + k * 6 + 0], promoteDate6[i * 6 + j * 6 + k * 6 + 1], promoteDate6[i * 6 + j * 6 + k * 6 + 2], promoteDate6[i * 6 + j * 6 + k * 6 + 3], promoteDate6[i * 6 + j * 6 + k * 6 + 4], promoteDate6[i * 6 + j * 6 + k * 6 + 5]);
                                System.out.println("1 + 1 무료");
                                seePromotionButton = 1;
                            }
                            if (seePromotionButton2 == 0) {
                                System.out.printf("---%s---\n", kind[i / 2000]);
                                seePromotionButton2 = 1;
                            }
                            System.out.printf("%s\n", weaponName[i / 2000 * 100 + j % 2000 / 20]);

                        }
                    }
                }
                seePromotionButton2 = 0;
                seePromotionValue1++;
            }
            seePromotionButton = 0;
        }
        seePromotionValue1 = 0;

        for (int e = 9000; e < 9020; e++) {
            for (int i = 0; i < 200000; i += 2000) {
                for (int j = 0; j < 2000; j += 20) {
                    for (int k = 0; k < 20; k++) {
                        if (promoteInformation9[i + j + k] == e) {
                            if (seePromotionButton == 0) {
                                System.out.printf("%d년 %d월 %d일 ~ %d년 %d월 %d일\n", promoteDate9[i * 6 + j * 6 + k * 6 + 0], promoteDate9[i * 6 + j * 6 + k * 6 + 1], promoteDate9[i * 6 + j * 6 + k * 6 + 2], promoteDate9[i * 6 + j * 6 + k * 6 + 3], promoteDate9[i * 6 + j * 6 + k * 6 + 4], promoteDate9[i * 6 + j * 6 + k * 6 + 5]);
                                System.out.println(discount[k] + "원 할인");
                                seePromotionButton = 1;
                            }
                            if (seePromotionButton2 == 0) {
                                System.out.printf("---%s---\n", kind[i / 2000]);
                                seePromotionButton2 = 1;
                            }
                            System.out.printf("%s\n", weaponName[i / 2000 * 100 + j % 2000 / 20]);

                        }
                    }
                }
                seePromotionButton2 = 0;
                seePromotionValue1++;
            }
            seePromotionButton = 0;
        }
        seePromotionValue1 = 0;
        //----------------------------------------------------------------------------

        adminUi(sc, weaponName, recoveryWeaphone, day, price, kind, iValue, sequence, storage, storageValue, start, money, button, buyButton, adminId, adminPassword, accountInformation, loginButton, accountInformationButton, idType, userNumber, capacityValueButton, weaponInformation, categoryRemove, categoryButton, num_of_days, month, year, promotionName, percentageDiscountButton, discountPercent, promotionYear1, promotionMonth1, promotionDay1, promotionYear2, promotionMonth2, promotionDay2, promotionValue1, promotionValue2, promotionValue3, promoteInformation1, timeCount, partialName, checkBox, history, damage, speed, weight, weaponRemoval, maximumInventory, currentInventory, promoteDate1, promoteDate2, promoteDate3, promoteDate4, promoteDate5, promoteDate6, promoteInformation2, promoteInformation3, discount, indexStorage1, indexStorage2, indexStorage3, thousandNumber, MAX_Z, recoveryStorage, promoteDate7, promoteDate8, promoteDate9, promoteInformation4, promoteInformation5, promoteInformation6, promoteInformation7, promoteInformation8, promoteInformation9, indexStorage4, indexStorage5, indexStorage6, indexStorage7, indexStorage8, indexStorage9, addPartialValue1, addPartialValue2, addPartialValue3, addPartialValue4, addPartialValue5, addPartialValue6, addPartialValue7, addPartialValue8, addPartialValue9, tempYear, tempMonth, tempDay, createButton, discountMoney, loginNumber);
    }

    public static void removePromotion(Scanner sc, String[] weaponName, int[] recoveryWeaphone, int day, int[] price, String[] kind, int iValue, int[] sequence, int[] storage, int storageValue, int start, long[] money, int button, int buyButton, String adminId, String adminPassword, String[] accountInformation, int loginButton, int accountInformationButton, String idType, int userNumber, int[] capacityValueButton, int[] weaponInformation, int[] categoryRemove, int categoryButton, int[] num_of_days, int month, int year, String[] promotionName, int percentageDiscountButton, int discountPercent, int promotionYear1, int promotionMonth1, int promotionDay1, int promotionYear2, int promotionMonth2, int promotionDay2, int promotionValue1, int promotionValue2, int promotionValue3, int[] promoteInformation1, int[] timeCount, String[] partialName, int[] checkBox, int[] history, int[] damage, int[] speed, int[] weight, int[] weaponRemoval, int[] maximumInventory, int[] currentInventory, int[] promoteDate1, int[] promoteDate2, int[] promoteDate3, int[] promoteDate4, int[] promoteDate5, int[] promoteDate6, int[] promoteInformation2, int[] promoteInformation3, int[] discount, int[] indexStorage1, int[] indexStorage2, int[] indexStorage3, int[] thousandNumber, int MAX_Z, int[] recoveryStorage, int[] promoteDate7, int[] promoteDate8, int[] promoteDate9, int[] promoteInformation4, int[] promoteInformation5, int[] promoteInformation6, int[] promoteInformation7, int[] promoteInformation8, int[] promoteInformation9, int[] indexStorage4, int[] indexStorage5, int[] indexStorage6, int[] indexStorage7, int[] indexStorage8, int[] indexStorage9, int[] addPartialValue1, int[] addPartialValue2, int[] addPartialValue3, int[] addPartialValue4, int[] addPartialValue5, int[] addPartialValue6, int[] addPartialValue7, int[] addPartialValue8, int[] addPartialValue9, int tempYear, int tempMonth, int tempDay, int createButton, int[] discountMoney, int loginNumber
    ) {
        System.out.println("프로모션을 제거합니다.");
        System.out.println("1. 모든 프로모션 없애기");
        System.out.println("2. 프로모션 그룹 하나 없애기 - 날짜 입력 필요");
        System.out.println("3. 한 카테고리의 프로모션 전부 없애기");
        System.out.println("4. 각각의 프로모션 없애기");
        System.out.println("5. 관리자 UI로 돌아가기");
        int y = sc.nextInt();
        if (y == 1) {
            removeAllPromotion(sc, weaponName, recoveryWeaphone, day, price, kind, iValue, sequence, storage, storageValue, start, money, button, buyButton, adminId, adminPassword, accountInformation, loginButton, accountInformationButton, idType, userNumber, capacityValueButton, weaponInformation, categoryRemove, categoryButton, num_of_days, month, year, promotionName, percentageDiscountButton, discountPercent, promotionYear1, promotionMonth1, promotionDay1, promotionYear2, promotionMonth2, promotionDay2, promotionValue1, promotionValue2, promotionValue3, promoteInformation1, timeCount, partialName, checkBox, history, damage, speed, weight, weaponRemoval, maximumInventory, currentInventory, promoteDate1, promoteDate2, promoteDate3, promoteDate4, promoteDate5, promoteDate6, promoteInformation2, promoteInformation3, discount, indexStorage1, indexStorage2, indexStorage3, thousandNumber, MAX_Z, recoveryStorage, promoteDate7, promoteDate8, promoteDate9, promoteInformation4, promoteInformation5, promoteInformation6, promoteInformation7, promoteInformation8, promoteInformation9, indexStorage4, indexStorage5, indexStorage6, indexStorage7, indexStorage8, indexStorage9, addPartialValue1, addPartialValue2, addPartialValue3, addPartialValue4, addPartialValue5, addPartialValue6, addPartialValue7, addPartialValue8, addPartialValue9, tempYear, tempMonth, tempDay, createButton, discountMoney, loginNumber);
        } else if (y == 2) {
            removeGroupPromotion(sc, weaponName, recoveryWeaphone, day, price, kind, iValue, sequence, storage, storageValue, start, money, button, buyButton, adminId, adminPassword, accountInformation, loginButton, accountInformationButton, idType, userNumber, capacityValueButton, weaponInformation, categoryRemove, categoryButton, num_of_days, month, year, promotionName, percentageDiscountButton, discountPercent, promotionYear1, promotionMonth1, promotionDay1, promotionYear2, promotionMonth2, promotionDay2, promotionValue1, promotionValue2, promotionValue3, promoteInformation1, timeCount, partialName, checkBox, history, damage, speed, weight, weaponRemoval, maximumInventory, currentInventory, promoteDate1, promoteDate2, promoteDate3, promoteDate4, promoteDate5, promoteDate6, promoteInformation2, promoteInformation3, discount, indexStorage1, indexStorage2, indexStorage3, thousandNumber, MAX_Z, recoveryStorage, promoteDate7, promoteDate8, promoteDate9, promoteInformation4, promoteInformation5, promoteInformation6, promoteInformation7, promoteInformation8, promoteInformation9, indexStorage4, indexStorage5, indexStorage6, indexStorage7, indexStorage8, indexStorage9, addPartialValue1, addPartialValue2, addPartialValue3, addPartialValue4, addPartialValue5, addPartialValue6, addPartialValue7, addPartialValue8, addPartialValue9, tempYear, tempMonth, tempDay, createButton, discountMoney, loginNumber);
        } else if (y == 3) {
            removeCategoryPromotion(sc, weaponName, recoveryWeaphone, day, price, kind, iValue, sequence, storage, storageValue, start, money, button, buyButton, adminId, adminPassword, accountInformation, loginButton, accountInformationButton, idType, userNumber, capacityValueButton, weaponInformation, categoryRemove, categoryButton, num_of_days, month, year, promotionName, percentageDiscountButton, discountPercent, promotionYear1, promotionMonth1, promotionDay1, promotionYear2, promotionMonth2, promotionDay2, promotionValue1, promotionValue2, promotionValue3, promoteInformation1, timeCount, partialName, checkBox, history, damage, speed, weight, weaponRemoval, maximumInventory, currentInventory, promoteDate1, promoteDate2, promoteDate3, promoteDate4, promoteDate5, promoteDate6, promoteInformation2, promoteInformation3, discount, indexStorage1, indexStorage2, indexStorage3, thousandNumber, MAX_Z, recoveryStorage, promoteDate7, promoteDate8, promoteDate9, promoteInformation4, promoteInformation5, promoteInformation6, promoteInformation7, promoteInformation8, promoteInformation9, indexStorage4, indexStorage5, indexStorage6, indexStorage7, indexStorage8, indexStorage9, addPartialValue1, addPartialValue2, addPartialValue3, addPartialValue4, addPartialValue5, addPartialValue6, addPartialValue7, addPartialValue8, addPartialValue9, tempYear, tempMonth, tempDay, createButton, discountMoney, loginNumber);
        } else if (y == 4) {
            removeIndividualPromotion(sc, weaponName, recoveryWeaphone, day, price, kind, iValue, sequence, storage, storageValue, start, money, button, buyButton, adminId, adminPassword, accountInformation, loginButton, accountInformationButton, idType, userNumber, capacityValueButton, weaponInformation, categoryRemove, categoryButton, num_of_days, month, year, promotionName, percentageDiscountButton, discountPercent, promotionYear1, promotionMonth1, promotionDay1, promotionYear2, promotionMonth2, promotionDay2, promotionValue1, promotionValue2, promotionValue3, promoteInformation1, timeCount, partialName, checkBox, history, damage, speed, weight, weaponRemoval, maximumInventory, currentInventory, promoteDate1, promoteDate2, promoteDate3, promoteDate4, promoteDate5, promoteDate6, promoteInformation2, promoteInformation3, discount, indexStorage1, indexStorage2, indexStorage3, thousandNumber, MAX_Z, recoveryStorage, promoteDate7, promoteDate8, promoteDate9, promoteInformation4, promoteInformation5, promoteInformation6, promoteInformation7, promoteInformation8, promoteInformation9, indexStorage4, indexStorage5, indexStorage6, indexStorage7, indexStorage8, indexStorage9, addPartialValue1, addPartialValue2, addPartialValue3, addPartialValue4, addPartialValue5, addPartialValue6, addPartialValue7, addPartialValue8, addPartialValue9, tempYear, tempMonth, tempDay, createButton, discountMoney, loginNumber);
        } else if (y == 5) {
            adminUi(sc, weaponName, recoveryWeaphone, day, price, kind, iValue, sequence, storage, storageValue, start, money, button, buyButton, adminId, adminPassword, accountInformation, loginButton, accountInformationButton, idType, userNumber, capacityValueButton, weaponInformation, categoryRemove, categoryButton, num_of_days, month, year, promotionName, percentageDiscountButton, discountPercent, promotionYear1, promotionMonth1, promotionDay1, promotionYear2, promotionMonth2, promotionDay2, promotionValue1, promotionValue2, promotionValue3, promoteInformation1, timeCount, partialName, checkBox, history, damage, speed, weight, weaponRemoval, maximumInventory, currentInventory, promoteDate1, promoteDate2, promoteDate3, promoteDate4, promoteDate5, promoteDate6, promoteInformation2, promoteInformation3, discount, indexStorage1, indexStorage2, indexStorage3, thousandNumber, MAX_Z, recoveryStorage, promoteDate7, promoteDate8, promoteDate9, promoteInformation4, promoteInformation5, promoteInformation6, promoteInformation7, promoteInformation8, promoteInformation9, indexStorage4, indexStorage5, indexStorage6, indexStorage7, indexStorage8, indexStorage9, addPartialValue1, addPartialValue2, addPartialValue3, addPartialValue4, addPartialValue5, addPartialValue6, addPartialValue7, addPartialValue8, addPartialValue9, tempYear, tempMonth, tempDay, createButton, discountMoney, loginNumber);
        }
    }

    public static void removeAllPromotion(Scanner sc, String[] weaponName, int[] recoveryWeaphone, int day, int[] price, String[] kind, int iValue, int[] sequence, int[] storage, int storageValue, int start, long[] money, int button, int buyButton, String adminId, String adminPassword, String[] accountInformation, int loginButton, int accountInformationButton, String idType, int userNumber, int[] capacityValueButton, int[] weaponInformation, int[] categoryRemove, int categoryButton, int[] num_of_days, int month, int year, String[] promotionName, int percentageDiscountButton, int discountPercent, int promotionYear1, int promotionMonth1, int promotionDay1, int promotionYear2, int promotionMonth2, int promotionDay2, int promotionValue1, int promotionValue2, int promotionValue3, int[] promoteInformation1, int[] timeCount, String[] partialName, int[] checkBox, int[] history, int[] damage, int[] speed, int[] weight, int[] weaponRemoval, int[] maximumInventory, int[] currentInventory, int[] promoteDate1, int[] promoteDate2, int[] promoteDate3, int[] promoteDate4, int[] promoteDate5, int[] promoteDate6, int[] promoteInformation2, int[] promoteInformation3, int[] discount, int[] indexStorage1, int[] indexStorage2, int[] indexStorage3, int[] thousandNumber, int MAX_Z, int[] recoveryStorage, int[] promoteDate7, int[] promoteDate8, int[] promoteDate9, int[] promoteInformation4, int[] promoteInformation5, int[] promoteInformation6, int[] promoteInformation7, int[] promoteInformation8, int[] promoteInformation9, int[] indexStorage4, int[] indexStorage5, int[] indexStorage6, int[] indexStorage7, int[] indexStorage8, int[] indexStorage9, int[] addPartialValue1, int[] addPartialValue2, int[] addPartialValue3, int[] addPartialValue4, int[] addPartialValue5, int[] addPartialValue6, int[] addPartialValue7, int[] addPartialValue8, int[] addPartialValue9, int tempYear, int tempMonth, int tempDay, int createButton, int[] discountMoney, int loginNumber
    ) {
        System.out.println("프로모션을 전부 제거합니다.");
        for (int i = 0; i < MAX_Z; i++) {
        }
        removePromotion(sc, weaponName, recoveryWeaphone, day, price, kind, iValue, sequence, storage, storageValue, start, money, button, buyButton, adminId, adminPassword, accountInformation, loginButton, accountInformationButton, idType, userNumber, capacityValueButton, weaponInformation, categoryRemove, categoryButton, num_of_days, month, year, promotionName, percentageDiscountButton, discountPercent, promotionYear1, promotionMonth1, promotionDay1, promotionYear2, promotionMonth2, promotionDay2, promotionValue1, promotionValue2, promotionValue3, promoteInformation1, timeCount, partialName, checkBox, history, damage, speed, weight, weaponRemoval, maximumInventory, currentInventory, promoteDate1, promoteDate2, promoteDate3, promoteDate4, promoteDate5, promoteDate6, promoteInformation2, promoteInformation3, discount, indexStorage1, indexStorage2, indexStorage3, thousandNumber, MAX_Z, recoveryStorage, promoteDate7, promoteDate8, promoteDate9, promoteInformation4, promoteInformation5, promoteInformation6, promoteInformation7, promoteInformation8, promoteInformation9, indexStorage4, indexStorage5, indexStorage6, indexStorage7, indexStorage8, indexStorage9, addPartialValue1, addPartialValue2, addPartialValue3, addPartialValue4, addPartialValue5, addPartialValue6, addPartialValue7, addPartialValue8, addPartialValue9, tempYear, tempMonth, tempDay, createButton, discountMoney, loginNumber);
    }

    public static void removeGroupPromotion(Scanner sc, String[] weaponName, int[] recoveryWeaphone, int day, int[] price, String[] kind, int iValue, int[] sequence, int[] storage, int storageValue, int start, long[] money, int button, int buyButton, String adminId, String adminPassword, String[] accountInformation, int loginButton, int accountInformationButton, String idType, int userNumber, int[] capacityValueButton, int[] weaponInformation, int[] categoryRemove, int categoryButton, int[] num_of_days, int month, int year, String[] promotionName, int percentageDiscountButton, int discountPercent, int promotionYear1, int promotionMonth1, int promotionDay1, int promotionYear2, int promotionMonth2, int promotionDay2, int promotionValue1, int promotionValue2, int promotionValue3, int[] promoteInformation1, int[] timeCount, String[] partialName, int[] checkBox, int[] history, int[] damage, int[] speed, int[] weight, int[] weaponRemoval, int[] maximumInventory, int[] currentInventory, int[] promoteDate1, int[] promoteDate2, int[] promoteDate3, int[] promoteDate4, int[] promoteDate5, int[] promoteDate6, int[] promoteInformation2, int[] promoteInformation3, int[] discount, int[] indexStorage1, int[] indexStorage2, int[] indexStorage3, int[] thousandNumber, int MAX_Z, int[] recoveryStorage, int[] promoteDate7, int[] promoteDate8, int[] promoteDate9, int[] promoteInformation4, int[] promoteInformation5, int[] promoteInformation6, int[] promoteInformation7, int[] promoteInformation8, int[] promoteInformation9, int[] indexStorage4, int[] indexStorage5, int[] indexStorage6, int[] indexStorage7, int[] indexStorage8, int[] indexStorage9, int[] addPartialValue1, int[] addPartialValue2, int[] addPartialValue3, int[] addPartialValue4, int[] addPartialValue5, int[] addPartialValue6, int[] addPartialValue7, int[] addPartialValue8, int[] addPartialValue9, int tempYear, int tempMonth, int tempDay, int createButton, int[] discountMoney, int loginNumber
    ) {
        removePromotion(sc, weaponName, recoveryWeaphone, day, price, kind, iValue, sequence, storage, storageValue, start, money, button, buyButton, adminId, adminPassword, accountInformation, loginButton, accountInformationButton, idType, userNumber, capacityValueButton, weaponInformation, categoryRemove, categoryButton, num_of_days, month, year, promotionName, percentageDiscountButton, discountPercent, promotionYear1, promotionMonth1, promotionDay1, promotionYear2, promotionMonth2, promotionDay2, promotionValue1, promotionValue2, promotionValue3, promoteInformation1, timeCount, partialName, checkBox, history, damage, speed, weight, weaponRemoval, maximumInventory, currentInventory, promoteDate1, promoteDate2, promoteDate3, promoteDate4, promoteDate5, promoteDate6, promoteInformation2, promoteInformation3, discount, indexStorage1, indexStorage2, indexStorage3, thousandNumber, MAX_Z, recoveryStorage, promoteDate7, promoteDate8, promoteDate9, promoteInformation4, promoteInformation5, promoteInformation6, promoteInformation7, promoteInformation8, promoteInformation9, indexStorage4, indexStorage5, indexStorage6, indexStorage7, indexStorage8, indexStorage9, addPartialValue1, addPartialValue2, addPartialValue3, addPartialValue4, addPartialValue5, addPartialValue6, addPartialValue7, addPartialValue8, addPartialValue9, tempYear, tempMonth, tempDay, createButton, discountMoney, loginNumber);
        System.out.println("그룹화된 프로모션을 제거합니다.");
    }

    public static void removeCategoryPromotion(Scanner sc, String[] weaponName, int[] recoveryWeaphone, int day, int[] price, String[] kind, int iValue, int[] sequence, int[] storage, int storageValue, int start, long[] money, int button, int buyButton, String adminId, String adminPassword, String[] accountInformation, int loginButton, int accountInformationButton, String idType, int userNumber, int[] capacityValueButton, int[] weaponInformation, int[] categoryRemove, int categoryButton, int[] num_of_days, int month, int year, String[] promotionName, int percentageDiscountButton, int discountPercent, int promotionYear1, int promotionMonth1, int promotionDay1, int promotionYear2, int promotionMonth2, int promotionDay2, int promotionValue1, int promotionValue2, int promotionValue3, int[] promoteInformation1, int[] timeCount, String[] partialName, int[] checkBox, int[] history, int[] damage, int[] speed, int[] weight, int[] weaponRemoval, int[] maximumInventory, int[] currentInventory, int[] promoteDate1, int[] promoteDate2, int[] promoteDate3, int[] promoteDate4, int[] promoteDate5, int[] promoteDate6, int[] promoteInformation2, int[] promoteInformation3, int[] discount, int[] indexStorage1, int[] indexStorage2, int[] indexStorage3, int[] thousandNumber, int MAX_Z, int[] recoveryStorage, int[] promoteDate7, int[] promoteDate8, int[] promoteDate9, int[] promoteInformation4, int[] promoteInformation5, int[] promoteInformation6, int[] promoteInformation7, int[] promoteInformation8, int[] promoteInformation9, int[] indexStorage4, int[] indexStorage5, int[] indexStorage6, int[] indexStorage7, int[] indexStorage8, int[] indexStorage9, int[] addPartialValue1, int[] addPartialValue2, int[] addPartialValue3, int[] addPartialValue4, int[] addPartialValue5, int[] addPartialValue6, int[] addPartialValue7, int[] addPartialValue8, int[] addPartialValue9, int tempYear, int tempMonth, int tempDay, int createButton, int[] discountMoney, int loginNumber
    ) {
        removePromotion(sc, weaponName, recoveryWeaphone, day, price, kind, iValue, sequence, storage, storageValue, start, money, button, buyButton, adminId, adminPassword, accountInformation, loginButton, accountInformationButton, idType, userNumber, capacityValueButton, weaponInformation, categoryRemove, categoryButton, num_of_days, month, year, promotionName, percentageDiscountButton, discountPercent, promotionYear1, promotionMonth1, promotionDay1, promotionYear2, promotionMonth2, promotionDay2, promotionValue1, promotionValue2, promotionValue3, promoteInformation1, timeCount, partialName, checkBox, history, damage, speed, weight, weaponRemoval, maximumInventory, currentInventory, promoteDate1, promoteDate2, promoteDate3, promoteDate4, promoteDate5, promoteDate6, promoteInformation2, promoteInformation3, discount, indexStorage1, indexStorage2, indexStorage3, thousandNumber, MAX_Z, recoveryStorage, promoteDate7, promoteDate8, promoteDate9, promoteInformation4, promoteInformation5, promoteInformation6, promoteInformation7, promoteInformation8, promoteInformation9, indexStorage4, indexStorage5, indexStorage6, indexStorage7, indexStorage8, indexStorage9, addPartialValue1, addPartialValue2, addPartialValue3, addPartialValue4, addPartialValue5, addPartialValue6, addPartialValue7, addPartialValue8, addPartialValue9, tempYear, tempMonth, tempDay, createButton, discountMoney, loginNumber);
    }

    public static void removeIndividualPromotion(Scanner sc, String[] weaponName, int[] recoveryWeaphone, int day, int[] price, String[] kind, int iValue, int[] sequence, int[] storage, int storageValue, int start, long[] money, int button, int buyButton, String adminId, String adminPassword, String[] accountInformation, int loginButton, int accountInformationButton, String idType, int userNumber, int[] capacityValueButton, int[] weaponInformation, int[] categoryRemove, int categoryButton, int[] num_of_days, int month, int year, String[] promotionName, int percentageDiscountButton, int discountPercent, int promotionYear1, int promotionMonth1, int promotionDay1, int promotionYear2, int promotionMonth2, int promotionDay2, int promotionValue1, int promotionValue2, int promotionValue3, int[] promoteInformation1, int[] timeCount, String[] partialName, int[] checkBox, int[] history, int[] damage, int[] speed, int[] weight, int[] weaponRemoval, int[] maximumInventory, int[] currentInventory, int[] promoteDate1, int[] promoteDate2, int[] promoteDate3, int[] promoteDate4, int[] promoteDate5, int[] promoteDate6, int[] promoteInformation2, int[] promoteInformation3, int[] discount, int[] indexStorage1, int[] indexStorage2, int[] indexStorage3, int[] thousandNumber, int MAX_Z, int[] recoveryStorage, int[] promoteDate7, int[] promoteDate8, int[] promoteDate9, int[] promoteInformation4, int[] promoteInformation5, int[] promoteInformation6, int[] promoteInformation7, int[] promoteInformation8, int[] promoteInformation9, int[] indexStorage4, int[] indexStorage5, int[] indexStorage6, int[] indexStorage7, int[] indexStorage8, int[] indexStorage9, int[] addPartialValue1, int[] addPartialValue2, int[] addPartialValue3, int[] addPartialValue4, int[] addPartialValue5, int[] addPartialValue6, int[] addPartialValue7, int[] addPartialValue8, int[] addPartialValue9, int tempYear, int tempMonth, int tempDay, int createButton, int[] discountMoney, int loginNumber
    ) {
        removePromotion(sc, weaponName, recoveryWeaphone, day, price, kind, iValue, sequence, storage, storageValue, start, money, button, buyButton, adminId, adminPassword, accountInformation, loginButton, accountInformationButton, idType, userNumber, capacityValueButton, weaponInformation, categoryRemove, categoryButton, num_of_days, month, year, promotionName, percentageDiscountButton, discountPercent, promotionYear1, promotionMonth1, promotionDay1, promotionYear2, promotionMonth2, promotionDay2, promotionValue1, promotionValue2, promotionValue3, promoteInformation1, timeCount, partialName, checkBox, history, damage, speed, weight, weaponRemoval, maximumInventory, currentInventory, promoteDate1, promoteDate2, promoteDate3, promoteDate4, promoteDate5, promoteDate6, promoteInformation2, promoteInformation3, discount, indexStorage1, indexStorage2, indexStorage3, thousandNumber, MAX_Z, recoveryStorage, promoteDate7, promoteDate8, promoteDate9, promoteInformation4, promoteInformation5, promoteInformation6, promoteInformation7, promoteInformation8, promoteInformation9, indexStorage4, indexStorage5, indexStorage6, indexStorage7, indexStorage8, indexStorage9, addPartialValue1, addPartialValue2, addPartialValue3, addPartialValue4, addPartialValue5, addPartialValue6, addPartialValue7, addPartialValue8, addPartialValue9, tempYear, tempMonth, tempDay, createButton, discountMoney, loginNumber);
    }

    /**
     * 관리자 페이지
     */
    public static void adminUi(Scanner sc, String[] weaponName, int[] recoveryWeaphone, int day, int[] price, String[] kind, int iValue, int[] sequence, int[] storage, int storageValue, int start, long[] money, int button, int buyButton, String adminId, String adminPassword, String[] accountInformation, int loginButton, int accountInformationButton, String idType, int userNumber, int[] capacityValueButton, int[] weaponInformation, int[] categoryRemove, int categoryButton, int[] num_of_days, int month, int year, String[] promotionName, int percentageDiscountButton, int discountPercent, int promotionYear1, int promotionMonth1, int promotionDay1, int promotionYear2, int promotionMonth2, int promotionDay2, int promotionValue1, int promotionValue2, int promotionValue3, int[] promoteInformation1, int[] timeCount, String[] partialName, int[] checkBox, int[] history, int[] damage, int[] speed, int[] weight, int[] weaponRemoval, int[] maximumInventory, int[] currentInventory, int[] promoteDate1, int[] promoteDate2, int[] promoteDate3, int[] promoteDate4, int[] promoteDate5, int[] promoteDate6, int[] promoteInformation2, int[] promoteInformation3, int[] discount, int[] indexStorage1, int[] indexStorage2, int[] indexStorage3, int[] thousandNumber, int MAX_Z, int[] recoveryStorage, int[] promoteDate7, int[] promoteDate8, int[] promoteDate9, int[] promoteInformation4, int[] promoteInformation5, int[] promoteInformation6, int[] promoteInformation7, int[] promoteInformation8, int[] promoteInformation9, int[] indexStorage4, int[] indexStorage5, int[] indexStorage6, int[] indexStorage7, int[] indexStorage8, int[] indexStorage9, int[] addPartialValue1, int[] addPartialValue2, int[] addPartialValue3, int[] addPartialValue4, int[] addPartialValue5, int[] addPartialValue6, int[] addPartialValue7, int[] addPartialValue8, int[] addPartialValue9, int tempYear, int tempMonth, int tempDay, int createButton, int[] discountMoney, int loginNumber
    ) {
        System.out.println("1. 모든 항목의 인벤토리 보기");
        System.out.println("2. 인벤토리의 새 항목 추가하기");
        System.out.println("3. 인벤토리의 항목 제거하기");
        /**
         * 업데이트 -> 항목의 최대 재고를 채워주는 버튼, 그리고 재고의 최대재고를 추가해주는 버튼, 재고의 재고수를 입력받아 추가해주는 버튼
         * 무기 추가, 무기 제거
         */
        System.out.println("4. 인벤토리에 항목 업데이트하기");
        System.out.println("5. 인벤토리 복구하기");
        System.out.println("6. 프로모션 만들기 -- 중요 로직");
        System.out.println("7. 프로모션 보기");
        System.out.println("8. 프로모션 제거하기");
        System.out.println("9. 보고서 생성");
        System.out.println("10. 로그아웃");
        try {
            int x = sc.nextInt();

            if (x == 1) {
                seeInventory(sc, weaponName, recoveryWeaphone, day, price, kind, iValue, sequence, storage, storageValue, start, money, button, buyButton, adminId, adminPassword, accountInformation, loginButton, accountInformationButton, idType, userNumber, capacityValueButton, weaponInformation, categoryRemove, categoryButton, num_of_days, month, year, promotionName, percentageDiscountButton, discountPercent, promotionYear1, promotionMonth1, promotionDay1, promotionYear2, promotionMonth2, promotionDay2, promotionValue1, promotionValue2, promotionValue3, promoteInformation1, timeCount, partialName, checkBox, history, damage, speed, weight, weaponRemoval, maximumInventory, currentInventory, promoteDate1, promoteDate2, promoteDate3, promoteDate4, promoteDate5, promoteDate6, promoteInformation2, promoteInformation3, discount, indexStorage1, indexStorage2, indexStorage3, thousandNumber, MAX_Z, recoveryStorage, promoteDate7, promoteDate8, promoteDate9, promoteInformation4, promoteInformation5, promoteInformation6, promoteInformation7, promoteInformation8, promoteInformation9, indexStorage4, indexStorage5, indexStorage6, indexStorage7, indexStorage8, indexStorage9, addPartialValue1, addPartialValue2, addPartialValue3, addPartialValue4, addPartialValue5, addPartialValue6, addPartialValue7, addPartialValue8, addPartialValue9, tempYear, tempMonth, tempDay, createButton, discountMoney, loginNumber);
                adminUi(sc, weaponName, recoveryWeaphone, day, price, kind, iValue, sequence, storage, storageValue, start, money, button, buyButton, adminId, adminPassword, accountInformation, loginButton, accountInformationButton, idType, userNumber, capacityValueButton, weaponInformation, categoryRemove, categoryButton, num_of_days, month, year, promotionName, percentageDiscountButton, discountPercent, promotionYear1, promotionMonth1, promotionDay1, promotionYear2, promotionMonth2, promotionDay2, promotionValue1, promotionValue2, promotionValue3, promoteInformation1, timeCount, partialName, checkBox, history, damage, speed, weight, weaponRemoval, maximumInventory, currentInventory, promoteDate1, promoteDate2, promoteDate3, promoteDate4, promoteDate5, promoteDate6, promoteInformation2, promoteInformation3, discount, indexStorage1, indexStorage2, indexStorage3, thousandNumber, MAX_Z, recoveryStorage, promoteDate7, promoteDate8, promoteDate9, promoteInformation4, promoteInformation5, promoteInformation6, promoteInformation7, promoteInformation8, promoteInformation9, indexStorage4, indexStorage5, indexStorage6, indexStorage7, indexStorage8, indexStorage9, addPartialValue1, addPartialValue2, addPartialValue3, addPartialValue4, addPartialValue5, addPartialValue6, addPartialValue7, addPartialValue8, addPartialValue9, tempYear, tempMonth, tempDay, createButton, discountMoney, loginNumber);
            } else if (x == 2) {
                addCategory(sc, weaponName, recoveryWeaphone, day, price, kind, iValue, sequence, storage, storageValue, start, money, button, buyButton, adminId, adminPassword, accountInformation, loginButton, accountInformationButton, idType, userNumber, capacityValueButton, weaponInformation, categoryRemove, categoryButton, num_of_days, month, year, promotionName, percentageDiscountButton, discountPercent, promotionYear1, promotionMonth1, promotionDay1, promotionYear2, promotionMonth2, promotionDay2, promotionValue1, promotionValue2, promotionValue3, promoteInformation1, timeCount, partialName, checkBox, history, damage, speed, weight, weaponRemoval, maximumInventory, currentInventory, promoteDate1, promoteDate2, promoteDate3, promoteDate4, promoteDate5, promoteDate6, promoteInformation2, promoteInformation3, discount, indexStorage1, indexStorage2, indexStorage3, thousandNumber, MAX_Z, recoveryStorage, promoteDate7, promoteDate8, promoteDate9, promoteInformation4, promoteInformation5, promoteInformation6, promoteInformation7, promoteInformation8, promoteInformation9, indexStorage4, indexStorage5, indexStorage6, indexStorage7, indexStorage8, indexStorage9, addPartialValue1, addPartialValue2, addPartialValue3, addPartialValue4, addPartialValue5, addPartialValue6, addPartialValue7, addPartialValue8, addPartialValue9, tempYear, tempMonth, tempDay, createButton, discountMoney, loginNumber);
            } else if (x == 3) {
                removeCategory(sc, weaponName, recoveryWeaphone, day, price, kind, iValue, sequence, storage, storageValue, start, money, button, buyButton, adminId, adminPassword, accountInformation, loginButton, accountInformationButton, idType, userNumber, capacityValueButton, weaponInformation, categoryRemove, categoryButton, num_of_days, month, year, promotionName, percentageDiscountButton, discountPercent, promotionYear1, promotionMonth1, promotionDay1, promotionYear2, promotionMonth2, promotionDay2, promotionValue1, promotionValue2, promotionValue3, promoteInformation1, timeCount, partialName, checkBox, history, damage, speed, weight, weaponRemoval, maximumInventory, currentInventory, promoteDate1, promoteDate2, promoteDate3, promoteDate4, promoteDate5, promoteDate6, promoteInformation2, promoteInformation3, discount, indexStorage1, indexStorage2, indexStorage3, thousandNumber, MAX_Z, recoveryStorage, promoteDate7, promoteDate8, promoteDate9, promoteInformation4, promoteInformation5, promoteInformation6, promoteInformation7, promoteInformation8, promoteInformation9, indexStorage4, indexStorage5, indexStorage6, indexStorage7, indexStorage8, indexStorage9, addPartialValue1, addPartialValue2, addPartialValue3, addPartialValue4, addPartialValue5, addPartialValue6, addPartialValue7, addPartialValue8, addPartialValue9, tempYear, tempMonth, tempDay, createButton, discountMoney, loginNumber);
            } else if (x == 4) {
                stockUpdateMake(sc, weaponName, recoveryWeaphone, day, price, kind, iValue, sequence, storage, storageValue, start, money, button, buyButton, adminId, adminPassword, accountInformation, loginButton, accountInformationButton, idType, userNumber, capacityValueButton, weaponInformation, categoryRemove, categoryButton, num_of_days, month, year, promotionName, percentageDiscountButton, discountPercent, promotionYear1, promotionMonth1, promotionDay1, promotionYear2, promotionMonth2, promotionDay2, promotionValue1, promotionValue2, promotionValue3, promoteInformation1, timeCount, partialName, checkBox, history, damage, speed, weight, weaponRemoval, maximumInventory, currentInventory, promoteDate1, promoteDate2, promoteDate3, promoteDate4, promoteDate5, promoteDate6, promoteInformation2, promoteInformation3, discount, indexStorage1, indexStorage2, indexStorage3, thousandNumber, MAX_Z, recoveryStorage, promoteDate7, promoteDate8, promoteDate9, promoteInformation4, promoteInformation5, promoteInformation6, promoteInformation7, promoteInformation8, promoteInformation9, indexStorage4, indexStorage5, indexStorage6, indexStorage7, indexStorage8, indexStorage9, addPartialValue1, addPartialValue2, addPartialValue3, addPartialValue4, addPartialValue5, addPartialValue6, addPartialValue7, addPartialValue8, addPartialValue9, tempYear, tempMonth, tempDay, createButton, discountMoney, loginNumber);
            } else if (x == 5) {
                recoveryCategory(sc, weaponName, recoveryWeaphone, day, price, kind, iValue, sequence, storage, storageValue, start, money, button, buyButton, adminId, adminPassword, accountInformation, loginButton, accountInformationButton, idType, userNumber, capacityValueButton, weaponInformation, categoryRemove, categoryButton, num_of_days, month, year, promotionName, percentageDiscountButton, discountPercent, promotionYear1, promotionMonth1, promotionDay1, promotionYear2, promotionMonth2, promotionDay2, promotionValue1, promotionValue2, promotionValue3, promoteInformation1, timeCount, partialName, checkBox, history, damage, speed, weight, weaponRemoval, maximumInventory, currentInventory, promoteDate1, promoteDate2, promoteDate3, promoteDate4, promoteDate5, promoteDate6, promoteInformation2, promoteInformation3, discount, indexStorage1, indexStorage2, indexStorage3, thousandNumber, MAX_Z, recoveryStorage, promoteDate7, promoteDate8, promoteDate9, promoteInformation4, promoteInformation5, promoteInformation6, promoteInformation7, promoteInformation8, promoteInformation9, indexStorage4, indexStorage5, indexStorage6, indexStorage7, indexStorage8, indexStorage9, addPartialValue1, addPartialValue2, addPartialValue3, addPartialValue4, addPartialValue5, addPartialValue6, addPartialValue7, addPartialValue8, addPartialValue9, tempYear, tempMonth, tempDay, createButton, discountMoney, loginNumber);
            } else if (x == 6) {
                createPromotion(sc, weaponName, recoveryWeaphone, day, price, kind, iValue, sequence, storage, storageValue, start, money, button, buyButton, adminId, adminPassword, accountInformation, loginButton, accountInformationButton, idType, userNumber, capacityValueButton, weaponInformation, categoryRemove, categoryButton, num_of_days, month, year, promotionName, percentageDiscountButton, discountPercent, promotionYear1, promotionMonth1, promotionDay1, promotionYear2, promotionMonth2, promotionDay2, promotionValue1, promotionValue2, promotionValue3, promoteInformation1, timeCount, partialName, checkBox, history, damage, speed, weight, weaponRemoval, maximumInventory, currentInventory, promoteDate1, promoteDate2, promoteDate3, promoteDate4, promoteDate5, promoteDate6, promoteInformation2, promoteInformation3, discount, indexStorage1, indexStorage2, indexStorage3, thousandNumber, MAX_Z, recoveryStorage, promoteDate7, promoteDate8, promoteDate9, promoteInformation4, promoteInformation5, promoteInformation6, promoteInformation7, promoteInformation8, promoteInformation9, indexStorage4, indexStorage5, indexStorage6, indexStorage7, indexStorage8, indexStorage9, addPartialValue1, addPartialValue2, addPartialValue3, addPartialValue4, addPartialValue5, addPartialValue6, addPartialValue7, addPartialValue8, addPartialValue9, tempYear, tempMonth, tempDay, createButton, discountMoney, loginNumber);
            } else if (x == 7) {
                seePromotion(sc, weaponName, recoveryWeaphone, day, price, kind, iValue, sequence, storage, storageValue, start, money, button, buyButton, adminId, adminPassword, accountInformation, loginButton, accountInformationButton, idType, userNumber, capacityValueButton, weaponInformation, categoryRemove, categoryButton, num_of_days, month, year, promotionName, percentageDiscountButton, discountPercent, promotionYear1, promotionMonth1, promotionDay1, promotionYear2, promotionMonth2, promotionDay2, promotionValue1, promotionValue2, promotionValue3, promoteInformation1, timeCount, partialName, checkBox, history, damage, speed, weight, weaponRemoval, maximumInventory, currentInventory, promoteDate1, promoteDate2, promoteDate3, promoteDate4, promoteDate5, promoteDate6, promoteInformation2, promoteInformation3, discount, indexStorage1, indexStorage2, indexStorage3, thousandNumber, MAX_Z, recoveryStorage, promoteDate7, promoteDate8, promoteDate9, promoteInformation4, promoteInformation5, promoteInformation6, promoteInformation7, promoteInformation8, promoteInformation9, indexStorage4, indexStorage5, indexStorage6, indexStorage7, indexStorage8, indexStorage9, addPartialValue1, addPartialValue2, addPartialValue3, addPartialValue4, addPartialValue5, addPartialValue6, addPartialValue7, addPartialValue8, addPartialValue9, tempYear, tempMonth, tempDay, createButton, discountMoney, loginNumber);
            } else if (x == 8) {
                removePromotion(sc, weaponName, recoveryWeaphone, day, price, kind, iValue, sequence, storage, storageValue, start, money, button, buyButton, adminId, adminPassword, accountInformation, loginButton, accountInformationButton, idType, userNumber, capacityValueButton, weaponInformation, categoryRemove, categoryButton, num_of_days, month, year, promotionName, percentageDiscountButton, discountPercent, promotionYear1, promotionMonth1, promotionDay1, promotionYear2, promotionMonth2, promotionDay2, promotionValue1, promotionValue2, promotionValue3, promoteInformation1, timeCount, partialName, checkBox, history, damage, speed, weight, weaponRemoval, maximumInventory, currentInventory, promoteDate1, promoteDate2, promoteDate3, promoteDate4, promoteDate5, promoteDate6, promoteInformation2, promoteInformation3, discount, indexStorage1, indexStorage2, indexStorage3, thousandNumber, MAX_Z, recoveryStorage, promoteDate7, promoteDate8, promoteDate9, promoteInformation4, promoteInformation5, promoteInformation6, promoteInformation7, promoteInformation8, promoteInformation9, indexStorage4, indexStorage5, indexStorage6, indexStorage7, indexStorage8, indexStorage9, addPartialValue1, addPartialValue2, addPartialValue3, addPartialValue4, addPartialValue5, addPartialValue6, addPartialValue7, addPartialValue8, addPartialValue9, tempYear, tempMonth, tempDay, createButton, discountMoney, loginNumber);
            } else if (x == 9) {
                createReport(sc, weaponName, recoveryWeaphone, day, price, kind, iValue, sequence, storage, storageValue, start, money, button, buyButton, adminId, adminPassword, accountInformation, loginButton, accountInformationButton, idType, userNumber, capacityValueButton, weaponInformation, categoryRemove, categoryButton, num_of_days, month, year, promotionName, percentageDiscountButton, discountPercent, promotionYear1, promotionMonth1, promotionDay1, promotionYear2, promotionMonth2, promotionDay2, promotionValue1, promotionValue2, promotionValue3, promoteInformation1, timeCount, partialName, checkBox, history, damage, speed, weight, weaponRemoval, maximumInventory, currentInventory, promoteDate1, promoteDate2, promoteDate3, promoteDate4, promoteDate5, promoteDate6, promoteInformation2, promoteInformation3, discount, indexStorage1, indexStorage2, indexStorage3, thousandNumber, MAX_Z, recoveryStorage, promoteDate7, promoteDate8, promoteDate9, promoteInformation4, promoteInformation5, promoteInformation6, promoteInformation7, promoteInformation8, promoteInformation9, indexStorage4, indexStorage5, indexStorage6, indexStorage7, indexStorage8, indexStorage9, addPartialValue1, addPartialValue2, addPartialValue3, addPartialValue4, addPartialValue5, addPartialValue6, addPartialValue7, addPartialValue8, addPartialValue9, tempYear, tempMonth, tempDay, createButton, discountMoney, loginNumber);
            } else if (x == 10) {
                uiLogin(sc, weaponName, recoveryWeaphone, day, price, kind, iValue, sequence, storage, storageValue, start, money, button, buyButton, adminId, adminPassword, accountInformation, loginButton, accountInformationButton, idType, userNumber, capacityValueButton, weaponInformation, categoryRemove, categoryButton, num_of_days, month, year, promotionName, percentageDiscountButton, discountPercent, promotionYear1, promotionMonth1, promotionDay1, promotionYear2, promotionMonth2, promotionDay2, promotionValue1, promotionValue2, promotionValue3, promoteInformation1, timeCount, partialName, checkBox, history, damage, speed, weight, weaponRemoval, maximumInventory, currentInventory, promoteDate1, promoteDate2, promoteDate3, promoteDate4, promoteDate5, promoteDate6, promoteInformation2, promoteInformation3, discount, indexStorage1, indexStorage2, indexStorage3, thousandNumber, MAX_Z, recoveryStorage, promoteDate7, promoteDate8, promoteDate9, promoteInformation4, promoteInformation5, promoteInformation6, promoteInformation7, promoteInformation8, promoteInformation9, indexStorage4, indexStorage5, indexStorage6, indexStorage7, indexStorage8, indexStorage9, addPartialValue1, addPartialValue2, addPartialValue3, addPartialValue4, addPartialValue5, addPartialValue6, addPartialValue7, addPartialValue8, addPartialValue9, tempYear, tempMonth, tempDay, createButton, discountMoney, loginNumber);
            } else {
                System.out.println("범위를 초과했습니다. 다시 입력해주세요.");
                adminUi(sc, weaponName, recoveryWeaphone, day, price, kind, iValue, sequence, storage, storageValue, start, money, button, buyButton, adminId, adminPassword, accountInformation, loginButton, accountInformationButton, idType, userNumber, capacityValueButton, weaponInformation, categoryRemove, categoryButton, num_of_days, month, year, promotionName, percentageDiscountButton, discountPercent, promotionYear1, promotionMonth1, promotionDay1, promotionYear2, promotionMonth2, promotionDay2, promotionValue1, promotionValue2, promotionValue3, promoteInformation1, timeCount, partialName, checkBox, history, damage, speed, weight, weaponRemoval, maximumInventory, currentInventory, promoteDate1, promoteDate2, promoteDate3, promoteDate4, promoteDate5, promoteDate6, promoteInformation2, promoteInformation3, discount, indexStorage1, indexStorage2, indexStorage3, thousandNumber, MAX_Z, recoveryStorage, promoteDate7, promoteDate8, promoteDate9, promoteInformation4, promoteInformation5, promoteInformation6, promoteInformation7, promoteInformation8, promoteInformation9, indexStorage4, indexStorage5, indexStorage6, indexStorage7, indexStorage8, indexStorage9, addPartialValue1, addPartialValue2, addPartialValue3, addPartialValue4, addPartialValue5, addPartialValue6, addPartialValue7, addPartialValue8, addPartialValue9, tempYear, tempMonth, tempDay, createButton, discountMoney, loginNumber);
            }
        } catch (InputMismatchException e) {
            System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
            sc.nextLine();
            adminUi(sc, weaponName, recoveryWeaphone, day, price, kind, iValue, sequence, storage, storageValue, start, money, button, buyButton, adminId, adminPassword, accountInformation, loginButton, accountInformationButton, idType, userNumber, capacityValueButton, weaponInformation, categoryRemove, categoryButton, num_of_days, month, year, promotionName, percentageDiscountButton, discountPercent, promotionYear1, promotionMonth1, promotionDay1, promotionYear2, promotionMonth2, promotionDay2, promotionValue1, promotionValue2, promotionValue3, promoteInformation1, timeCount, partialName, checkBox, history, damage, speed, weight, weaponRemoval, maximumInventory, currentInventory, promoteDate1, promoteDate2, promoteDate3, promoteDate4, promoteDate5, promoteDate6, promoteInformation2, promoteInformation3, discount, indexStorage1, indexStorage2, indexStorage3, thousandNumber, MAX_Z, recoveryStorage, promoteDate7, promoteDate8, promoteDate9, promoteInformation4, promoteInformation5, promoteInformation6, promoteInformation7, promoteInformation8, promoteInformation9, indexStorage4, indexStorage5, indexStorage6, indexStorage7, indexStorage8, indexStorage9, addPartialValue1, addPartialValue2, addPartialValue3, addPartialValue4, addPartialValue5, addPartialValue6, addPartialValue7, addPartialValue8, addPartialValue9, tempYear, tempMonth, tempDay, createButton, discountMoney, loginNumber);
        }

    }

    /**
     * 능력치 통계
     * accountInformation[계정번호][0] = 아이디
     * accountInformation[계정번호][1] = 비밀번호
     * accountInformation[계정번호][2] = 주민등록번호
     * accountInformation[계정번호][3] = 나이
     * accountInformation[계정번호][4] = 이름
     * accountInformation[계정번호][5] = 능력치: 힘
     * accountInformation[계정번호][6] = 능력치: 민첩성
     * accountInformation[계정번호][7] = 능력치: 지구력
     */
    public static void capacityValue(Scanner sc, String[] weaponName, int[] recoveryWeaphone, int day, int[] price, String[] kind, int iValue, int[] sequence, int[] storage, int storageValue, int start, long[] money, int button, int buyButton, String adminId, String adminPassword, String[] accountInformation, int loginButton, int accountInformationButton, String idType, int userNumber, int[] capacityValueButton, int[] weaponInformation, int[] categoryRemove, int categoryButton, int[] num_of_days, int month, int year, String[] promotionName, int percentageDiscountButton, int discountPercent, int promotionYear1, int promotionMonth1, int promotionDay1, int promotionYear2, int promotionMonth2, int promotionDay2, int promotionValue1, int promotionValue2, int promotionValue3, int[] promoteInformation1, int[] timeCount, String[] partialName, int[] checkBox, int[] history, int[] damage, int[] speed, int[] weight, int[] weaponRemoval, int[] maximumInventory, int[] currentInventory, int[] promoteDate1, int[] promoteDate2, int[] promoteDate3, int[] promoteDate4, int[] promoteDate5, int[] promoteDate6, int[] promoteInformation2, int[] promoteInformation3, int[] discount, int[] indexStorage1, int[] indexStorage2, int[] indexStorage3, int[] thousandNumber, int MAX_Z, int[] recoveryStorage, int[] promoteDate7, int[] promoteDate8, int[] promoteDate9, int[] promoteInformation4, int[] promoteInformation5, int[] promoteInformation6, int[] promoteInformation7, int[] promoteInformation8, int[] promoteInformation9, int[] indexStorage4, int[] indexStorage5, int[] indexStorage6, int[] indexStorage7, int[] indexStorage8, int[] indexStorage9, int[] addPartialValue1, int[] addPartialValue2, int[] addPartialValue3, int[] addPartialValue4, int[] addPartialValue5, int[] addPartialValue6, int[] addPartialValue7, int[] addPartialValue8, int[] addPartialValue9, int tempYear, int tempMonth, int tempDay, int createButton, int[] discountMoney, int loginNumber
    ) {
        for (int i = 0; i < 100; i++) {
            if (idType.equals(accountInformation[i * 100 + 0])) {
                userNumber = i;
            }
        }
        if (capacityValueButton[userNumber] == 0) {
            System.out.println("아직까지 기본통계를 무작위로 생성하지 않았습니다. 생성합니다.");
            accountInformation[userNumber * 100 + 5] = Integer.toString((int) (Math.random() * 10) + 1);
            accountInformation[userNumber * 100 + 6] = Integer.toString((int) (Math.random() * 10) + 1);
            accountInformation[userNumber * 100 + 7] = Integer.toString((int) (Math.random() * 10) + 1);
            capacityValueButton[userNumber] = 1;
        }
        System.out.println("이 계정의 현재 능력치는");
        System.out.println("힘: " + accountInformation[userNumber * 100 + 5]);
        System.out.println("민첩성: " + accountInformation[userNumber * 100 + 6]);
        System.out.println("지구력: " + accountInformation[userNumber * 100 + 7]);

        input2(sc, weaponName, recoveryWeaphone, day, price, kind, iValue, sequence, storage, storageValue, start, money, button, buyButton, adminId, adminPassword, accountInformation, loginButton, accountInformationButton, idType, userNumber, capacityValueButton, weaponInformation, categoryRemove, categoryButton, num_of_days, month, year, promotionName, percentageDiscountButton, discountPercent, promotionYear1, promotionMonth1, promotionDay1, promotionYear2, promotionMonth2, promotionDay2, promotionValue1, promotionValue2, promotionValue3, promoteInformation1, timeCount, partialName, checkBox, history, damage, speed, weight, weaponRemoval, maximumInventory, currentInventory, promoteDate1, promoteDate2, promoteDate3, promoteDate4, promoteDate5, promoteDate6, promoteInformation2, promoteInformation3, discount, indexStorage1, indexStorage2, indexStorage3, thousandNumber, MAX_Z, recoveryStorage, promoteDate7, promoteDate8, promoteDate9, promoteInformation4, promoteInformation5, promoteInformation6, promoteInformation7, promoteInformation8, promoteInformation9, indexStorage4, indexStorage5, indexStorage6, indexStorage7, indexStorage8, indexStorage9, addPartialValue1, addPartialValue2, addPartialValue3, addPartialValue4, addPartialValue5, addPartialValue6, addPartialValue7, addPartialValue8, addPartialValue9, tempYear, tempMonth, tempDay, createButton, discountMoney, loginNumber);
    }

    /**
     * 로그인 시스템
     */
    public static void uiLogin(Scanner sc, String[] weaponName, int[] recoveryWeaphone, int day, int[] price, String[] kind, int iValue, int[] sequence, int[] storage, int storageValue, int start, long[] money, int button, int buyButton, String adminId, String adminPassword, String[] accountInformation, int loginButton, int accountInformationButton, String idType, int userNumber, int[] capacityValueButton, int[] weaponInformation, int[] categoryRemove, int categoryButton, int[] num_of_days, int month, int year, String[] promotionName, int percentageDiscountButton, int discountPercent, int promotionYear1, int promotionMonth1, int promotionDay1, int promotionYear2, int promotionMonth2, int promotionDay2, int promotionValue1, int promotionValue2, int promotionValue3, int[] promoteInformation1, int[] timeCount, String[] partialName, int[] checkBox, int[] history, int[] damage, int[] speed, int[] weight, int[] weaponRemoval, int[] maximumInventory, int[] currentInventory, int[] promoteDate1, int[] promoteDate2, int[] promoteDate3, int[] promoteDate4, int[] promoteDate5, int[] promoteDate6, int[] promoteInformation2, int[] promoteInformation3, int[] discount, int[] indexStorage1, int[] indexStorage2, int[] indexStorage3, int[] thousandNumber, int MAX_Z, int[] recoveryStorage, int[] promoteDate7, int[] promoteDate8, int[] promoteDate9, int[] promoteInformation4, int[] promoteInformation5, int[] promoteInformation6, int[] promoteInformation7, int[] promoteInformation8, int[] promoteInformation9, int[] indexStorage4, int[] indexStorage5, int[] indexStorage6, int[] indexStorage7, int[] indexStorage8, int[] indexStorage9, int[] addPartialValue1, int[] addPartialValue2, int[] addPartialValue3, int[] addPartialValue4, int[] addPartialValue5, int[] addPartialValue6, int[] addPartialValue7, int[] addPartialValue8, int[] addPartialValue9, int tempYear, int tempMonth, int tempDay, int createButton, int[] discountMoney, int loginNumber
    ) {
        System.out.println("관리자 아이디와 비밀번호는 아이디 : a 비밀번호 : 1 입니다!");
        System.out.println("오늘의 날짜는 " + year + "년 " + month + "월 " + day + "일입니다.");
        System.out.println("1. 로그인");
        System.out.println("2. 아이디 찾기");
        System.out.println("3. 비밀번호 찾기");
        System.out.println("4. 회원가입");
        System.out.println("5. 다음날로");

        try {
            int z = sc.nextInt();

            if (z == 1) {
                loginInput(sc, weaponName, recoveryWeaphone, day, price, kind, iValue, sequence, storage, storageValue, start, money, button, buyButton, adminId, adminPassword, accountInformation, loginButton, accountInformationButton, idType, userNumber, capacityValueButton, weaponInformation, categoryRemove, categoryButton, num_of_days, month, year, promotionName, percentageDiscountButton, discountPercent, promotionYear1, promotionMonth1, promotionDay1, promotionYear2, promotionMonth2, promotionDay2, promotionValue1, promotionValue2, promotionValue3, promoteInformation1, timeCount, partialName, checkBox, history, damage, speed, weight, weaponRemoval, maximumInventory, currentInventory, promoteDate1, promoteDate2, promoteDate3, promoteDate4, promoteDate5, promoteDate6, promoteInformation2, promoteInformation3, discount, indexStorage1, indexStorage2, indexStorage3, thousandNumber, MAX_Z, recoveryStorage, promoteDate7, promoteDate8, promoteDate9, promoteInformation4, promoteInformation5, promoteInformation6, promoteInformation7, promoteInformation8, promoteInformation9, indexStorage4, indexStorage5, indexStorage6, indexStorage7, indexStorage8, indexStorage9, addPartialValue1, addPartialValue2, addPartialValue3, addPartialValue4, addPartialValue5, addPartialValue6, addPartialValue7, addPartialValue8, addPartialValue9, tempYear, tempMonth, tempDay, createButton, discountMoney, loginNumber);
            } else if (z == 2) {
                findId(sc, weaponName, recoveryWeaphone, day, price, kind, iValue, sequence, storage, storageValue, start, money, button, buyButton, adminId, adminPassword, accountInformation, loginButton, accountInformationButton, idType, userNumber, capacityValueButton, weaponInformation, categoryRemove, categoryButton, num_of_days, month, year, promotionName, percentageDiscountButton, discountPercent, promotionYear1, promotionMonth1, promotionDay1, promotionYear2, promotionMonth2, promotionDay2, promotionValue1, promotionValue2, promotionValue3, promoteInformation1, timeCount, partialName, checkBox, history, damage, speed, weight, weaponRemoval, maximumInventory, currentInventory, promoteDate1, promoteDate2, promoteDate3, promoteDate4, promoteDate5, promoteDate6, promoteInformation2, promoteInformation3, discount, indexStorage1, indexStorage2, indexStorage3, thousandNumber, MAX_Z, recoveryStorage, promoteDate7, promoteDate8, promoteDate9, promoteInformation4, promoteInformation5, promoteInformation6, promoteInformation7, promoteInformation8, promoteInformation9, indexStorage4, indexStorage5, indexStorage6, indexStorage7, indexStorage8, indexStorage9, addPartialValue1, addPartialValue2, addPartialValue3, addPartialValue4, addPartialValue5, addPartialValue6, addPartialValue7, addPartialValue8, addPartialValue9, tempYear, tempMonth, tempDay, createButton, discountMoney, loginNumber);
            } else if (z == 3) {
                findPassword(sc, weaponName, recoveryWeaphone, day, price, kind, iValue, sequence, storage, storageValue, start, money, button, buyButton, adminId, adminPassword, accountInformation, loginButton, accountInformationButton, idType, userNumber, capacityValueButton, weaponInformation, categoryRemove, categoryButton, num_of_days, month, year, promotionName, percentageDiscountButton, discountPercent, promotionYear1, promotionMonth1, promotionDay1, promotionYear2, promotionMonth2, promotionDay2, promotionValue1, promotionValue2, promotionValue3, promoteInformation1, timeCount, partialName, checkBox, history, damage, speed, weight, weaponRemoval, maximumInventory, currentInventory, promoteDate1, promoteDate2, promoteDate3, promoteDate4, promoteDate5, promoteDate6, promoteInformation2, promoteInformation3, discount, indexStorage1, indexStorage2, indexStorage3, thousandNumber, MAX_Z, recoveryStorage, promoteDate7, promoteDate8, promoteDate9, promoteInformation4, promoteInformation5, promoteInformation6, promoteInformation7, promoteInformation8, promoteInformation9, indexStorage4, indexStorage5, indexStorage6, indexStorage7, indexStorage8, indexStorage9, addPartialValue1, addPartialValue2, addPartialValue3, addPartialValue4, addPartialValue5, addPartialValue6, addPartialValue7, addPartialValue8, addPartialValue9, tempYear, tempMonth, tempDay, createButton, discountMoney, loginNumber);
            } else if (z == 4) {
                registerId(sc, weaponName, recoveryWeaphone, day, price, kind, iValue, sequence, storage, storageValue, start, money, button, buyButton, adminId, adminPassword, accountInformation, loginButton, accountInformationButton, idType, userNumber, capacityValueButton, weaponInformation, categoryRemove, categoryButton, num_of_days, month, year, promotionName, percentageDiscountButton, discountPercent, promotionYear1, promotionMonth1, promotionDay1, promotionYear2, promotionMonth2, promotionDay2, promotionValue1, promotionValue2, promotionValue3, promoteInformation1, timeCount, partialName, checkBox, history, damage, speed, weight, weaponRemoval, maximumInventory, currentInventory, promoteDate1, promoteDate2, promoteDate3, promoteDate4, promoteDate5, promoteDate6, promoteInformation2, promoteInformation3, discount, indexStorage1, indexStorage2, indexStorage3, thousandNumber, MAX_Z, recoveryStorage, promoteDate7, promoteDate8, promoteDate9, promoteInformation4, promoteInformation5, promoteInformation6, promoteInformation7, promoteInformation8, promoteInformation9, indexStorage4, indexStorage5, indexStorage6, indexStorage7, indexStorage8, indexStorage9, addPartialValue1, addPartialValue2, addPartialValue3, addPartialValue4, addPartialValue5, addPartialValue6, addPartialValue7, addPartialValue8, addPartialValue9, tempYear, tempMonth, tempDay, createButton, discountMoney, loginNumber);
            } else if (z == 5) {
                nextDay(sc, weaponName, recoveryWeaphone, day, price, kind, iValue, sequence, storage, storageValue, start, money, button, buyButton, adminId, adminPassword, accountInformation, loginButton, accountInformationButton, idType, userNumber, capacityValueButton, weaponInformation, categoryRemove, categoryButton, num_of_days, month, year, promotionName, percentageDiscountButton, discountPercent, promotionYear1, promotionMonth1, promotionDay1, promotionYear2, promotionMonth2, promotionDay2, promotionValue1, promotionValue2, promotionValue3, promoteInformation1, timeCount, partialName, checkBox, history, damage, speed, weight, weaponRemoval, maximumInventory, currentInventory, promoteDate1, promoteDate2, promoteDate3, promoteDate4, promoteDate5, promoteDate6, promoteInformation2, promoteInformation3, discount, indexStorage1, indexStorage2, indexStorage3, thousandNumber, MAX_Z, recoveryStorage, promoteDate7, promoteDate8, promoteDate9, promoteInformation4, promoteInformation5, promoteInformation6, promoteInformation7, promoteInformation8, promoteInformation9, indexStorage4, indexStorage5, indexStorage6, indexStorage7, indexStorage8, indexStorage9, addPartialValue1, addPartialValue2, addPartialValue3, addPartialValue4, addPartialValue5, addPartialValue6, addPartialValue7, addPartialValue8, addPartialValue9, tempYear, tempMonth, tempDay, createButton, discountMoney, loginNumber);

            } else {
                System.out.println("입력범위를 초과했습니다. 다시 입력해주세요.");
                uiLogin(sc, weaponName, recoveryWeaphone, day, price, kind, iValue, sequence, storage, storageValue, start, money, button, buyButton, adminId, adminPassword, accountInformation, loginButton, accountInformationButton, idType, userNumber, capacityValueButton, weaponInformation, categoryRemove, categoryButton, num_of_days, month, year, promotionName, percentageDiscountButton, discountPercent, promotionYear1, promotionMonth1, promotionDay1, promotionYear2, promotionMonth2, promotionDay2, promotionValue1, promotionValue2, promotionValue3, promoteInformation1, timeCount, partialName, checkBox, history, damage, speed, weight, weaponRemoval, maximumInventory, currentInventory, promoteDate1, promoteDate2, promoteDate3, promoteDate4, promoteDate5, promoteDate6, promoteInformation2, promoteInformation3, discount, indexStorage1, indexStorage2, indexStorage3, thousandNumber, MAX_Z, recoveryStorage, promoteDate7, promoteDate8, promoteDate9, promoteInformation4, promoteInformation5, promoteInformation6, promoteInformation7, promoteInformation8, promoteInformation9, indexStorage4, indexStorage5, indexStorage6, indexStorage7, indexStorage8, indexStorage9, addPartialValue1, addPartialValue2, addPartialValue3, addPartialValue4, addPartialValue5, addPartialValue6, addPartialValue7, addPartialValue8, addPartialValue9, tempYear, tempMonth, tempDay, createButton, discountMoney, loginNumber);
            }
        } catch (InputMismatchException e) {
            System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
            sc.nextLine();
            uiLogin(sc, weaponName, recoveryWeaphone, day, price, kind, iValue, sequence, storage, storageValue, start, money, button, buyButton, adminId, adminPassword, accountInformation, loginButton, accountInformationButton, idType, userNumber, capacityValueButton, weaponInformation, categoryRemove, categoryButton, num_of_days, month, year, promotionName, percentageDiscountButton, discountPercent, promotionYear1, promotionMonth1, promotionDay1, promotionYear2, promotionMonth2, promotionDay2, promotionValue1, promotionValue2, promotionValue3, promoteInformation1, timeCount, partialName, checkBox, history, damage, speed, weight, weaponRemoval, maximumInventory, currentInventory, promoteDate1, promoteDate2, promoteDate3, promoteDate4, promoteDate5, promoteDate6, promoteInformation2, promoteInformation3, discount, indexStorage1, indexStorage2, indexStorage3, thousandNumber, MAX_Z, recoveryStorage, promoteDate7, promoteDate8, promoteDate9, promoteInformation4, promoteInformation5, promoteInformation6, promoteInformation7, promoteInformation8, promoteInformation9, indexStorage4, indexStorage5, indexStorage6, indexStorage7, indexStorage8, indexStorage9, addPartialValue1, addPartialValue2, addPartialValue3, addPartialValue4, addPartialValue5, addPartialValue6, addPartialValue7, addPartialValue8, addPartialValue9, tempYear, tempMonth, tempDay, createButton, discountMoney, loginNumber);
        }
    }

    public static void loginInput(Scanner sc, String[] weaponName, int[] recoveryWeaphone, int day, int[] price, String[] kind, int iValue, int[] sequence, int[] storage, int storageValue, int start, long[] money, int button, int buyButton, String adminId, String adminPassword, String[] accountInformation, int loginButton, int accountInformationButton, String idType, int userNumber, int[] capacityValueButton, int[] weaponInformation, int[] categoryRemove, int categoryButton, int[] num_of_days, int month, int year, String[] promotionName, int percentageDiscountButton, int discountPercent, int promotionYear1, int promotionMonth1, int promotionDay1, int promotionYear2, int promotionMonth2, int promotionDay2, int promotionValue1, int promotionValue2, int promotionValue3, int[] promoteInformation1, int[] timeCount, String[] partialName, int[] checkBox, int[] history, int[] damage, int[] speed, int[] weight, int[] weaponRemoval, int[] maximumInventory, int[] currentInventory, int[] promoteDate1, int[] promoteDate2, int[] promoteDate3, int[] promoteDate4, int[] promoteDate5, int[] promoteDate6, int[] promoteInformation2, int[] promoteInformation3, int[] discount, int[] indexStorage1, int[] indexStorage2, int[] indexStorage3, int[] thousandNumber, int MAX_Z, int[] recoveryStorage, int[] promoteDate7, int[] promoteDate8, int[] promoteDate9, int[] promoteInformation4, int[] promoteInformation5, int[] promoteInformation6, int[] promoteInformation7, int[] promoteInformation8, int[] promoteInformation9, int[] indexStorage4, int[] indexStorage5, int[] indexStorage6, int[] indexStorage7, int[] indexStorage8, int[] indexStorage9, int[] addPartialValue1, int[] addPartialValue2, int[] addPartialValue3, int[] addPartialValue4, int[] addPartialValue5, int[] addPartialValue6, int[] addPartialValue7, int[] addPartialValue8, int[] addPartialValue9, int tempYear, int tempMonth, int tempDay, int createButton, int[] discountMoney, int loginNumber
    ) {
        try {
            System.out.println("아이디 입력 / 공백 / 패스워드 입력");
            idType = sc.next();
            String inputPassword = sc.next();
            if (idType.equals(adminId) && inputPassword.equals(adminPassword)) {
                System.out.println("관리자- 로그인합니다.");
                adminUi(sc, weaponName, recoveryWeaphone, day, price, kind, iValue, sequence, storage, storageValue, start, money, button, buyButton, adminId, adminPassword, accountInformation, loginButton, accountInformationButton, idType, userNumber, capacityValueButton, weaponInformation, categoryRemove, categoryButton, num_of_days, month, year, promotionName, percentageDiscountButton, discountPercent, promotionYear1, promotionMonth1, promotionDay1, promotionYear2, promotionMonth2, promotionDay2, promotionValue1, promotionValue2, promotionValue3, promoteInformation1, timeCount, partialName, checkBox, history, damage, speed, weight, weaponRemoval, maximumInventory, currentInventory, promoteDate1, promoteDate2, promoteDate3, promoteDate4, promoteDate5, promoteDate6, promoteInformation2, promoteInformation3, discount, indexStorage1, indexStorage2, indexStorage3, thousandNumber, MAX_Z, recoveryStorage, promoteDate7, promoteDate8, promoteDate9, promoteInformation4, promoteInformation5, promoteInformation6, promoteInformation7, promoteInformation8, promoteInformation9, indexStorage4, indexStorage5, indexStorage6, indexStorage7, indexStorage8, indexStorage9, addPartialValue1, addPartialValue2, addPartialValue3, addPartialValue4, addPartialValue5, addPartialValue6, addPartialValue7, addPartialValue8, addPartialValue9, tempYear, tempMonth, tempDay, createButton, discountMoney, loginNumber);
            }

            for (int i = 0; i < 100; i++) {
                if (accountInformation[i * 100 + 0].equals(idType) && accountInformation[i * 100 + 1].equals(inputPassword)) {
                    System.out.println("로그인을 성공하였습니다.");
                    loginNumber = i * 100;
                    capacityValue(sc, weaponName, recoveryWeaphone, day, price, kind, iValue, sequence, storage, storageValue, start, money, button, buyButton, adminId, adminPassword, accountInformation, loginButton, accountInformationButton, idType, userNumber, capacityValueButton, weaponInformation, categoryRemove, categoryButton, num_of_days, month, year, promotionName, percentageDiscountButton, discountPercent, promotionYear1, promotionMonth1, promotionDay1, promotionYear2, promotionMonth2, promotionDay2, promotionValue1, promotionValue2, promotionValue3, promoteInformation1, timeCount, partialName, checkBox, history, damage, speed, weight, weaponRemoval, maximumInventory, currentInventory, promoteDate1, promoteDate2, promoteDate3, promoteDate4, promoteDate5, promoteDate6, promoteInformation2, promoteInformation3, discount, indexStorage1, indexStorage2, indexStorage3, thousandNumber, MAX_Z, recoveryStorage, promoteDate7, promoteDate8, promoteDate9, promoteInformation4, promoteInformation5, promoteInformation6, promoteInformation7, promoteInformation8, promoteInformation9, indexStorage4, indexStorage5, indexStorage6, indexStorage7, indexStorage8, indexStorage9, addPartialValue1, addPartialValue2, addPartialValue3, addPartialValue4, addPartialValue5, addPartialValue6, addPartialValue7, addPartialValue8, addPartialValue9, tempYear, tempMonth, tempDay, createButton, discountMoney, loginNumber);
                }

            }
        } catch (NullPointerException e) {
            System.out.println("로그인에 실패하셨습니다. 메뉴로 돌아갑니다.");
            uiLogin(sc, weaponName, recoveryWeaphone, day, price, kind, iValue, sequence, storage, storageValue, start, money, button, buyButton, adminId, adminPassword, accountInformation, loginButton, accountInformationButton, idType, userNumber, capacityValueButton, weaponInformation, categoryRemove, categoryButton, num_of_days, month, year, promotionName, percentageDiscountButton, discountPercent, promotionYear1, promotionMonth1, promotionDay1, promotionYear2, promotionMonth2, promotionDay2, promotionValue1, promotionValue2, promotionValue3, promoteInformation1, timeCount, partialName, checkBox, history, damage, speed, weight, weaponRemoval, maximumInventory, currentInventory, promoteDate1, promoteDate2, promoteDate3, promoteDate4, promoteDate5, promoteDate6, promoteInformation2, promoteInformation3, discount, indexStorage1, indexStorage2, indexStorage3, thousandNumber, MAX_Z, recoveryStorage, promoteDate7, promoteDate8, promoteDate9, promoteInformation4, promoteInformation5, promoteInformation6, promoteInformation7, promoteInformation8, promoteInformation9, indexStorage4, indexStorage5, indexStorage6, indexStorage7, indexStorage8, indexStorage9, addPartialValue1, addPartialValue2, addPartialValue3, addPartialValue4, addPartialValue5, addPartialValue6, addPartialValue7, addPartialValue8, addPartialValue9, tempYear, tempMonth, tempDay, createButton, discountMoney, loginNumber);
        }
    }

    public static void findId(Scanner sc, String[] weaponName, int[] recoveryWeaphone, int day, int[] price, String[] kind, int iValue, int[] sequence, int[] storage, int storageValue, int start, long[] money, int button, int buyButton, String adminId, String adminPassword, String[] accountInformation, int loginButton, int accountInformationButton, String idType, int userNumber, int[] capacityValueButton, int[] weaponInformation, int[] categoryRemove, int categoryButton, int[] num_of_days, int month, int year, String[] promotionName, int percentageDiscountButton, int discountPercent, int promotionYear1, int promotionMonth1, int promotionDay1, int promotionYear2, int promotionMonth2, int promotionDay2, int promotionValue1, int promotionValue2, int promotionValue3, int[] promoteInformation1, int[] timeCount, String[] partialName, int[] checkBox, int[] history, int[] damage, int[] speed, int[] weight, int[] weaponRemoval, int[] maximumInventory, int[] currentInventory, int[] promoteDate1, int[] promoteDate2, int[] promoteDate3, int[] promoteDate4, int[] promoteDate5, int[] promoteDate6, int[] promoteInformation2, int[] promoteInformation3, int[] discount, int[] indexStorage1, int[] indexStorage2, int[] indexStorage3, int[] thousandNumber, int MAX_Z, int[] recoveryStorage, int[] promoteDate7, int[] promoteDate8, int[] promoteDate9, int[] promoteInformation4, int[] promoteInformation5, int[] promoteInformation6, int[] promoteInformation7, int[] promoteInformation8, int[] promoteInformation9, int[] indexStorage4, int[] indexStorage5, int[] indexStorage6, int[] indexStorage7, int[] indexStorage8, int[] indexStorage9, int[] addPartialValue1, int[] addPartialValue2, int[] addPartialValue3, int[] addPartialValue4, int[] addPartialValue5, int[] addPartialValue6, int[] addPartialValue7, int[] addPartialValue8, int[] addPartialValue9, int tempYear, int tempMonth, int tempDay, int createButton, int[] discountMoney, int loginNumber
    ) {
        System.out.println("1. 주민등록번호 6자리 2. 나이 3. 이름 을 순서대로 쳐주세요.");
        String findNumber = sc.next();
        String findAge = sc.next();
        String findName = sc.next();
        for (int i = 0; i < 100; i++) {
            if (accountInformation[i * 100 + 2].equals(findNumber) && accountInformation[i * 100 + 3].equals(findAge) && accountInformation[i * 100 + 4].equals(findName)) {
                System.out.println("정보가 맞습니다. 아이디는 " + accountInformation[i * 100 + 0] + " 입니다.");
                uiLogin(sc, weaponName, recoveryWeaphone, day, price, kind, iValue, sequence, storage, storageValue, start, money, button, buyButton, adminId, adminPassword, accountInformation, loginButton, accountInformationButton, idType, userNumber, capacityValueButton, weaponInformation, categoryRemove, categoryButton, num_of_days, month, year, promotionName, percentageDiscountButton, discountPercent, promotionYear1, promotionMonth1, promotionDay1, promotionYear2, promotionMonth2, promotionDay2, promotionValue1, promotionValue2, promotionValue3, promoteInformation1, timeCount, partialName, checkBox, history, damage, speed, weight, weaponRemoval, maximumInventory, currentInventory, promoteDate1, promoteDate2, promoteDate3, promoteDate4, promoteDate5, promoteDate6, promoteInformation2, promoteInformation3, discount, indexStorage1, indexStorage2, indexStorage3, thousandNumber, MAX_Z, recoveryStorage, promoteDate7, promoteDate8, promoteDate9, promoteInformation4, promoteInformation5, promoteInformation6, promoteInformation7, promoteInformation8, promoteInformation9, indexStorage4, indexStorage5, indexStorage6, indexStorage7, indexStorage8, indexStorage9, addPartialValue1, addPartialValue2, addPartialValue3, addPartialValue4, addPartialValue5, addPartialValue6, addPartialValue7, addPartialValue8, addPartialValue9, tempYear, tempMonth, tempDay, createButton, discountMoney, loginNumber);
            }
        }
        System.out.println("정보가 일치하지 않습니다. 메뉴로 돌아갑니다.");
        uiLogin(sc, weaponName, recoveryWeaphone, day, price, kind, iValue, sequence, storage, storageValue, start, money, button, buyButton, adminId, adminPassword, accountInformation, loginButton, accountInformationButton, idType, userNumber, capacityValueButton, weaponInformation, categoryRemove, categoryButton, num_of_days, month, year, promotionName, percentageDiscountButton, discountPercent, promotionYear1, promotionMonth1, promotionDay1, promotionYear2, promotionMonth2, promotionDay2, promotionValue1, promotionValue2, promotionValue3, promoteInformation1, timeCount, partialName, checkBox, history, damage, speed, weight, weaponRemoval, maximumInventory, currentInventory, promoteDate1, promoteDate2, promoteDate3, promoteDate4, promoteDate5, promoteDate6, promoteInformation2, promoteInformation3, discount, indexStorage1, indexStorage2, indexStorage3, thousandNumber, MAX_Z, recoveryStorage, promoteDate7, promoteDate8, promoteDate9, promoteInformation4, promoteInformation5, promoteInformation6, promoteInformation7, promoteInformation8, promoteInformation9, indexStorage4, indexStorage5, indexStorage6, indexStorage7, indexStorage8, indexStorage9, addPartialValue1, addPartialValue2, addPartialValue3, addPartialValue4, addPartialValue5, addPartialValue6, addPartialValue7, addPartialValue8, addPartialValue9, tempYear, tempMonth, tempDay, createButton, discountMoney, loginNumber);
    }

    public static void findPassword(Scanner sc, String[] weaponName, int[] recoveryWeaphone, int day, int[] price, String[] kind, int iValue, int[] sequence, int[] storage, int storageValue, int start, long[] money, int button, int buyButton, String adminId, String adminPassword, String[] accountInformation, int loginButton, int accountInformationButton, String idType, int userNumber, int[] capacityValueButton, int[] weaponInformation, int[] categoryRemove, int categoryButton, int[] num_of_days, int month, int year, String[] promotionName, int percentageDiscountButton, int discountPercent, int promotionYear1, int promotionMonth1, int promotionDay1, int promotionYear2, int promotionMonth2, int promotionDay2, int promotionValue1, int promotionValue2, int promotionValue3, int[] promoteInformation1, int[] timeCount, String[] partialName, int[] checkBox, int[] history, int[] damage, int[] speed, int[] weight, int[] weaponRemoval, int[] maximumInventory, int[] currentInventory, int[] promoteDate1, int[] promoteDate2, int[] promoteDate3, int[] promoteDate4, int[] promoteDate5, int[] promoteDate6, int[] promoteInformation2, int[] promoteInformation3, int[] discount, int[] indexStorage1, int[] indexStorage2, int[] indexStorage3, int[] thousandNumber, int MAX_Z, int[] recoveryStorage, int[] promoteDate7, int[] promoteDate8, int[] promoteDate9, int[] promoteInformation4, int[] promoteInformation5, int[] promoteInformation6, int[] promoteInformation7, int[] promoteInformation8, int[] promoteInformation9, int[] indexStorage4, int[] indexStorage5, int[] indexStorage6, int[] indexStorage7, int[] indexStorage8, int[] indexStorage9, int[] addPartialValue1, int[] addPartialValue2, int[] addPartialValue3, int[] addPartialValue4, int[] addPartialValue5, int[] addPartialValue6, int[] addPartialValue7, int[] addPartialValue8, int[] addPartialValue9, int tempYear, int tempMonth, int tempDay, int createButton, int[] discountMoney, int loginNumber
    ) {
        System.out.println("1. 아이디 2. 주민등록번호 6자리 3. 나이 4. 이름 을 순서대로 쳐주세요.");
        String findInputId = sc.next();
        String findNumber = sc.next();
        String findAge = sc.next();
        String findName = sc.next();
        for (int i = 0; i < 100; i++) {
            if (accountInformation[i * 100 + 0].equals(findInputId) && accountInformation[i * 100 + 2].equals(findNumber) && accountInformation[i * 100 + 3].equals(findAge) && accountInformation[i * 100 + 4].equals(findName)) {
                System.out.println("정보가 맞습니다. 비밀번호를 재설정합니다.");
                accountInformation[i * 100 + 1] = sc.next();
                System.out.println("재설정 되셨습니다.");
                uiLogin(sc, weaponName, recoveryWeaphone, day, price, kind, iValue, sequence, storage, storageValue, start, money, button, buyButton, adminId, adminPassword, accountInformation, loginButton, accountInformationButton, idType, userNumber, capacityValueButton, weaponInformation, categoryRemove, categoryButton, num_of_days, month, year, promotionName, percentageDiscountButton, discountPercent, promotionYear1, promotionMonth1, promotionDay1, promotionYear2, promotionMonth2, promotionDay2, promotionValue1, promotionValue2, promotionValue3, promoteInformation1, timeCount, partialName, checkBox, history, damage, speed, weight, weaponRemoval, maximumInventory, currentInventory, promoteDate1, promoteDate2, promoteDate3, promoteDate4, promoteDate5, promoteDate6, promoteInformation2, promoteInformation3, discount, indexStorage1, indexStorage2, indexStorage3, thousandNumber, MAX_Z, recoveryStorage, promoteDate7, promoteDate8, promoteDate9, promoteInformation4, promoteInformation5, promoteInformation6, promoteInformation7, promoteInformation8, promoteInformation9, indexStorage4, indexStorage5, indexStorage6, indexStorage7, indexStorage8, indexStorage9, addPartialValue1, addPartialValue2, addPartialValue3, addPartialValue4, addPartialValue5, addPartialValue6, addPartialValue7, addPartialValue8, addPartialValue9, tempYear, tempMonth, tempDay, createButton, discountMoney, loginNumber);
            }
        }
        System.out.println("정보가 일치하지 않습니다. 메뉴로 돌아갑니다.");
        uiLogin(sc, weaponName, recoveryWeaphone, day, price, kind, iValue, sequence, storage, storageValue, start, money, button, buyButton, adminId, adminPassword, accountInformation, loginButton, accountInformationButton, idType, userNumber, capacityValueButton, weaponInformation, categoryRemove, categoryButton, num_of_days, month, year, promotionName, percentageDiscountButton, discountPercent, promotionYear1, promotionMonth1, promotionDay1, promotionYear2, promotionMonth2, promotionDay2, promotionValue1, promotionValue2, promotionValue3, promoteInformation1, timeCount, partialName, checkBox, history, damage, speed, weight, weaponRemoval, maximumInventory, currentInventory, promoteDate1, promoteDate2, promoteDate3, promoteDate4, promoteDate5, promoteDate6, promoteInformation2, promoteInformation3, discount, indexStorage1, indexStorage2, indexStorage3, thousandNumber, MAX_Z, recoveryStorage, promoteDate7, promoteDate8, promoteDate9, promoteInformation4, promoteInformation5, promoteInformation6, promoteInformation7, promoteInformation8, promoteInformation9, indexStorage4, indexStorage5, indexStorage6, indexStorage7, indexStorage8, indexStorage9, addPartialValue1, addPartialValue2, addPartialValue3, addPartialValue4, addPartialValue5, addPartialValue6, addPartialValue7, addPartialValue8, addPartialValue9, tempYear, tempMonth, tempDay, createButton, discountMoney, loginNumber);
    }

    public static void registerId(Scanner sc, String[] weaponName, int[] recoveryWeaphone, int day, int[] price, String[] kind, int iValue, int[] sequence, int[] storage, int storageValue, int start, long[] money, int button, int buyButton, String adminId, String adminPassword, String[] accountInformation, int loginButton, int accountInformationButton, String idType, int userNumber, int[] capacityValueButton, int[] weaponInformation, int[] categoryRemove, int categoryButton, int[] num_of_days, int month, int year, String[] promotionName, int percentageDiscountButton, int discountPercent, int promotionYear1, int promotionMonth1, int promotionDay1, int promotionYear2, int promotionMonth2, int promotionDay2, int promotionValue1, int promotionValue2, int promotionValue3, int[] promoteInformation1, int[] timeCount, String[] partialName, int[] checkBox, int[] history, int[] damage, int[] speed, int[] weight, int[] weaponRemoval, int[] maximumInventory, int[] currentInventory, int[] promoteDate1, int[] promoteDate2, int[] promoteDate3, int[] promoteDate4, int[] promoteDate5, int[] promoteDate6, int[] promoteInformation2, int[] promoteInformation3, int[] discount, int[] indexStorage1, int[] indexStorage2, int[] indexStorage3, int[] thousandNumber, int MAX_Z, int[] recoveryStorage, int[] promoteDate7, int[] promoteDate8, int[] promoteDate9, int[] promoteInformation4, int[] promoteInformation5, int[] promoteInformation6, int[] promoteInformation7, int[] promoteInformation8, int[] promoteInformation9, int[] indexStorage4, int[] indexStorage5, int[] indexStorage6, int[] indexStorage7, int[] indexStorage8, int[] indexStorage9, int[] addPartialValue1, int[] addPartialValue2, int[] addPartialValue3, int[] addPartialValue4, int[] addPartialValue5, int[] addPartialValue6, int[] addPartialValue7, int[] addPartialValue8, int[] addPartialValue9, int tempYear, int tempMonth, int tempDay, int createButton, int[] discountMoney, int loginNumber
    ) {
        System.out.println("아이디 입력해주세요.");
        String inputId = sc.next();
        if (inputId.isEmpty()) {
            System.out.println("빈문자열입니다. 다시 입력받습니다.");
            registerId(sc, weaponName, recoveryWeaphone, day, price, kind, iValue, sequence, storage, storageValue, start, money, button, buyButton, adminId, adminPassword, accountInformation, loginButton, accountInformationButton, idType, userNumber, capacityValueButton, weaponInformation, categoryRemove, categoryButton, num_of_days, month, year, promotionName, percentageDiscountButton, discountPercent, promotionYear1, promotionMonth1, promotionDay1, promotionYear2, promotionMonth2, promotionDay2, promotionValue1, promotionValue2, promotionValue3, promoteInformation1, timeCount, partialName, checkBox, history, damage, speed, weight, weaponRemoval, maximumInventory, currentInventory, promoteDate1, promoteDate2, promoteDate3, promoteDate4, promoteDate5, promoteDate6, promoteInformation2, promoteInformation3, discount, indexStorage1, indexStorage2, indexStorage3, thousandNumber, MAX_Z, recoveryStorage, promoteDate7, promoteDate8, promoteDate9, promoteInformation4, promoteInformation5, promoteInformation6, promoteInformation7, promoteInformation8, promoteInformation9, indexStorage4, indexStorage5, indexStorage6, indexStorage7, indexStorage8, indexStorage9, addPartialValue1, addPartialValue2, addPartialValue3, addPartialValue4, addPartialValue5, addPartialValue6, addPartialValue7, addPartialValue8, addPartialValue9, tempYear, tempMonth, tempDay, createButton, discountMoney, loginNumber);
        }
        try {
            for (int i = 0; i < 100; i++) {
                if (accountInformation[i * 100 + 0].equals(inputId) && inputId.equals(adminId)) {
                    System.out.println("이미 존재하는 아이디 입니다. 다시 입력받습니다.");
                    registerId(sc, weaponName, recoveryWeaphone, day, price, kind, iValue, sequence, storage, storageValue, start, money, button, buyButton, adminId, adminPassword, accountInformation, loginButton, accountInformationButton, idType, userNumber, capacityValueButton, weaponInformation, categoryRemove, categoryButton, num_of_days, month, year, promotionName, percentageDiscountButton, discountPercent, promotionYear1, promotionMonth1, promotionDay1, promotionYear2, promotionMonth2, promotionDay2, promotionValue1, promotionValue2, promotionValue3, promoteInformation1, timeCount, partialName, checkBox, history, damage, speed, weight, weaponRemoval, maximumInventory, currentInventory, promoteDate1, promoteDate2, promoteDate3, promoteDate4, promoteDate5, promoteDate6, promoteInformation2, promoteInformation3, discount, indexStorage1, indexStorage2, indexStorage3, thousandNumber, MAX_Z, recoveryStorage, promoteDate7, promoteDate8, promoteDate9, promoteInformation4, promoteInformation5, promoteInformation6, promoteInformation7, promoteInformation8, promoteInformation9, indexStorage4, indexStorage5, indexStorage6, indexStorage7, indexStorage8, indexStorage9, addPartialValue1, addPartialValue2, addPartialValue3, addPartialValue4, addPartialValue5, addPartialValue6, addPartialValue7, addPartialValue8, addPartialValue9, tempYear, tempMonth, tempDay, createButton, discountMoney, loginNumber);
                }
            }
        } catch (NullPointerException e) {
            accountInformation[accountInformationButton * 100 + 0] = inputId;
            registerPassword(sc, weaponName, recoveryWeaphone, day, price, kind, iValue, sequence, storage, storageValue, start, money, button, buyButton, adminId, adminPassword, accountInformation, loginButton, accountInformationButton, idType, userNumber, capacityValueButton, weaponInformation, categoryRemove, categoryButton, num_of_days, month, year, promotionName, percentageDiscountButton, discountPercent, promotionYear1, promotionMonth1, promotionDay1, promotionYear2, promotionMonth2, promotionDay2, promotionValue1, promotionValue2, promotionValue3, promoteInformation1, timeCount, partialName, checkBox, history, damage, speed, weight, weaponRemoval, maximumInventory, currentInventory, promoteDate1, promoteDate2, promoteDate3, promoteDate4, promoteDate5, promoteDate6, promoteInformation2, promoteInformation3, discount, indexStorage1, indexStorage2, indexStorage3, thousandNumber, MAX_Z, recoveryStorage, promoteDate7, promoteDate8, promoteDate9, promoteInformation4, promoteInformation5, promoteInformation6, promoteInformation7, promoteInformation8, promoteInformation9, indexStorage4, indexStorage5, indexStorage6, indexStorage7, indexStorage8, indexStorage9, addPartialValue1, addPartialValue2, addPartialValue3, addPartialValue4, addPartialValue5, addPartialValue6, addPartialValue7, addPartialValue8, addPartialValue9, tempYear, tempMonth, tempDay, createButton, discountMoney, loginNumber);
        }
    }

    public static void registerPassword(Scanner sc, String[] weaponName, int[] recoveryWeaphone, int day, int[] price, String[] kind, int iValue, int[] sequence, int[] storage, int storageValue, int start, long[] money, int button, int buyButton, String adminId, String adminPassword, String[] accountInformation, int loginButton, int accountInformationButton, String idType, int userNumber, int[] capacityValueButton, int[] weaponInformation, int[] categoryRemove, int categoryButton, int[] num_of_days, int month, int year, String[] promotionName, int percentageDiscountButton, int discountPercent, int promotionYear1, int promotionMonth1, int promotionDay1, int promotionYear2, int promotionMonth2, int promotionDay2, int promotionValue1, int promotionValue2, int promotionValue3, int[] promoteInformation1, int[] timeCount, String[] partialName, int[] checkBox, int[] history, int[] damage, int[] speed, int[] weight, int[] weaponRemoval, int[] maximumInventory, int[] currentInventory, int[] promoteDate1, int[] promoteDate2, int[] promoteDate3, int[] promoteDate4, int[] promoteDate5, int[] promoteDate6, int[] promoteInformation2, int[] promoteInformation3, int[] discount, int[] indexStorage1, int[] indexStorage2, int[] indexStorage3, int[] thousandNumber, int MAX_Z, int[] recoveryStorage, int[] promoteDate7, int[] promoteDate8, int[] promoteDate9, int[] promoteInformation4, int[] promoteInformation5, int[] promoteInformation6, int[] promoteInformation7, int[] promoteInformation8, int[] promoteInformation9, int[] indexStorage4, int[] indexStorage5, int[] indexStorage6, int[] indexStorage7, int[] indexStorage8, int[] indexStorage9, int[] addPartialValue1, int[] addPartialValue2, int[] addPartialValue3, int[] addPartialValue4, int[] addPartialValue5, int[] addPartialValue6, int[] addPartialValue7, int[] addPartialValue8, int[] addPartialValue9, int tempYear, int tempMonth, int tempDay, int createButton, int[] discountMoney, int loginNumber
    ) {
        System.out.println("비밀번호를 입력해주세요.");
        String passwordType = sc.next();
        if (passwordType.isEmpty()) {
            System.out.println("빈문자열입니다. 다시 입력받습니다.");
            registerId(sc, weaponName, recoveryWeaphone, day, price, kind, iValue, sequence, storage, storageValue, start, money, button, buyButton, adminId, adminPassword, accountInformation, loginButton, accountInformationButton, idType, userNumber, capacityValueButton, weaponInformation, categoryRemove, categoryButton, num_of_days, month, year, promotionName, percentageDiscountButton, discountPercent, promotionYear1, promotionMonth1, promotionDay1, promotionYear2, promotionMonth2, promotionDay2, promotionValue1, promotionValue2, promotionValue3, promoteInformation1, timeCount, partialName, checkBox, history, damage, speed, weight, weaponRemoval, maximumInventory, currentInventory, promoteDate1, promoteDate2, promoteDate3, promoteDate4, promoteDate5, promoteDate6, promoteInformation2, promoteInformation3, discount, indexStorage1, indexStorage2, indexStorage3, thousandNumber, MAX_Z, recoveryStorage, promoteDate7, promoteDate8, promoteDate9, promoteInformation4, promoteInformation5, promoteInformation6, promoteInformation7, promoteInformation8, promoteInformation9, indexStorage4, indexStorage5, indexStorage6, indexStorage7, indexStorage8, indexStorage9, addPartialValue1, addPartialValue2, addPartialValue3, addPartialValue4, addPartialValue5, addPartialValue6, addPartialValue7, addPartialValue8, addPartialValue9, tempYear, tempMonth, tempDay, createButton, discountMoney, loginNumber);
        }
        try {
            for (int i = 0; i < 100; i++) {
                if (accountInformation[i * 100 + 1].equals(passwordType)) {
                    System.out.println("이미 존재하는 비밀번호 입니다. 다시 입력받습니다.");
                    registerPassword(sc, weaponName, recoveryWeaphone, day, price, kind, iValue, sequence, storage, storageValue, start, money, button, buyButton, adminId, adminPassword, accountInformation, loginButton, accountInformationButton, idType, userNumber, capacityValueButton, weaponInformation, categoryRemove, categoryButton, num_of_days, month, year, promotionName, percentageDiscountButton, discountPercent, promotionYear1, promotionMonth1, promotionDay1, promotionYear2, promotionMonth2, promotionDay2, promotionValue1, promotionValue2, promotionValue3, promoteInformation1, timeCount, partialName, checkBox, history, damage, speed, weight, weaponRemoval, maximumInventory, currentInventory, promoteDate1, promoteDate2, promoteDate3, promoteDate4, promoteDate5, promoteDate6, promoteInformation2, promoteInformation3, discount, indexStorage1, indexStorage2, indexStorage3, thousandNumber, MAX_Z, recoveryStorage, promoteDate7, promoteDate8, promoteDate9, promoteInformation4, promoteInformation5, promoteInformation6, promoteInformation7, promoteInformation8, promoteInformation9, indexStorage4, indexStorage5, indexStorage6, indexStorage7, indexStorage8, indexStorage9, addPartialValue1, addPartialValue2, addPartialValue3, addPartialValue4, addPartialValue5, addPartialValue6, addPartialValue7, addPartialValue8, addPartialValue9, tempYear, tempMonth, tempDay, createButton, discountMoney, loginNumber);
                }
            }
        } catch (NullPointerException e) {
            accountInformation[accountInformationButton * 100 + 1] = passwordType;
            registerAccountInformation(sc, weaponName, recoveryWeaphone, day, price, kind, iValue, sequence, storage, storageValue, start, money, button, buyButton, adminId, adminPassword, accountInformation, loginButton, accountInformationButton, idType, userNumber, capacityValueButton, weaponInformation, categoryRemove, categoryButton, num_of_days, month, year, promotionName, percentageDiscountButton, discountPercent, promotionYear1, promotionMonth1, promotionDay1, promotionYear2, promotionMonth2, promotionDay2, promotionValue1, promotionValue2, promotionValue3, promoteInformation1, timeCount, partialName, checkBox, history, damage, speed, weight, weaponRemoval, maximumInventory, currentInventory, promoteDate1, promoteDate2, promoteDate3, promoteDate4, promoteDate5, promoteDate6, promoteInformation2, promoteInformation3, discount, indexStorage1, indexStorage2, indexStorage3, thousandNumber, MAX_Z, recoveryStorage, promoteDate7, promoteDate8, promoteDate9, promoteInformation4, promoteInformation5, promoteInformation6, promoteInformation7, promoteInformation8, promoteInformation9, indexStorage4, indexStorage5, indexStorage6, indexStorage7, indexStorage8, indexStorage9, addPartialValue1, addPartialValue2, addPartialValue3, addPartialValue4, addPartialValue5, addPartialValue6, addPartialValue7, addPartialValue8, addPartialValue9, tempYear, tempMonth, tempDay, createButton, discountMoney, loginNumber);
        }
    }

    public static void registerAccountInformation(Scanner sc, String[] weaponName, int[] recoveryWeaphone, int day, int[] price, String[] kind, int iValue, int[] sequence, int[] storage, int storageValue, int start, long[] money, int button, int buyButton, String adminId, String adminPassword, String[] accountInformation, int loginButton, int accountInformationButton, String idType, int userNumber, int[] capacityValueButton, int[] weaponInformation, int[] categoryRemove, int categoryButton, int[] num_of_days, int month, int year, String[] promotionName, int percentageDiscountButton, int discountPercent, int promotionYear1, int promotionMonth1, int promotionDay1, int promotionYear2, int promotionMonth2, int promotionDay2, int promotionValue1, int promotionValue2, int promotionValue3, int[] promoteInformation1, int[] timeCount, String[] partialName, int[] checkBox, int[] history, int[] damage, int[] speed, int[] weight, int[] weaponRemoval, int[] maximumInventory, int[] currentInventory, int[] promoteDate1, int[] promoteDate2, int[] promoteDate3, int[] promoteDate4, int[] promoteDate5, int[] promoteDate6, int[] promoteInformation2, int[] promoteInformation3, int[] discount, int[] indexStorage1, int[] indexStorage2, int[] indexStorage3, int[] thousandNumber, int MAX_Z, int[] recoveryStorage, int[] promoteDate7, int[] promoteDate8, int[] promoteDate9, int[] promoteInformation4, int[] promoteInformation5, int[] promoteInformation6, int[] promoteInformation7, int[] promoteInformation8, int[] promoteInformation9, int[] indexStorage4, int[] indexStorage5, int[] indexStorage6, int[] indexStorage7, int[] indexStorage8, int[] indexStorage9, int[] addPartialValue1, int[] addPartialValue2, int[] addPartialValue3, int[] addPartialValue4, int[] addPartialValue5, int[] addPartialValue6, int[] addPartialValue7, int[] addPartialValue8, int[] addPartialValue9, int tempYear, int tempMonth, int tempDay, int createButton, int[] discountMoney, int loginNumber
    ) {
        System.out.println("1. 주민등록번호 6자리 2. 나이 3. 이름");
        accountInformation[accountInformationButton * 100 + 2] = sc.next();
        accountInformation[accountInformationButton * 100 + 3] = sc.next();
        accountInformation[accountInformationButton * 100 + 4] = sc.next();
        if (accountInformation[accountInformationButton * 100 + 2].length() != 6) {
            System.out.println("주민등록번호가 6자리가 아닙니다. 다시 입력해주세요.");
            registerAccountInformation(sc, weaponName, recoveryWeaphone, day, price, kind, iValue, sequence, storage, storageValue, start, money, button, buyButton, adminId, adminPassword, accountInformation, loginButton, accountInformationButton, idType, userNumber, capacityValueButton, weaponInformation, categoryRemove, categoryButton, num_of_days, month, year, promotionName, percentageDiscountButton, discountPercent, promotionYear1, promotionMonth1, promotionDay1, promotionYear2, promotionMonth2, promotionDay2, promotionValue1, promotionValue2, promotionValue3, promoteInformation1, timeCount, partialName, checkBox, history, damage, speed, weight, weaponRemoval, maximumInventory, currentInventory, promoteDate1, promoteDate2, promoteDate3, promoteDate4, promoteDate5, promoteDate6, promoteInformation2, promoteInformation3, discount, indexStorage1, indexStorage2, indexStorage3, thousandNumber, MAX_Z, recoveryStorage, promoteDate7, promoteDate8, promoteDate9, promoteInformation4, promoteInformation5, promoteInformation6, promoteInformation7, promoteInformation8, promoteInformation9, indexStorage4, indexStorage5, indexStorage6, indexStorage7, indexStorage8, indexStorage9, addPartialValue1, addPartialValue2, addPartialValue3, addPartialValue4, addPartialValue5, addPartialValue6, addPartialValue7, addPartialValue8, addPartialValue9, tempYear, tempMonth, tempDay, createButton, discountMoney, loginNumber);
        }
        accountInformationButton++;
        System.out.println("회원가입에 성공하였습니다!");
        uiLogin(sc, weaponName, recoveryWeaphone, day, price, kind, iValue, sequence, storage, storageValue, start, money, button, buyButton, adminId, adminPassword, accountInformation, loginButton, accountInformationButton, idType, userNumber, capacityValueButton, weaponInformation, categoryRemove, categoryButton, num_of_days, month, year, promotionName, percentageDiscountButton, discountPercent, promotionYear1, promotionMonth1, promotionDay1, promotionYear2, promotionMonth2, promotionDay2, promotionValue1, promotionValue2, promotionValue3, promoteInformation1, timeCount, partialName, checkBox, history, damage, speed, weight, weaponRemoval, maximumInventory, currentInventory, promoteDate1, promoteDate2, promoteDate3, promoteDate4, promoteDate5, promoteDate6, promoteInformation2, promoteInformation3, discount, indexStorage1, indexStorage2, indexStorage3, thousandNumber, MAX_Z, recoveryStorage, promoteDate7, promoteDate8, promoteDate9, promoteInformation4, promoteInformation5, promoteInformation6, promoteInformation7, promoteInformation8, promoteInformation9, indexStorage4, indexStorage5, indexStorage6, indexStorage7, indexStorage8, indexStorage9, addPartialValue1, addPartialValue2, addPartialValue3, addPartialValue4, addPartialValue5, addPartialValue6, addPartialValue7, addPartialValue8, addPartialValue9, tempYear, tempMonth, tempDay, createButton, discountMoney, loginNumber);
    }

    public static void nextDay(Scanner sc, String[] weaponName, int[] recoveryWeaphone, int day, int[] price, String[] kind, int iValue, int[] sequence, int[] storage, int storageValue, int start, long[] money, int button, int buyButton, String adminId, String adminPassword, String[] accountInformation, int loginButton, int accountInformationButton, String idType, int userNumber, int[] capacityValueButton, int[] weaponInformation, int[] categoryRemove, int categoryButton, int[] num_of_days, int month, int year, String[] promotionName, int percentageDiscountButton, int discountPercent, int promotionYear1, int promotionMonth1, int promotionDay1, int promotionYear2, int promotionMonth2, int promotionDay2, int promotionValue1, int promotionValue2, int promotionValue3, int[] promoteInformation1, int[] timeCount, String[] partialName, int[] checkBox, int[] history, int[] damage, int[] speed, int[] weight, int[] weaponRemoval, int[] maximumInventory, int[] currentInventory, int[] promoteDate1, int[] promoteDate2, int[] promoteDate3, int[] promoteDate4, int[] promoteDate5, int[] promoteDate6, int[] promoteInformation2, int[] promoteInformation3, int[] discount, int[] indexStorage1, int[] indexStorage2, int[] indexStorage3, int[] thousandNumber, int MAX_Z, int[] recoveryStorage, int[] promoteDate7, int[] promoteDate8, int[] promoteDate9, int[] promoteInformation4, int[] promoteInformation5, int[] promoteInformation6, int[] promoteInformation7, int[] promoteInformation8, int[] promoteInformation9, int[] indexStorage4, int[] indexStorage5, int[] indexStorage6, int[] indexStorage7, int[] indexStorage8, int[] indexStorage9, int[] addPartialValue1, int[] addPartialValue2, int[] addPartialValue3, int[] addPartialValue4, int[] addPartialValue5, int[] addPartialValue6, int[] addPartialValue7, int[] addPartialValue8, int[] addPartialValue9, int tempYear, int tempMonth, int tempDay, int createButton, int[] discountMoney, int loginNumber
    ) {
        day++;
        tempDay++;
        if (num_of_days[month] < day) {
            day = 1;
            month++;
        }
        if (month == 13) {
            month = 1;
            year++;
            day = 1;
        }
        if (num_of_days[tempMonth] < tempDay) {
            tempDay = 1;
            tempMonth++;
        }
        if (tempMonth == 13) {
            tempMonth = 1;
            tempYear++;
            tempDay = 1;
        }
        // promoteDate7[i * 6 + j * 6 + k * 6 + 0] +1, +2, +3, +4, +5 년 월 일 다 나타남
        // promoteInformation1 변수이름앞에 1, 2, 3, 4, 5, 6, 7 ,8 9로 과거와 현재 미래와 프로모션 조율를 나타냄 addPartialValeu[iValue * 100 + i]를 쓰고
        // indexStorage 이애는 promoteDate배열 인덱스 안에 쓰임
        // addPartialValue promoteInformation


        // 다음 날이 될때 프로모션을 옮기는 방법
        // 날짜를 옮긴다. promoteDate2(현재) -> promoteDate1(과거), promoteDate3(미래) -> promoteDate2(현재)
        // promoteInformation과 promoteDate의 원리파악을 해야한한다.
        // iValue -> 무기 카테고리 번호
        // addPartialValue

        int seePromotionButton = 0;
        int seePromotionButton2 = 0;
        int seePromotionValue1 = 0;
        int check = 0;
        System.out.println("프로모션 리스트를 확인합니다");
        System.out.println("★☆★종료된 프로모션★☆★");
        //[iValue * 2000 + i * 20 + indexStorage3[iValue * 100 + i]]
        /**
         * %할인
         */
        for (int e = 1000; e < 1020; e++) {
            for (int i = 0; i < 200000; i += 2000) {
                for (int j = 0; j < 2000; j += 20) {
                    for (int k = 0; k < 20; k++) {
                        if (promoteInformation1[i + j + k] == e) {
                            if (seePromotionButton == 0) {
                                System.out.printf("%d년 %d월 %d일 ~ %d년 %d월 %d일\n", promoteDate1[i * 6 + j * 6 + k * 6 + 0], promoteDate1[i * 6 + j * 6 + k * 6 + 1], promoteDate1[i * 6 + j * 6 + k * 6 + 2], promoteDate1[i * 6 + j * 6 + k * 6 + 3], promoteDate1[i * 6 + j * 6 + k * 6 + 4], promoteDate1[i * 6 + j * 6 + k * 6 + 5]);
                                System.out.println(discount[k] + "%할인");
                                seePromotionButton = 1;
                            }
                            if (seePromotionButton2 == 0) {
                                System.out.printf("---%s---\n", kind[i / 2000]);
                                seePromotionButton2 = 1;
                            }
                            System.out.printf("%s\n", weaponName[i / 2000 * 100 + j % 2000 / 20]);
                        }
                    }
                }
                seePromotionButton2 = 0;
                seePromotionValue1++;
            }
            seePromotionButton = 0;
        }
        seePromotionValue1 = 0;

        for (int e = 4000; e < 4020; e++) {
            for (int i = 0; i < 200000; i += 2000) {
                for (int j = 0; j < 2000; j += 20) {
                    for (int k = 0; k < j + 20; k++) {
                        if (promoteInformation4[i + j + k] == e) {
                            if (seePromotionButton == 0) {
                                System.out.printf("%d년 %d월 %d일 ~ %d년 %d월 %d일\n", promoteDate4[i * 6 + j * 6 + k * 6 + 0], promoteDate2[i * 6 + j * 6 + k * 6 + 1], promoteDate4[i * 6 + j * 6 + k * 6 + 2], promoteDate4[i * 6 + j * 6 + k * 6 + 3], promoteDate4[i * 6 + j * 6 + k * 6 + 4], promoteDate4[i * 6 + j * 6 + k * 6 + 5]);
                                System.out.println("1 + 1 무료");
                                seePromotionButton = 1;
                            }
                            if (seePromotionButton2 == 0) {
                                System.out.printf("---%s---\n", kind[i / 2000]);
                                seePromotionButton2 = 1;
                            }
                            System.out.printf("%s\n", weaponName[i / 2000 * 100 + j % 2000 / 20]);
                        }
                    }
                }
                seePromotionButton2 = 0;
                seePromotionValue1++;
            }
            seePromotionButton = 0;
        }
        seePromotionValue1 = 0;

        for (int e = 7000; e < 7020; e++) {
            for (int i = 0; i < 200000; i += 2000) {
                for (int j = 0; j < 2000; j += 20) {
                    for (int k = 0; k < 20; k++) {
                        if (promoteInformation7[i + j + k] == e) {
                            if (seePromotionButton == 0) {
                                System.out.printf("%d년 %d월 %d일 ~ %d년 %d월 %d일\n", promoteDate7[i * 6 + j * 6 + k * 6 + 0], promoteDate7[i * 6 + j * 6 + k * 6 + 1], promoteDate7[i * 6 + j * 6 + k * 6 + 2], promoteDate7[i * 6 + j * 6 + k * 6 + 3], promoteDate7[i * 6 + j * 6 + k * 6 + 4], promoteDate7[i * 6 + j * 6 + k * 6 + 5]);
                                System.out.println(discount[k] + "원 할인");
                                seePromotionButton = 1;
                            }
                            if (seePromotionButton2 == 0) {
                                System.out.printf("---%s---\n", kind[i / 2000]);
                                seePromotionButton2 = 1;
                            }
                            System.out.printf("%s\n", weaponName[i / 2000 * 100 + j % 2000 / 20]);

                        }
                    }
                }
                seePromotionButton2 = 0;
                seePromotionValue1++;
            }
            seePromotionButton = 0;
        }
        seePromotionValue1 = 0;
        System.out.println("★☆★진행중인 프로모션★☆★");
        //[iValue * 2000 + i * 20 + indexStorage3[iValue * 100 + i]]
        for (int e = 2000; e < 2020; e++) {
            for (int i = 0; i < 200000; i += 2000) {
                for (int j = 0; j < 2000; j += 20) {
                    for (int k = 0; k < 20; k++) {
                        if (promoteInformation2[i + j + k] == e) {
//                            System.out.printf("promoteInformation[%d] == %d\n\n", k, e);
                            if (seePromotionButton == 0) {

                                System.out.printf("%d년 %d월 %d일 ~ %d년 %d월 %d일\n", promoteDate2[i * 6 + j * 6 + k * 6 + 0], promoteDate2[i * 6 + j * 6 + k * 6 + 1], promoteDate2[i * 6 + j * 6 + k * 6 + 2], promoteDate2[i * 6 + j * 6 + k * 6 + 3], promoteDate2[i * 6 + j * 6 + k * 6 + 4], promoteDate2[i * 6 + j * 6 + k * 6 + 5]);
                                System.out.println(discount[k] + "%할인");
                                seePromotionButton = 1;

                                if (promoteDate2[i * 6 + j * 6 + k * 6 + 3] == tempYear && promoteDate2[i * 6 + j * 6 + k * 6 + 4] == tempMonth && promoteDate2[i * 6 + j * 6 + k * 6 + 5] == tempDay) {
                                    System.out.printf("%d년 %d월 %d일 이후로 종료되는 프로모션입니다.\n", year, month, day);
                                    check = 1;
                                }
                            }
                            if (seePromotionButton2 == 0) {
                                System.out.printf("---%s---\n", kind[i / 2000]);
                                seePromotionButton2 = 1;
                            }
                            System.out.printf("%s\n", weaponName[i / 2000 * 100 + j % 2000 / 20]);
                            if (check == 1) {
                                promoteDate1[i * 6 + j * 6 + indexStorage1[i / 2000 * 100 + j / 20] + 0] = promoteDate2[i * 6 + j * 6 + k * 6 + 0];
                                promoteDate1[i * 6 + j * 6 + indexStorage1[i / 2000 * 100 + j / 20] + 1] = promoteDate2[i * 6 + j * 6 + k * 6 + 1];
                                promoteDate1[i * 6 + j * 6 + indexStorage1[i / 2000 * 100 + j / 20] + 2] = promoteDate2[i * 6 + j * 6 + k * 6 + 2];
                                promoteDate1[i * 6 + j * 6 + indexStorage1[i / 2000 * 100 + j / 20] + 3] = promoteDate2[i * 6 + j * 6 + k * 6 + 3];
                                promoteDate1[i * 6 + j * 6 + indexStorage1[i / 2000 * 100 + j / 20] + 4] = promoteDate2[i * 6 + j * 6 + k * 6 + 4];
                                promoteDate1[i * 6 + j * 6 + indexStorage1[i / 2000 * 100 + j / 20] + 5] = promoteDate2[i * 6 + j * 6 + k * 6 + 5];

                                indexStorage1[i / 2000 * 100 + j / 20] += 6;
                                indexStorage2[i / 2000 * 100 + j / 20] -= 6;

                                promoteDate2[i * 6 + j * 6 + k * 6 + 0] = 0;
                                promoteDate2[i * 6 + j * 6 + k * 6 + 1] = 0;
                                promoteDate2[i * 6 + j * 6 + k * 6 + 2] = 0;
                                promoteDate2[i * 6 + j * 6 + k * 6 + 3] = 0;
                                promoteDate2[i * 6 + j * 6 + k * 6 + 4] = 0;
                                promoteDate2[i * 6 + j * 6 + k * 6 + 5] = 0;

                                addPartialValue2[i / 2000 * 100 + j / 20]--;

                                promoteInformation1[i + j % 2000 + addPartialValue1[i / 2000 * 100 + j / 20]] = thousandNumber[1];
                                promoteInformation2[i + j % 2000 + addPartialValue2[i / 2000 * 100 + j / 20]] = 0;
                                addPartialValue1[i / 2000 * 100 + j / 20]++;
                                addPartialValue2[i / 2000 * 100 + j / 20]--; // 여기 체크

                            }
                        }
                    }
                }
                seePromotionButton2 = 0;
                seePromotionValue1++;
            }
            if (check == 1) {
                check = 0;
                thousandNumber[1]++;
            }

            seePromotionButton = 0;

        }
        seePromotionValue1 = 0;


        for (int e = 5000; e < 5020; e++) {
            for (int i = 0; i < 200000; i += 2000) {
                for (int j = 0; j < 2000; j += 20) {
                    for (int k = 0; k < 20; k++) {
                        if (promoteInformation5[i + j + k] == e) {
                            if (seePromotionButton == 0) {
                                System.out.printf("%d년 %d월 %d일 ~ %d년 %d월 %d일\n", promoteDate5[i * 6 + j * 6 + k * 6 + 0], promoteDate5[i * 6 + j * 6 + k * 6 + 1], promoteDate5[i * 6 + j * 6 + k * 6 + 2], promoteDate5[i * 6 + j * 6 + k * 6 + 3], promoteDate5[i * 6 + j * 6 + k * 6 + 4], promoteDate5[i * 6 + j * 6 + k * 6 + 5]);
                                System.out.println("1 + 1 무료");
                                seePromotionButton = 1;

                                if (promoteDate5[i * 6 + j * 6 + k * 6 + 3] == tempYear && promoteDate5[i * 6 + j * 6 + k * 6 + 4] == tempMonth && promoteDate5[i * 6 + j * 6 + k * 6 + 5] == tempDay) {
                                    System.out.printf("%d년 %d월 %d일 이후로 종료되는 프로모션입니다.\n", year, month, day);
                                    check = 1;
                                }
                            }
                            if (seePromotionButton2 == 0) {
                                System.out.printf("---%s---\n", kind[i / 2000]);
                                seePromotionButton2 = 1;
                            }
                            System.out.printf("%s\n", weaponName[i / 2000 * 100 + j % 2000 / 20]);

                            if (check == 1) {
                                promoteDate4[i * 6 + j * 6 + indexStorage4[i / 2000 * 100 + j / 20] + 0] = promoteDate5[i * 6 + j * 6 + k * 6 + 0];
                                promoteDate4[i * 6 + j * 6 + indexStorage4[i / 2000 * 100 + j / 20] + 1] = promoteDate5[i * 6 + j * 6 + k * 6 + 1];
                                promoteDate4[i * 6 + j * 6 + indexStorage4[i / 2000 * 100 + j / 20] + 2] = promoteDate5[i * 6 + j * 6 + k * 6 + 2];
                                promoteDate4[i * 6 + j * 6 + indexStorage4[i / 2000 * 100 + j / 20] + 3] = promoteDate5[i * 6 + j * 6 + k * 6 + 3];
                                promoteDate4[i * 6 + j * 6 + indexStorage4[i / 2000 * 100 + j / 20] + 4] = promoteDate5[i * 6 + j * 6 + k * 6 + 4];
                                promoteDate4[i * 6 + j * 6 + indexStorage4[i / 2000 * 100 + j / 20] + 5] = promoteDate5[i * 6 + j * 6 + k * 6 + 5];

                                indexStorage4[i / 2000 * 100 + j / 20] += 6;
                                indexStorage5[i / 2000 * 100 + j / 20] -= 6;
                                promoteDate5[i * 6 + j * 6 + k * 6 + 0] = 0;
                                promoteDate5[i * 6 + j * 6 + k * 6 + 1] = 0;
                                promoteDate5[i * 6 + j * 6 + k * 6 + 2] = 0;
                                promoteDate5[i * 6 + j * 6 + k * 6 + 3] = 0;
                                promoteDate5[i * 6 + j * 6 + k * 6 + 4] = 0;
                                promoteDate5[i * 6 + j * 6 + k * 6 + 5] = 0;

                                addPartialValue5[i / 2000 * 100 + j / 20]--;

                                promoteInformation4[i + j % 2000 + addPartialValue4[i / 2000 * 100 + j / 20]] = thousandNumber[4];
                                promoteInformation5[i + j % 2000 + addPartialValue5[i / 2000 * 100 + j / 20]] = 0;

                            }
                        }
                    }
                }
                seePromotionButton2 = 0;
                seePromotionValue1++;
            }
            if (check == 1) {
                check = 0;
                thousandNumber[4]++;
            }

            seePromotionButton = 0;

        }
        seePromotionValue1 = 0;

        for (int e = 8000; e < 8020; e++) {
            for (int i = 0; i < 200000; i += 2000) {
                for (int j = 0; j < 2000; j += 20) {
                    for (int k = 0; k < 20; k++) {
                        if (promoteInformation8[i + j + k] == e) {
                            if (seePromotionButton == 0) {
                                System.out.printf("%d년 %d월 %d일 ~ %d년 %d월 %d일\n", promoteDate8[i * 6 + j * 6 + k * 6 + 0], promoteDate8[i * 6 + j * 6 + k * 6 + 1], promoteDate8[i * 6 + j * 6 + k * 6 + 2], promoteDate8[i * 6 + j * 6 + k * 6 + 3], promoteDate8[i * 6 + j * 6 + k * 6 + 4], promoteDate8[i * 6 + j * 6 + k * 6 + 5]);
                                System.out.println(discount[k] + "원 할인");
                                seePromotionButton = 1;

                                if (promoteDate8[i * 6 + j * 6 + k * 6 + 3] == tempYear && promoteDate8[i * 6 + j * 6 + k * 6 + 4] == tempMonth && promoteDate8[i * 6 + j * 6 + k * 6 + 5] == tempDay) {
                                    System.out.printf("%d년 %d월 %d일 이후로 종료되는 프로모션입니다.\n", year, month, day);
                                    check = 1;
                                }
                            }
                            if (seePromotionButton2 == 0) {
                                System.out.printf("---%s---\n", kind[i / 2000]);
                                seePromotionButton2 = 1;
                            }
                            System.out.printf("%s\n", weaponName[i / 2000 * 100 + j % 2000 / 20]);
                            if (check == 1) {
                                promoteDate7[i * 6 + j * 6 + indexStorage7[i / 2000 * 100 + j / 20] + 0] = promoteDate8[i * 6 + j * 6 + k * 6 + 0];
                                promoteDate7[i * 6 + j * 6 + indexStorage7[i / 2000 * 100 + j / 20] + 1] = promoteDate8[i * 6 + j * 6 + k * 6 + 1];
                                promoteDate7[i * 6 + j * 6 + indexStorage7[i / 2000 * 100 + j / 20] + 2] = promoteDate8[i * 6 + j * 6 + k * 6 + 2];
                                promoteDate7[i * 6 + j * 6 + indexStorage7[i / 2000 * 100 + j / 20] + 3] = promoteDate8[i * 6 + j * 6 + k * 6 + 3];
                                promoteDate7[i * 6 + j * 6 + indexStorage7[i / 2000 * 100 + j / 20] + 4] = promoteDate8[i * 6 + j * 6 + k * 6 + 4];
                                promoteDate7[i * 6 + j * 6 + indexStorage7[i / 2000 * 100 + j / 20] + 5] = promoteDate8[i * 6 + j * 6 + k * 6 + 5];
                                indexStorage7[i / 2000 * 100 + j / 20] += 6;
                                indexStorage8[i / 2000 * 100 + j / 20] -= 6;
                                promoteDate8[i * 6 + j * 6 + k * 6 + 0] = 0;
                                promoteDate8[i * 6 + j * 6 + k * 6 + 1] = 0;
                                promoteDate8[i * 6 + j * 6 + k * 6 + 2] = 0;
                                promoteDate8[i * 6 + j * 6 + k * 6 + 3] = 0;
                                promoteDate8[i * 6 + j * 6 + k * 6 + 4] = 0;
                                promoteDate8[i * 6 + j * 6 + k * 6 + 5] = 0;

                                addPartialValue8[i / 2000 * 100 + j / 20]--;

                                promoteInformation7[i + j % 2000 + addPartialValue7[i / 2000 * 100 + j / 20]] = thousandNumber[7];
                                promoteInformation8[i + j % 2000 + addPartialValue8[i / 2000 * 100 + j / 20]] = 0;
                            }
                        }
                    }
                }
                seePromotionButton2 = 0;
                seePromotionValue1++;
            }

            if (check == 1) {
                check = 0;
                thousandNumber[7]++;
            }
            seePromotionButton = 0;
        }
        seePromotionValue1 = 0;

        //-------------------------------------------------------------------
        System.out.println("★☆★프로모션 예정★☆★");
        //[iValue * 2000 + i * 20 + indexStorage3[iValue * 100 + i]]
        for (int e = 3000; e < 3020; e++) {
            for (int i = 0; i < 200000; i += 2000) {
                for (int j = 0; j < 2000; j += 20) {
                    for (int k = 0; k < 20; k++) {
                        if (promoteInformation3[i + j + k] == e) {
                            if (seePromotionButton == 0) {
                                System.out.printf("%d년 %d월 %d일 ~ %d년 %d월 %d일\n", promoteDate3[i * 6 + j * 6 + k * 6 + 0], promoteDate3[i * 6 + j * 6 + k * 6 + 1], promoteDate3[i * 6 + j * 6 + k * 6 + 2], promoteDate3[i * 6 + j * 6 + k * 6 + 3], promoteDate3[i * 6 + j * 6 + k * 6 + 4], promoteDate3[i * 6 + j * 6 + k * 6 + 5]);
                                System.out.println(discount[k] + "%할인");
                                seePromotionButton = 1;

                                if (promoteDate3[i * 6 + j * 6 + k * 6 + 0] == year && promoteDate3[i * 6 + j * 6 + k * 6 + 1] == month && promoteDate3[i * 6 + j * 6 + k * 6 + 2] == day) {
                                    System.out.printf("%d년 %d월 %d일 이후로 시작되는 프로모션입니다.\n", year, month, day);
                                    check = 1;
                                }
                            }
                            if (seePromotionButton2 == 0) {
                                System.out.printf("---%s---\n", kind[i / 2000]);
                                seePromotionButton2 = 1;
                            }
//                            System.out.printf("promoteInformation[%d + %d + %d] = %d\n", i, j, k, e);
                            System.out.printf("%s\n", weaponName[i / 2000 * 100 + j % 2000 / 20]);

                            if (check == 1) {
                                promoteDate2[i * 6 + j * 6 + indexStorage2[i / 2000 * 100 + j / 20] + 0] = promoteDate3[i * 6 + j * 6 + k * 6 + 0];
                                promoteDate2[i * 6 + j * 6 + indexStorage2[i / 2000 * 100 + j / 20] + 1] = promoteDate3[i * 6 + j * 6 + k * 6 + 1];
                                promoteDate2[i * 6 + j * 6 + indexStorage2[i / 2000 * 100 + j / 20] + 2] = promoteDate3[i * 6 + j * 6 + k * 6 + 2];
                                promoteDate2[i * 6 + j * 6 + indexStorage2[i / 2000 * 100 + j / 20] + 3] = promoteDate3[i * 6 + j * 6 + k * 6 + 3];
                                promoteDate2[i * 6 + j * 6 + indexStorage2[i / 2000 * 100 + j / 20] + 4] = promoteDate3[i * 6 + j * 6 + k * 6 + 4];
                                promoteDate2[i * 6 + j * 6 + indexStorage2[i / 2000 * 100 + j / 20] + 5] = promoteDate3[i * 6 + j * 6 + k * 6 + 5];

                                indexStorage2[i / 2000 * 100 + j / 20] += 6;
                                indexStorage3[i / 2000 * 100 + j / 20] -= 6;

                                promoteDate3[i * 6 + j * 6 + k * 6 + 0] = 0;
                                promoteDate3[i * 6 + j * 6 + k * 6 + 1] = 0;
                                promoteDate3[i * 6 + j * 6 + k * 6 + 2] = 0;
                                promoteDate3[i * 6 + j * 6 + k * 6 + 3] = 0;
                                promoteDate3[i * 6 + j * 6 + k * 6 + 4] = 0;
                                promoteDate3[i * 6 + j * 6 + k * 6 + 5] = 0;

                                addPartialValue3[i / 2000 * 100 + j / 20]--;

                                promoteInformation2[i + j % 2000 + addPartialValue2[i / 2000 * 100 + j / 20]] = thousandNumber[2];
                                promoteInformation3[i + j % 2000 + addPartialValue3[i / 2000 * 100 + j / 20]] = 0;
                                addPartialValue2[i / 2000 * 100 + j / 20]++;
                                addPartialValue3[i / 2000 * 100 + j / 20]--; // 여기 체크
                            }
                        }
                    }
                }
                seePromotionButton2 = 0;
                seePromotionValue1++;
            }
            if (check == 1) {
                check = 0;
                thousandNumber[2]++;
            }

            seePromotionButton = 0;
        }
        seePromotionValue1 = 0;

        for (int e = 6000; e < 6020; e++) {
            for (int i = 0; i < 200000; i += 2000) {
                for (int j = 0; j < 2000; j += 20) {
                    for (int k = 0; k < 20; k++) {
                        if (promoteInformation6[i + j + k] == e) {
                            if (seePromotionButton == 0) {
                                System.out.printf("%d년 %d월 %d일 ~ %d년 %d월 %d일\n", promoteDate6[i * 6 + j * 6 + k * 6 + 0], promoteDate6[i * 6 + j * 6 + k * 6 + 1], promoteDate6[i * 6 + j * 6 + k * 6 + 2], promoteDate6[i * 6 + j * 6 + k * 6 + 3], promoteDate6[i * 6 + j * 6 + k * 6 + 4], promoteDate6[i * 6 + j * 6 + k * 6 + 5]);
                                System.out.println("1 + 1 무료");
                                seePromotionButton = 1;

                                if (promoteDate6[i * 6 + j * 6 + k * 6 + 0] == year && promoteDate6[i * 6 + j * 6 + k * 6 + 1] == month && promoteDate6[i * 6 + j * 6 + k * 6 + 2] == day) {
                                    System.out.printf("%d년 %d월 %d일 이후로 시작되는 프로모션입니다.\n", year, month, day);
                                    check = 1;
                                }
                            }
                            if (seePromotionButton2 == 0) {
                                System.out.printf("---%s---\n", kind[i / 2000]);
                                seePromotionButton2 = 1;
                            }
                            System.out.printf("%s\n", weaponName[i / 2000 * 100 + j % 2000 / 20]);

                            if (check == 1) {
                                promoteDate5[i * 6 + j * 6 + indexStorage5[i / 2000 * 100 + j / 20] + 0] = promoteDate6[i * 6 + j * 6 + k * 6 + 0];
                                promoteDate5[i * 6 + j * 6 + indexStorage5[i / 2000 * 100 + j / 20] + 1] = promoteDate6[i * 6 + j * 6 + k * 6 + 1];
                                promoteDate5[i * 6 + j * 6 + indexStorage5[i / 2000 * 100 + j / 20] + 2] = promoteDate6[i * 6 + j * 6 + k * 6 + 2];
                                promoteDate5[i * 6 + j * 6 + indexStorage5[i / 2000 * 100 + j / 20] + 3] = promoteDate6[i * 6 + j * 6 + k * 6 + 3];
                                promoteDate5[i * 6 + j * 6 + indexStorage5[i / 2000 * 100 + j / 20] + 4] = promoteDate6[i * 6 + j * 6 + k * 6 + 4];
                                promoteDate5[i * 6 + j * 6 + indexStorage5[i / 2000 * 100 + j / 20] + 5] = promoteDate6[i * 6 + j * 6 + k * 6 + 5];

                                indexStorage5[i / 2000 * 100 + j / 20] += 6;
                                indexStorage6[i / 2000 * 100 + j / 20] -= 6;

                                promoteDate6[i * 6 + j * 6 + k * 6 + 0] = 0;
                                promoteDate6[i * 6 + j * 6 + k * 6 + 1] = 0;
                                promoteDate6[i * 6 + j * 6 + k * 6 + 2] = 0;
                                promoteDate6[i * 6 + j * 6 + k * 6 + 3] = 0;
                                promoteDate6[i * 6 + j * 6 + k * 6 + 4] = 0;
                                promoteDate6[i * 6 + j * 6 + k * 6 + 5] = 0;

                                addPartialValue6[i / 2000 * 100 + j / 20]--;

                                promoteInformation5[i + j % 2000 + addPartialValue5[i / 2000 * 100 + j / 20]] = thousandNumber[5];
                                promoteInformation6[i + j % 2000 + addPartialValue6[i / 2000 * 100 + j / 20]] = 0;
                                addPartialValue5[i / 2000 * 100 + j / 20]++;
                                addPartialValue6[i / 2000 * 100 + j / 20]--; // 여기 체크
                            }
                        }
                    }
                }
                seePromotionButton2 = 0;
                seePromotionValue1++;
            }
            if (check == 1) {
                check = 0;
                thousandNumber[5]++;
            }
            seePromotionButton = 0;
        }
        seePromotionValue1 = 0;

        for (int e = 9000; e < 9020; e++) {
            for (int i = 0; i < 200000; i += 2000) {
                for (int j = 0; j < 2000; j += 20) {
                    for (int k = 0; k < 20; k++) {
                        if (promoteInformation9[i + j + k] == e) {
                            if (seePromotionButton == 0) {
                                System.out.printf("%d년 %d월 %d일 ~ %d년 %d월 %d일\n", promoteDate9[i * 6 + j * 6 + k * 6 + 0], promoteDate9[i * 6 + j * 6 + k * 6 + 1], promoteDate9[i * 6 + j * 6 + k * 6 + 2], promoteDate9[i * 6 + j * 6 + k * 6 + 3], promoteDate9[i * 6 + j * 6 + k * 6 + 4], promoteDate9[i * 6 + j * 6 + k * 6 + 5]);
                                System.out.println(discount[k] + "원 할인");
                                seePromotionButton = 1;

                                if (promoteDate9[i * 6 + j * 6 + k * 6 + 0] == year && promoteDate9[i * 6 + j * 6 + k * 6 + 1] == month && promoteDate9[i * 6 + j * 6 + k * 6 + 2] == day) {
                                    System.out.printf("%d년 %d월 %d일 이후로 시작되는 프로모션입니다.\n", year, month, day);
                                    check = 1;
                                }
                            }
                            if (seePromotionButton2 == 0) {
                                System.out.printf("---%s---\n", kind[i / 2000]);
                                seePromotionButton2 = 1;
                            }
                            System.out.printf("%s\n", weaponName[i / 2000 * 100 + j % 2000 / 20]);

                            if (check == 1) {
                                promoteDate8[i * 6 + j * 6 + indexStorage8[i / 2000 * 100 + j / 20] + 0] = promoteDate9[i * 6 + j * 6 + k * 6 + 0];
                                promoteDate8[i * 6 + j * 6 + indexStorage8[i / 2000 * 100 + j / 20] + 1] = promoteDate9[i * 6 + j * 6 + k * 6 + 1];
                                promoteDate8[i * 6 + j * 6 + indexStorage8[i / 2000 * 100 + j / 20] + 2] = promoteDate9[i * 6 + j * 6 + k * 6 + 2];
                                promoteDate8[i * 6 + j * 6 + indexStorage8[i / 2000 * 100 + j / 20] + 3] = promoteDate9[i * 6 + j * 6 + k * 6 + 3];
                                promoteDate8[i * 6 + j * 6 + indexStorage8[i / 2000 * 100 + j / 20] + 4] = promoteDate9[i * 6 + j * 6 + k * 6 + 4];
                                promoteDate8[i * 6 + j * 6 + indexStorage8[i / 2000 * 100 + j / 20] + 5] = promoteDate9[i * 6 + j * 6 + k * 6 + 5];

                                indexStorage8[i / 2000 * 100 + j / 20] += 6;
                                indexStorage9[i / 2000 * 100 + j / 20] -= 6;

                                promoteDate9[i * 6 + j * 6 + k * 6 + 0] = 0;
                                promoteDate9[i * 6 + j * 6 + k * 6 + 1] = 0;
                                promoteDate9[i * 6 + j * 6 + k * 6 + 2] = 0;
                                promoteDate9[i * 6 + j * 6 + k * 6 + 3] = 0;
                                promoteDate9[i * 6 + j * 6 + k * 6 + 4] = 0;
                                promoteDate9[i * 6 + j * 6 + k * 6 + 5] = 0;

                                addPartialValue9[i / 2000 * 100 + j / 20]--;

                                promoteInformation8[i + j % 2000 + addPartialValue8[i / 2000 * 100 + j / 20]] = thousandNumber[8];
                                promoteInformation9[i + j % 2000 + addPartialValue9[i / 2000 * 100 + j / 20]] = 0;
                                addPartialValue8[i / 2000 * 100 + j / 20]++;
                                addPartialValue9[i / 2000 * 100 + j / 20]--; // 여기 체크
                            }
                        }
                    }
                }
                seePromotionButton2 = 0;
                seePromotionValue1++;
            }
            if (check == 1) {
                check = 0;
                thousandNumber[8]++;
            }

            seePromotionButton = 0;
        }
        seePromotionValue1 = 0;
        // i는 냅두고 k 도 냅두고 k를 이용한다.

        uiLogin(sc, weaponName, recoveryWeaphone, day, price, kind, iValue, sequence, storage, storageValue, start, money, button, buyButton, adminId, adminPassword, accountInformation, loginButton, accountInformationButton, idType, userNumber, capacityValueButton, weaponInformation, categoryRemove, categoryButton, num_of_days, month, year, promotionName, percentageDiscountButton, discountPercent, promotionYear1, promotionMonth1, promotionDay1, promotionYear2, promotionMonth2, promotionDay2, promotionValue1, promotionValue2, promotionValue3, promoteInformation1, timeCount, partialName, checkBox, history, damage, speed, weight, weaponRemoval, maximumInventory, currentInventory, promoteDate1, promoteDate2, promoteDate3, promoteDate4, promoteDate5, promoteDate6, promoteInformation2, promoteInformation3, discount, indexStorage1, indexStorage2, indexStorage3, thousandNumber, MAX_Z, recoveryStorage, promoteDate7, promoteDate8, promoteDate9, promoteInformation4, promoteInformation5, promoteInformation6, promoteInformation7, promoteInformation8, promoteInformation9, indexStorage4, indexStorage5, indexStorage6, indexStorage7, indexStorage8, indexStorage9, addPartialValue1, addPartialValue2, addPartialValue3, addPartialValue4, addPartialValue5, addPartialValue6, addPartialValue7, addPartialValue8, addPartialValue9, tempYear, tempMonth, tempDay, createButton, discountMoney, loginNumber);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int MAX_Z = 10000000;
        String[] weaponName = new String[MAX_Z];
        int[] recoveryWeaphone = new int[MAX_Z]; // 3턴후 회복
        int[] recoveryStorage = new int[MAX_Z];

        int[] sequence = new int[MAX_Z];
        for (int i = 0; i < 10; i++) {
            sequence[i] = 10;  //이거 수정해야됨 for(int i = 100; i < 100 + sequence[i] = 10; i++) 이렇게 나와야 됨
        }
        int[] storage = new int[MAX_Z];
        int[] damage = new int[MAX_Z];
        int[] speed = new int[MAX_Z];
        int[] weight = new int[MAX_Z];
        int[] weaponRemoval = new int[MAX_Z];
        int[] maximumInventory = new int[MAX_Z];
        int[] currentInventory = new int[MAX_Z];

        int[] price = new int[MAX_Z];
        long[] money = new long[MAX_Z];

        int iValue = 0;
        int storageValue = 0;
        int start = 0;
        int button = 0;
        int buyButton = 0;

        /**
         * 로그인 시스템
         */
        String adminId = "a";
        String adminPassword = "1";
        int loginButton = 0;
        int accountInformationButton = 0; // 능력치 기본 통계 시스템에도 변수가 쓰인다.


        String[] accountInformation = new String[MAX_Z];

        /**
         * 능력치 기본 통계 무작위 생성 시스템
         */
        String idType = ""; //idType이 key값
        int userNumber = 0;
        int[] capacityValueButton = new int[100];

        /**
         * 관리자페이지
         * 1. 카테고리 추가하기
         * 2. 카테고리 제거하기
         * 3. 업데이트 -> 항목의 최대 재고를 채워주는 버튼, 그리고 재고의 최대재고를 추가해주는 버튼, 재고의 재고수를 입력받아 추가해주는 버튼
         *    무기 추가, 무기 제거
         */
        String[] kind = new String[MAX_Z]; // 요긴하게 쓰일 것 같다.
        int[] weaponInformation = new int[MAX_Z];

        int weaponPrice = 500;

        for (int i = 0; i < 100; i++) {
            kind[i] = "";
        }
        kind[0] = "sword";
        kind[1] = "axe";
        kind[2] = "mace";
        kind[3] = "bow";
        kind[4] = "crossBow";
        kind[5] = "dagger";
        kind[6] = "club";
        kind[7] = "lance";
        kind[8] = "shield";
        kind[9] = "bar";

        /**
         * weaponInformation 배열에 대하여
         * weaponInformation[무기종류][무기번호][0] = 손상
         * weaponInformation[무기종류][무기번호][1] = 속도
         * weaponInformation[무기종류][무기번호][2] = 무게
         * weaponInformation[무기종류][무기번호][3] = 기본가격
         * weaponInformation[무기종류][무기번호][4] = 무기제거유무
         */
        int[] categoryRemove = new int[MAX_Z]; // 카테고리 제거 유무
        int categoryButton = 10;

        for (int i = 0; i < MAX_Z; i++) {
            storage[i] = -1;
            categoryRemove[i] = -1; // 카테고리가 아예없다면 -1 있다면 0 제거됬다면 1
        }

        for (int i = 0; i < 10; i++) {
            categoryRemove[i] = 0;
        }
        /**
         * 날짜계산
         */
        int[] num_of_days = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int year = 2023;
        int month = 5;
        int day = 6;

        int tempYear = 2023;
        int tempMonth = 5;
        int tempDay = 5;


        /**
         * 프로모션
         */
        String[] promotionName = new String[MAX_Z];

        int[] promoteInformation1 = new int[MAX_Z];
        int[] promoteInformation2 = new int[MAX_Z];
        int[] promoteInformation3 = new int[MAX_Z];

        int[] promoteInformation4 = new int[MAX_Z];
        int[] promoteInformation5 = new int[MAX_Z];
        int[] promoteInformation6 = new int[MAX_Z];

        int[] promoteInformation7 = new int[MAX_Z];
        int[] promoteInformation8 = new int[MAX_Z];
        int[] promoteInformation9 = new int[MAX_Z];

        int[] promoteDate1 = new int[MAX_Z]; //
        int[] promoteDate2 = new int[MAX_Z];
        int[] promoteDate3 = new int[MAX_Z];

        int[] promoteDate4 = new int[MAX_Z];
        int[] promoteDate5 = new int[MAX_Z];
        int[] promoteDate6 = new int[MAX_Z];

        int[] promoteDate7 = new int[MAX_Z];
        int[] promoteDate8 = new int[MAX_Z];
        int[] promoteDate9 = new int[MAX_Z];

        int[] addPartialValue1 = new int[MAX_Z];
        int[] addPartialValue2 = new int[MAX_Z];
        int[] addPartialValue3 = new int[MAX_Z];
        int[] addPartialValue4 = new int[MAX_Z];
        int[] addPartialValue5 = new int[MAX_Z];
        int[] addPartialValue6 = new int[MAX_Z];
        int[] addPartialValue7 = new int[MAX_Z];
        int[] addPartialValue8 = new int[MAX_Z];
        int[] addPartialValue9 = new int[MAX_Z];


        int[] discount = new int[MAX_Z];
        int[] discountMoney = new int[MAX_Z];

        for (int i = 0; i < 100; i++) {
            promotionName[i] = "";
        }
        int promotionValue1 = 0;
        int promotionValue2 = 100;
        int promotionValue3 = 200;

        int discountPercent = 0;
        int percentageDiscountButton = 0;

        int promotionYear1 = 0;
        int promotionMonth1 = 0;
        int promotionDay1 = 0;

        int promotionYear2 = 0;
        int promotionMonth2 = 0;
        int promotionDay2 = 0;

        int[] timeCount = new int[MAX_Z];
        String[] partialName = new String[]{"", "", ""};

        int[] checkBox = new int[MAX_Z];

        int[] indexStorage1 = new int[MAX_Z];
        int[] indexStorage2 = new int[MAX_Z];
        int[] indexStorage3 = new int[MAX_Z];

        int[] indexStorage4 = new int[MAX_Z];
        int[] indexStorage5 = new int[MAX_Z];
        int[] indexStorage6 = new int[MAX_Z];

        int[] indexStorage7 = new int[MAX_Z];
        int[] indexStorage8 = new int[MAX_Z];
        int[] indexStorage9 = new int[MAX_Z];


        int[] thousandNumber = new int[]{0, 1000, 2000, 3000, 4000, 5000, 6000, 7000, 8000, 9000};

        //indexStorage[i] 는 인덱스를 저장하는 곳이고 또한 무기의 프로모션관련 배열을 읽고 값을 넣을때 빈공간을 찾아가는 배열이다. 사용하면 1을 추가해줘야된다.
        //프로모션을 구분하는 공간에서 20개밖에 없기때문에 나중에 필요에 의해 확장하는게 중요하다고 생각된다.
        /**
         * 구매내역
         */

        int[] history = new int[MAX_Z];

        int createButton = 0;

        int loginNumber = 0;


        input1(sc, weaponName, recoveryWeaphone, day, price, kind, iValue, sequence, storage, storageValue, start, money, button, buyButton, adminId, adminPassword, accountInformation, loginButton, accountInformationButton, idType, userNumber, capacityValueButton, weaponInformation, categoryRemove, categoryButton, num_of_days, month, year, promotionName, percentageDiscountButton, discountPercent, promotionYear1, promotionMonth1, promotionDay1, promotionYear2, promotionMonth2, promotionDay2, promotionValue1, promotionValue2, promotionValue3, promoteInformation1, timeCount, partialName, checkBox, history, damage, speed, weight, weaponRemoval, maximumInventory, currentInventory, promoteDate1, promoteDate2, promoteDate3, promoteDate4, promoteDate5, promoteDate6, promoteInformation2, promoteInformation3, discount, indexStorage1, indexStorage2, indexStorage3, thousandNumber, MAX_Z, recoveryStorage, promoteDate7, promoteDate8, promoteDate9, promoteInformation4, promoteInformation5, promoteInformation6, promoteInformation7, promoteInformation8, promoteInformation9, indexStorage4, indexStorage5, indexStorage6, indexStorage7, indexStorage8, indexStorage9, addPartialValue1, addPartialValue2, addPartialValue3, addPartialValue4, addPartialValue5, addPartialValue6, addPartialValue7, addPartialValue8, addPartialValue9, tempYear, tempMonth, tempDay, createButton, discountMoney, loginNumber);
    }
}