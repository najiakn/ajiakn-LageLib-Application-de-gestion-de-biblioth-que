<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="biblio.css"> 
    <title>Document</title>
</head>
<body>
    <div class="d-flex align-items-start">
        <div class="nav flex-column nav-pills me-3" id="v-pills-tab" role="tablist" aria-orientation="vertical">
            <button class="nav-link active home-btn" id="v-pills-home-tab" data-bs-toggle="pill" data-bs-target="#v-pills-home" type="button" role="tab" aria-controls="v-pills-home" aria-selected="true">Home</button>
            <button class="nav-link" id="v-pills-profile-tab" data-bs-toggle="pill" data-bs-target="#v-pills-profile" type="button" role="tab" aria-controls="v-pills-profile" aria-selected="false">Livre</button>
            <button class="nav-link" id="v-pills-disabled-tab" data-bs-toggle="pill" data-bs-target="#v-pills-disabled" type="button" role="tab" aria-controls="v-pills-disabled" aria-selected="false" >Emprunt</button>
            <button class="nav-link" id="v-pills-messages-tab" data-bs-toggle="pill" data-bs-target="#v-pills-messages" type="button" role="tab" aria-controls="v-pills-messages" aria-selected="false">Membre</button>
            <button class="nav-link" id="v-pills-settings-tab" data-bs-toggle="pill" data-bs-target="#v-pills-settings" type="button" role="tab" aria-controls="v-pills-settings" aria-selected="false">Admin</button>
        </div>
        <div class="tab-content" id="v-pills-tabContent">
            <div class="tab-pane fade show active" id="v-pills-home" role="tabpanel" aria-labelledby="v-pills-home-tab" tabindex="0">...</div>
            <div class="tab-pane fade" id="v-pills-profile" role="tabpanel" aria-labelledby="v-pills-profile-tab" tabindex="0">...</div>
            <div class="tab-pane fade" id="v-pills-disabled" role="tabpanel" aria-labelledby="v-pills-disabled-tab" tabindex="0">...</div>
            <div class="tab-pane fade" id="v-pills-messages" role="tabpanel" aria-labelledby="v-pills-messages-tab" tabindex="0">...</div>
            <div class="tab-pane fade" id="v-pills-settings" role="tabpanel" aria-labelledby="v-pills-settings-tab" tabindex="0">...</div>
        </div>
        
        <div class="container">
            <div class="table">
                <div class="table-header">
                    <div class="header__item"><a id="name" class="filter__link" href="#">Name</a></div>
                    <div class="header__item"><a id="wins" class="filter__link filter__link--number" href="#">Wins</a></div>
                    <div class="header__item"><a id="draws" class="filter__link filter__link--number" href="#">Draws</a></div>
                    <div class="header__item"><a id="losses" class="filter__link filter__link--number" href="#">Losses</a></div>
                    <div class="header__item"><a id="total" class="filter__link filter__link--number" href="#">Total</a></div>
                </div>
                <div class="table-content">    
                    <div class="table-row">       
                        <div class="table-data">Tom</div>
                        <div class="table-data">2</div>
                        <div class="table-data">0</div>
                        <div class="table-data">1</div>
                        <div class="table-data">
                            <button class="btn btn-sm btn-info"><i class="fa fa-pencil"></i> Modifier</button>
                            <button class="btn btn-sm btn-danger"><i class="fa fa-trash"></i> Supprimer</button>
                        </div>
                    </div>
                    <div class="table-row">
                        <div class="table-data">Dick</div>
                        <div class="table-data">1</div>
                        <div class="table-data">1</div>
                        <div class="table-data">2</div>
                        <div class="table-data">
                            <button class="btn btn-sm btn-info"><i class="fa fa-pencil"></i> Modifier</button>
                            <button class="btn btn-sm btn-danger"><i class="fa fa-trash"></i> Supprimer</button>


                        </div>
                    </div>
                    <div class="table-row">
                        <div class="table-data">Harry</div>
                        <div class="table-data">0</div>
                        <div class="table-data">2</div>
                        <div class="table-data">2</div>
                        <div class="table-data">
                            <button class="btn btn-sm btn-info"><i class="fa fa-pencil"></i> Modifier</button>
                            <button class="btn btn-sm btn-danger"><i class="fa fa-trash"></i> Supprimer</button>
                        </div>
                    </div>
                </div>  
            </div>
        </div>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</body>
</html>
