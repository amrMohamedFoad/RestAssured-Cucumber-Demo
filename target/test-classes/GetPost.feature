Feature:
  verify different GET operations using Rest-Assured

  Scenario: Verify one author of the post
    Given Perform GET operation for "/post"
    And Perform GET for the post number "1"
    Then Should see the authorName as "Kathik KK"

