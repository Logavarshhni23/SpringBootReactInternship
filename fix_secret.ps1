$file = "OAuth/OAuth/src/main/resources/application.yml"
if (Test-Path $file) {
    $content = Get-Content $file -Raw
    $content = $content -replace 'client-id:.*', 'client-id: <your-google-client-id>'
    $content = $content -replace 'client-secret:.*', 'client-secret: <your-google-client-secret>'
    Set-Content $file $content -NoNewline
}
