Feature: 用于测试两数相加

  Scenario Outline: 测试两数相加
    Given 打开计算界面
    Given 设置第一个加数为"<Number1>"
    Given 设置第二个加数为"<Number2>"
    When 执行相加操作
    Then 两数相加结果为"<Result>"
    Examples:
      | Number1 | Number2 | Result |
      | 2       | 4       | 6      |
      | 5       | 8       | 13     |