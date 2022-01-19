Feature: Search Flight

  Scenario: Verify user search flight
    Given user on the home screen
    And user click tiket pesawat
    And user select Dari with Jakarta
    And user select Ke with Padang
    And user click Cari
    And user click first result flight
    When user click Pilih
    Then user navigate to Isi data screen
