Feature: books authentication and search features

  Scenario: Verify that anonymous user can download 3 books successfully

    Given open "books" app
    And   latest 10 books are displayed instantly
    When  user select 3 books
    And   click "download" button
    Then  3 books downloaded successfully
    And   terminate app
    And   open "books" app
    And   I should see download books displayed successfully

  Scenario: Verify that anonymous user cannot download more than 3 books

    Given open "books" app
    And   latest 10 books are displayed instantly
    And   user select 3 books
    And   click "download" button
    And   3 books downloaded successfully
    When  select another book to download
    Then  error message should displayed that you have exceed the downloaded books


  Scenario: Verify that anonymous user can select new book to download after cancel download

    Given open "books" app
    And   latest 10 books are displayed instantly
    When  user select book to download
    And   click "download" button
    And   click on "cancel_download" before download completed
    And   select another "book_name" to download
    Then  I should see "book_name" downloaded successfully

  Scenario: Check app behavior after termination while download book

    Given open "books" app
    And   latest 10 books are displayed instantly
    And   user select book to download
    And   click "download" button
    When  book is downloading terminate app
    And   open "books" app
    Then  I should see a message "complete download book selected before"

  Scenario: Check app behavior after enter app in background while download book

    Given open "books" app
    And   latest 10 books are displayed instantly
    And   user select book to download
    And   click "download" button
    When  book is downloading enter app in background
    And   open "books" app
    Then  I should see "book" screen
    And   "book_name" should continue download


  Scenario:  Check performance while battery full

    Given open "books" app
    And   latest 10 books are displayed instantly
    When   mobile battery is 100%
    And   user select book to download
    And   click "download" button
    Then  book downloaded successfully


  Scenario Check performance while battery about die

    Given open "books" app
    And   latest 10 books are displayed instantly
    When   mobile battery is 10%
    And  user select book to download
    And   click "download" button
    Then  book downloaded successfully

  Scenario Check performance while battery die while download

    Given open "books" app
    And   latest 10 books are displayed instantly
    And  user select book to download
    When   mobile battery died
    And   recharge mobile
    And   open mobile again
    And   open "books" app
    Then  I should see "book_name"

  Scenario Check performance while mobile on charge

    Given open "books" app
    And   latest 10 books are displayed instantly
    And   enter mobile on charge
    When  user select book to download
    And   click "download" button
    Then  book downloaded successfully


  Scenario: Verify that user Search for no exist Book

    Given open "books" app
    And   click on search bar
    When  enter "book_name" that not exist
    Then  I should see "No_search_result" displayed on screen

  Scenario: Verify Latest 10 Books displayed
    Given open "books" app
    And   click on search bar
    And   enter the following "books_names" inside search bar

      | book_name | book_count | is_exist? |
      | book_1    | 1          | Yes       |
      | book_2    | 2          | NO        |
      | book_3    | 3          | Yes       |
      | book_4    | 4          | Yes       |
      | book_5    | 5          | Yes       |
      | book_6    | 6          | Yes       |
      | book_7    | 7          | NO        |
      | book_8    | 8          | NO        |
      | book_9    | 9          | NO        |
      | book_10   | 10         | Yes       |
      | book_11   | 11         | Yes       |
      | book_12   | 12         | Yes       |
      | book_13   | 13         | Yes       |
      | book_14   | 14         | Yes       |
      | book_15   | 15         | Yes       |
      | book_16   | 16         | Yes       |
      | book_17   | 17         | Yes       |
      | book_18   | 18         | NO        |
      | book_19   | 19         | Yes       |
      | book_20   | 20         | Yes       |

    Then I should see latest 10 "book_name" displayed inside search bar in descending order

      | book_name | book_count |
      | book_20   | 1          |
      | book_19   | 2          |
      | book_17   | 3          |
      | book_16   | 4          |
      | book_15   | 5          |
      | book_14   | 6          |
      | book_13   | 7          |
      | book_12   | 8          |
      | book_10   | 9          |
      | book_6    | 10         |


  Scenario: Verify that Anonymous user needs to login to have permissions

    Given Anonymous User Open "books" App
    And   latest 10 books are displayed instantly
    And  user select "book_name"
    When click on "share – rate .. etc."
    Then I should see error message "user don’t have permission to "share – rate .. etc.""


  Scenario: Check download behavior when Internet Connection is off while download

    Given Anonymous User Open "books" App
    And   latest 10 books are displayed instantly
    And   user select 3 books
    When  internet connection is off
    Then  error message should displayed that "internet connection is off"

