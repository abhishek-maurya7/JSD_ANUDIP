import { NgModule } from '@angular/core';
import { BrowserModule, provideClientHydration } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AdminproductComponent } from './adminproduct/adminproduct.component';
import { RouterModule } from '@angular/router';
import { HttpClientModule, provideHttpClient, withFetch } from '@angular/common/http';
import { FormsModule} from '@angular/forms';
import { UserProductComponent } from './user-product/user-product.component';
import { SuccessfulComponent } from './successful/successful.component';
import { LoginComponent } from './login/login.component';

@NgModule({
  declarations: [
    AppComponent,
    AdminproductComponent,
    UserProductComponent,
    SuccessfulComponent,
    LoginComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    RouterModule.forRoot([
      {path:'adminproduct', component:AdminproductComponent},
      {path:'userproduct', component:UserProductComponent},
      {path:'successful', component:SuccessfulComponent},
      {path:'login', component:LoginComponent},
    ])
  ],
  providers: [
     provideHttpClient(withFetch())
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
