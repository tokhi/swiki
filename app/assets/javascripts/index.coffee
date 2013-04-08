$ ->
  $.get "/articles", (data) ->
    $.each data, (index, article) ->
     $("#articles").append $("<li>").text article.title